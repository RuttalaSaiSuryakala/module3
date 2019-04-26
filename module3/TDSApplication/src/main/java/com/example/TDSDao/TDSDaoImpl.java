package com.example.TDSDao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.model.TDSModel;
@Component("tdsdao")
@Repository
@ComponentScan("com")
public class TDSDaoImpl implements TDSDao {
	@PersistenceContext
	EntityManager entityManager;

	
	@Override
	public TDSModel getByDepartmentid(int pId) {
		// TODO Auto-generated method stub
		TDSModel tdsmodel=entityManager.find(TDSModel.class, pId);
		return tdsmodel;
		}

	
	
}
