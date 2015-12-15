package com.athudong.grapgoodsteam.search.presenter;

import com.athudong.grapgoodsteam.search.model.SearchModel;
import com.athudong.grapgoodsteam.search.model.SearchModelInterface;
import com.athudong.grapgoodsteam.search.view.SearchActivityInterface;

/**
 * Created by HP1 on 2015/12/15.
 */
public class SearchPresenter {
    private SearchActivityInterface searchActivityInterface;
    private SearchModelInterface searchModelInterface;

    public SearchPresenter(SearchActivityInterface searchActivityInterface) {
        this.searchActivityInterface = searchActivityInterface;
        searchModelInterface = new SearchModel();
    }

    public void setSearchList() {
        searchActivityInterface.setSearchList(searchModelInterface.getSearchList());
    }
}
