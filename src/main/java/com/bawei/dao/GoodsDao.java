package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bawei.domain.Goods;
import com.bawei.vo.GoodsVO;

public interface GoodsDao {

	List<Goods> list(GoodsVO vo);

	int add(@Param("goods")List<Goods> goods);

	@Select("select * from week2 where id=#{id}")
	Goods toUpdate(int id);

}
