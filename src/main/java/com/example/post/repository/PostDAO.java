package com.example.post.repository;


import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.post.exception.PostException;
import com.example.post.vo.PostVO;

@Repository
public class PostDAO {
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSession sqlSession;
	
	
	public List<PostVO> getList() throws PostException {
		List<PostVO> list = sqlSession.selectList("guestbook.getList");
		return list;
	}
	
	public boolean insert(PostVO vo ) throws PostException {
		int count = sqlSession.insert("guestbook.insert", vo);
		return count == 1;
	}
	
	public boolean delete(Integer no) throws PostException {
		int count = sqlSession.delete("guestbook.delete", no);
		return count == 1;
	}

}