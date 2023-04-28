package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XunwuxinxiEntity;
import com.entity.view.XunwuxinxiView;

import com.service.XunwuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 寻物信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
@RestController
@RequestMapping("/xunwuxinxi")
public class XunwuxinxiController {
    @Autowired
    private XunwuxinxiService xunwuxinxiService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XunwuxinxiEntity xunwuxinxi,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date diushishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date diushishijianend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("baoguanyuan")) {
			xunwuxinxi.setFabuxuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XunwuxinxiEntity> ew = new EntityWrapper<XunwuxinxiEntity>();
                if(diushishijianstart!=null) ew.ge("diushishijian", diushishijianstart);
                if(diushishijianend!=null) ew.le("diushishijian", diushishijianend);
		PageUtils page = xunwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xunwuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XunwuxinxiEntity xunwuxinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date diushishijianstart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date diushishijianend,
		HttpServletRequest request){
        EntityWrapper<XunwuxinxiEntity> ew = new EntityWrapper<XunwuxinxiEntity>();
                if(diushishijianstart!=null) ew.ge("diushishijian", diushishijianstart);
                if(diushishijianend!=null) ew.le("diushishijian", diushishijianend);
		PageUtils page = xunwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xunwuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XunwuxinxiEntity xunwuxinxi){
       	EntityWrapper<XunwuxinxiEntity> ew = new EntityWrapper<XunwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xunwuxinxi, "xunwuxinxi")); 
        return R.ok().put("data", xunwuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XunwuxinxiEntity xunwuxinxi){
        EntityWrapper< XunwuxinxiEntity> ew = new EntityWrapper< XunwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xunwuxinxi, "xunwuxinxi")); 
		XunwuxinxiView xunwuxinxiView =  xunwuxinxiService.selectView(ew);
		return R.ok("查询寻物信息成功").put("data", xunwuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XunwuxinxiEntity xunwuxinxi = xunwuxinxiService.selectById(id);
        return R.ok().put("data", xunwuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XunwuxinxiEntity xunwuxinxi = xunwuxinxiService.selectById(id);
        return R.ok().put("data", xunwuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XunwuxinxiEntity xunwuxinxi, HttpServletRequest request){
    	xunwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xunwuxinxi);
        xunwuxinxiService.insert(xunwuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XunwuxinxiEntity xunwuxinxi, HttpServletRequest request){
    	xunwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xunwuxinxi);
        xunwuxinxiService.insert(xunwuxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XunwuxinxiEntity xunwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xunwuxinxi);
        xunwuxinxiService.updateById(xunwuxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xunwuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XunwuxinxiEntity> wrapper = new EntityWrapper<XunwuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("baoguanyuan")) {
			wrapper.eq("fabuxuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = xunwuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
