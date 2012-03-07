package social;

public class ProxyMessageFactory implements MessageFactory {

	MessageInvocationHandler invocationHandler;
	
	public ProxyMessageFactory(MessageInvocationHandler ih) {
		invocationHandler = ih;
	}
	
}
