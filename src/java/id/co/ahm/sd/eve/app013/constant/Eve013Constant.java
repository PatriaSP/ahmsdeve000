/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ahm.sd.eve.app013.constant;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author patria
 */
public class Eve013Constant {

    public static final Map<String, String> COL_ORDER = new LinkedHashMap<String, String>() {
        {
            put("srnSort", "SERIAL_NUMBER_MAKER");
            put("acctypeSort", "ACCESORIES_TYPE");
            put("receivedateSort", "AHM_RECEIVE_DATE");
            put("proddateSort", "PROD_DATE");
            put("durationaccsSort", "DURATION_ACCS_EV");
            put("laststatusSort", "LAST_STATUS");
            put("pkgsheetnumSort", "PACKING_SHEET_NUMBER");
            put("boxnumSort", "BOX_NUMBER");
            put("cartonnumSort", "CARTON_NUMBER");
            put("shplistSort", "SHIPPING_LIST");
            put("partnumSort", "PART_NUMBER");
            put("partdescSort", "PART_DESC");
            put("trucknumSort", "TRUCK_NO");
            put("expcodeSort", "EXPEDITION_CODE");
            put("expdescSort", "EXPEDITION_DESC");
            put("shplistdateSort", "SHIPPING_LIST_DATE");
            put("mdrecdateSort", "MD_RECEIVE_DATE");
            put("mdoutdateSort", "MD_OUT_DATE");
            put("mdslnoSort", "MD_SL_NO");
            put("mdoutdealcodeSort", "MD_OUT_DEALER_CODE");
            put("mdoutdealdescSort", "MD_OUT_DEALER_DESC");
            put("dealrecdateSort", "DEALER_RECEIVE_DATE");
            put("dealreccodeSort", "RECEIVE_DEALER_CODE");
            put("dealrecdescSort", "DEALER_RECEIVE_DESC");
            put("bstnumSort", "BAST_NO");
            put("bstdateSort", "BAST_DATE");
            put("frmnumSort", "FRAME_NO");
            put("engnumSort", "ENGINE_NO");
            put("typecodeSort", "TYPE_CODE");
            put("coldescSort", "COLOR_DESC");
            put("dealslscodeSort", "DEALER_SALES_CODE");
            put("dealslsdescSort", "DEALER_SALES_DESC");
            put("invdirslsnumSort", "INVOICE_DIRECT_SALES_NUMBER");
            put("invdirslsdateSort", "INVOICE_DIRECT_SALES_DATE");
            put("phonenumSort", "PHONE_NUMBER");
            put("nameSort", "NAME");
        }
    };

    public static final Map<String, String> PARAM_VALUE_SEARCH = new LinkedHashMap<String, String>() {
        {
            //Filter panel 
            put("SHIPLSTDATEFROM", "PSLAHMFROM");
            put("SHIPLSTDATETO", "PSLAHMTO");
            put("MDRECDATEFROM", "PRECMDFROM");
            put("MDRECDATETO", "PRECMDTO");
            put("MDOUTDATEFROM", "PSLMDFROM");
            put("MDOUTDATETO", "PSLMDTO");
            put("DEALRECDATEFROM", "PRECDLRFROM");
            put("DEALRECDATETO", "PRECDLRTO");
            put("BSTDATEFROM", "PBASTFROM");
            put("BSTDATETO", "PBASTTO");

            //Filter table
            put("SRN", "SRN");
            put("ACCTYPE", "ACCTYPE");
            put("RECEIVEDATE", "RECEIVEDATE");
            put("PRODDATE", "PRODDATE");
            put("DURATIONACCS", "DURATIONACCS");
            put("LASTSTATUS", "LASTSTATUS");
            put("PKGSHEETNUM", "PKGSHEETNUM");
            put("BOXNUM", "BOXNUM");
            put("CARTONNUM", "CARTONNUM");
            put("SHPLIST", "SHPLIST");
            put("PARTNUM", "PARTNUM");
            put("PARTDESC", "PARTDESC");
            put("TRUCKNUM", "TRUCKNUM");
            put("EXPCODE", "EXPCODE");
            put("EXPDESC", "EXPDESC");
            put("SHPLISTDATE", "SHPLISTDATE");
            put("MDRECDATE", "MDRECDATE");
            put("MDOUTDATE", "MDOUTDATE");
            put("MDSLNO", "MDSLNO");
            put("MDOUTDEALCODE", "MDOUTDEALCODE");
            put("MDOUTDEALDESC", "MDOUTDEALDESC");
            put("DEALRECDATE", "DEALRECDATE");
            put("DEALRECCODE", "DEALRECCODE");
            put("DEALRECDEST", "DEALRECDEST");
            put("BSTNUM", "BSTNUM");
            put("BSTDATE", "BSTDATE");
            put("FRMNUM", "FRMNUM");
            put("ENGNUM", "ENGNUM");
            put("TYPECODE", "TYPECODE");
            put("COLDESC", "COLDESC");
            put("DEALSLSCODE", "DEALSLSCODE");
            put("DEALSLSDESC", "DEALSLSDESC");
            put("INVDIRSLSNUM", "INVDIRSLSNUM");
            put("INVDIRSlSDATE", "INVDIRSlSDATE");
            put("PHONENUM", "PHONENUM");
            put("NAME", "NAME");
        }
    };

