package controller.dao;

import controller.dao.connection.MyConnection;
import controller.exeptions.DataBaseRuntimeException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class AbstractCrudDaoImpl<E> implements CrudDao<E, Integer> {
    protected final MyConnection connector;
    private final String saveQuery;
    private final String findByIdQuery;
    private final String findAllQuery;
    private final String updateQuery;
    private final String deleteQuery;

    public AbstractCrudDaoImpl(MyConnection connector, String saveQuery, String findByIdQuery, String findAllQuery, String updateQuery, String deleteQuery) {
        this.connector = connector;
        this.saveQuery = saveQuery;
        this.findByIdQuery = findByIdQuery;
        this.findAllQuery = findAllQuery;
        this.updateQuery = updateQuery;
        this.deleteQuery = deleteQuery;
    }


    @Override
    public void save(E entity) {

    }

    @Override
    public Optional<E> findById(Integer param) {
        try {
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(findByIdQuery);
            preparedStatement.setInt(1, param);
            ResultSet rs = preparedStatement.executeQuery();

            return Optional.ofNullable(mapResultSetToEntity(rs));


        } catch (SQLException e) {
            throw new DataBaseRuntimeException(e);

        }


    }
    @Override
    public List<E> findAll() {
        try (Connection connection = connector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(findAllQuery)) {
            try (final ResultSet resultSet = preparedStatement.executeQuery()) {
                List<E> entities = new ArrayList<>();
                while (resultSet.next()) {
                    entities.add(mapResultSetToEntity(resultSet));
                }
                return new ArrayList<>(entities);
            }
        } catch (SQLException e) {
            throw new DataBaseRuntimeException(e);
        }
    }




    protected abstract E mapResultSetToEntity(ResultSet resultSet) throws SQLException;


}
