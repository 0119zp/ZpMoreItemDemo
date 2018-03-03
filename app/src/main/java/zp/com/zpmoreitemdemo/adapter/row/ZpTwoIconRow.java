package zp.com.zpmoreitemdemo.adapter.row;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import zp.com.zpmoreitemdemo.R;
import zp.com.zpmoreitemdemo.adapter.data.ZpBaseData;

/**
 * Created by Administrator on 2018/3/3 0003.
 * 1 * 2 模块
 */
public class ZpTwoIconRow extends ZpBaseRow {

    public ZpTwoIconRow(Context context, ZpBaseData data) {
        super(context, data);
    }

    @Override
    public int getViewType() {
        return Type.ZP_ROW_TWO_ICON.getValue();
    }

    @Override
    public int initRowView() {
        return R.layout.zp_two_icon_row;
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup parent) {
        return new TwoIconHolder(getRowView(parent));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    private static class TwoIconHolder extends RecyclerView.ViewHolder {

        public TwoIconHolder(View itemView) {
            super(itemView);
        }
    }
}
