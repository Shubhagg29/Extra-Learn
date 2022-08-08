package singelton;

public class DemoSingelton {
	
	
	private DemoSingelton() {
		
	}

	private static DemoSingelton obj =null;
			
	public static DemoSingelton getInstance() {
		
		if(obj==null) {
			obj = new DemoSingelton();	
		}
		return obj;
	}
}
