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


import com.dao.ShiwujubaoDao;
import com.entity.ShiwujubaoEntity;
import com.service.ShiwujubaoService;
import com.entity.vo.ShiwujubaoVO;
import com.entity.view.ShiwujubaoView;

@Service("shiwujubaoService")
public class ShiwujubaoServiceImpl extends ServiceImpl<ShiwujubaoDao, ShiwujubaoEntity> implements ShiwujubaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiwujubaoEntity> page = this.selectPage(
                new Query<ShiwujubaoEntity>(params).getPage(),
                new EntityWrapper<ShiwujubaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiwujubaoEntity> wrapper) {
		  Page<ShiwujubaoView> page =new Query<ShiwujubaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiwujubaoVO> selectListVO(Wrapper<ShiwujubaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiwujubaoVO selectVO(Wrapper<ShiwujubaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiwujubaoView> selectListView(Wrapper<ShiwujubaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiwujubaoView selectView(Wrapper<ShiwujubaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
