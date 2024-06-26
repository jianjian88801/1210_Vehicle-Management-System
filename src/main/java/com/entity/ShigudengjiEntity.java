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
 * 事故登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
@TableName("shigudengji")
public class ShigudengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShigudengjiEntity() {
		
	}
	
	public ShigudengjiEntity(T t) {
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
	 * 车辆名称
	 */
					
	private String cheliangmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：车辆名称
	 */
	public void setCheliangmingcheng(String cheliangmingcheng) {
		this.cheliangmingcheng = cheliangmingcheng;
	}
	/**
	 * 获取：车辆名称
	 */
	public String getCheliangmingcheng() {
		return cheliangmingcheng;
	}
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
