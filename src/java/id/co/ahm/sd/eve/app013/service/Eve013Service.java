/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ahm.sd.eve.app013.service;

import id.co.ahm.jxf.dto.DtoParamPaging;
import id.co.ahm.jxf.dto.DtoResponse;
import id.co.ahm.jxf.vo.VoPstUserCred;

/**
 *
 * @author patria
 */
public interface Eve013Service {

    public DtoResponse getMonitoringAccEv(DtoParamPaging input, VoPstUserCred userCred);
    
}
