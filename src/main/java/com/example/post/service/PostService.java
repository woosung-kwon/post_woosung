package com.example.post.service;

import java.util.List;

import com.example.post.repository.PostDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.post.vo.PostVO;

@Service
public class PostService {
	@Autowired
	private PostDAO guestBookDAO;
	
	
	public List<PostVO> getList(){
		return guestBookDAO.getList();
	}
	
	
	public boolean insert(PostVO vo ) {
		return guestBookDAO.insert(vo);
	}
	
	
	public boolean delete(PostVO vo) {
		return guestBookDAO.delete(vo.getNo());
	}
}

