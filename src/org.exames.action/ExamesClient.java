package org.exames.action;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class ExamesClient {

	public static void main(String[] args) throws exception {
		URL url = new URL("http://localhost:8080/STRUTS2CRUD/report?wsdl");
		
		QName qname = new QName("http://STRUTS2CRUD/","ReportActionService");
		
		Service ws = Service.create(url, qname);
		ReportAction report = ws.getPort(ReportAction.class);
		
		System.out.println("Candidatos cadastrados: " +report.execute());

	}

}
