public class chap4 {

	public static void main(String[] args) {

		int number = 12321;
		String str = Integer.toString(number);
		
		StringBuffer sb = new StringBuffer(str);
		String reversedStr = sb.reverse().toString();
			
//		String str = Integer.toString(number);
//		String str2 = "";
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			str2 += str.charAt(i);
//
//		}
		System.out.println(str + " " + reversedStr);
		if (str.equals(reversedStr)) {
			System.out.println("회문수");
		} else {
			System.out.println("회문수 아님");
		}

	}

}