package homework_1_q3;

public class homework_1_q3 {
	public static void main(String[] agrs){
		String firstName="suffee";
		String lastName="su";
		/**將姓名設定並以String 格式儲存*/
		
		String ay="ay";
		/**Pig Latin的結尾*/
		
		String firstNameUpper=firstName.toUpperCase();
		String lastNameUpper=lastName.toUpperCase();
		/**將姓名設定成大寫並以String 格式儲存*/
		
		
		char firstNameCharBefore=firstName.charAt(0);
		char lastNameCharBefore=lastName.charAt(0);
		/**姓名原本的字首的字元空間*/		
		
		char firstNameCharAfter=firstNameUpper.charAt(1);
		char lastNameCharAfter=lastNameUpper.charAt(1);
		/**姓名後來的字首的字元空間*/
		
		String firstNameIgpay=firstNameCharAfter+firstName.substring(2)+firstNameCharBefore+ay;
		String lastNameIgpay=lastNameCharAfter+lastName.substring(2)+lastNameCharBefore+ay;
		/**儲存轉換後的空間*/
		
		
		System.out.println(firstNameIgpay);
		System.out.println(lastNameIgpay);		
		/**印出字串*/
	}
	}
