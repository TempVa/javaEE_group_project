package org.innopolis.javaEE.stat.model.dao;

import org.innopolis.javaEE.stat.model.pojo.Stat;

import java.util.List;

public interface StatDao {
    List<Stat> getAll();
    Stat getById(Integer id);
}
