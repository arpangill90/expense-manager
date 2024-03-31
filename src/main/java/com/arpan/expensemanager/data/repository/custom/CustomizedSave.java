package com.arpan.expensemanager.data.repository.custom;

public interface CustomizedSave<T> {

    <S extends T> S saveEntity(S entity);
}
