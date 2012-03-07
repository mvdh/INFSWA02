package social;

public class User {

	ProxyMessageFactory messageFactory;
	UserMessages<Message> messages;
	
	public User(ProxyMessageFactory mf){
		messages = new UserMessages<Message>();
		messageFactory = mf;
	}
	
}
