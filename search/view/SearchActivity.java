package com.athudong.grapgoodsteam.search.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.athudong.grapgoodsteam.R;
import com.athudong.grapgoodsteam.search.bean.SearchBean;
import com.athudong.grapgoodsteam.search.model.SearchListAdapter;
import com.athudong.grapgoodsteam.search.presenter.SearchPresenter;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP1 on 2015/12/14.
 */
@ContentView(R.layout.search_activity)
public class SearchActivity extends AppCompatActivity implements SearchActivityInterface{

    @ViewInject(R.id.toolbar)
    private Toolbar toolbar;
    @ViewInject(R.id.search_list)
    private ListView list;

    private List<SearchBean> searchBeanList = new ArrayList<SearchBean>();
    private SearchPresenter presenter;
    private SearchListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);

        setSupportActionBar(toolbar);

        presenter = new SearchPresenter(this);
        presenter.setSearchList();

        adapter = new SearchListAdapter(this);
        adapter.setList(searchBeanList);
        list.setAdapter(adapter);
    }

    @Override
    public void setSearchList(List<SearchBean> list) {
        this.searchBeanList = list;
    }
}
