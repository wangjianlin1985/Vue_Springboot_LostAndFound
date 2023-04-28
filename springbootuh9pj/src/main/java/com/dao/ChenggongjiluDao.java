package com.dao;

import com.entity.ChenggongjiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChenggongjiluVO;
import com.entity.view.ChenggongjiluView;


/**
 * 成功记录
 * 
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface ChenggongjiluDao extends BaseMapper<ChenggongjiluEntity> {
	
	List<ChenggongjiluVO> selectListVO(@Param("ew") Wrapper<ChenggongjiluEntity> wrapper);
	
	ChenggongjiluVO selectVO(@Param("ew") Wrapper<ChenggongjiluEntity> wrapper);
	
	List<ChenggongjiluView> selectListView(@Param("ew") Wrapper<ChenggongjiluEntity> wrapper);

	List<ChenggongjiluView> selectListView(Pagination page,@Param("ew") Wrapper<ChenggongjiluEntity> wrapper);
	
	ChenggongjiluView selectView(@Param("ew") Wrapper<ChenggongjiluEntity> wrapper);
	

}
