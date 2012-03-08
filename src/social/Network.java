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
		MessageFactory rmf = new RealMessageFactory();
		MessageFactory notAllowedProxy = this.getNotAllowedProxy(rmf);
		try {
			notAllowedProxy.createMessage();
		}
		catch(Exception e) {
			System.out.println("Oeps geen rechten.");
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
