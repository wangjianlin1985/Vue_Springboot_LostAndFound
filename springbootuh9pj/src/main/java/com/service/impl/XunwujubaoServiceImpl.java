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


import com.dao.XunwujubaoDao;
import com.entity.XunwujubaoEntity;
import com.service.XunwujubaoService;
import com.entity.vo.XunwujubaoVO;
import com.entity.view.XunwujubaoView;

@Service("xunwujubaoService")
public class XunwujubaoServiceImpl extends ServiceImpl<XunwujubaoDao, XunwujubaoEntity> implements XunwujubaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XunwujubaoEntity> page = this.selectPage(
                new Query<XunwujubaoEntity>(params).getPage(),
                new EntityWrapper<XunwujubaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XunwujubaoEntity> wrapper) {
		  Page<XunwujubaoView> page =new Query<XunwujubaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XunwujubaoVO> selectListVO(Wrapper<XunwujubaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XunwujubaoVO selectVO(Wrapper<XunwujubaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XunwujubaoView> selectListView(Wrapper<XunwujubaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XunwujubaoView selectView(Wrapper<XunwujubaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
