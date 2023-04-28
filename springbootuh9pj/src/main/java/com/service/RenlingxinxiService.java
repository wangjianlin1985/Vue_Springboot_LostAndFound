package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenlingxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenlingxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenlingxinxiView;


/**
 * 认领信息
 *
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface RenlingxinxiService extends IService<RenlingxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenlingxinxiVO> selectListVO(Wrapper<RenlingxinxiEntity> wrapper);
   	
   	RenlingxinxiVO selectVO(@Param("ew") Wrapper<RenlingxinxiEntity> wrapper);
   	
   	List<RenlingxinxiView> selectListView(Wrapper<RenlingxinxiEntity> wrapper);
   	
   	RenlingxinxiView selectView(@Param("ew") Wrapper<RenlingxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenlingxinxiEntity> wrapper);
   	

}

