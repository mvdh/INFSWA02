package social;

import java.util.ArrayList;


public class MessageDisplay implements Observer {

	UserMessages<Message> subject;
	
	public void display(Message m){
		System.out.println(m.header);
		System.out.println(m.body);
		System.out.println(m.footer);
	}

	@Override
	public void subscribe(Subject s) {
		s.attach(this);
		subject = (UserMessages<Message>)s;
	}

	@Override
	public void unsubscribe(Subject s) {
		s.detach(this);
		subject = null;
	}

	@Override
	public void update() {
		
		
	}



}
