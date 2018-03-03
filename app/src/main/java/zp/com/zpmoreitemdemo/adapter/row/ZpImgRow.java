package zp.com.zpmoreitemdemo.adapter.row;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import zp.com.zpmoreitemdemo.R;
import zp.com.zpmoreitemdemo.adapter.data.ZpBaseData;

/**
 * Created by Administrator on 2018/3/3 0003.
 * 图片广告模块
 */
public class ZpImgRow extends ZpBaseRow{

    public ZpImgRow(Context context, ZpBaseData data) {
        super(context, data);
    }

    @Override
    public int initRowView() {
        return R.layout.zp_img_row;
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup parent) {
        return new ImgHolder(getRowView(parent));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    private static class ImgHolder extends RecyclerView.ViewHolder {

        public ImgHolder(View itemView) {
            super(itemView);
        }
    }
}
