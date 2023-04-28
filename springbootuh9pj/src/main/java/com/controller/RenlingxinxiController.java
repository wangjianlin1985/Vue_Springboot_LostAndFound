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

import com.entity.RenlingxinxiEntity;
import com.entity.view.RenlingxinxiView;

import com.service.RenlingxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 认领信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
@RestController
@RequestMapping("/renlingxinxi")
public class RenlingxinxiController {
    @Autowired
    private RenlingxinxiService renlingxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RenlingxinxiEntity renlingxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("baoguanyuan")) {
			renlingxinxi.setFabuxuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			renlingxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RenlingxinxiEntity> ew = new EntityWrapper<RenlingxinxiEntity>();
		PageUtils page = renlingxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renlingxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RenlingxinxiEntity renlingxinxi, 
		HttpServletRequest request){
        EntityWrapper<RenlingxinxiEntity> ew = new EntityWrapper<RenlingxinxiEntity>();
		PageUtils page = renlingxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renlingxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RenlingxinxiEntity renlingxinxi){
       	EntityWrapper<RenlingxinxiEntity> ew = new EntityWrapper<RenlingxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( renlingxinxi, "renlingxinxi")); 
        return R.ok().put("data", renlingxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RenlingxinxiEntity renlingxinxi){
        EntityWrapper< RenlingxinxiEntity> ew = new EntityWrapper< RenlingxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( renlingxinxi, "renlingxinxi")); 
		RenlingxinxiView renlingxinxiView =  renlingxinxiService.selectView(ew);
		return R.ok("查询认领信息成功").put("data", renlingxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RenlingxinxiEntity renlingxinxi = renlingxinxiService.selectById(id);
        return R.ok().put("data", renlingxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RenlingxinxiEntity renlingxinxi = renlingxinxiService.selectById(id);
        return R.ok().put("data", renlingxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RenlingxinxiEntity renlingxinxi, HttpServletRequest request){
    	renlingxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(renlingxinxi);
        renlingxinxiService.insert(renlingxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RenlingxinxiEntity renlingxinxi, HttpServletRequest request){
    	renlingxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(renlingxinxi);
        renlingxinxiService.insert(renlingxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RenlingxinxiEntity renlingxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(renlingxinxi);
        renlingxinxiService.updateById(renlingxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        renlingxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<RenlingxinxiEntity> wrapper = new EntityWrapper<RenlingxinxiEntity>();
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
		if(tableName.equals("yonghu")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = renlingxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
