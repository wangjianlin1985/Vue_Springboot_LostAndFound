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


import com.dao.XunwuxinxiDao;
import com.entity.XunwuxinxiEntity;
import com.service.XunwuxinxiService;
import com.entity.vo.XunwuxinxiVO;
import com.entity.view.XunwuxinxiView;

@Service("xunwuxinxiService")
public class XunwuxinxiServiceImpl extends ServiceImpl<XunwuxinxiDao, XunwuxinxiEntity> implements XunwuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XunwuxinxiEntity> page = this.selectPage(
                new Query<XunwuxinxiEntity>(params).getPage(),
                new EntityWrapper<XunwuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XunwuxinxiEntity> wrapper) {
		  Page<XunwuxinxiView> page =new Query<XunwuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XunwuxinxiVO> selectListVO(Wrapper<XunwuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XunwuxinxiVO selectVO(Wrapper<XunwuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XunwuxinxiView> selectListView(Wrapper<XunwuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XunwuxinxiView selectView(Wrapper<XunwuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
