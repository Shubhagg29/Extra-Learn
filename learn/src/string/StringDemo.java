package string;

public class StringDemo {
public static void main(String[]args) {
String name="    Shubham GUPTA  2 ";
String name2="Shubham";
String name3="Shubham";
	      
	      //System.out.println(name.trim());
	     System.out.println(name.replaceAll("\\s", ""));
	      
	      name2.substring(1, 6);
	      
	      String name1= new String ("Shubham");
	      
	    System.out.println(name2.equals(name1));
	    System.out.println(name2==name3);
	   
	      
	      
	     // System.out.println(name.indexOf("u"));
	      
	     // System.out.println(name.charAt(2));
	      
	    //  System.out.println(name.substring(1, 4));
	      String cars="Audi@BMW@Carrera@Duster@Eco@Ferrari";
	   String AllCars[]=   cars.split("@");
	   String[] word=   name.split("\\s");
	 
	   for(String ar:AllCars) {
	//System.out.println(ar);
	  
	   }
	   
	  for(int i=0;i<=word.length-1;i++) {
		//  System.out.print("DUPLICATE:: " +word[i]);
		  duplicateString();
	  }
	           }
	              
	
	public static  void duplicateString() {
String str = "w3schools";
	
	  int cnt = 0;
	  char[] inp = str.toCharArray();
	 // System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < str.length(); i++) {
	   for (int j = i+1 ; j < str.length(); j++) {
	    if (inp[i] == inp[j]) {
	   //  System.out.println(inp[j]);
	     cnt++;
	     break;
	    }
	   }
	  }
	}
}

