package com.dao;

import com.entity.XunwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XunwuxinxiVO;
import com.entity.view.XunwuxinxiView;


/**
 * 寻物信息
 * 
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface XunwuxinxiDao extends BaseMapper<XunwuxinxiEntity> {
	
	List<XunwuxinxiVO> selectListVO(@Param("ew") Wrapper<XunwuxinxiEntity> wrapper);
	
	XunwuxinxiVO selectVO(@Param("ew") Wrapper<XunwuxinxiEntity> wrapper);
	
	List<XunwuxinxiView> selectListView(@Param("ew") Wrapper<XunwuxinxiEntity> wrapper);

	List<XunwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XunwuxinxiEntity> wrapper);
	
	XunwuxinxiView selectView(@Param("ew") Wrapper<XunwuxinxiEntity> wrapper);
	

}
