package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiayoudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiayoudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiayoudengjiView;


/**
 * 加油登记
 *
 * @author 
 * @email 
 * @date 2021-04-26 10:19:40
 */
public interface JiayoudengjiService extends IService<JiayoudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiayoudengjiVO> selectListVO(Wrapper<JiayoudengjiEntity> wrapper);
   	
   	JiayoudengjiVO selectVO(@Param("ew") Wrapper<JiayoudengjiEntity> wrapper);
   	
   	List<JiayoudengjiView> selectListView(Wrapper<JiayoudengjiEntity> wrapper);
   	
   	JiayoudengjiView selectView(@Param("ew") Wrapper<JiayoudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiayoudengjiEntity> wrapper);
   	
}

