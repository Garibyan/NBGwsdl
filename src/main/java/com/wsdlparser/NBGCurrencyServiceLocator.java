/**
 * NBGCurrencyServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.wsdlparser;

public class NBGCurrencyServiceLocator extends org.apache.axis.client.Service implements com.wsdlparser.NBGCurrencyService {

    public NBGCurrencyServiceLocator() {
    }


    public NBGCurrencyServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NBGCurrencyServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NBGCurrencyPort
    private java.lang.String NBGCurrencyPort_address = "http://nbg.gov.ge/currency_service.php";

    public java.lang.String getNBGCurrencyPortAddress() {
        return NBGCurrencyPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NBGCurrencyPortWSDDServiceName = "NBGCurrencyPort";

    public java.lang.String getNBGCurrencyPortWSDDServiceName() {
        return NBGCurrencyPortWSDDServiceName;
    }

    public void setNBGCurrencyPortWSDDServiceName(java.lang.String name) {
        NBGCurrencyPortWSDDServiceName = name;
    }

    public com.wsdlparser.NBGCurrencyPort_PortType getNBGCurrencyPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NBGCurrencyPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNBGCurrencyPort(endpoint);
    }

    public com.wsdlparser.NBGCurrencyPort_PortType getNBGCurrencyPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.wsdlparser.NBGCurrencyBindingStub _stub = new com.wsdlparser.NBGCurrencyBindingStub(portAddress, this);
            _stub.setPortName(getNBGCurrencyPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNBGCurrencyPortEndpointAddress(java.lang.String address) {
        NBGCurrencyPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.wsdlparser.NBGCurrencyPort_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.wsdlparser.NBGCurrencyBindingStub _stub = new com.wsdlparser.NBGCurrencyBindingStub(new java.net.URL(NBGCurrencyPort_address), this);
                _stub.setPortName(getNBGCurrencyPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NBGCurrencyPort".equals(inputPortName)) {
            return getNBGCurrencyPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:NBGCurrency", "NBGCurrencyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:NBGCurrency", "NBGCurrencyPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NBGCurrencyPort".equals(portName)) {
            setNBGCurrencyPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
