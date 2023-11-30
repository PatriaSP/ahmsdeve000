/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ahm.sd.eve.app013.dao;

import id.co.ahm.jxf.dto.DtoParamPaging;
import id.co.ahm.jxf.vo.VoPstUserCred;
import id.co.ahm.sd.eve.app013.vo.Eve013VoSearch;
import java.util.List;

/**
 *
 * @author patria
 */
public interface Eve013ObjectDao{

    public int getCountMonitoringData(DtoParamPaging input, VoPstUserCred userCred);

    public List<Eve013VoSearch> getMonitoringData(DtoParamPaging input, VoPstUserCred userCred);
    
}
