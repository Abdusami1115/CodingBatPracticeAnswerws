package codingbatWormUp1;

public class DeleteDel {

	public static void main(String[] args) {
		String str = delDel("bDELHI");
		System.out.println(str);

	}
	public static String delDel(String str) {
		
		if (str.startsWith("del", 1) || (str.startsWith("DEL", 1))) {
		return str.charAt(0)+ str.substring(4);
		}
		else  
			return str;
		  
	}
	}
