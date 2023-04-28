package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussxunwuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussxunwuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussxunwuxinxiView;


/**
 * 寻物信息评论表
 *
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface DiscussxunwuxinxiService extends IService<DiscussxunwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussxunwuxinxiVO> selectListVO(Wrapper<DiscussxunwuxinxiEntity> wrapper);
   	
   	DiscussxunwuxinxiVO selectVO(@Param("ew") Wrapper<DiscussxunwuxinxiEntity> wrapper);
   	
   	List<DiscussxunwuxinxiView> selectListView(Wrapper<DiscussxunwuxinxiEntity> wrapper);
   	
   	DiscussxunwuxinxiView selectView(@Param("ew") Wrapper<DiscussxunwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussxunwuxinxiEntity> wrapper);
   	

}

