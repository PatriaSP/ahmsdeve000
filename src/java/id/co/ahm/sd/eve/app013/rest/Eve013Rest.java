/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ahm.sd.eve.app013.rest;

import id.co.ahm.jxf.constant.CommonConstant;
import id.co.ahm.jxf.dto.DtoParamPaging;
import id.co.ahm.jxf.dto.DtoResponse;
import id.co.ahm.jxf.security.TokenPstUtil;
import id.co.ahm.sd.eve.app013.rest.view.Eve013ExportMonitoring;
import id.co.ahm.sd.eve.app013.service.Eve013Service;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author patria
 */
@Controller
@RequestMapping("sd/eve013")
public class Eve013Rest {
    
    @Autowired
    @Qualifier(value = "tokenPstUtil")
    private TokenPstUtil tokenPstUtil;
    
    @Autowired
    @Qualifier(value = "eve013Service")
    private Eve013Service eve013Service;
    
    @RequestMapping(value = "monitoringaccev", method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody DtoResponse getPlantLov(@RequestHeader(value = CommonConstant.JXID,
            defaultValue = "") String token,
            @RequestBody DtoParamPaging input) {
        return eve013Service.getMonitoringAccEv(input, tokenPstUtil.getUserCred(token));
    }
    
    @RequestMapping(value = "export-excel", method = RequestMethod.GET)
    public ModelAndView exportToExcel(
            @RequestParam(name = "JXID", required = true) String token,
            @RequestParam Map<String, Object> input) {
        
        DtoParamPaging param = new DtoParamPaging();
        input.remove("JXID");
        param.setSearch(input);
        
        Map<String, Object> src = new HashMap<>();
        src.put("tx", eve013Service.getMonitoringAccEv(param, tokenPstUtil.getUserCred(token)));
        src.put("input", param);

        return new ModelAndView(new Eve013ExportMonitoring(), "param", src);
    }
}
