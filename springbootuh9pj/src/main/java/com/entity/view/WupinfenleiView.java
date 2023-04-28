package com.entity.view;

import com.entity.WupinfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
@TableName("wupinfenlei")
public class WupinfenleiView  extends WupinfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinfenleiView(){
	}
 
 	public WupinfenleiView(WupinfenleiEntity wupinfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, wupinfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
