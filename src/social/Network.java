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
		/*
		 * Eerste bericht
		 */
		MessageComponentFactory mcf = new TextMessageComponentFactory();
		User u = new User(this.getAllowedProxy(new RealMessageFactory()));
		try {
			u.createMessage(mcf, "Content TextHeader", "Content van TextBody", "Content van TextFooter");
			Message m = u.messages.get(u.messages.size() - 1);
			System.out.println(
			"Header: \t" + "(" + m.header.getClass() + ") " + m.header.get() + "\n" +
			"Body: \t\t" + "(" + m.body.getClass() + ") " + m.body.get() + "\n" +
			"Footer: \t" + "(" + m.footer.getClass() + ") " + m.footer.get() + "\n\n"
			);
		}
		catch(Exception e) {
			System.out.println("Sorry, eerste bericht niet gelukt");
		}
		
		
		/*
		 * Tweede bericht
		 */
		mcf = new ImageMessageComponentFactory();
		try {
			u.createMessage(mcf, "Content ImageHeader", "Content van ImageBody", "Content van ImageFooter");
			Message m = u.messages.get(u.messages.size() - 1);
			System.out.println(
			"Header: \t" + "(" + m.header.getClass() + ") " + m.header.get() + "\n" +
			"Body: \t\t" + "(" + m.body.getClass() + ") " + m.body.get() + "\n" +
			"Footer: \t" + "(" + m.footer.getClass() + ") " + m.footer.get() + "\n\n"
			);
		}
		catch(Exception e) {
			System.out.println("Sorry, tweede bericht niet gelukt");
		}
		
		
		
		u.messageFactoryProxy = this.getNotAllowedProxy(new RealMessageFactory());
		/*
		 * Derde bericht
		 */
		mcf = new ImageMessageComponentFactory();
		try {
			u.createMessage(mcf, "Content ImageHeader", "Content van ImageBody", "Content van ImageFooter");
			Message m = u.messages.get(u.messages.size() - 1);
			System.out.println(
			"Header: \t" + "(" + m.header.getClass() + ") " + m.header.get() + "\n" +
			"Body: \t\t" + "(" + m.body.getClass() + ") " + m.body.get() + "\n" +
			"Footer: \t" + "(" + m.footer.getClass() + ") " + m.footer.get()
			);
		}
		catch(Exception e) {
			System.out.println("Sorry, derde bericht niet gelukt");
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
