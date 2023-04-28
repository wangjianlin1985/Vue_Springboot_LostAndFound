package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 拾物信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
@TableName("shiwuxinxi")
public class ShiwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiwuxinxiEntity() {
		
	}
	
	public ShiwuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 拾物编号
	 */
					
	private String shiwubianhao;
	
	/**
	 * 物品名称
	 */
					
	private String wupinmingcheng;
	
	/**
	 * 物品分类
	 */
					
	private String wupinfenlei;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 拾得地点
	 */
					
	private String shidedidian;
	
	/**
	 * 拾得时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shideshijian;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	/**
	 * 发布学号
	 */
					
	private String fabuxuehao;
	
	/**
	 * 发布姓名
	 */
					
	private String fabuxingming;
	
	/**
	 * 联系手机
	 */
					
	private String lianxishouji;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：拾物编号
	 */
	public void setShiwubianhao(String shiwubianhao) {
		this.shiwubianhao = shiwubianhao;
	}
	/**
	 * 获取：拾物编号
	 */
	public String getShiwubianhao() {
		return shiwubianhao;
	}
	/**
	 * 设置：物品名称
	 */
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
	/**
	 * 设置：物品分类
	 */
	public void setWupinfenlei(String wupinfenlei) {
		this.wupinfenlei = wupinfenlei;
	}
	/**
	 * 获取：物品分类
	 */
	public String getWupinfenlei() {
		return wupinfenlei;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：拾得地点
	 */
	public void setShidedidian(String shidedidian) {
		this.shidedidian = shidedidian;
	}
	/**
	 * 获取：拾得地点
	 */
	public String getShidedidian() {
		return shidedidian;
	}
	/**
	 * 设置：拾得时间
	 */
	public void setShideshijian(Date shideshijian) {
		this.shideshijian = shideshijian;
	}
	/**
	 * 获取：拾得时间
	 */
	public Date getShideshijian() {
		return shideshijian;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
	/**
	 * 设置：发布学号
	 */
	public void setFabuxuehao(String fabuxuehao) {
		this.fabuxuehao = fabuxuehao;
	}
	/**
	 * 获取：发布学号
	 */
	public String getFabuxuehao() {
		return fabuxuehao;
	}
	/**
	 * 设置：发布姓名
	 */
	public void setFabuxingming(String fabuxingming) {
		this.fabuxingming = fabuxingming;
	}
	/**
	 * 获取：发布姓名
	 */
	public String getFabuxingming() {
		return fabuxingming;
	}
	/**
	 * 设置：联系手机
	 */
	public void setLianxishouji(String lianxishouji) {
		this.lianxishouji = lianxishouji;
	}
	/**
	 * 获取：联系手机
	 */
	public String getLianxishouji() {
		return lianxishouji;
	}

}
