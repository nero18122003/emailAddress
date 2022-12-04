package com.gl.service;
import com.gl.interfaces.Credentials;
import com.gl.interfaces.Employee;

public class CredentialServices implements Credentials{
       public String generatePassword() {
    	   String retnValue = null;
           return retnValue;
       } 
       public generateEmail(String firstName,String lastName,String department) {
    	   String retnValue = null;
    	   retnValue = firstName+lastName+"@."+department+".greatlearning.com";
       }
}