    public static final Map<String, Object> HEADER_EXPORT = new LinkedHashMap<String, Object>() {
        {
            put("No", "");
            put("Serial Number Marker", "");
            put("Battery/Charger Category", "");
            put("AHM Receive Date", "");
            put("Production Date", "");
            put("Duration Accs EV", "");
            put("Last Status", "");
            put("Packing Sheet Number", "");
            put("Box Number", "");
            put("Carton Number", "");
            put("Shipping List", "");
            put("Part Number", "");
            put("Part Desc", "");
            put("Truck No", "");
            put("Expedition Code", "");
            put("Expedition Desc", "");
            put("Shipping List Date", "");
            put("MD Receive Date", "");
            put("MD Out Date", "");
            put("MD SL No", "");
            put("MD Out Dealer Code", "");
            put("MD Out Dealer Desc", "");
            put("Dealer Receive Date", "");
            put("Dealer Receive Code", "");
            put("Dealer Receive Desc", "");
            put("Bast Number", "");
            put("Bast Date", "");
            put("Frame Number", "");
            put("Engine Number", "");
            put("Type Code(3 Digit)", "");
            put("Color Desc", "");
            put("Dealer Sales Code", "");
            put("Dealer Sales Desc", "");
            put("Invoice Direct Sales Number", "");
            put("Invoice Direct Sales Date", "");
            put("Phone Number", "");
            put("Name", "");
        }
    };

