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
 * 寻物信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
@TableName("xunwuxinxi")
public class XunwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XunwuxinxiEntity() {
		
	}
	
	public XunwuxinxiEntity(T t) {
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
	 * 寻物编号
	 */
					
	private String xunwubianhao;
	
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
	 * 丢失地点
	 */
					
	private String diushididian;
	
	/**
	 * 丢失时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date diushishijian;
	
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
	 * 设置：寻物编号
	 */
	public void setXunwubianhao(String xunwubianhao) {
		this.xunwubianhao = xunwubianhao;
	}
	/**
	 * 获取：寻物编号
	 */
	public String getXunwubianhao() {
		return xunwubianhao;
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
	 * 设置：丢失地点
	 */
	public void setDiushididian(String diushididian) {
		this.diushididian = diushididian;
	}
	/**
	 * 获取：丢失地点
	 */
	public String getDiushididian() {
		return diushididian;
	}
	/**
	 * 设置：丢失时间
	 */
	public void setDiushishijian(Date diushishijian) {
		this.diushishijian = diushishijian;
	}
	/**
	 * 获取：丢失时间
	 */
	public Date getDiushishijian() {
		return diushishijian;
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
