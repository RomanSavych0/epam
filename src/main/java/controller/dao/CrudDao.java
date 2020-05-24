package controller.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface CrudDao<E , ID> {

    void save(E entity);

    Optional<E>findById(ID id) throws SQLException;

    List<E> findByStringParam(String param1, String param2);

    List<E> findAll();

}
