
public class StringTest {

	public static void main(String[] args) {
		
		
		
		String str3= "I am dkfjsdfjdsfj 1234 fkjsdfksdjf567 fjsdkfdsjf";
		char[] chars1= str3.toCharArray();
		for(int i=0;i<chars1.length;i++) {
			if(Character.isAlphabetic(chars1[i])) {
				System.out.println(chars1[i]);
			}}
		}
}
