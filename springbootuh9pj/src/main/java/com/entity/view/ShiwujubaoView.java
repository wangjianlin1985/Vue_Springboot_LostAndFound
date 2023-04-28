package com.entity.view;

import com.entity.ShiwujubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 拾物举报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
@TableName("shiwujubao")
public class ShiwujubaoView  extends ShiwujubaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiwujubaoView(){
	}
 
 	public ShiwujubaoView(ShiwujubaoEntity shiwujubaoEntity){
 	try {
			BeanUtils.copyProperties(this, shiwujubaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
