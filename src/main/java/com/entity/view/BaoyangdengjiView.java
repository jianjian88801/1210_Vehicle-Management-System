package com.entity.view;

import com.entity.BaoyangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 保养登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
@TableName("baoyangdengji")
public class BaoyangdengjiView  extends BaoyangdengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaoyangdengjiView(){
	}
 
 	public BaoyangdengjiView(BaoyangdengjiEntity baoyangdengjiEntity){
 	try {
			BeanUtils.copyProperties(this, baoyangdengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
