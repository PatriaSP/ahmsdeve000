/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ahm.sd.eve.app013.dao.impl;

import id.co.ahm.jxf.dao.DefaultHibernateDao;
import id.co.ahm.jxf.dto.DtoParamPaging;
import id.co.ahm.jxf.vo.VoPstUserCred;
import id.co.ahm.sd.eve.app013.constant.Eve013Constant;
import id.co.ahm.sd.eve.app013.util.Eve013QueryUtil;
import id.co.ahm.sd.eve.app013.vo.Eve013VoSearch;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;
import id.co.ahm.sd.eve.app013.dao.Eve013ObjectDao;
import java.math.BigDecimal;
import java.sql.Timestamp;
import org.hibernate.ScrollMode;
import org.hibernate.ScrollableResults;


/**
 *
 * @author patria
 */
@Repository("eve013ObjectDao")
public class Eve013ObjectDaoImpl extends DefaultHibernateDao<Object, Serializable> implements Eve013ObjectDao{

    @Override
    public int getCountMonitoringData(DtoParamPaging input, VoPstUserCred userCred) {

        String sql = Eve013QueryUtil.setParamQuery(Eve013Constant.SQL_MONITORING, input.getSearch(), Eve013Constant.PARAM_QUERY_SEARCH);

        Query query = getCurrentSession().createSQLQuery(Eve013QueryUtil.countQuery(sql));

        query = (SQLQuery) Eve013QueryUtil.setParamValue(query, input.getSearch(), Eve013Constant.PARAM_VALUE_SEARCH);
        query.setParameter("PMDCODE", "J20");

        Number number = (Number) query.uniqueResult();
        int count = number.intValue();

        return count;
    }

    @Override
    public List<Eve013VoSearch> getMonitoringData(DtoParamPaging input, VoPstUserCred userCred) {

        String sql = Eve013QueryUtil.setParamQuery(Eve013Constant.SQL_MONITORING, input.getSearch(), Eve013Constant.PARAM_QUERY_SEARCH);

        sql = Eve013QueryUtil.orderClause(input, sql, "", Eve013Constant.COL_ORDER);

        Query query = getCurrentSession().createSQLQuery(sql);

        query = (SQLQuery) Eve013QueryUtil.setParamValue(query, input.getSearch(), Eve013Constant.PARAM_VALUE_SEARCH);
        query.setParameter("PMDCODE", "J20");

        query.setMaxResults(input.getLimit());
        query.setFirstResult(input.getOffset());

        List<Eve013VoSearch> listResult = new ArrayList<>();
        int rownum = input.getOffset();
        Eve013VoSearch vo;
        Object[] result;
        int index;
        ScrollableResults list = query.scroll(ScrollMode.FORWARD_ONLY);
        while (list.next()) {
            result = (Object[]) list.get();
            index = 0;
            vo = new Eve013VoSearch();
            rownum++;
            vo.setROWNUM(rownum);
            vo.setSRN((result[index] == null) ? null : (String) result[index]);index++;
            vo.setACCTYPE((result[index] == null) ? null : (String) result[index]);index++;
            vo.setRECEIVEDATE((result[index] == null) ? null : (Timestamp) result[index]);index++;
            vo.setPRODDATE((result[index] == null) ? null : (Timestamp) result[index]);index++;
            vo.setDURATIONACCS((result[index] == null) ? null : (BigDecimal) result[index]);index++;
            vo.setLASTSTATUS((result[index] == null) ? null : (String) result[index]);index++;
            vo.setSHPLIST((result[index] == null) ? null : (String) result[index]);index++;
            vo.setSHPLISTDATE((result[index] == null) ? null : (Timestamp) result[index]);index++;
            vo.setPKGSHEETNUM((result[index] == null) ? null : (String) result[index]);index++;
            vo.setBOXNUM((result[index] == null) ? null : (String) result[index]);index++;
            vo.setCARTONNUM((result[index] == null) ? null : (String) result[index]);index++;
            vo.setPARTNUM((result[index] == null) ? null : (String) result[index]);index++;
            vo.setPARTDESC((result[index] == null) ? null : (String) result[index]);index++;
            vo.setTRUCKNUM((result[index] == null) ? null : (String) result[index]);index++;
            vo.setEXPCODE((result[index] == null) ? null : (String) result[index]);index++;
            vo.setEXPDESC((result[index] == null) ? null : (String) result[index]);index++;
            vo.setMDRECDATE((result[index] == null) ? null : (Timestamp) result[index]);index++;
            vo.setMDOUTDATE((result[index] == null) ? null : (Timestamp) result[index]);index++;
            vo.setMDSLNO((result[index] == null) ? null : (String) result[index]);index++;
            vo.setMDOUTDEALCODE((result[index] == null) ? null : (String) result[index]);index++;
            vo.setMDOUTDEALDESC((result[index] == null) ? null : (String) result[index]);index++;
            vo.setDEALRECDATE((result[index] == null) ? null : (Timestamp) result[index]);index++;
            vo.setDEALRECCODE((result[index] == null) ? null : (String) result[index]);index++;
            vo.setDEALRECDESC((result[index] == null) ? null : (String) result[index]);index++;
            vo.setBSTNUM((result[index] == null) ? null : (String) result[index]);index++;
            vo.setBSTDATE((result[index] == null) ? null : (Timestamp) result[index]);index++;
            vo.setFRMNUM((result[index] == null) ? null : (String) result[index]);index++;
            vo.setENGNUM((result[index] == null) ? null : (String) result[index]);index++;
            vo.setTYPECODE((result[index] == null) ? null : (String) result[index]);index++;
            vo.setCOLDESC((result[index] == null) ? null : (String) result[index]);index++;
            vo.setDEALSLSCODE((result[index] == null) ? null : (String) result[index]);index++;
            vo.setDEALSLSDESC((result[index] == null) ? null : (String) result[index]);index++;
            vo.setINVDIRSLSNUM((result[index] == null) ? null : (String) result[index]);index++;
            vo.setINVDIRSLSDATE((result[index] == null) ? null : (Timestamp) result[index]);index++;
            vo.setPHONENUM((result[index] == null) ? null : (String) result[index]);index++;
            vo.setNAME((result[index] == null) ? null : (String) result[index]);
            listResult.add(vo);
        }
        return listResult;
    }

}
