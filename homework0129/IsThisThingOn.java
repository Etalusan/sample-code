public class IsThisThingOn {
	public static void main(String[]args) {
		String testString = "Testing, testing, is this thing on?";
		System.out.println(countTheVowels(testString));
	}
	public static int countTheVowels(String text) {
		int count = 0;
		for (int index = 0; index < text.length(); index++) {
			if (text.charAt(index)=='a'||
				text.charAt(index)=='e'||
				text.charAt(index)=='i'||
				text.charAt(index)=='o'||
				text.charAt(index)=='u')
			count++;
		}
		//TODO: Finish this.
		return count;
	}

}
