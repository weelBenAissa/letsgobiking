﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RoutingServer
{
    
    internal interface IService
    {

         void GetItinerary(string start, string end);
    }
}
