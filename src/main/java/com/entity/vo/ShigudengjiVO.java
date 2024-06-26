package com.entity.vo;

import com.entity.ShigudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 事故登记
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public class ShigudengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 发生日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fashengriqi;
		
	/**
	 * 事故地点
	 */
	
	private String shigudidian;
		
	/**
	 * 责任归属
	 */
	
	private String zerenguishu;
		
	/**
	 * 事故原因
	 */
	
	private String shiguyuanyin;
		
	/**
	 * 细节处理
	 */
	
	private String xijiechuli;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：发生日期
	 */
	 
	public void setFashengriqi(Date fashengriqi) {
		this.fashengriqi = fashengriqi;
	}
	
	/**
	 * 获取：发生日期
	 */
	public Date getFashengriqi() {
		return fashengriqi;
	}
				
	
	/**
	 * 设置：事故地点
	 */
	 
	public void setShigudidian(String shigudidian) {
		this.shigudidian = shigudidian;
	}
	
	/**
	 * 获取：事故地点
	 */
	public String getShigudidian() {
		return shigudidian;
	}
				
	
	/**
	 * 设置：责任归属
	 */
	 
	public void setZerenguishu(String zerenguishu) {
		this.zerenguishu = zerenguishu;
	}
	
	/**
	 * 获取：责任归属
	 */
	public String getZerenguishu() {
		return zerenguishu;
	}
				
	
	/**
	 * 设置：事故原因
	 */
	 
	public void setShiguyuanyin(String shiguyuanyin) {
		this.shiguyuanyin = shiguyuanyin;
	}
	
	/**
	 * 获取：事故原因
	 */
	public String getShiguyuanyin() {
		return shiguyuanyin;
	}
				
	
	/**
	 * 设置：细节处理
	 */
	 
	public void setXijiechuli(String xijiechuli) {
		this.xijiechuli = xijiechuli;
	}
	
	/**
	 * 获取：细节处理
	 */
	public String getXijiechuli() {
		return xijiechuli;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
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
			
}
