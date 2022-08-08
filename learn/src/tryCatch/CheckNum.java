package tryCatch;

public class CheckNum {

	public static void main(String[] args) {
		
		
		
		try{
			numberTest(2);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void numberTest(int num) throws IllegalArgumentException{

        if(num>0){
            System.out.println("YES");
            
        }
    
    
        else if(num==0){
        	throw new IllegalArgumentException("Zero Eror");
        }
        else if(num<0){
        	throw new IllegalArgumentException("Negative Eror");
        }
	}
		}

	


