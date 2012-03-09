package social;

import java.util.ArrayList;

public class MessageListDisplay implements Observer {

	ArrayList<UserMessages<Message>> subjects;
	
	public void display(){
		int i=0;
		for (UserMessages<Message> um : subjects){
			i++;
			System.out.println("Lijst "+i);
			for (Message m : um){
				System.out.println(m.header);
			}
		}
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
		display();
	}

}
