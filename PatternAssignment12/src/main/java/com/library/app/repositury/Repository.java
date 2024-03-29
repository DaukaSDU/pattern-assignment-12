package com.library.app.repositury;

import com.library.app.pojo.Item;

import java.util.List;

public interface Repository {

    List<Item> findAll();

    void save(Item item);

    Object find(int id);

    void update(int id, Item item);

    void delete(int id);

}
