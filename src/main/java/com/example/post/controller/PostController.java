package com.example.post.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.post.service.PostService;
import com.example.post.vo.PostVO;

@Controller
@RequestMapping("/old_post")
public class PostController {
	@Autowired
	private PostService postService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String list(Model model) {
		List<PostVO> list = postService.getList();
		model.addAttribute("list", list);
		return "index";
	}
	
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String insert(PostVO vo) {
		postService.insert(vo);
		return "redirect:/old_post/";
	}
	
	
	@RequestMapping(value="/deleteform", method=RequestMethod.GET)
	public String delete(@RequestParam Integer no, Model model) {
		model.addAttribute("no",no);
		return "deleteform";
	}
	
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String delete(PostVO vo) {
		postService.delete(vo);
		return "redirect:/old_post/";
	}
}
