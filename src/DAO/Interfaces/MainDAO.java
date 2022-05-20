package DAO.Interfaces;

import java.util.ArrayList;

// T => Client
// T => Order
    public interface MainDAO<T> {
        ArrayList<T> getAll();
        T getById(int id);
        void save(T t);
        void update(T t);
        void delete(int id);
    }

