package solid.openclose.after;

public class Client {

	private IMessageTransformer messageTransformer;

	public Client(TransformType type) {
		this.messageTransformer = TransformerFactory.getTransformer(type);
	}

	public String transformMessage(String message) {
		return this.messageTransformer.transform(message);
	}

	public static void main(String[] args) {
		Client client = new Client(TransformType.LOWER_CASE);
		System.out.println(client.transformMessage("Hello World!"));

		client = new Client(TransformType.UPPER_CASE);
		System.out.println(client.transformMessage("Hello World!"));

		client = new Client(TransformType.TRIM);
		System.out.println(client.transformMessage(" Hello World! "));
	}
}
