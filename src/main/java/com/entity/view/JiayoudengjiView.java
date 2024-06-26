package com.entity.view;

import com.entity.JiayoudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 加油登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
@TableName("jiayoudengji")
public class JiayoudengjiView  extends JiayoudengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiayoudengjiView(){
	}
 
 	public JiayoudengjiView(JiayoudengjiEntity jiayoudengjiEntity){
 	try {
			BeanUtils.copyProperties(this, jiayoudengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
