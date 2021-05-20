package OtherEasyOne;

public class StrngToObj {
	public static void name(String args[]) throws Exception{
		Class c = Class.forName("java.lang");
		System.out.println("ClassName:"+c.getName());
		System.out.println("Super class name: " +c.getSuperclass().getName());
		
		
	}

}
