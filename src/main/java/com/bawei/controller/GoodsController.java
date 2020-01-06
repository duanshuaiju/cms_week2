package com.bawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bawei.domain.Goods;
import com.bawei.service.GoodsService;
import com.bawei.vo.GoodsVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
//定义controller控制器注解
@Controller
public class GoodsController {
	//类型转换
	@Resource
	private GoodsService service;
	
	//访问list界面
	@RequestMapping("list")
	public String list(GoodsVO vo,Model m) {
		List<Goods> list=service.list(vo);
		m.addAttribute("list", list);
		m.addAttribute("v", vo);
		//返回list界面
		return "list";
	}
	
	//访问回显界面
	@RequestMapping("toUpdate")
	public String toUpdate(int id,Model m){
		//根据id查询
		Goods g=service.Toupdate(id);
		m.addAttribute("g", g);
		//返回回显界面
		return "update";
	}
}
