package com.caresoft.clinicapp;

import java.util.Date;
import java.util.ArrayList;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
	

		// TODO Auto-generated constructor stub
	
//... imports class definition...
    
   

	
	// Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public AdminUser(Integer id, String role) {
        super(id); 
        this.role = role;
        this.securityIncidents = new ArrayList<String>();
        
    }
    
    public void newIncident(String notes) {
    	String report = String.format(
	            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
	            new Date(), this.id, notes
	        );
	        securityIncidents.add(report);
    }
    public void authIncident() {
    	 String report = String.format(
 	            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
 	            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
 	        );
 	        securityIncidents.add(report);
    }
	@Override
	public boolean assignPin(int pin) {
		String strPin=String.valueOf(pin);
		if (strPin.length() < 6){
			return false;
		}
		super.pin = pin;
		return true;
	}
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		
		if(this.id == confirmedAuthID) {
			return true;
		}
		this.authIncident();
		return false;
	}
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return securityIncidents;
	}
	@Override
	public void printSecurityIncidents() {
		// TODO Auto-generated method stub
		HIPAACompliantAdmin.super.printSecurityIncidents();
	}
	@Override
	public boolean adminQATest(ArrayList<String> expectedIncidents) {
		// TODO Auto-generated method stub
		return HIPAACompliantAdmin.super.adminQATest(expectedIncidents);
	}
	
//	GETERS AND SERTERS
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
