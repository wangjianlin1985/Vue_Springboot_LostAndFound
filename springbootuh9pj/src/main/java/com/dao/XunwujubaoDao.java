package com.dao;

import com.entity.XunwujubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XunwujubaoVO;
import com.entity.view.XunwujubaoView;


/**
 * 寻物举报
 * 
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface XunwujubaoDao extends BaseMapper<XunwujubaoEntity> {
	
	List<XunwujubaoVO> selectListVO(@Param("ew") Wrapper<XunwujubaoEntity> wrapper);
	
	XunwujubaoVO selectVO(@Param("ew") Wrapper<XunwujubaoEntity> wrapper);
	
	List<XunwujubaoView> selectListView(@Param("ew") Wrapper<XunwujubaoEntity> wrapper);

	List<XunwujubaoView> selectListView(Pagination page,@Param("ew") Wrapper<XunwujubaoEntity> wrapper);
	
	XunwujubaoView selectView(@Param("ew") Wrapper<XunwujubaoEntity> wrapper);
	

}
