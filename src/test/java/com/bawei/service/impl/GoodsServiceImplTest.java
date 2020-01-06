package com.bawei.service.impl;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bawei.domain.Goods;
import com.bawei.service.GoodsService;
import com.yangchunbo.util.DateUtil;
import com.yangchunbo.util.NumberUtil;
import com.yangchunbo.util.StreamUtil;
import com.yangchunbo.util.StringUtil;
@ContextConfiguration(locations="classpath:spring-beans.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class GoodsServiceImplTest {

	@Resource
	private GoodsService service;

	@Test
	public void testAdd() {
		//读取文件
		List<String> list = StreamUtil.readLine(this.getClass().getResourceAsStream("/cms附件-机械设备公司年检信息.txt"));
		List<Goods> goodsList=new ArrayList<Goods>();
		//循环遍历
		for (int i = 0; i < list.size(); i++) {
			Goods g = new Goods();
			//根据空格分割成数组
			String[] s = list.get(i).split("\\	");
			if(NumberUtil.isNumber(s[0])) {
				BigInteger id = new BigInteger(s[0]);
				g.setId(id);
			}
			if(StringUtil.hasText(s[1]) && StringUtil.hasText(s[2]) && StringUtil.hasText(s[3])) {
				g.setGjz(s[1]);
				g.setMs(s[2]);
				g.setGsmc(s[3]);
			}
			if(StringUtil.hasText(s[6]) && NumberUtil.isNumber(s[6])) {
				g.setZczb(s[6]);
			}
			if(StringUtil.hasText(s[7])) {
				g.setRq(s[7]);
			}
			g.setZtcp(s[4]);
			g.setDz(s[5]);
			g.setNkzt("未安检");
			goodsList.add(g);
		}
		service.add(goodsList);
	}

}
