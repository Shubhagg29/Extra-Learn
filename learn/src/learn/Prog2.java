package learn;

public class Prog2 {
	
	

	public static void main(String[] args) {
		factorial();
		
     int num= 123456;
     
     int tem=num;
     int sum=0;
     
     while(tem>0) {
    	 
    	 int lastdigit= tem%10;
    	 
    	 if(lastdigit%2!=0) {
    		 
    		 sum =sum+ lastdigit;
    		 
    		 System.out.println(sum);
    	 }
    	tem = tem / 10;
     }
     System.out.println(sum);
    	  
      }
      

	public static void factorial() {
		int number= 4;
		int fact =1;
		for (int i=1;i<=number;i++) {
			fact = fact *i;
			
			
		}
		System.out.println(fact);
	}
	}


