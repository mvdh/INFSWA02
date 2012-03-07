package social;

public interface MessageComponentFactory {

	Header createHeader();
	Body createBody();
	Footer createFooter();
	
}
