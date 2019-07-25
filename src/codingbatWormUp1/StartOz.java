package codingbatWormUp1;

public class StartOz {
	public static void main(String[] args) {
		String str = startOz("obymama");
		System.out.println(str);
	}
	public static String startOz(String str) {
		if(str.startsWith("oz", 0)) 
				return "oz";
		if(str.startsWith("z", 1)) 
			return "z";
		if(str.startsWith("o", 0)) 
			return "o";
		else
			return "";
		
		  
	}	

}
