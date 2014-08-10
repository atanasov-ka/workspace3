
public class Box<T> {

	public Box(T obj)
	{
		this.setObj(obj);
	}
	
	private T obj;

	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public static <T> T newInstance(Class<T> clazz) throws InstantiationException, IllegalAccessException
	{
		return clazz.newInstance();
	}
}
