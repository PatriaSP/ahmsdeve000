/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ahm.sd.eve.app013.exception;

import java.util.List;
import java.util.Map;

/**
 *
 * @author patria
 */
public class Eve013Exception extends RuntimeException {
    private String errMsg;
    private List obj;

    private Map<String, List<String>> messages;

    public Eve013Exception(String message) {
        super(message);
        this.errMsg = message;
    }

    public Eve013Exception(Map<String, List<String>> messages) {
        this.messages = messages;
    }

    public Eve013Exception(String errMsg, List obj) {
        this.errMsg = errMsg;
        this.obj = obj;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public List getObj() {
        return obj;
    }

    public void setObj(List obj) {
        this.obj = obj;
    }
}


