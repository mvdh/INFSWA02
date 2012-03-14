package social;

public class RealMessageFactory implements MessageFactory {

	@Override
	public Message createMessage(MessageComponentFactory mCF){
		return new Message(mCF);
	}
}
