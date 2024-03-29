package com.library.app.repositury;

import com.library.app.pojo.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository implements Repository {

    private List<Item> database;
    private int id = 0;

    public ItemRepository() {
        database = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    @Override
    public List<Item> findAll() {
        return database;
    }

    @Override
    public void save(Item item) {
        database.add(item);
        id++;
    }

    @Override
    public Object find(int id) {
        return database.get(id);
    }

    @Override
    public void update(int id, Item item) {
        database.add(id, item);
    }

    @Override
    public void delete(int id) {
        database.set(id, null);
    }
}
