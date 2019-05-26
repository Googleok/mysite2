package com.cafe24.mysite.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.mysite.vo.MainVo;

@Repository
public class MainDao {

	@Autowired
	private SqlSession sqlSession;

	public MainVo getInfo() {
		return sqlSession.selectOne("main.getInfo");
	}

	public Boolean updateInfo(MainVo mainVo) {
		int count = sqlSession.update("main.updateInfo", mainVo);
		return count == 1;
	}
}
