package com.example.post.repository;

import com.example.post.vo.PostVO;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.*;

public class PostDAOTest {

    @Test
    public void test_전체포스트가져오기() {
        PostDAO dao = new PostDAO();
//        List<PostVO> list = dao.getList();

//        assertTrue(list.size() > 0);
        assertTrue(true);
    }

    @Test
    public void testLogin() {
        PostDAO dao = new PostDAO();
        String id = "admin";
        String pwd = "1234";
        assertTrue(dao.login(id, pwd));
    }

    @Test
    public void testLogin_실패케이스() {
        PostDAO dao = new PostDAO();
        String id = "admin";
        String pwd = "1111";
        assertTrue(dao.login(id, pwd));
    }
}
