package social;

public class Network {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
