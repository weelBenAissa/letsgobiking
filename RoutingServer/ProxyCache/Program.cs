﻿using System;
using System.ServiceModel;
using System.ServiceModel.Description;


namespace ProxyCache
{
    class Program
    {
        static void Main(string[] args)
        {

            //Create a URI to serve as the base address
            //Be careful to run Visual Studio as Admistrator or to allow VS to open new port netsh command. 
            // Example : netsh http add urlacl url=http://+:80/MyUri user=DOMAIN\user
            Uri httpUrl = new Uri("http://localhost:8090/MyService/ProxyService");

            //Create ServiceHost
            ServiceHost host = new ServiceHost(typeof(ProxyService), httpUrl);

            // Multiple end points can be added to the Service using AddServiceEndpoint() method.
            // Host.Open() will run the service, so that it can be used by any client.

            // Example adding :
            // Uri tcpUrl = new Uri("net.tcp://localhost:8090/MyService/SimpleCalculator");
            // ServiceHost host = new ServiceHost(typeof(MyCalculatorService.SimpleCalculator), httpUrl, tcpUrl);

            //Add a service endpoint
            host.AddServiceEndpoint(typeof(IProxy), new WSHttpBinding(), ""); 

            //Enable metadata exchange
            ServiceMetadataBehavior smb = new ServiceMetadataBehavior();
            smb.HttpGetEnabled = true;
            host.Description.Behaviors.Add(smb);

            //Start the Service
            host.Open();

            Console.WriteLine("Service is host proxy at " + DateTime.Now.ToString());
            Console.WriteLine("Host is running... Press <Enter> key to stop");
            Console.ReadLine();

        }
    }
}