    public static final Map<String, String> PARAM_QUERY_SEARCH = new LinkedHashMap<String, String>() {
        {
            //Filter panel 
            put("SHIPLSTDATEFROM", "AND TRUNC(TXN.DSL) >= :PSLAHMFROM");
            put("SHIPLSTDATETO", "AND TRUNC(TXN.DSL) <= :PSLAHMTO");
            put("MDRECDATEFROM", "AND TRUNC(TXN.DRECMD) >= :PRECMDFROM");
            put("MDRECDATETO", "AND TRUNC(TXN.DRECMD) <= :PRECMDTO");
            put("MDOUTDATEFROM", "AND TRUNC(TXN.DSLMD) >= :PSLMDFROM");
            put("MDOUTDATETO", "AND TRUNC(TXN.DSLMD) <= :PSLMDTO");
            put("DEALRECDATEFROM", "AND TRUNC(TXN.DRECDLR) >= :PRECDLRFROM");
            put("DEALRECDATETO", "AND TRUNC(TXN.DRECDLR) <= :PRECDLRTO");
            put("BSTDATEFROM", "AND TRUNC(TXN.DBAST) >= :PBASTFROM");
            put("BSTDATETO", "AND TRUNC(TXN.DBAST) <= :PBASTTO");

            //Filter table
            put("SRN", "AND LOWER(MSDEVEACCSN_VSRNUMBER) LIKE LOWER(('%'||:SRN||'%'))");
            put("ACCTYPE", "AND LOWER((SELECT VITEMNAME FROM AHMPS2005.ahmmoerp_dtlsettings WHERE rset_vid =DSET_RSET_VID_TYACC AND VITEMCODE=DSET_VITEMCODE_TYACC)) LIKE LOWER(('%'||:ACCTYPE||'%'))");
            put("RECEIVEDATE", "AND TRUNC(DECODE(DSET_VITEMCODE_TYACC,'C',TXN.DRECVAHM,NULL)) = :RECEIVEDATE");
            put("PRODDATE", "AND TRUNC(MST.DPRODACC) = :PRODDATE");
            put("DURATIONACCS", "AND ROUND((NVL(NVL(txn.dbast,DINVDIRSAL),TRUNC(SYSDATE)) - MST.DPRODACC),0) LIKE ('%'||:DURATIONACCS||'%')");
            put("LASTSTATUS", "AND LOWER((SELECT VITEMNAME FROM AHMPS2005.ahmmoerp_dtlsettings WHERE rset_vid =DSET_RSET_VID_SNSTAT AND VITEMCODE=DSET_VITEMCODE_SNSTAT)) LIKE LOWER(('%'||:LASTSTATUS||'%'))");
            put("PKGSHEETNUM", "AND LOWER(VPACKNO) LIKE LOWER(('%'||:PKGSHEETNUM||'%'))");
            put("BOXNUM", "AND LOWER(VBOXNO) LIKE LOWER(('%'||:BOXNUM||'%'))");
            put("CARTONNUM", "AND LOWER(VCARTONNO) LIKE LOWER(('%'||:CARTONNUM||'%'))");
            put("SHPLIST", "AND LOWER(VSLAHM) LIKE LOWER(('%'||:SHPLIST||'%'))");
            put("PARTNUM", "AND LOWER(MST.VPARTNUM) LIKE LOWER(('%'||:PARTNUM||'%'))");
            put("PARTDESC", "AND LOWER((select vpartdesc from AHMPS2005.ahmmomsc_mstparts where VPARTNUM =MST.VPARTNUM)) LIKE LOWER(('%'||:PARTDESC||'%'))");
            put("TRUCKNUM", "AND LOWER(VPOLICENO) LIKE LOWER(('%'||:TRUCKNUM||'%'))");
            put("EXPCODE", "AND LOWER(VEXPID) LIKE LOWER(('%'||:EXPCODE||'%'))");
            put("EXPDESC", "AND LOWER(VEXPDESC) LIKE LOWER(('%'||:EXPDESC||'%'))");
            put("SHPLISTDATE", "AND TRUNC(TXN.DSL) = :SHPLISTDATE");
            put("MDRECDATE", "AND TRUNC(DRECMD) = :MDRECDATE");
            put("MDOUTDATE", "AND TRUNC(DSLMD) = :MDOUTDATE");
            put("MDSLNO", "AND LOWER(VSLMD) LIKE LOWER(('%'||:MDSLNO||'%'))");
            put("MDOUTDEALCODE", "AND LOWER(VDLRCODE3) LIKE LOWER(('%'||:MDOUTDEALCODE||'%'))");
            put("MDOUTDEALDESC", "AND LOWER((SELECT A.VND_NAME FROM FMPPC_PP00_VENDORS A WHERE A.VND_CODE =VDLRCODE3 AND A.VNDTYP_VND_TYPE = 'A' AND NVL(A.VND_KDEKS, 'D') <> 'E')) LIKE LOWER(('%'||:MDOUTDEALDESC||'%'))");
            put("DEALRECDATE", "AND TRUNC(DRECDLR) = :DEALRECDATE");
            put("DEALRECCODE", "AND LOWER(VDLRCODE4) LIKE LOWER(('%'||:DEALRECCODE||'%'))");
            put("DEALRECDEST", "AND LOWER((SELECT A.VND_NAME FROM FMPPC_PP00_VENDORS A WHERE A.VND_CODE =VDLRCODE4 AND A.VNDTYP_VND_TYPE = 'A' AND NVL(A.VND_KDEKS, 'D') <> 'E')) LIKE LOWER(('%'||:DEALRECDEST||'%'))");
            put("BSTNUM", "AND LOWER(VBAST) LIKE LOWER(('%'||:BSTNUM||'%'))");
            put("BSTDATE", "AND TRUNC(DBAST) = :BSTDATE");
            put("FRMNUM", "AND LOWER(VFRAMENO) LIKE LOWER(('%'||:FRMNUM||'%'))");
            put("ENGNUM", "AND LOWER(VENGINENO) LIKE LOWER(('%'||:ENGNUM||'%'))");
            put("TYPECODE", "AND LOWER((select VTYPECODE from ahmpsssn_hisssMDs a where a.VFRAMENO =txn.VFRAMENO)) LIKE LOWER(('%'||:TYPECODE||'%'))");
            put("COLDESC", "AND LOWER((select VCOLORDESC from AHMPS2005.ahmmomsc_mstcolors where VCOLORID = (select vcolorcode from ahmpsssn_hisssMDs c where c.VFRAMENO = txn.VFRAMENO))) LIKE LOWER(('%'||:COLDESC||'%'))");
            put("DEALSLSCODE", "AND LOWER(VDLRCODEFIN) LIKE LOWER(('%'||:DEALSLSCODE||'%'))");
            put("DEALSLSDESC", "AND LOWER((SELECT A.VND_NAME FROM FMPPC_PP00_VENDORS A WHERE A.VND_CODE =VDLRCODEFIN AND A.VNDTYP_VND_TYPE = 'A' AND NVL(A.VND_KDEKS, 'D') <> 'E')) LIKE LOWER(('%'||:DEALSLSDESC||'%'))");
            put("INVDIRSLSNUM", "AND LOWER(VINVDIRSAL) LIKE LOWER(('%'||:INVDIRSLSNUM||'%'))");
            put("INVDIRSlSDATE", "AND TRUNC(DINVDIRSAL) = :INVDIRSlSDATE");
            put("PHONENUM", "AND LOWER(VPHONE) LIKE LOWER(('%'||:PHONENUM||'%'))");
            put("NAME", "AND LOWER(VCUSTNAME) LIKE LOWER(('%'||:NAME||'%'))");
        }
    };

