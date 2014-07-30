package com.sct.incidencias.ibm;

public interface DigitalizarDocumento  extends java.rmi.Remote {
    public byte[] obtener(java.lang.String cUsr, java.lang.String cPwd, java.lang.String cEsquema, java.lang.String[] keys, java.lang.String[] values, java.lang.String[] operators) throws java.rmi.RemoteException;
    public java.lang.String asignar(java.lang.String cUsr, java.lang.String cPwd, java.lang.String cEsquema, java.lang.String[] keys, java.lang.String[] values, byte[] bytes) throws java.rmi.RemoteException;
}
