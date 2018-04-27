package com.gonevertical.server.maher;

import java.io.IOException;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;


@WebServlet(
    name = "Hello__App___Enginou",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {
	
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
     throws IOException {
    
	  DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
	 
			
	
	  
	  
	  
	  //Create an entity <ithout identifier
	  
	  Entity e=new Entity("person");
	  e.setProperty("FirstName","Maher");
	  e.setIndexedProperty("LastName", "MATHLOU");
	 
	  
	  ds.put(e);
	  
	  //Creating an identifier
	  
	  Entity user=new Entity("user",183293);
	  user.setProperty("userid",183293);
	  user.setProperty("username", "maherotion");
	  user.setProperty("mot_de_passe","Mot_de_passe");
	  user.setProperty("Email","Maher15@live.fr");
	  user.setProperty("numero","+33625150512");
	  
	  
	  ds.put(user);
	  
	  
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    response.getWriter().print("Hello datastore!\r\n");

  }
}