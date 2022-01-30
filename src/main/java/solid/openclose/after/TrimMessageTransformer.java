package solid.openclose.after;

public class TrimMessageTransformer implements IMessageTransformer{

	@Override
	public String transform(String message) {
		return message.trim();
	}
	
	

}
