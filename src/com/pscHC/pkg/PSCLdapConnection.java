package com.pscHC.pkg;
import com.unboundid.ldap.sdk.BindResult;
import com.unboundid.ldap.sdk.LDAPConnection;
import com.unboundid.ldap.sdk.LDAPConnectionPool;
import com.unboundid.ldap.sdk.LDAPException;


//private static final int  max_numbof_connection = 2;

public class PSCLdapConnection {
	
	public static void connectLDAP()
	{	
	try {
//		LDAPConnection connection = new LDAPConnection(address, port);
//	     BindResult bindResult = connection.bind(DN, password);
//	     LDAPConnectionPool connectionPool = new LDAPConnectionPool(connection, max_numbof_connection);
		LDAPConnection connection = new LDAPConnection();
		connection.connect("10.162.41.122", 389);
		
		connection.bind("cn=Administrator,cn=users,dc=vSphere,dc=local", "Admin!23");
		System.out.println("connected");
	    } catch (LDAPException e) {
	        String es = e.getExceptionMessage();
	        System.out.println(es);
	    }
}
}