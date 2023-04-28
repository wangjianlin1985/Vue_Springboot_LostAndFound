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


import com.dao.DiscussxunwuxinxiDao;
import com.entity.DiscussxunwuxinxiEntity;
import com.service.DiscussxunwuxinxiService;
import com.entity.vo.DiscussxunwuxinxiVO;
import com.entity.view.DiscussxunwuxinxiView;

@Service("discussxunwuxinxiService")
public class DiscussxunwuxinxiServiceImpl extends ServiceImpl<DiscussxunwuxinxiDao, DiscussxunwuxinxiEntity> implements DiscussxunwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussxunwuxinxiEntity> page = this.selectPage(
                new Query<DiscussxunwuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussxunwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussxunwuxinxiEntity> wrapper) {
		  Page<DiscussxunwuxinxiView> page =new Query<DiscussxunwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussxunwuxinxiVO> selectListVO(Wrapper<DiscussxunwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussxunwuxinxiVO selectVO(Wrapper<DiscussxunwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussxunwuxinxiView> selectListView(Wrapper<DiscussxunwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussxunwuxinxiView selectView(Wrapper<DiscussxunwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
