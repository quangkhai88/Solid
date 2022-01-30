package solid.openclose.before;

public class MessageTransformer {
	
	/*
	 * 
	 * This method break O (open close) principle, 
	 * When a new transformation type is added, we need to modify this code 
	 * => Have to refactor 
	 */
	
	public String transform(String message, TransformType type) {
		switch (type) {
			case LOWER_CASE:
				return message.toLowerCase();
			case UPPER_CASE:
				return message.toUpperCase();
			case TRIM:
				return message.trim();
			default:
				return message;
		}
		
	}

}
