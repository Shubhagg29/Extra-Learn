package InterfaceDemo;

public interface Player extends Trophy {
	
	
	 

	public void footBaller();
	
  
	//**From Java 8 we concrete method can be created in Interface using dewfault keyword***
	default void clubs() {
	   System.out.println("Player selectrion for clubs");
   }
	  
	
}
