package social;

public abstract class Body<T> {
	public T content;
	
	public T get() {
		return this.content;
	}
	
	public void set(T content) {
		this.content = content;	
	}
}
