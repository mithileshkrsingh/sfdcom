/**
 * NotificationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2005._09.outbound;

public class NotificationServiceLocator extends org.apache.axis.client.Service implements com.sforce.soap._2005._09.outbound.NotificationService {

/**
 * Notification Service Implementation
 */

    public NotificationServiceLocator() {
    }


    public NotificationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NotificationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Notification
    private java.lang.String Notification_address = "https://singhoutboundmessage.fwd.wf/OM/services/Notification";

    public java.lang.String getNotificationAddress() {
        return Notification_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NotificationWSDDServiceName = "Notification";

    public java.lang.String getNotificationWSDDServiceName() {
        return NotificationWSDDServiceName;
    }

    public void setNotificationWSDDServiceName(java.lang.String name) {
        NotificationWSDDServiceName = name;
    }

    public com.sforce.soap._2005._09.outbound.NotificationPort getNotification() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Notification_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNotification(endpoint);
    }

    public com.sforce.soap._2005._09.outbound.NotificationPort getNotification(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sforce.soap._2005._09.outbound.NotificationBindingStub _stub = new com.sforce.soap._2005._09.outbound.NotificationBindingStub(portAddress, this);
            _stub.setPortName(getNotificationWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNotificationEndpointAddress(java.lang.String address) {
        Notification_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sforce.soap._2005._09.outbound.NotificationPort.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sforce.soap._2005._09.outbound.NotificationBindingStub _stub = new com.sforce.soap._2005._09.outbound.NotificationBindingStub(new java.net.URL(Notification_address), this);
                _stub.setPortName(getNotificationWSDDServiceName());
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
        if ("Notification".equals(inputPortName)) {
            return getNotification();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.sforce.com/2005/09/outbound", "NotificationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.sforce.com/2005/09/outbound", "Notification"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Notification".equals(portName)) {
            setNotificationEndpointAddress(address);
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
