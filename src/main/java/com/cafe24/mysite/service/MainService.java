package com.cafe24.mysite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.mysite.repository.MainDao;
import com.cafe24.mysite.vo.MainVo;

@Service
public class MainService {

	@Autowired
	MainDao mainDao;

	public MainVo getInfo() {
		return mainDao.getInfo();
	}

	public Boolean updateInfo(MainVo mainVo) {
		return mainDao.updateInfo(mainVo);
	}
}
