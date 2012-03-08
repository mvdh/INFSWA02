package social;

import java.lang.reflect.InvocationHandler;

public class ProxyMessageFactory implements MessageFactory {

	InvocationHandler invocationHandler;
	
	public ProxyMessageFactory(InvocationHandler ih) {
		invocationHandler = ih;
	}

	@Override
	public Message createMessage() {
		return null;
	}
	
}
