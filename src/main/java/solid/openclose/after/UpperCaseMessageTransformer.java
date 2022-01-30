package solid.openclose.after;

public class UpperCaseMessageTransformer implements IMessageTransformer{

	@Override
	public String transform(String message) {
		return message.toUpperCase();
	}

}
