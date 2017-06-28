package com.ut.scf.web.controller.jasperreport;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRHtmlExporterParameter;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;

public class HtmlReportServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Connection getConnection() throws SQLException,
			ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@172.25.1.56:1521:scfcloud", "scfcloud",
				"scfcloud");
		if (conn != null) {
			return conn;
		}
		return null;

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection conn = null;
		try {
			conn = getConnection();
			String type = request.getParameter("type");
			if (type.equals("excel")) {
				exportExcel(response, conn);
			} else if (type.equals("pdf")) {
				exportPdf(response, conn);
			} else if (type.equals("html")) {
				exportHtml(response, conn);
			} else if (type.equals("word")) {
				exportWord(response, conn);
			} else if(type.equals("stamp")){
				exportPrint(response, conn);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	/**
	 * 导出为html文件
	 * 
	 * @param request
	 * @param response
	 */
	private void exportHtml(HttpServletResponse response, Connection conn) {

		try {
			response.setCharacterEncoding("UTF-8");
			ServletContext servletContext = this.getServletConfig()
					.getServletContext();
			// 得到jasper文件
			File jasperFile = new File(
					servletContext
							.getRealPath("/WEB-INF/jasper/report2.jasper"));
			JasperReport jasperReport = (JasperReport) JRLoader
					.loadObjectFromFile(jasperFile.getPath());
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, null, conn);
			JRHtmlExporter exporter = new JRHtmlExporter();

			exporter.setParameter(JRHtmlExporterParameter.JASPER_PRINT,
					jasperPrint);
			exporter.setParameter(JRHtmlExporterParameter.OUTPUT_WRITER,
					response.getWriter());
			exporter.setParameter(
					JRHtmlExporterParameter.IS_USING_IMAGES_TO_ALIGN,
					Boolean.FALSE);
			exporter.setParameter(JRExporterParameter.CHARACTER_ENCODING,
					"utf-8");
			exporter.exportReport();
		} catch (JRException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 导出为excel文件
	 * 
	 * @param request
	 * @param response
	 */
	private void exportExcel(HttpServletResponse response, Connection conn) {
		try {
			response.setCharacterEncoding("UTF-8");
			ServletContext servletContext = this.getServletConfig()
					.getServletContext();
			// 得到jasper文件
			File jasperFile = new File(
					servletContext
							.getRealPath("/WEB-INF/jasper/report2.jasper"));
			JasperReport jasperReport = (JasperReport) JRLoader
					.loadObjectFromFile(jasperFile.getPath());
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, null, conn);
			JRExporter exporter = new JRXlsExporter();
			exporter.setParameter(JRXlsExporterParameter.JASPER_PRINT,
					jasperPrint);
			exporter.setParameter(JRXlsExporterParameter.OUTPUT_STREAM,
					response.getOutputStream());
			exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET,
					Boolean.FALSE);
			exporter.setParameter(
					JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND,
					Boolean.FALSE);

			response.setContentType("application/vnd_ms-excel;charset=utf-8");
			String fileName = new String("未命名.xls".getBytes("GBK"), "ISO8859_1");
			response.setHeader("Content-disposition", "attachment; filename="
					+ fileName);
			
//			response.setHeader("Content-Disposition",
//					"attachment;filename=first.xls");
//			response.setContentType("application/vnd_ms-excel");
			exporter.exportReport();
		} catch (JRException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 导出为pdf文件
	 * 
	 * @param response
	 * @param conn
	 */
	private void exportPdf(HttpServletResponse response, Connection conn) {
		try {
			ServletContext servletContext = this.getServletConfig()
					.getServletContext();
			// 得到jasper文件
			File jasperFile = new File(
					servletContext
							.getRealPath("/WEB-INF/jasper/report2.jasper"));
			JasperReport jasperReport = (JasperReport) JRLoader
					.loadObjectFromFile(jasperFile.getPath());
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, null, conn);
			JRExporter exporter = new JRPdfExporter();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
					response.getOutputStream());

			response.setHeader("Content-Disposition",
					"attachment;filename=first.pdf");
			response.setContentType("application/pdf");
			response.setCharacterEncoding("UTF-8");
			exporter.exportReport();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 导出word
	 */
	public void exportWord(HttpServletResponse response, Connection conn) {

		try {
			ServletContext servletContext = this.getServletConfig()
					.getServletContext();
			// 得到jasper文件
			File jasperFile = new File(
					servletContext
							.getRealPath("/WEB-INF/jasper/report2.jasper"));
			JasperReport jasperReport = (JasperReport) JRLoader
					.loadObjectFromFile(jasperFile.getPath());
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, null, conn);
			JRExporter exporter = new JRRtfExporter();
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
					response.getOutputStream());
			response.setContentType("application/msword;charset=utf-8");
			String fileName = new String("未命名.doc".getBytes("GBK"), "ISO8859_1");
			response.setHeader("Content-disposition", "attachment; filename="
					+ fileName);
			exporter.exportReport();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 打印
	 * 
	 * @throws JRException
	 */
	public void exportPrint(HttpServletResponse response, Connection conn) {
		try {
			ServletContext servletContext = this.getServletConfig()
					.getServletContext();
			// 得到jasper文件
			File jasperFile = new File(
					servletContext
							.getRealPath("/WEB-INF/jasper/report2.jasper"));
			JasperReport jasperReport = (JasperReport) JRLoader
					.loadObjectFromFile(jasperFile.getPath());
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, null, conn);
			response.setContentType("application/octet-stream");
			ServletOutputStream ouputStream = response.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(ouputStream);
			oos.writeObject(jasperPrint);
			oos.flush();
			oos.close();
			ouputStream.flush();
			ouputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
