package social;

import java.lang.reflect.Method;

public class AllowedInvocationHandler implements MessageInvocationHandler {

	RealMessageFactory messageFactory;
	
	public AllowedInvocationHandler(RealMessageFactory mf) {
		messageFactory = mf;
	}
	
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
