package social;

import java.util.ArrayList;

public class MessageListDisplay implements Observer {

	ArrayList<UserMessages<Message>> subjects = new ArrayList<UserMessages<Message>>();
	
	public void display(){
		int i=0;
		System.out.println("MessageListDisplay:");
		for (UserMessages<Message> um : subjects){
			i++;
			System.out.println("User "+i);
			for (Message m : um){
				System.out.println(m.header.get());
			}
		}
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
		display();
	}

}
