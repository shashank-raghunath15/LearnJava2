package org.shashank.learnJava.util;

import java.util.List;

public interface Crud {

	public Object insert(Object object);

	public Object update(Object object);

	public Object delete(Object object);

	public List<Object> getAll(Class<?> object);
}
