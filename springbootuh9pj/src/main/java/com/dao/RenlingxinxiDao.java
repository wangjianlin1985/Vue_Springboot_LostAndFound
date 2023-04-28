package com.dao;

import com.entity.RenlingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenlingxinxiVO;
import com.entity.view.RenlingxinxiView;


/**
 * 认领信息
 * 
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface RenlingxinxiDao extends BaseMapper<RenlingxinxiEntity> {
	
	List<RenlingxinxiVO> selectListVO(@Param("ew") Wrapper<RenlingxinxiEntity> wrapper);
	
	RenlingxinxiVO selectVO(@Param("ew") Wrapper<RenlingxinxiEntity> wrapper);
	
	List<RenlingxinxiView> selectListView(@Param("ew") Wrapper<RenlingxinxiEntity> wrapper);

	List<RenlingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RenlingxinxiEntity> wrapper);
	
	RenlingxinxiView selectView(@Param("ew") Wrapper<RenlingxinxiEntity> wrapper);
	

}
