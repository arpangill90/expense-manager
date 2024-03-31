package com.arpan.expensemanager.data.repository.custom;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class CustomizedSaveImpl<T> implements CustomizedSave<T> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public <S extends T> S saveEntity(S entity) {
        entityManager.persist(entity);
        return entity;
    }
}