    public static final String SQL_MONITORING = "SELECT MSDEVEACCSN_VSRNUMBER SERIAL_NUMBER_MAKER, \n"
            + "(SELECT VITEMNAME FROM AHMPS2005.ahmmoerp_dtlsettings WHERE rset_vid =DSET_RSET_VID_TYACC AND VITEMCODE=DSET_VITEMCODE_TYACC)Accesories_Type,\n"
            + "DECODE(DSET_VITEMCODE_TYACC,'C',TXN.DRECVAHM,NULL) AHM_RECEIVE_DATE,\n"
            + "MST.DPRODACC PROD_DATE,\n"
            + "ROUND((NVL(NVL(txn.dbast,DINVDIRSAL),TRUNC(SYSDATE)) - MST.DPRODACC),0) DURATION_ACCS_EV,\n"
            + "(SELECT VITEMNAME FROM AHMPS2005.ahmmoerp_dtlsettings WHERE rset_vid =DSET_RSET_VID_SNSTAT AND VITEMCODE=DSET_VITEMCODE_SNSTAT)Last_Status,\n"
            + "VSLAHM SHIPPING_LIST,\n"
            + "TXN.DSL SHIPPING_LIST_DATE,\n"
            + "VPACKNO PACKING_SHEET_NUMBER,\n"
            + "VBOXNO BOX_NUMBER,\n"
            + "VCARTONNO CARTON_NUMBER,\n"
            + "MST.VPARTNUM PART_NUMBER,\n"
            + "(select vpartdesc from AHMPS2005.ahmmomsc_mstparts where VPARTNUM =MST.VPARTNUM)PART_DESC,\n"
            + "VPOLICENO TRUCK_NO,\n"
            + "VEXPID EXPEDITION_CODE,\n"
            + "VEXPDESC EXPEDITION_DESC,\n"
            + "DRECMD MD_RECEIVE_DATE,\n"
            + "DSLMD MD_OUT_DATE,\n"
            + "VSLMD MD_SL_NO,\n"
            + "VDLRCODE3 MD_OUT_DEALER_CODE,\n"
            + "(SELECT A.VND_NAME FROM FMPPC_PP00_VENDORS A WHERE A.VND_CODE =VDLRCODE3 AND A.VNDTYP_VND_TYPE = 'A' AND NVL(A.VND_KDEKS, 'D') <> 'E')MD_OUT_DEALER_DESC,\n"
            + "DRECDLR DEALER_RECEIVE_DATE,\n"
            + "VDLRCODE4 RECEIVE_DEALER_CODE,\n"
            + "(SELECT A.VND_NAME FROM FMPPC_PP00_VENDORS A WHERE A.VND_CODE =VDLRCODE4 AND A.VNDTYP_VND_TYPE = 'A' AND NVL(A.VND_KDEKS, 'D') <> 'E')DEALER_RECEIVE_DESC,\n"
            + "VBAST BAST_NO,\n"
            + "DBAST BAST_DATE,\n"
            + "VFRAMENO FRAME_NO,\n"
            + "VENGINENO ENGINE_NO,\n"
            + "(select VTYPECODE from ahmpsssn_hisssMDs a where a.VFRAMENO =txn.VFRAMENO)TYPE_CODE,\n"
            + "(select VCOLORDESC from AHMPS2005.ahmmomsc_mstcolors where VCOLORID = (select vcolorcode from ahmpsssn_hisssMDs c where c.VFRAMENO = txn.VFRAMENO))COLOR_DESC,\n"
            + "VDLRCODEFIN DEALER_SALES_CODE,\n"
            + "(SELECT A.VND_NAME FROM FMPPC_PP00_VENDORS A WHERE A.VND_CODE =VDLRCODEFIN AND A.VNDTYP_VND_TYPE = 'A' AND NVL(A.VND_KDEKS, 'D') <> 'E')DEALER_SALES_DESC,\n"
            + "VINVDIRSAL INVOICE_DIRECT_SALES_NUMBER,\n"
            + "DINVDIRSAL INVOICE_DIRECT_SALES_DATE,\n"
            + "VPHONE PHONE_NUMBER,\n"
            + "VCUSTNAME NAME\n"
            + "FROM AHMSDEVE_TXNACCSNS TXN, AHMSDEVE_MSTACCSNS MST\n"
            + "WHERE "
            + "TXN.MSDEVEACCSN_VSRNUMBER = MST.VSRNUMBER\n"
            + "AND TXN.VMDCODE = :PMDCODE\n"
            + "AND DSL IS NOT NULL\n"; 
}
