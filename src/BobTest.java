import java.util.HashMap;
import java.util.Map;

public class BobTest {

	public static void main(String[] args) {
		String w = "Whatever";
		String s = "Sure";
		String c = "Woah, chill out"; 
		String f = "Fine. Be that way";

		Map<String, String> map = new HashMap<String, String>();
		map.put("Hi", w);
		map.put("What is your favorite color?", s);
		map.put("STOP YELLING AT ME!", c);
		map.put("", f);
		map.put("WHAT WERE YOU THINKING?", c);
		map.put("1, 2, 3 GO!", c);
		map.put("1, 2, 3", w);
		map.put("ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!", c);
		map.put("4?", s);
		map.put("Ending with a ? means a question.", w);
		map.put("   ", f);
		
		for(Map.Entry<String, String> entry : map.entrySet()){
			speakTest(entry);
		}
		
	}
	
	public static void speakTest(Map.Entry<String, String> input) {

		Bob bob = new Bob();
		String response = bob.speak(input.getKey());

		if (response == input.getValue()) {
			System.out.println("       \"" + input.getKey() + 
					"\" correctly returned: \"" + response + "\"");
		} else {
			System.out.println("(FAIL) \"" + input.getKey() + "\" returned: \""
					+ response	+ "\", expected: \"" + input.getValue() + "\"");
		}
	}
}
