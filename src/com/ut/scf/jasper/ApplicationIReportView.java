package com.ut.scf.jasper;

import java.util.Map;  

import net.sf.jasperreports.engine.JasperPrint;  
import net.sf.jasperreports.engine.JasperReport;  
  
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;  
  
/** 
 * SpringMVC + IReport整合 视图处理扩展 
 * @Author wukai
 * @Create 2017-5-23 14:30:58 
 */  
public class ApplicationIReportView extends JasperReportsMultiFormatView {  
    private JasperReport jasperReport;  
      
    public ApplicationIReportView() {  
        super();  
    }  
  
    protected JasperPrint fillReport(Map<String, Object> model) throws Exception {  
        if (model.containsKey("url")) {  
            setUrl(String.valueOf(model.get("url")));  
            this.jasperReport = loadReport();  
        }  
          
        return super.fillReport(model);  
    }  
      
    protected JasperReport getReport() {  
        return this.jasperReport;  
    }  
}  
