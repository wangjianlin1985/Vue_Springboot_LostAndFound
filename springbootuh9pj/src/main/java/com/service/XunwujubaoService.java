package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XunwujubaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XunwujubaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XunwujubaoView;


/**
 * 寻物举报
 *
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface XunwujubaoService extends IService<XunwujubaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XunwujubaoVO> selectListVO(Wrapper<XunwujubaoEntity> wrapper);
   	
   	XunwujubaoVO selectVO(@Param("ew") Wrapper<XunwujubaoEntity> wrapper);
   	
   	List<XunwujubaoView> selectListView(Wrapper<XunwujubaoEntity> wrapper);
   	
   	XunwujubaoView selectView(@Param("ew") Wrapper<XunwujubaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XunwujubaoEntity> wrapper);
   	

}

