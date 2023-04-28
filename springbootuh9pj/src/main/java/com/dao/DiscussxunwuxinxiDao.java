package com.dao;

import com.entity.DiscussxunwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussxunwuxinxiVO;
import com.entity.view.DiscussxunwuxinxiView;


/**
 * 寻物信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface DiscussxunwuxinxiDao extends BaseMapper<DiscussxunwuxinxiEntity> {
	
	List<DiscussxunwuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussxunwuxinxiEntity> wrapper);
	
	DiscussxunwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussxunwuxinxiEntity> wrapper);
	
	List<DiscussxunwuxinxiView> selectListView(@Param("ew") Wrapper<DiscussxunwuxinxiEntity> wrapper);

	List<DiscussxunwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussxunwuxinxiEntity> wrapper);
	
	DiscussxunwuxinxiView selectView(@Param("ew") Wrapper<DiscussxunwuxinxiEntity> wrapper);
	

}
