/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ahm.sd.eve.app013.rest.advice;

import id.co.ahm.jxf.constant.StatusMsgEnum;
import id.co.ahm.jxf.dto.DtoResponse;
import id.co.ahm.jxf.util.DtoHelper;
import id.co.ahm.sd.eve.app013.exception.Eve013Exception;
import id.co.ahm.sd.eve.app013.rest.Eve013Rest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author patria
 */
@ControllerAdvice(basePackageClasses = {Eve013Rest.class})
public class Eve013RestAdvice {
    private static final String ERROR = "note";
    private static final String SERVER_PROCESSING_ERROR = "Server Processing Error";

    @ExceptionHandler({Exception.class,RuntimeException.class})
    public @ResponseBody
    DtoResponse handleException(Exception e, HttpServletResponse response) {
        
        e.printStackTrace();
        
        Map<String,Object> mapMsg = new HashMap<String, Object>();
        mapMsg.put( ERROR, SERVER_PROCESSING_ERROR );
        
        DtoResponse dto = DtoHelper.constructResponse( StatusMsgEnum.GAGAL, mapMsg, null );
        return dto;
        
    }
    @ExceptionHandler(Eve013Exception.class)
    @ResponseBody
    public DtoResponse handleException(Eve013Exception e, HttpServletResponse response) {
        e.printStackTrace();
        Map<String, Object> mapMsg = new HashMap<>();
        if (e.getObj() == null || e.getObj().isEmpty()) {
            mapMsg.put(ERROR, e.getMessage());
        } else {
            Map<Integer, Object> mapListError = new HashMap<>();
            List listerr = e.getObj();
            for (int i = 1; i <= listerr.size(); i++) {
                mapListError.put(i, listerr.get(i - 1));
            }
            mapMsg.put(ERROR, mapListError);
        }
        return DtoHelper.constructResponse(StatusMsgEnum.GAGAL, mapMsg, null);
    }
}
