package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChenggongjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChenggongjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChenggongjiluView;


/**
 * 成功记录
 *
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface ChenggongjiluService extends IService<ChenggongjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChenggongjiluVO> selectListVO(Wrapper<ChenggongjiluEntity> wrapper);
   	
   	ChenggongjiluVO selectVO(@Param("ew") Wrapper<ChenggongjiluEntity> wrapper);
   	
   	List<ChenggongjiluView> selectListView(Wrapper<ChenggongjiluEntity> wrapper);
   	
   	ChenggongjiluView selectView(@Param("ew") Wrapper<ChenggongjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChenggongjiluEntity> wrapper);
   	

}

