package social;

public class Network {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User user = new User(
				new ProxyMessageFactory(
						new AllowedInvocationHandler(
								new RealMessageFactory())));
		
		user.createMessage(new TextMessageComponentFactory(),
				"De kop!",
				"Het midden...",
				"De staart?");
	}

}
