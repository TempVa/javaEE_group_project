package org.innopolis.javaEE.stat.model.dao;

import org.innopolis.javaEE.stat.model.pojo.Stat;
import org.innopolis.javaEE.stat.model.pojo.Top;
import org.innopolis.javaEE.utils.DataSourceFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StatDaoImpl implements StatDao {
    @Override
    public List<Stat> getAll() {
        List<Stat> stats = new ArrayList<>();
        String sql = "SELECT * FROM top";
        try(Connection connection = DataSourceFactory.getDataSource().getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM top;");

            while (resultSet.next()) {
                Stat stat = new Stat();
                stat.setId(resultSet.getInt("id"));
                stat.setUsername(resultSet.getString("username"));
                stat.setCountIn(resultSet.getInt("num_in"));
                stat.setCountOut(resultSet.getInt("num_out"));
                stat.setMeanIn(resultSet.getTime("mean_in"));
                stat.setMeanOut(resultSet.getTime("mean_out"));
                stat.setMeanWorktime(resultSet.getInt("mean_time"));
                stats.add(stat);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException ignored) {}
        return stats;
    }

    @Override
    public Stat getById(Integer id) {
        Stat stat = null;
        String sql = "SELECT * FROM top WHERE id = ?";

        try (Connection connection = DataSourceFactory.getDataSource().getConnection()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setObject(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                stat.setId(resultSet.getInt("id"));
                stat.setUsername(resultSet.getString("username"));
                stat.setCountIn(resultSet.getInt("num_in"));
                stat.setCountOut(resultSet.getInt("num_out"));
                stat.setMeanIn(resultSet.getTime("mean_in"));
                stat.setMeanOut(resultSet.getTime("mean_out"));
                stat.setMeanWorktime(resultSet.getInt("mean_time"));

                resultSet.close();
                statement.close();
                connection.close();
            }
        } catch (SQLException ignored) {}

        return stat;
    }
}
