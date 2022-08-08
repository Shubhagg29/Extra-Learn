package hackerrank;

public class StringTest {
	
	public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";

//        int count = 1;
// 
//        for (int i = 0; i < str.length() - 1; i++)
//        {
//            if (((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))||(str.charAt(i)=='+\+'))
//            {
//                count++;
//            }
//        }
//        System.out.println(count);
//        
//        for(String s :str.split(" ")){ 
//        	 
//        	System.out.println(s); 
//        	 
//        	} 
        
       
            // Strip out non-word characters and replace with whitespace, trim leading/trailing whitespace
            s = s.replaceAll("[^\\p{Alpha}]+"," ");
           System.out.println(s.length());
           
                // Split the string into valid tokens
                String[] strings = s.split("\\p{Space}+");
                
                // Print number of tokens
            System.out.println(strings.length);
                
                // Print each token
                for(String str : strings){
                   System.out.println(str);
                }
            }
        
//        
    }
	


