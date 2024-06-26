package com.entity.view;

import com.entity.YewudanjuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业务单据
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
@TableName("yewudanju")
public class YewudanjuView  extends YewudanjuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YewudanjuView(){
	}
 
 	public YewudanjuView(YewudanjuEntity yewudanjuEntity){
 	try {
			BeanUtils.copyProperties(this, yewudanjuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
