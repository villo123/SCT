/**
 * DigitalizarDocumentoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sct.incidencias.upload;

public class DigitalizarDocumentoServiceLocator extends org.apache.axis.client.Service implements com.sct.incidencias.upload.DigitalizarDocumentoService {

    public DigitalizarDocumentoServiceLocator() {
    }


    public DigitalizarDocumentoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DigitalizarDocumentoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DigitalizarDocumentoSoapPort
    private java.lang.String DigitalizarDocumentoSoapPort_address = "http://10.33.169.117:7001/Documentos/DigitalizarDocumento";

    public java.lang.String getDigitalizarDocumentoSoapPortAddress() {
        return DigitalizarDocumentoSoapPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DigitalizarDocumentoSoapPortWSDDServiceName = "DigitalizarDocumentoSoapPort";

    public java.lang.String getDigitalizarDocumentoSoapPortWSDDServiceName() {
        return DigitalizarDocumentoSoapPortWSDDServiceName;
    }

    public void setDigitalizarDocumentoSoapPortWSDDServiceName(java.lang.String name) {
        DigitalizarDocumentoSoapPortWSDDServiceName = name;
    }

    public com.sct.incidencias.upload.DigitalizarDocumento getDigitalizarDocumentoSoapPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DigitalizarDocumentoSoapPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDigitalizarDocumentoSoapPort(endpoint);
    }

    public com.sct.incidencias.upload.DigitalizarDocumento getDigitalizarDocumentoSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
        	com.sct.incidencias.upload.DigitalizarDocumentoServiceSoapBindingStub _stub = new com.sct.incidencias.upload.DigitalizarDocumentoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDigitalizarDocumentoSoapPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDigitalizarDocumentoSoapPortEndpointAddress(java.lang.String address) {
        DigitalizarDocumentoSoapPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sct.incidencias.upload.DigitalizarDocumento.class.isAssignableFrom(serviceEndpointInterface)) {
            	com.sct.incidencias.upload.DigitalizarDocumentoServiceSoapBindingStub _stub = new com.sct.incidencias.upload.DigitalizarDocumentoServiceSoapBindingStub(new java.net.URL(DigitalizarDocumentoSoapPort_address), this);
                _stub.setPortName(getDigitalizarDocumentoSoapPortWSDDServiceName());
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
        if ("DigitalizarDocumentoSoapPort".equals(inputPortName)) {
            return getDigitalizarDocumentoSoapPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://gob/sct/documentos", "DigitalizarDocumentoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://gob/sct/documentos", "DigitalizarDocumentoSoapPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DigitalizarDocumentoSoapPort".equals(portName)) {
            setDigitalizarDocumentoSoapPortEndpointAddress(address);
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
