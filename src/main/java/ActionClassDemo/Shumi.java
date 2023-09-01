package ActionClassDemo;

public class Shumi {
	
	
	public static void main(String[] args) {
		String a = "5";
		
		
		int convert = Integer.parseInt(a);
		
		System.out.println(convert+1);
		//System.out.println(Integer.parseInt(a));
		
		
		double y =5.5;
		System.out.println((int)y);
		
		
		
		
		}
	
//	// singleton class explanation.
//	
//	
//
//	   static Shumi sDemo1;// nshumi object
//	
//	   // constractor is privae
//	    private Shumi() {
//	        // Private constructor
//	    }
//
//	    
//	    //we use a static method to call the private 
//	    //constructor from whithin the class
//	    public static Shumi getInstance() {
//
//	    	
//	    	if(sDemo1 == null) {
//	    		
//	    		sDemo1 = new Shumi();
//	    	}
//	    	return sDemo1;
//	    }
//	    
//	//why singletone class?
//	    // so that only one instance of this class 
//	    // is created or to stop multiple object creation.
}
