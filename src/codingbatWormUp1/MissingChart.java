package codingbatWormUp1;

public class MissingChart {

	public static void main(String[] args) {
	String str =  missingChart("kitten",1);
	 str = missingChart("kitten",4);
	System.out.println(str);
	

	}
	public static String missingChart(String str,int n) {
		return str.substring(0,n) + str.substring(n+1,str.length());
		
		     }

	}


