package com.paradise.app.dao;

public interface DaoFactory {

	<T> BaseDaoImpl<T> getDao(Class<T> type);

}
