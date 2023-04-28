package com.entity.model;

import com.entity.WupinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物品分类
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public class WupinfenleiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 标签代码
	 */
	
	private String biaoqiandaima;
				
	
	/**
	 * 设置：标签代码
	 */
	 
	public void setBiaoqiandaima(String biaoqiandaima) {
		this.biaoqiandaima = biaoqiandaima;
	}
	
	/**
	 * 获取：标签代码
	 */
	public String getBiaoqiandaima() {
		return biaoqiandaima;
	}
			
}
