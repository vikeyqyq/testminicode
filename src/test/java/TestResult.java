import org.junit.Assert;
import org.junit.Test;

import com.vikey.MathUtil;

/**
 * 单元测试类
 * @author qyq
 *
 */
public class TestResult {
	
	@Test
	public void testResult(){
		
		MathUtil mathUtil=new MathUtil();
		
		//验证1是否字母是否对应
		Assert.assertEquals(mathUtil.getNumVal(1), "");
		//验证9是否字母是否对应
		Assert.assertEquals(mathUtil.getNumVal(9), "wxyz");
		//验证22是否字母是否对应
		Assert.assertEquals(mathUtil.getNumVal(22), "abcabc");
		//验证99是否字母是否对应
		Assert.assertEquals(mathUtil.getNumVal(99), "wxyzwxyz");
		//验证10是否字母是否对应
		Assert.assertEquals(mathUtil.getNumVal(10), "");
		
		
		//验证0,1的排列组合
		Assert.assertEquals(mathUtil.getTwoNumResult(0, 1), "");
		//验证10,11的排列组合
		Assert.assertEquals(mathUtil.getTwoNumResult(10, 11), "");
		//验证10,99的排列组合
		Assert.assertEquals(mathUtil.getTwoNumResult(10, 99), "w x y z");
		//验证45,89的排列组合
		Assert.assertEquals(mathUtil.getTwoNumResult(45, 89), 
				"gt gu gv gw gx gy gz ht hu hv hw hx hy hz it iu iv iw ix iy iz jt ju jv jw jx jy jz kt ku kv kw kx ky kz lt lu lv lw lx ly lz");
		//验证22,33的排列组合
		Assert.assertEquals(mathUtil.getTwoNumResult(22, 33), 
						"ad ae af bd be bf cd ce cf");
		
		
		//验证0到2的排列组合
		Assert.assertEquals(mathUtil.showResult(0, 2), 
				"a b c");
		//验证7到9的排列组合
		Assert.assertEquals(mathUtil.showResult(7, 9), 
				"pt pu pv qt qu qv rt ru rv st su sv tw tx ty tz uw ux uy uz vw vx vy vz");
		//验证超出范围时是否为空
		Assert.assertNull(mathUtil.showResult(0, 100));
				
		
		
	}

}
