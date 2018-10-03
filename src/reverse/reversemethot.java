package reverse;

public class reversemethot {


	public static String rev(String str1){

		String str="";

		for (int i=str1.length()-1;i>=0;i-- ){

			str= str + str1.charAt(i);

		}
		return str;	
		}


public static void main(String[] args) {

	System.out.println(rev("bu stringin tersi alinacak"));

	}
}
