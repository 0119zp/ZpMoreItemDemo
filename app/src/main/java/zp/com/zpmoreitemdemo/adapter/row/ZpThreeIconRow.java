package zp.com.zpmoreitemdemo.adapter.row;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import zp.com.zpmoreitemdemo.R;
import zp.com.zpmoreitemdemo.adapter.data.ZpBaseData;

/**
 * Created by Administrator on 2018/3/3 0003.
 * 1 * 3 模块
 */
public class ZpThreeIconRow extends ZpBaseRow {

    public ZpThreeIconRow(Context context, ZpBaseData data) {
        super(context, data);
    }

    @Override
    public int initRowView() {
        return R.layout.zp_three_icon_row;
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup parent) {
        return new ThreeIconHolder(getRowView(parent));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    private static class ThreeIconHolder extends RecyclerView.ViewHolder {

        public ThreeIconHolder(View itemView) {
            super(itemView);
        }
    }
}
