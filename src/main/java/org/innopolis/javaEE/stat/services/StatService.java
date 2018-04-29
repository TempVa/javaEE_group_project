package org.innopolis.javaEE.stat.services;

import org.innopolis.javaEE.stat.model.pojo.Stat;

import java.util.List;

public interface StatService {
    List<Stat> getAllStat();
    Stat getStatById(Integer id);
}
