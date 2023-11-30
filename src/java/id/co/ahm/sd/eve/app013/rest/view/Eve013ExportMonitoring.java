/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.ahm.sd.eve.app013.rest.view;

import id.co.ahm.jxf.dto.DtoResponse;
import id.co.ahm.sd.eve.app013.constant.Eve013Constant;
import id.co.ahm.sd.eve.app013.vo.Eve013VoSearch;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;

/**
 *
 * @author patria
 */
public class Eve013ExportMonitoring extends Eve013BaseExcelExportView {

    @Override
    protected void buildExcelDocument(Map<String, Object> param, Workbook workbook, HttpServletRequest hsr, HttpServletResponse response) throws Exception {
        Map<String, Object> map = (Map<String, Object>) param.get("param");
        try {
            SXSSFSheet sheet = (SXSSFSheet) workbook.createSheet("Sheet");
            DtoResponse responsePosition = (DtoResponse) map.get("tx");
            List<Eve013VoSearch> data = new ArrayList<>();
            int total = responsePosition.getData() == null ? 0 : responsePosition.getData().size();
            if (total > 0
                    && responsePosition.getData().get(0).getClass().equals(Eve013VoSearch.class)) {
                data = responsePosition.getData();
            }

            //Style Header
            XSSFCellStyle styleHeader = (XSSFCellStyle) workbook.createCellStyle();
            XSSFFont fontHeader = (XSSFFont) workbook.createFont();
            fontHeader.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
            fontHeader.setFontHeightInPoints((short) 11);
            styleHeader.setBorderBottom((short) 1);
            styleHeader.setBorderTop((short) 1);
            styleHeader.setBorderLeft((short) 1);
            styleHeader.setBorderRight((short) 1);
            styleHeader.setAlignment(HorizontalAlignment.CENTER);
            styleHeader.setFont(fontHeader);

            //Style data left
            XSSFCellStyle styleDataLeft = (XSSFCellStyle) workbook.createCellStyle();
            XSSFFont fontData = (XSSFFont) workbook.createFont();
            fontData.setFontHeightInPoints((short) 11);
            styleDataLeft.setBorderBottom((short) 1);
            styleDataLeft.setBorderTop((short) 1);
            styleDataLeft.setBorderLeft((short) 1);
            styleDataLeft.setBorderRight((short) 1);
            styleDataLeft.setVerticalAlignment(VerticalAlignment.CENTER);
            styleDataLeft.setWrapText(true);
            styleDataLeft.setAlignment(HorizontalAlignment.LEFT);
            styleDataLeft.setFont(fontData);
            
            //Style data right
            XSSFCellStyle styleDataRight = (XSSFCellStyle) workbook.createCellStyle();
            fontData.setFontHeightInPoints((short) 11);
            styleDataRight.setBorderBottom((short) 1);
            styleDataRight.setBorderTop((short) 1);
            styleDataRight.setBorderLeft((short) 1);
            styleDataRight.setBorderRight((short) 1);
            styleDataRight.setVerticalAlignment(VerticalAlignment.CENTER);
            styleDataRight.setWrapText(true);
            styleDataRight.setAlignment(HorizontalAlignment.RIGHT);
            styleDataRight.setFont(fontData);

            int rHeader = 0;
            SXSSFRow row;
            row = sheet.createRow(rHeader++);

            Object[] headers = Eve013Constant.HEADER_EXPORT.keySet().toArray();
            for (int i = 0; i < headers.length; i++) {
                createCell(row, headers[i], i, styleHeader,"");
            }
            
            int index = 0;
            for (Eve013VoSearch value : data) {
                //create cell
                row = sheet.createRow(rHeader++);
                index = 0;
                createCell(row, value.getROWNUM(), index++, styleDataRight,"");
                createCell(row, value.getSRN() == null ? null : value.getSRN(), index++, styleDataLeft,"");
                createCell(row, value.getACCTYPE() == null ? null : value.getACCTYPE(), index++, styleDataLeft,"");
                createCell(row, value.getRECEIVEDATE() == null ? null : value.getRECEIVEDATE(), index++, styleDataLeft, "dd-MMM-yyyy");
                createCell(row, value.getPRODDATE() == null ? null : value.getPRODDATE(), index++, styleDataLeft, "dd-MMM-yyyy");
                createCell(row, value.getDURATIONACCS() == null ? null : value.getDURATIONACCS(), index++, styleDataRight,"");
                createCell(row, value.getLASTSTATUS() == null ? null : value.getLASTSTATUS(), index++, styleDataLeft,"");
                createCell(row, value.getPKGSHEETNUM() == null ? null : value.getPKGSHEETNUM(), index++, styleDataLeft,"");
                createCell(row, value.getBOXNUM() == null ? null : value.getBOXNUM(), index++, styleDataLeft,"");
                createCell(row, value.getCARTONNUM() == null ? null : value.getCARTONNUM(), index++, styleDataLeft,"");
                createCell(row, value.getSHPLIST() == null ? null : value.getSHPLIST(), index++, styleDataLeft,"");
                createCell(row, value.getPARTNUM() == null ? null : value.getPARTNUM(), index++, styleDataLeft,"");
                createCell(row, value.getPARTDESC() == null ? null : value.getPARTDESC(), index++, styleDataLeft,"");
                createCell(row, value.getTRUCKNUM() == null ? null : value.getTRUCKNUM(), index++, styleDataLeft,"");
                createCell(row, value.getEXPCODE() == null ? null : value.getEXPCODE(), index++, styleDataLeft,"");
                createCell(row, value.getEXPDESC() == null ? null : value.getEXPDESC(), index++, styleDataLeft,"");
                createCell(row, value.getSHPLISTDATE() == null ? null : value.getSHPLISTDATE(), index++, styleDataLeft,"dd-MMM-yyyy HH:mm:ss");
                createCell(row, value.getMDRECDATE() == null ? null : value.getMDRECDATE(), index++, styleDataLeft,"dd-MMM-yyyy HH:mm:ss");
                createCell(row, value.getMDOUTDATE() == null ? null : value.getMDOUTDATE(), index++, styleDataLeft,"dd-MMM-yyyy HH:mm:ss");
                createCell(row, value.getMDSLNO() == null ? null : value.getMDSLNO(), index++, styleDataLeft,"");
                createCell(row, value.getMDOUTDEALCODE() == null ? null : value.getMDOUTDEALCODE(), index++, styleDataLeft,"");
                createCell(row, value.getMDOUTDEALDESC() == null ? null : value.getMDOUTDEALDESC(), index++, styleDataLeft,"");
                createCell(row, value.getDEALRECDATE() == null ? null : value.getDEALRECDATE(), index++, styleDataLeft,"dd-MMM-yyyy HH:mm:ss");
                createCell(row, value.getDEALRECCODE() == null ? null : value.getDEALRECCODE(), index++, styleDataLeft,"");
                createCell(row, value.getDEALRECDESC() == null ? null : value.getDEALRECDESC(), index++, styleDataLeft,"");
                createCell(row, value.getBSTNUM() == null ? null : value.getBSTNUM(), index++, styleDataLeft,"");
                createCell(row, value.getBSTDATE() == null ? null : value.getBSTDATE(), index++, styleDataLeft,"dd-MMM-yyyy HH:mm:ss");
                createCell(row, value.getFRMNUM() == null ? null : value.getFRMNUM(), index++, styleDataLeft,"");
                createCell(row, value.getENGNUM() == null ? null : value.getENGNUM(), index++, styleDataLeft,"");
                createCell(row, value.getTYPECODE() == null ? null : value.getTYPECODE(), index++, styleDataLeft,"");
                createCell(row, value.getCOLDESC() == null ? null : value.getCOLDESC(), index++, styleDataLeft,"");
                createCell(row, value.getDEALSLSCODE() == null ? null : value.getDEALSLSCODE(), index++, styleDataLeft,"");
                createCell(row, value.getDEALSLSDESC() == null ? null : value.getDEALSLSDESC(), index++, styleDataLeft,"");
                createCell(row, value.getINVDIRSLSNUM() == null ? null : value.getINVDIRSLSNUM(), index++, styleDataLeft,"");
                createCell(row, value.getINVDIRSLSDATE() == null ? null : value.getINVDIRSLSDATE(), index++, styleDataLeft,"dd-MMM-yyyy HH:mm:ss");
                createCell(row, value.getPHONENUM() == null ? null : value.getPHONENUM(), index++, styleDataRight,"");
                createCell(row, value.getNAME() == null ? null : value.getNAME(), index++, styleDataLeft,"");
            }
            int column = 0;
            sheet.setColumnWidth(column, 5 * 256);column++;
            sheet.setColumnWidth(column, 23 * 256);column++;
            sheet.setColumnWidth(column, 24 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 16 * 256);column++;
            sheet.setColumnWidth(column, 23 * 256);column++;
            sheet.setColumnWidth(column, 13 * 256);column++;
            sheet.setColumnWidth(column, 16 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 17 * 256);column++;
            sheet.setColumnWidth(column, 25 * 256);column++;
            sheet.setColumnWidth(column, 25 * 256);column++;
            sheet.setColumnWidth(column, 19 * 256);column++;
            sheet.setColumnWidth(column, 25 * 256);column++;
            sheet.setColumnWidth(column, 22 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 25 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 30 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 30 * 256);column++;
            sheet.setColumnWidth(column, 18 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 25 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 18 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);column++;
            sheet.setColumnWidth(column, 18 * 256);column++;
            sheet.setColumnWidth(column, 30 * 256);column++;
            sheet.setColumnWidth(column, 29 * 256);column++;
            sheet.setColumnWidth(column, 25 * 256);column++;
            sheet.setColumnWidth(column, 16 * 256);column++;
            sheet.setColumnWidth(column, 20 * 256);

        } catch (Exception e) {
            throw new RuntimeException("Generate Excel Failed");
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        String dt = sdf.format(new Date());
        String fileName = "MonitoringDataAccessoriesEV ";
        response.setHeader("Content-Disposition", "attachment;filename=\"" + fileName + dt + ".xlsx\"");
    }

}
