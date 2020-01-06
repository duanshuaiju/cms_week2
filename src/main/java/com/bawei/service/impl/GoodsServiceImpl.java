package com.bawei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.dao.GoodsDao;
import com.bawei.domain.Goods;
import com.bawei.service.GoodsService;
import com.bawei.vo.GoodsVO;

@Service
public class GoodsServiceImpl implements GoodsService{
	@Resource
	private GoodsDao dao;

	@Override
	public List<Goods> list(GoodsVO vo) {
		// TODO Auto-generated method stub
		return dao.list(vo);
	}

	@Override
	public int add(List<Goods> g) {
		// TODO Auto-generated method stub
		return dao.add(g);
	}

	@Override
	public Goods Toupdate(int id) {
		// TODO Auto-generated method stub
		return dao.toUpdate(id);
	}
}
