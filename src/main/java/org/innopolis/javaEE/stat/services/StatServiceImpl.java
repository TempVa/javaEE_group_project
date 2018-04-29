package org.innopolis.javaEE.stat.services;

import org.innopolis.javaEE.stat.model.dao.StatDao;
import org.innopolis.javaEE.stat.model.dao.StatDaoImpl;
import org.innopolis.javaEE.stat.model.pojo.Stat;

import java.util.List;

public class StatServiceImpl implements StatService {
    private static final StatDao STAT_DAO = new StatDaoImpl();

    @Override
    public List<Stat> getAllStat() {
        return STAT_DAO.getAll();
    }

    @Override
    public Stat getStatById(Integer id) {
        return STAT_DAO.getById(id);
    }
}
