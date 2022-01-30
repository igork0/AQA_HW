package task2lab1;

public class GetNumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "Hello. My   name   is Dmytro    Sukhii.";
		
		System.out.println("Number of words = " + getNumberOfWords(words));
	}
	public static int getNumberOfWords(String s) {
		s = s.strip();
		if (s == "") {
			return 0;
		}
		int result = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != ' ' && s.charAt(i+1) == ' ') {
				result++;
			}
		}
		return result;
	}
}

	

