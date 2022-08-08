package inherritance;

public class Main {

	public static void main(String[] args) {
		
          Teacher t=  new Teacher();
          t.name="Stalin";
          
          t.eat();
          t.teach();
         
          t.walk();
          
          
          
          //t1.eat();

         //** Casting **// 
          Person t1 = new Teacher();
          Teacher t2 = (Teacher) t1;
         
	}

}
