package com.dao;

import com.entity.BaoguanyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoguanyuanVO;
import com.entity.view.BaoguanyuanView;


/**
 * 保管员
 * 
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface BaoguanyuanDao extends BaseMapper<BaoguanyuanEntity> {
	
	List<BaoguanyuanVO> selectListVO(@Param("ew") Wrapper<BaoguanyuanEntity> wrapper);
	
	BaoguanyuanVO selectVO(@Param("ew") Wrapper<BaoguanyuanEntity> wrapper);
	
	List<BaoguanyuanView> selectListView(@Param("ew") Wrapper<BaoguanyuanEntity> wrapper);

	List<BaoguanyuanView> selectListView(Pagination page,@Param("ew") Wrapper<BaoguanyuanEntity> wrapper);
	
	BaoguanyuanView selectView(@Param("ew") Wrapper<BaoguanyuanEntity> wrapper);
	

}
