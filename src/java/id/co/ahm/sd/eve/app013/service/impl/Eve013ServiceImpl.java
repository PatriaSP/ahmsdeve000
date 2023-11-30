/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ahm.sd.eve.app013.service.impl;

import id.co.ahm.jxf.constant.StatusMsgEnum;
import id.co.ahm.jxf.dto.DtoParamPaging;
import id.co.ahm.jxf.dto.DtoResponse;
import id.co.ahm.jxf.util.DtoHelper;
import id.co.ahm.jxf.vo.VoPstUserCred;
import id.co.ahm.sd.eve.app013.service.Eve013Service;
import id.co.ahm.sd.eve.app013.vo.Eve013VoSearch;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import id.co.ahm.sd.eve.app013.dao.Eve013ObjectDao;

/**
 *
 * @author patria
 */
@Transactional
@Service(value = "eve013Service")
public class Eve013ServiceImpl implements Eve013Service{
    
    @Autowired
    @Qualifier("eve013ObjectDao")
    private Eve013ObjectDao eve013DefaultDao;

    @Override
    public DtoResponse getMonitoringAccEv(DtoParamPaging input, VoPstUserCred userCred) {
        int count = eve013DefaultDao.getCountMonitoringData(input,userCred);
        if(count != 0){
            List<Eve013VoSearch> data = eve013DefaultDao.getMonitoringData(input,userCred);
            return DtoHelper.constructResponsePaging(StatusMsgEnum.SUKSES, null, data, count);
        }else{
            return DtoHelper.constructResponsePaging(StatusMsgEnum.GAGAL, null, null, count);
        }
    }
    
}
