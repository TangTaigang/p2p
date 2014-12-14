package com.itany.p2p.util;

import java.util.List;

/**
 * 
 * 文 件 名: PageRueslt.java
 * 版 权: Copyright 2014-, All rights reserved
 * 描 述: <描述>
 * 创 建 人:
 * 版本：V1.0.0
 */
public class PageResult<T>
{
    private int pageNo = 1;
    
    private int totleNo;
    
    private int pageSize = 10;
    
    private List<T> list;
    
    /**
     * 获取上一页
     * @return
     */
    public int getPrePage()
    {
    	return pageNo - 1 >= 1 ? pageNo - 1 : 1;
    }
    
    /**
     * 获取下一页
     * @return
     */
    public int getNextPage()
    {
    	return pageNo + 1 > totleNo ? totleNo : pageNo + 1;
    }
    
    /**
     * 获取当前页
     * @return
     */
    public int getPageNo()
    {
        return pageNo;
    }
    
    /**
     * 设置当前页
     * @param pageNo
     */
    public void setPageNo(int pageNo)
    {
        if (pageNo <= totleNo)
        {
            this.pageNo = pageNo;
        }
        else
        {
            this.pageNo = totleNo;
        }
    }
    
    /**
     * 获取总页数
     * @return
     */
    public int getTotleNo()
    {
        return totleNo;
    }
    
    /**
     * 设置总页数
     * @param totalCount 数据总条数
     */
    public void setTotleNo(int totalCount)
    {
        if (totalCount % pageSize == 0)
        {
            this.totleNo = totalCount / pageSize;
        }
        else
        {
            this.totleNo = totalCount / pageSize + 1;
        }
        
    }
    
    public List<T> getList()
    {
        return list;
    }
    
    public void setList(List<T> list)
    {
        this.list = list;
    }
    
}
