package zp.com.zpmoreitemdemo.adapter.row;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zp.com.zpmoreitemdemo.adapter.data.ZpBaseData;
import zp.com.zpmoreitemdemo.base.ExRowBaseRecyclerView;
import zp.com.zpmoreitemdemo.bean.ZpRowBean;

/**
 * Created by Administrator on 2018/3/3 0003.
 * 模块抽象类
 */
public abstract class ZpBaseRow extends ExRowBaseRecyclerView {

    public Context mContext;
    public LayoutInflater mInflater;
    private ZpBaseData data;

    public ZpBaseRow(Context context, ZpBaseData data){
        this.mContext = context;
        this.data = data;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getViewType() {
        return data.getType().getValue();
    }

    @Override
    public View getRowView(ViewGroup parent) {
        return mInflater.inflate(initRowView(), parent, false);
    }

    /**
     * 获取 Row 对应数据
     * @return row 数据
     */
    public ZpRowBean getRowData() {
        return data.getZpRowBean();
    }

    /**
     * 枚举 模块类型管理
     */
    public enum Type {

        UNKNOWN(-1),                 // 未知Row
        ZP_ROW_BANNER(1),           // 轮播图 row
        ZP_ROW_TWO_ICON(2),         // 两个Icon row
        ZP_ROW_THREE_ICON(3),       // 三个Icon row
        ZP_ROW_FOUR_ICON(4),        // 四个Icon row
        ZP_ROW_IMG(5);               // 图片广告

        private final int value;

        Type(final int value) {
            this.value = value;
        }

        public static Type from(final int value) {
            for (final Type type : values()) {
                if (type.getValue() == value) {
                    return type;
                }
            }
            return UNKNOWN;
        }

        public int getValue() {
            return value;
        }
    }

}
