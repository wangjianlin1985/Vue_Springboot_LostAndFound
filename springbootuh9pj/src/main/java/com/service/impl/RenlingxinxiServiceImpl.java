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


import com.dao.RenlingxinxiDao;
import com.entity.RenlingxinxiEntity;
import com.service.RenlingxinxiService;
import com.entity.vo.RenlingxinxiVO;
import com.entity.view.RenlingxinxiView;

@Service("renlingxinxiService")
public class RenlingxinxiServiceImpl extends ServiceImpl<RenlingxinxiDao, RenlingxinxiEntity> implements RenlingxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenlingxinxiEntity> page = this.selectPage(
                new Query<RenlingxinxiEntity>(params).getPage(),
                new EntityWrapper<RenlingxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenlingxinxiEntity> wrapper) {
		  Page<RenlingxinxiView> page =new Query<RenlingxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenlingxinxiVO> selectListVO(Wrapper<RenlingxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenlingxinxiVO selectVO(Wrapper<RenlingxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenlingxinxiView> selectListView(Wrapper<RenlingxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenlingxinxiView selectView(Wrapper<RenlingxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
