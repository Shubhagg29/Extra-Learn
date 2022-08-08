package string;

public class AnagramString {

	public static void main(String[] args) {

		String a = "act";
		String b = "aat";
		boolean isAnagram = false;
       boolean isVisited[]= new boolean[b.length()];
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				
				int c = a.charAt(i);
			 	isAnagram=false;
				for (int j = 0; j < b.length(); j++) {

					if (b.charAt(j) == c && !isVisited[j] ) {
						isVisited[j]=true;
						isAnagram = true;
						break;
					}

				}
			
				if(!(isAnagram))	{
					break;
				}
			}
			
		}
		if ((isAnagram)) {
			System.out.println("This is Anagram");
		} else {
			System.out.println("This is not Anagram");
		}
	}

	
	
	
}
