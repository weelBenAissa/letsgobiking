
package com.soap.ws.client.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetItineraryResult" type="{http://schemas.datacontract.org/2004/07/RoutingServer}ArrayOfDirection.Step" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getItineraryResult"
})
@XmlRootElement(name = "GetItineraryResponse")
public class GetItineraryResponse {

    @XmlElementRef(name = "GetItineraryResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDirectionStep> getItineraryResult;

    /**
     * Obtient la valeur de la propri�t� getItineraryResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDirectionStep }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDirectionStep> getGetItineraryResult() {
        return getItineraryResult;
    }

    /**
     * D�finit la valeur de la propri�t� getItineraryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDirectionStep }{@code >}
     *     
     */
    public void setGetItineraryResult(JAXBElement<ArrayOfDirectionStep> value) {
        this.getItineraryResult = value;
    }

}
