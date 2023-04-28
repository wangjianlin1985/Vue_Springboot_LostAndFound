package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaoguanyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaoguanyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaoguanyuanView;


/**
 * 保管员
 *
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public interface BaoguanyuanService extends IService<BaoguanyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaoguanyuanVO> selectListVO(Wrapper<BaoguanyuanEntity> wrapper);
   	
   	BaoguanyuanVO selectVO(@Param("ew") Wrapper<BaoguanyuanEntity> wrapper);
   	
   	List<BaoguanyuanView> selectListView(Wrapper<BaoguanyuanEntity> wrapper);
   	
   	BaoguanyuanView selectView(@Param("ew") Wrapper<BaoguanyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaoguanyuanEntity> wrapper);
   	

}

