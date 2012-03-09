package social;

public interface Observer {
	
	void subscribe(Subject s);
	void unsubscribe(Subject s);
	void update(Subject s);

}
