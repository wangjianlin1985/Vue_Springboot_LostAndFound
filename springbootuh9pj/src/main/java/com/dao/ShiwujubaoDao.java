package com.dao;

import com.entity.ShiwujubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwujubaoVO;
import com.entity.view.ShiwujubaoView;


/**
 * 拾物举报
 * 
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface ShiwujubaoDao extends BaseMapper<ShiwujubaoEntity> {
	
	List<ShiwujubaoVO> selectListVO(@Param("ew") Wrapper<ShiwujubaoEntity> wrapper);
	
	ShiwujubaoVO selectVO(@Param("ew") Wrapper<ShiwujubaoEntity> wrapper);
	
	List<ShiwujubaoView> selectListView(@Param("ew") Wrapper<ShiwujubaoEntity> wrapper);

	List<ShiwujubaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwujubaoEntity> wrapper);
	
	ShiwujubaoView selectView(@Param("ew") Wrapper<ShiwujubaoEntity> wrapper);
	

}
