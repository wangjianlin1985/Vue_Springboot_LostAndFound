package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwujubaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiwujubaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwujubaoView;


/**
 * 拾物举报
 *
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface ShiwujubaoService extends IService<ShiwujubaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiwujubaoVO> selectListVO(Wrapper<ShiwujubaoEntity> wrapper);
   	
   	ShiwujubaoVO selectVO(@Param("ew") Wrapper<ShiwujubaoEntity> wrapper);
   	
   	List<ShiwujubaoView> selectListView(Wrapper<ShiwujubaoEntity> wrapper);
   	
   	ShiwujubaoView selectView(@Param("ew") Wrapper<ShiwujubaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiwujubaoEntity> wrapper);
   	

}

