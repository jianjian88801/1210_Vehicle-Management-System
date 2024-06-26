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
 * 证件信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
@TableName("zhengjianxinxi")
public class ZhengjianxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhengjianxinxiEntity() {
		
	}
	
	public ZhengjianxinxiEntity(T t) {
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
	 * 工号
	 */
					
	private String gonghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date youxiaoriqi;
	
	/**
	 * 违规内容
	 */
					
	private String weiguineirong;
	
	
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
