package com.entity.vo;

import com.entity.ChenggongjiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 成功记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public class ChenggongjiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
	/**
	 * 物品分类
	 */
	
	private String wupinfenlei;
		
	/**
	 * 拾得地点
	 */
	
	private String shidedidian;
		
	/**
	 * 拾得时间
	 */
	
	private String shideshijian;
		
	/**
	 * 发布学号
	 */
	
	private String fabuxuehao;
		
	/**
	 * 发布姓名
	 */
	
	private String fabuxingming;
		
	/**
	 * 认领凭证
	 */
	
	private String renlingpingzheng;
		
	/**
	 * 申请原因
	 */
	
	private String shenqingyuanyin;
		
	/**
	 * 申请日期
	 */
	
	private String shenqingriqi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 认领地点
	 */
	
	private String renlingdidian;
		
	/**
	 * 认领时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date renlingshijian;
		
	/**
	 * 认领备注
	 */
	
	private String renlingbeizhu;
				
	
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
	 
	public void setShideshijian(String shideshijian) {
		this.shideshijian = shideshijian;
	}
	
	/**
	 * 获取：拾得时间
	 */
	public String getShideshijian() {
		return shideshijian;
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
	 * 设置：认领凭证
	 */
	 
	public void setRenlingpingzheng(String renlingpingzheng) {
		this.renlingpingzheng = renlingpingzheng;
	}
	
	/**
	 * 获取：认领凭证
	 */
	public String getRenlingpingzheng() {
		return renlingpingzheng;
	}
				
	
	/**
	 * 设置：申请原因
	 */
	 
	public void setShenqingyuanyin(String shenqingyuanyin) {
		this.shenqingyuanyin = shenqingyuanyin;
	}
	
	/**
	 * 获取：申请原因
	 */
	public String getShenqingyuanyin() {
		return shenqingyuanyin;
	}
				
	
	/**
	 * 设置：申请日期
	 */
	 
	public void setShenqingriqi(String shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public String getShenqingriqi() {
		return shenqingriqi;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：认领地点
	 */
	 
	public void setRenlingdidian(String renlingdidian) {
		this.renlingdidian = renlingdidian;
	}
	
	/**
	 * 获取：认领地点
	 */
	public String getRenlingdidian() {
		return renlingdidian;
	}
				
	
	/**
	 * 设置：认领时间
	 */
	 
	public void setRenlingshijian(Date renlingshijian) {
		this.renlingshijian = renlingshijian;
	}
	
	/**
	 * 获取：认领时间
	 */
	public Date getRenlingshijian() {
		return renlingshijian;
	}
				
	
	/**
	 * 设置：认领备注
	 */
	 
	public void setRenlingbeizhu(String renlingbeizhu) {
		this.renlingbeizhu = renlingbeizhu;
	}
	
	/**
	 * 获取：认领备注
	 */
	public String getRenlingbeizhu() {
		return renlingbeizhu;
	}
			
}
