package objectPool.interfaces;

public interface Pool<T> {
	T acquire();
	void release(T t);

}
