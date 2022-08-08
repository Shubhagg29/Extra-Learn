package string;

public class LongestWord {

	public static void main(String[] args) {
		
     String sent="The great physics jump b00abloo lunch";
    String LongestWord="";
  String word[]=  sent.split(" ");
  
  for(int i=0;i< word.length ;i++) {
	  String inWord= word[i];
	  if(inWord.length()>LongestWord.length()) {
		  LongestWord= inWord;
	  }
  }
System.out.println(LongestWord);
}
}