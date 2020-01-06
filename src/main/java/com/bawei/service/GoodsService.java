package com.bawei.service;

import java.util.List;

import com.bawei.domain.Goods;
import com.bawei.vo.GoodsVO;

public interface GoodsService {

	List<Goods> list(GoodsVO vo);
	
	int add(List<Goods> g);

	Goods Toupdate(int id);
}
