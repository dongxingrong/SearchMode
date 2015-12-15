package com.athudong.grapgoodsteam.search.model;

import com.athudong.grapgoodsteam.search.bean.SearchBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP1 on 2015/12/15.
 */
public class SearchModel implements SearchModelInterface{
    @Override
    public List<SearchBean> getSearchList() {
        List<SearchBean> list = new ArrayList<SearchBean>();
        SearchBean bean = new SearchBean();
        bean.nameSearch = "iPhone6s";
        list.add(bean);
        bean = new SearchBean();
        bean.nameSearch = "苹果";
        list.add(bean);
        bean = new SearchBean();
        bean.nameSearch = "i数码";
        list.add(bean);
        bean = new SearchBean();
        bean.nameSearch = "手表";
        list.add(bean);
        return list;
    }
}
