package social;

import java.util.ArrayList;


public class MessageDisplay implements Observer {

	ArrayList<UserMessages<Message>> subjects = new ArrayList<UserMessages<Message>>();
	
	public void display(Message m){
		System.out.println("MessageDisplay:");
		System.out.println(m.header.get());
		System.out.println(m.body.get());
		System.out.println(m.footer.get());
		System.out.println("");
	}

	@Override
	public void subscribe(Subject s) {
		s.attach(this);
		subjects.add((UserMessages<Message>)s);
	}

	@Override
	public void unsubscribe(Subject s) {
		s.detach(this);
		subjects.remove(s);
	}

	@Override
	public void update(Subject s) {
		for (UserMessages<Message> um : subjects){
			Message m = um.get(um.size()-1);
			display(m);
		}
	}



}
