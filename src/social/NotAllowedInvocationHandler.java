package social;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NotAllowedInvocationHandler implements InvocationHandler {

	MessageFactory realMessageFactory;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("createMessage")) {
			throw new IllegalAccessException();
		}
		return null;
	}
	
	public NotAllowedInvocationHandler(MessageFactory rmf) {
		realMessageFactory = rmf;
	}
}
