package org.innopolis.javaEE.stat.model.dao;

import org.innopolis.javaEE.stat.model.pojo.Top;
import org.innopolis.javaEE.utils.DataSourceFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TopDaoImpl implements TopDao {
    @Override
    public List<Top> getTop() {
        List<Top> topList = new ArrayList<>();
        String sql = "SELECT * FROM top";
        try(Connection connection = DataSourceFactory.getDataSource().getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM top;");

            while (resultSet.next()) {
                Top top = new Top();
                top.setRank(resultSet.getInt("rank"));
                top.setUsername(resultSet.getString("username"));
                topList.add(top);
            }

            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException ignored) {
        }
        return topList;
    }
}
