package org.llsmp.model.dao;

/**
 * <p>Title:${type_inName}<p/>
 * <p>Description:<p/>
 * <p>Company: </p>
 *
 * @author litao
 * @mail llsmpsvn@gmail.com
 * @date on 2016/12/27
 */
public interface GenericDao {

    <T> void save(T t);

    <T> void delete(T t);

    <T> void update(T t);

    <T> T findById(Class<T> clazz, int id);
}
