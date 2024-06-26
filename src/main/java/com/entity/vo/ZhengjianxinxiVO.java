package com.entity.vo;

import com.entity.ZhengjianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 证件信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public class ZhengjianxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 准驾车型
	 */
	
	private String zhunjiachexing;
		
	/**
	 * 驾驶证图
	 */
	
	private String jiashizhengtu;
		
	/**
	 * 有效日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date youxiaoriqi;
		
	/**
	 * 违规内容
	 */
	
	private String weiguineirong;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：年龄
	 */
	 
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
				
	
	/**
	 * 设置：准驾车型
	 */
	 
	public void setZhunjiachexing(String zhunjiachexing) {
		this.zhunjiachexing = zhunjiachexing;
	}
	
	/**
	 * 获取：准驾车型
	 */
	public String getZhunjiachexing() {
		return zhunjiachexing;
	}
				
	
	/**
	 * 设置：驾驶证图
	 */
	 
	public void setJiashizhengtu(String jiashizhengtu) {
		this.jiashizhengtu = jiashizhengtu;
	}
	
	/**
	 * 获取：驾驶证图
	 */
	public String getJiashizhengtu() {
		return jiashizhengtu;
	}
				
	
	/**
	 * 设置：有效日期
	 */
	 
	public void setYouxiaoriqi(Date youxiaoriqi) {
		this.youxiaoriqi = youxiaoriqi;
	}
	
	/**
	 * 获取：有效日期
	 */
	public Date getYouxiaoriqi() {
		return youxiaoriqi;
	}
				
	
	/**
	 * 设置：违规内容
	 */
	 
	public void setWeiguineirong(String weiguineirong) {
		this.weiguineirong = weiguineirong;
	}
	
	/**
	 * 获取：违规内容
	 */
	public String getWeiguineirong() {
		return weiguineirong;
	}
			
}
