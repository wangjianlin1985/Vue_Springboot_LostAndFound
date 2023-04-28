package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.BaoguanyuanDao;
import com.entity.BaoguanyuanEntity;
import com.service.BaoguanyuanService;
import com.entity.vo.BaoguanyuanVO;
import com.entity.view.BaoguanyuanView;

@Service("baoguanyuanService")
public class BaoguanyuanServiceImpl extends ServiceImpl<BaoguanyuanDao, BaoguanyuanEntity> implements BaoguanyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaoguanyuanEntity> page = this.selectPage(
                new Query<BaoguanyuanEntity>(params).getPage(),
                new EntityWrapper<BaoguanyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaoguanyuanEntity> wrapper) {
		  Page<BaoguanyuanView> page =new Query<BaoguanyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaoguanyuanVO> selectListVO(Wrapper<BaoguanyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaoguanyuanVO selectVO(Wrapper<BaoguanyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaoguanyuanView> selectListView(Wrapper<BaoguanyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaoguanyuanView selectView(Wrapper<BaoguanyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
