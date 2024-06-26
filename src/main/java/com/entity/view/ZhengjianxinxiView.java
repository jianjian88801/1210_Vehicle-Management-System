package com.entity.view;

import com.entity.ZhengjianxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 证件信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
@TableName("zhengjianxinxi")
public class ZhengjianxinxiView  extends ZhengjianxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhengjianxinxiView(){
	}
 
 	public ZhengjianxinxiView(ZhengjianxinxiEntity zhengjianxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhengjianxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
