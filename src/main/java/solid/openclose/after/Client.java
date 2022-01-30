package solid.openclose.after;

public class Client {

	private IMessageTransformer messageTransformer;

	public String transformMessage(String message) {
		return this.messageTransformer.transform(message);
	}
}
