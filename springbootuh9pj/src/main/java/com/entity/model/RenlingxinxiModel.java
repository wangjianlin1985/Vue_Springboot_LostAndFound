package com.entity.model;

import com.entity.RenlingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 认领信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-29 20:48:46
 */
public class RenlingxinxiModel  implements Serializable {
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingriqi;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
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
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
