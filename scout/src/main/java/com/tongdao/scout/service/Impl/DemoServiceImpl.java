package com.tongdao.scout.service.Impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tongdao.scout.dao.DemoMapper;
import com.tongdao.scout.pojo.Demo;
import com.tongdao.scout.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService{
    @Autowired
    private DemoMapper demoMapper;
	@Override
	public Demo selectOneById(Integer id) {
		return demoMapper.selectByPrimaryKey(id);
	}
	

}
