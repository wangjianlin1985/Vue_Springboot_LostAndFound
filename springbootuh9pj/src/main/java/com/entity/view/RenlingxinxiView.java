package com.entity.view;

import com.entity.RenlingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 认领信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
@TableName("renlingxinxi")
public class RenlingxinxiView  extends RenlingxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenlingxinxiView(){
	}
 
 	public RenlingxinxiView(RenlingxinxiEntity renlingxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, renlingxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
