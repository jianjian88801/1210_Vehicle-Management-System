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
 * 车辆信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
@TableName("cheliangxinxi")
public class CheliangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CheliangxinxiEntity() {
		
	}
	
	public CheliangxinxiEntity(T t) {
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
	 * 车辆类型
	 */
					
	private String cheliangleixing;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 车牌号
	 */
					
	private String chepaihao;
	
	/**
	 * 车辆颜色
	 */
					
	private String cheliangyanse;
	
	/**
	 * 停放位置
	 */
					
	private String tingfangweizhi;
	
	/**
	 * 车辆详情
	 */
					
	private String cheliangxiangqing;
	
	/**
	 * 投保日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date toubaoriqi;
	
	/**
	 * 到期日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date daoqiriqi;
	
	/**
	 * 年检日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date nianjianriqi;
	
	/**
	 * 车辆状况
	 */
					
	private String cheliangzhuangkuang;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	
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
	 * 设置：车辆类型
	 */
	public void setCheliangleixing(String cheliangleixing) {
		this.cheliangleixing = cheliangleixing;
	}
	/**
	 * 获取：车辆类型
	 */
	public String getCheliangleixing() {
		return cheliangleixing;
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
	 * 设置：车辆颜色
	 */
	public void setCheliangyanse(String cheliangyanse) {
		this.cheliangyanse = cheliangyanse;
	}
	/**
	 * 获取：车辆颜色
	 */
	public String getCheliangyanse() {
		return cheliangyanse;
	}
	/**
	 * 设置：停放位置
	 */
	public void setTingfangweizhi(String tingfangweizhi) {
		this.tingfangweizhi = tingfangweizhi;
	}
	/**
	 * 获取：停放位置
	 */
	public String getTingfangweizhi() {
		return tingfangweizhi;
	}
	/**
	 * 设置：车辆详情
	 */
	public void setCheliangxiangqing(String cheliangxiangqing) {
		this.cheliangxiangqing = cheliangxiangqing;
	}
	/**
	 * 获取：车辆详情
	 */
	public String getCheliangxiangqing() {
		return cheliangxiangqing;
	}
	/**
	 * 设置：投保日期
	 */
	public void setToubaoriqi(Date toubaoriqi) {
		this.toubaoriqi = toubaoriqi;
	}
	/**
	 * 获取：投保日期
	 */
	public Date getToubaoriqi() {
		return toubaoriqi;
	}
	/**
	 * 设置：到期日期
	 */
	public void setDaoqiriqi(Date daoqiriqi) {
		this.daoqiriqi = daoqiriqi;
	}
	/**
	 * 获取：到期日期
	 */
	public Date getDaoqiriqi() {
		return daoqiriqi;
	}
	/**
	 * 设置：年检日期
	 */
	public void setNianjianriqi(Date nianjianriqi) {
		this.nianjianriqi = nianjianriqi;
	}
	/**
	 * 获取：年检日期
	 */
	public Date getNianjianriqi() {
		return nianjianriqi;
	}
	/**
	 * 设置：车辆状况
	 */
	public void setCheliangzhuangkuang(String cheliangzhuangkuang) {
		this.cheliangzhuangkuang = cheliangzhuangkuang;
	}
	/**
	 * 获取：车辆状况
	 */
	public String getCheliangzhuangkuang() {
		return cheliangzhuangkuang;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}

}
