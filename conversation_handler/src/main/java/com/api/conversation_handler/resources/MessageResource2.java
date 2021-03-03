package com.api.conversation_handler.resources;
import java.io.FileNotFoundException;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import conversation_handler.data.data;
import conversation_handler.service.Service;

@Path("/api2")

public class MessageResource2 {
	
	
	
//	Service serv= new Service();
	@GET
	@Path("{name: [A-M][a-zA-Z]*}")  
	@Produces(MediaType.APPLICATION_JSON)
	public data GetMessage(@PathParam("name") String name) {


		
		 Date date = Calendar.getInstance().getTime();  
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
         String strDate = dateFormat.format(date);  
         System.out.println("Converted String: " + strDate);  
		
		data d1= new data();
		d1.setName(name);
		
		System.out.println(d1.getName());
		
		d1.setdate(strDate);
		System.out.println(d1.getdate());
//		list.add(d1);
		Input i1= new Input("2","JSON");
		try {
			Mapper.ReadFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Output o1= Mapper.getPath(i1);
		d1.setPath(o1.getApi());
	return d1;
}
	@GET
@Path("{name: [N-Z][a-zA-Z]*}")
	
	
  
	@Produces(MediaType.APPLICATION_XML)
	public data GetMessageN_Z(@PathParam("name") String name) {

		LocalDateTime current = LocalDateTime.now();
		
		
		 Date date = Calendar.getInstance().getTime();  
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
         String strDate = dateFormat.format(date);  
         System.out.println("Converted String: " + strDate);  
		
		data d1= new data();
		d1.setName(name);
		
		System.out.println(d1.getName());
		
		d1.setdate(strDate);
		System.out.println(d1.getdate());
		Input i1= new Input("2","XML");//send this current api and output to o/p object and get next 
		try {
			Mapper.ReadFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Output o1= Mapper.getPath(i1);
		d1.setPath(o1.getApi());
//		list.add(d1);
	return d1;
}

	
}
		
	

