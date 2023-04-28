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


import com.dao.ChenggongjiluDao;
import com.entity.ChenggongjiluEntity;
import com.service.ChenggongjiluService;
import com.entity.vo.ChenggongjiluVO;
import com.entity.view.ChenggongjiluView;

@Service("chenggongjiluService")
public class ChenggongjiluServiceImpl extends ServiceImpl<ChenggongjiluDao, ChenggongjiluEntity> implements ChenggongjiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChenggongjiluEntity> page = this.selectPage(
                new Query<ChenggongjiluEntity>(params).getPage(),
                new EntityWrapper<ChenggongjiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChenggongjiluEntity> wrapper) {
		  Page<ChenggongjiluView> page =new Query<ChenggongjiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChenggongjiluVO> selectListVO(Wrapper<ChenggongjiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChenggongjiluVO selectVO(Wrapper<ChenggongjiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChenggongjiluView> selectListView(Wrapper<ChenggongjiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChenggongjiluView selectView(Wrapper<ChenggongjiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
