
public class Student {
	  private String name;
	    private String ssNum;
	    private double gpa;
	    
	    public Student(String sName, String socialSecurityNum, double urGpa){
	        name = sName;
	        ssNum = socialSecurityNum;
	        gpa = urGpa;
	        
	    }
	    
	public String getName( ) {
	     return name;
	}
	 
	public void setName( String newName ) {
	     name = newName;
	}

	public String getSsn( ) {
	     return ssNum;
	}

	public void setSsn( String newSsn ) {
	     ssNum = newSsn;
	}
	   
	public double getGpa( ) {
	     return gpa;
	}
	public void setGpa( double newGpa ) {
	     gpa = newGpa;
	  
	         
	}
	public String toString( ) {
	    return name + " " + ssNum + " " + gpa;
	    
	    
	}
	public boolean equals( Student o) {
	
	    if(o.getName().equals(name) && o.getSsn().equals(ssNum) && o.getGpa() == (gpa)){
	          return true;
	    }
	    else{
	        return false;
	    
}
	}
}
