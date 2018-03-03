package zp.com.zpmoreitemdemo.adapter;

import android.content.Context;

import java.util.ArrayList;

import zp.com.zpmoreitemdemo.adapter.data.ZpBannerData;
import zp.com.zpmoreitemdemo.adapter.data.ZpFourIconData;
import zp.com.zpmoreitemdemo.adapter.data.ZpImgData;
import zp.com.zpmoreitemdemo.adapter.data.ZpThreeIconData;
import zp.com.zpmoreitemdemo.adapter.data.ZpTwoIconData;
import zp.com.zpmoreitemdemo.adapter.row.ZpBannerRow;
import zp.com.zpmoreitemdemo.adapter.row.ZpFourIconRow;
import zp.com.zpmoreitemdemo.adapter.row.ZpImgRow;
import zp.com.zpmoreitemdemo.adapter.row.ZpThreeIconRow;
import zp.com.zpmoreitemdemo.adapter.row.ZpTwoIconRow;
import zp.com.zpmoreitemdemo.base.ExRowBaseRecyclerAdapter;
import zp.com.zpmoreitemdemo.bean.ZpRowBean;

/**
 * Created by Administrator on 2018/3/3 0003.
 */

public class ZpRecyclerAdapter extends ExRowBaseRecyclerAdapter {


    private ArrayList<ZpRowBean> zpList = new ArrayList<>();
    private Context mContext;

    public ZpRecyclerAdapter(Context context, ArrayList<ZpRowBean> zpData) {
        super(context);
        this.mContext = context;
        this.zpList.addAll(zpData);

        setData();
    }

    /**
     * 遍历数据
     */
    public void setData() {
        for (ZpRowBean rowBean : zpList) {
            switch (rowBean.getType()) {
                case 1:
                    addBannerRow(rowBean);
                    break;
                case 2:
                    addTwoIconRow(rowBean);
                    break;
                case 3:
                    addThreeIconRow(rowBean);
                    break;
                case 4:
                    addFourIconRow(rowBean);
                    break;
                default:
                    addImgRow(rowBean);
                    break;
            }
        }
    }

    /**
     * 添加轮播图模块
     *
     * @param rowBean 数据
     */
    private void addBannerRow(ZpRowBean rowBean) {
        ZpBannerRow bannerRow = new ZpBannerRow(mContext, new ZpBannerData(rowBean));
        mExRowManager.addRowView(bannerRow);
    }

    /**
     * 添加 1 * 2 模块
     *
     * @param rowBean 数据
     */
    private void addTwoIconRow(ZpRowBean rowBean) {
        ZpTwoIconRow twoIconRow = new ZpTwoIconRow(mContext, new ZpTwoIconData(rowBean));
        mExRowManager.addRowView(twoIconRow);
    }

    /**
     * 添加 1 * 3 模块
     *
     * @param rowBean 数据
     */
    private void addThreeIconRow(ZpRowBean rowBean) {
        ZpThreeIconRow threeIconRow = new ZpThreeIconRow(mContext, new ZpThreeIconData(rowBean));
        mExRowManager.addRowView(threeIconRow);
    }

    /**
     * 添加 1 * 4 模块
     *
     * @param rowBean 数据
     */
    private void addFourIconRow(ZpRowBean rowBean) {
        ZpFourIconRow fourIconRow = new ZpFourIconRow(mContext, new ZpFourIconData(rowBean));
        mExRowManager.addRowView(fourIconRow);
    }

    /**
     * 添加图片广告模块
     *
     * @param rowBean 数据
     */
    private void addImgRow(ZpRowBean rowBean) {
        ZpImgRow imgRow = new ZpImgRow(mContext, new ZpImgData(rowBean));
        mExRowManager.addRowView(imgRow);
    }


}
