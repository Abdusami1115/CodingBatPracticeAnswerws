package codingbatWormUp1;

public class Front3Copies {

	public static void main(String[] args) {
		  String str = front3("tr");
		System.out.println(str);
}
	public static String front3(String str) {
		String front;
		if(str.length()>=3) {
			 front = str.substring(0, 3);
		}
			else {
				 front = str;
			}
			
			return front +front +front;
		}
			
		}
		
	


