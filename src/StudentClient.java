
public class StudentClient {
	    public static void main(String[] args) {
	        // TODO code application logic here
	   
	    
	   Student s1 = new Student("Sara", "103523667", 4.0);
	    
	   Student s2 = new Student("Max", "123543889", 3.2);
	    
	   System.out.println(s1.getName() + " " + s1.getSsn() + " " + s1.getGpa());
	    
	   System.out.println(s2.getName() + " " + s2.getSsn() + " " + s2.getGpa());
	      
	   System.out.println(s1.equals(s2));
	   
	  s2.setName(s1.getName());
	  
	  s2.setSsn(s1.getSsn()); 
	  
	  s2.setGpa(s1.getGpa());
	  
	  System.out.println(s2);
	     
	  System.out.println(s1.equals(s2));
	
	   
	    
	    
	    
	}

}
