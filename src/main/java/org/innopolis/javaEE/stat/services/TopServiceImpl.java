package org.innopolis.javaEE.stat.services;

import org.innopolis.javaEE.stat.model.dao.TopDao;
import org.innopolis.javaEE.stat.model.dao.TopDaoImpl;
import org.innopolis.javaEE.stat.model.pojo.Top;

import java.util.List;

public class TopServiceImpl implements TopService {
    private static final TopDao TOP_DAO = new TopDaoImpl();
    @Override
    public List<Top> getTop() {
        return TOP_DAO.getTop();
    }
}
