package com.itany.p2p.action;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.itany.p2p.entity.News;
import com.itany.p2p.exception.ServiceException;
import com.itany.p2p.service.INewsService;
import com.itany.p2p.service.impl.NewsServiceImpl;

public class NewsAction {
	
	INewsService newsService = new NewsServiceImpl();
	
	public String showPage(HttpServletRequest request,HttpServletResponse response){
		List list = null;
		try {
			list = newsService.getAllNews();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("newsList", list);
		
		return "success";
	}
	
	//新闻详情页面
	public String newsDetail(HttpServletRequest request,HttpServletResponse response){
		String newsId = request.getParameter("newsId").trim();
		List list = null;
		try {
			list = newsService.getNewsById(Integer.parseInt(newsId));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("news", list.get(0));
		return "success";
	}
	
	//根据ID修改新闻内容
	public String newsModifyDetail(HttpServletRequest request,HttpServletResponse response){
		String newsId = request.getParameter("newsId").trim();
		List list = null;
		try {
			list = newsService.getNewsById(Integer.parseInt(newsId));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.setAttribute("news", list.get(0));
		return "success";
	}
	
	//添加新闻
	public String newsAdd(HttpServletRequest request,HttpServletResponse response){
		News news = getNews(request, response);
		try {
			newsService.addNews(news);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return "success";
	}
	
	//修改新闻
	public String newsModify(HttpServletRequest request,HttpServletResponse response){
		News news = getNews(request,response);
		try {
			newsService.modifyNewsById(news);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		
		return "success";
		
	}
	
	//获取普通表单域和文件文件表单域
	private News getNews(HttpServletRequest request,HttpServletResponse response){
		String tempDirectory = request.getSession().getServletContext().getRealPath("/")+"temp\\";	
		String fileDirectory = request.getSession().getServletContext().getRealPath("/")+"images\\";
		String newsTitle = "";
		String content = "";
		String newsId = "";
		String newFileName = "";
		try {
			int sizeThreshold = 1024*64; //写满该大小的缓存后，存入硬盘中
			File repositoryFile = new File(tempDirectory);
			
			FileItemFactory factory = new DiskFileItemFactory(sizeThreshold, repositoryFile);
			ServletFileUpload upload = new ServletFileUpload(factory);
			upload.setSizeMax(10*1024*1024); //设置上传文件大小10M
			List items = upload.parseRequest(request); //这里开始执行上传
			
			Iterator iter = items.iterator();
			while(iter.hasNext()){
				FileItem item = (FileItem) iter.next();	//FileItem就是表示一个表单域 
				
				if(item.isFormField()){   //isFormField方法用于判断FileItem是否代表一个普通表单域（即非file表单域）
					if("newsTitle".equals(item.getFieldName())){			//item.getFieldNam 返回表单域名字
						newsTitle = item.getString("utf-8");				//item.getString 返回表单域值
					} else if("content".equals(item.getFieldName())){
						content = item.getString("utf-8");
					} else if("newsId".equals(item.getFieldName())){
						newsId = item.getString("utf-8");
					}
				} else{
					String fieldName = item.getFieldName();  //获取表单域name属性的值
					String fileName = item.getName();	//返回该文件在客户机上的文件名
					//System.out.println("***"+fieldName);
					//System.out.println("***"+fileName);
					String fileType = fileName.substring(fileName.lastIndexOf("."));
					File uploadFile = new File(fileDirectory+new Date().getTime()+fileType);
					newFileName = "images/"+new Date().getTime()+fileType;
					item.write(uploadFile);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Date date = new Date();
		News news = new News();
		if(newsId!=null && newsId!=""){
			news.setNewsId(Integer.parseInt(newsId));
		}
		news.setNewsTitle(newsTitle);
		news.setContent(content);
		news.setImage(newFileName);
		news.setCreateAt(date);
		return news;
	}
	
	
	
}
