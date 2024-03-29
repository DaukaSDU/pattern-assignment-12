package com.library.app.service;

import com.library.app.pojo.Item;
import com.library.app.repositury.Repository;

import java.util.List;

public class ItemService implements Service {

    private Repository repository;

    public ItemService(Repository theRepository) {
        this.repository = theRepository;
    }

    @Override
    public List<Item> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Item item) {
        repository.save(item);
    }

    @Override
    public Object find(int id) {
        return repository.find(id);
    }

    @Override
    public void update(int id, Item item) {
        repository.update(id, item);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}
