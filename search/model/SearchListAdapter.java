package com.athudong.grapgoodsteam.search.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.athudong.grapgoodsteam.R;
import com.athudong.grapgoodsteam.search.bean.SearchBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP1 on 2015/12/15.
 */
public class SearchListAdapter extends BaseAdapter{

    private Context mContext;
    private List<SearchBean> searchBeanList = new ArrayList<SearchBean>();

    public SearchListAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setList(List<SearchBean> searchBeanList) {
        this.searchBeanList = searchBeanList;
    }

    @Override
    public int getCount() {
        return searchBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return searchBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        SearchBean bean = (SearchBean) getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_search_list, null);
            holder = new ViewHolder();

            holder.tvName = (TextView) convertView.findViewById(R.id.name_search);
            holder.vDivider = (View) convertView.findViewById(R.id.search_divider);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tvName.setText(bean.nameSearch);

        if (position == getCount() - 1){
            holder.vDivider.setVisibility(View.GONE);
        } else {
            holder.vDivider.setVisibility(View.VISIBLE);
        }
        return convertView;
    }

    class ViewHolder {
        TextView tvName;
        View vDivider;
    }
}
