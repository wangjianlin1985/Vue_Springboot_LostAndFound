package com.entity.vo;

import com.entity.WupinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 物品分类
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public class WupinfenleiVO  implements Serializable {
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
