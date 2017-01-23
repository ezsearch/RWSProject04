package org.neo.rest.controllers;

import java.util.HashSet;
import java.util.Set;
 
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.neo.rest.service.GetEmpDetailsService;

////Does not require web.xml
////to define the base URI pattern
@ApplicationPath(value="/resource" )
public class EmpBaseApplication extends Application {

	public EmpBaseApplication(){
	}
	
	public Set<Class<?>> getClasses(){
		final Set<Class<?>> rSet = new HashSet<Class<?>>();
		rSet.add( GetEmpDetailsService.class );
		return rSet;
	}
}
