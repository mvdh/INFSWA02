package social;

import java.lang.reflect.Proxy;

public class Network {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Network n = new Network();
		n.dosomething();
	}

	public void dosomething() {
		
		User u = new User(this.getAllowedProxy(new RealMessageFactory()));
		User u2 = new User(this.getAllowedProxy(new RealMessageFactory()));
		MessageDisplay md = new MessageDisplay();
		md.subscribe(u.messages);

		MessageListDisplay mld = new MessageListDisplay();
		mld.subscribe(u.messages);
		mld.subscribe(u2.messages);
		
		/*
		 * Eerste bericht, user 1
		 */
		try {
			u.createMessage(new TextMessageComponentFactory(), "Aap", "Noot", "Mies");
			System.out.println(u.lastMessage());
		}
		catch(Exception e) {
			System.out.println("Sorry, eerste bericht niet gelukt\n");
		}
		
		/*
		 * Eerste bericht, user 2
		 */
		try {
			u2.createMessage(new TextMessageComponentFactory(), "Wim", "Zus", "Jet");
			System.out.println(u2.lastMessage());
		}
		catch(Exception e) {
			System.out.println("Sorry, eerste bericht niet gelukt");
		}		
		
		/*
		 * Tweede bericht, user 1
		 */
		try {
			u.createMessage(new ImageMessageComponentFactory(), "Teun", "Vuur", "Gijs");
			System.out.println(u.lastMessage());
		}
		catch(Exception e) {
			System.out.println("Sorry, tweede bericht niet gelukt");
		}
		
		
		u.messageFactoryProxy = this.getNotAllowedProxy(new RealMessageFactory());
		/*
		 * Derde bericht, user 1
		 */
		try {
			u.createMessage(new ImageMessageComponentFactory(), "Lam", "Kees", "Bok");
			System.out.println(u.lastMessage());
		}
		catch(Exception e) {
			System.out.println("Sorry, derde bericht niet gelukt\n");
			System.out.println("///////////////////////////////////");
		}
		
		/*
		 * Tweede bericht, user 2
		 */
		try {
			u2.createMessage(new TextMessageComponentFactory(), "Weide", "Does", "Hok");
			System.out.println(u2.lastMessage());
		}
		catch(Exception e) {
			System.out.println("Sorry, tweede bericht niet gelukt");
		}		
	}
	
	
	
	public MessageFactory getAllowedProxy(MessageFactory realMessageFactory) {
		return (MessageFactory) Proxy.newProxyInstance(
				realMessageFactory.getClass().getClassLoader(),
				realMessageFactory.getClass().getInterfaces(),
				new AllowedInvocationHandler(realMessageFactory));
	}
	
	public MessageFactory getNotAllowedProxy(MessageFactory realMessageFactory) {
		return (MessageFactory) Proxy.newProxyInstance(
				realMessageFactory.getClass().getClassLoader(),
				realMessageFactory.getClass().getInterfaces(),
				new NotAllowedInvocationHandler(realMessageFactory));
	}
}
