package zp.com.zpmoreitemdemo.adapter.row;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import zp.com.zpmoreitemdemo.R;
import zp.com.zpmoreitemdemo.adapter.data.ZpBaseData;

/**
 * Created by Administrator on 2018/3/3 0003.
 * 1 * 4 模块
 */
public class ZpFourIconRow extends ZpBaseRow {

    public ZpFourIconRow(Context context, ZpBaseData data) {
        super(context, data);
    }

    @Override
    public int initRowView() {
        return R.layout.zp_four_icon_row;
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup parent) {
        return new FourIconHolder(getRowView(parent));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    private static class FourIconHolder extends RecyclerView.ViewHolder {

        public FourIconHolder(View itemView) {
            super(itemView);
        }
    }
}
