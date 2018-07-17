package com.qfedu.service;

import com.qfedu.common.vo.EchartsVo;
import com.qfedu.common.vo.PageVo;
import com.qfedu.common.vo.ProcessVo;
import com.qfedu.domain.CheckProcess;


public interface CheckProcessService {
    boolean insert(CheckProcess checkProcess,String rname);
    boolean update(String tid,int id, int flag);
    boolean del(String tid,String name,int id);
    PageVo<CheckProcess> queryAll(String no);
    PageVo<ProcessVo> queryByName(String name);
    EchartsVo queryBtEcharts(String pid);
}
