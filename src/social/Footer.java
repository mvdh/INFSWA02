package social;

public abstract class Footer<T> {
	public T content;
	
	public T get() {
		return this.content;
	}
	
	public void set(T content) {
		this.content = content;	
	}
}
