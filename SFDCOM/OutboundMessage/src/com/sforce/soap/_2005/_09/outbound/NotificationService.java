/**
 * NotificationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2005._09.outbound;

public interface NotificationService extends javax.xml.rpc.Service {

/**
 * Notification Service Implementation
 */
    public java.lang.String getNotificationAddress();

    public com.sforce.soap._2005._09.outbound.NotificationPort getNotification() throws javax.xml.rpc.ServiceException;

    public com.sforce.soap._2005._09.outbound.NotificationPort getNotification(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
