package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XunwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XunwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XunwuxinxiView;


/**
 * 寻物信息
 *
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface XunwuxinxiService extends IService<XunwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XunwuxinxiVO> selectListVO(Wrapper<XunwuxinxiEntity> wrapper);
   	
   	XunwuxinxiVO selectVO(@Param("ew") Wrapper<XunwuxinxiEntity> wrapper);
   	
   	List<XunwuxinxiView> selectListView(Wrapper<XunwuxinxiEntity> wrapper);
   	
   	XunwuxinxiView selectView(@Param("ew") Wrapper<XunwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XunwuxinxiEntity> wrapper);
   	

}

