package social;

import java.util.ArrayList;


public class MessageDisplay implements Observer {

	ArrayList<UserMessages<Message>> subjects;
	
	public void display(Message m){
		System.out.println(m.header);
		System.out.println(m.body);
		System.out.println(m.footer);
	}

	@Override
	public void subscribe(Subject s) {
		s.attach(this);
		subjects.add((UserMessages<Message>)s);
	}

	@Override
	public void unsubscribe(Subject s) {
		s.detach(this);
		subjects.remove((UserMessages<Message>)s);
	}

	@Override
	public void update(Subject s) {
		for (UserMessages<Message> um : subjects){
			Message m = um.get(um.size()-1);
			display(m);
		}
	}



}
