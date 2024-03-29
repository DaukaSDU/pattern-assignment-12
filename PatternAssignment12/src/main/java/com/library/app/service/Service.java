package com.library.app.service;

import com.library.app.pojo.Item;

import java.util.List;

public interface Service {

    List<Item> findAll();

    void save(Item item);

    Object find(int id);

    void update(int id, Item item);

    void delete(int id);

}
