/**
 * NotificationBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap._2005._09.outbound;

public class NotificationBindingImpl implements com.sforce.soap._2005._09.outbound.NotificationPort
 {
	static int i = 0;
	public boolean notifications(java.lang.String organizationId, java.lang.String actionId, java.lang.String sessionId, java.lang.String enterpriseUrl, java.lang.String partnerUrl, com.sforce.soap._2005._09.outbound.UserNotification[] notification) throws java.rmi.RemoteException 
	 {
    	System.out.println("My Web Server Is Responding : " + i);
    	System.out.println(notification[0].getSObject().getId());
    	System.out.println(notification[0].getSObject().getFirstName());
        System.out.println(notification[0].getSObject().getLastName());
        System.out.println();
        i++;
    	return true;
    }
}
