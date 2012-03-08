package social;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AllowedInvocationHandler implements InvocationHandler {

	MessageFactory realMessageFactory;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("createMessage")) {
			return method.invoke(realMessageFactory, args);
		}
		return null;
	}

	public AllowedInvocationHandler(MessageFactory rmf) {
		realMessageFactory = rmf;
	}
}
