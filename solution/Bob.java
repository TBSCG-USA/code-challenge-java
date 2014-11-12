public class Bob {

	public String speak(String input) {
		if (input.trim().isEmpty()) {
			return "Fine. Be that way";
		} else if (input.matches(".*[a-zA-Z]+.*") && input.toUpperCase() 
				== input) {
			return "Woah, chill out";
		} else if (input.endsWith("?")) { 
			return "Sure";
		} else {
			return "Whatever";
		}
	}
}

