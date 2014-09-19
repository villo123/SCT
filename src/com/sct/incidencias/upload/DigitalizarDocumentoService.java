/**
 * DigitalizarDocumentoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sct.incidencias.upload;

import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.portlet.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.io.*;
import org.apache.commons.io.filefilter.*;
import org.apache.commons.io.input.*;
import org.apache.commons.io.output.*;

public interface DigitalizarDocumentoService extends javax.xml.rpc.Service {
    public java.lang.String getDigitalizarDocumentoSoapPortAddress();

    public com.sct.incidencias.upload.DigitalizarDocumento getDigitalizarDocumentoSoapPort() throws javax.xml.rpc.ServiceException;

    public com.sct.incidencias.upload.DigitalizarDocumento getDigitalizarDocumentoSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
