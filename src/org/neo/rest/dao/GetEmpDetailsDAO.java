package org.neo.rest.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.neo.rest.model.EmpDetails;;

public class GetEmpDetailsDAO {

	Map<String, EmpDetails> employees = new HashMap<String, EmpDetails>();

	public GetEmpDetailsDAO()
    {
 
        //Emp details to be retrieved from the database. 
        employees.put("1001", new EmpDetails("1001", "ABC",40000, "101, ABC St" ));
        employees.put("1002", new EmpDetails("1002", "XYZ",50000, "102, XYZ St"));
        employees.put("1003", new EmpDetails("1003", "QAZ", 30000, "103, QAZ St"));
        employees.put("1004", new EmpDetails("1004", "WSX",70000, "104, WSX St"));
    }

	public EmpDetails getEmpDetails(String empcode) {

		return employees.get(empcode); // returns employee datails based on
										// employee code

	}

	public List<EmpDetails> getEmployees() {

		// Convert Map to ArrayList

		return new ArrayList<EmpDetails>(employees.values()); // returns list of
																// employees.

	}

}
