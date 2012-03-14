package social;


public class User {

	MessageFactory messageFactoryProxy;
	UserMessages<Message> messages;
	
	public User(MessageFactory mfp){
		messages = new UserMessages<Message>();
		messageFactoryProxy = mfp;
	}
	
	public void createMessage(MessageComponentFactory mcf, String header, String body, String footer){
		Message message = this.messageFactoryProxy.createMessage(mcf);
		message.header.set(header);
		message.body.set(body);
		message.footer.set(footer);
		messages.add(message);
	}
	
	public String lastMessage() {
		Message m = messages.get(messages.size() - 1);
		String r = 
			"Controle vanuit Network \n" +
			"Header: \t" + "(" + m.header.getClass() + ") " + m.header.get() + "\n" +
			"Body: \t\t" + "(" + m.body.getClass() + ") " + m.body.get() + "\n" +
			"Footer: \t" + "(" + m.footer.getClass() + ") " + m.footer.get() + "\n\n///////////////////////////////////////\n";
		return r;
	}
}
