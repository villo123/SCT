package com.sct.incidencias.ibm;

public interface DigitalizarDocumentoService extends javax.xml.rpc.Service {
    public java.lang.String getDigitalizarDocumentoSoapPortAddress();

    public gob.sct.documentos.DigitalizarDocumento getDigitalizarDocumentoSoapPort() throws javax.xml.rpc.ServiceException;

    public gob.sct.documentos.DigitalizarDocumento getDigitalizarDocumentoSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
