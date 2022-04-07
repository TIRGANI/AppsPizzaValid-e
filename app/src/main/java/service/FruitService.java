package service;

import java.util.ArrayList;
import java.util.List;

import beans.Fruit;
import dao.IDao;

public class FruitService implements IDao<Fruit> {
    private List<Fruit> fruits;
    private static FruitService instance;
    public FruitService() {
        fruits = new ArrayList<>();
    }
    public static FruitService getInstance() {
        if(instance == null)
            instance =  new FruitService();
        return instance;
    }
    @Override
    public boolean create(Fruit o) {
        return fruits.add(o);
    }

    @Override
    public boolean update(Fruit o) {
        return false;
    }

    @Override
    public boolean delete(Fruit o) {
        return fruits.remove(o);
    }

    @Override
    public Fruit findById(int id) {
        for (Fruit f: fruits) {
            if (f.getId() == id)
            {
                return f;
            }
        }
        return null;
    }

    @Override
    public List<Fruit> findAll() {
        return fruits;
    }
}
