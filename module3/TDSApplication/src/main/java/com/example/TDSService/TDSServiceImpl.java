package com.example.TDSService;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.TDSDao.TDSDao;
import com.example.model.TDSModel;
@Component("tdsservice")
@Service
@Transactional
public class TDSServiceImpl implements TDSService {

	@Autowired
	TDSDao tdsdao;
	
	@Override
	public TDSModel getByDepartmentid(int pId) {
		// TODO Auto-generated method stub
		return tdsdao.getByDepartmentid(pId);
	}


	

}
