package zp.com.zpmoreitemdemo.adapter.data;

import zp.com.zpmoreitemdemo.adapter.row.ZpBaseRow;
import zp.com.zpmoreitemdemo.bean.ZpRowBean;

/**
 * Created by Administrator on 2018/3/3 0003.
 * 数据抽象类
 */
public abstract class ZpBaseData {

    private ZpBaseRow.Type mType;
    private ZpRowBean mRowBean;

    protected ZpBaseData(ZpBaseRow.Type type, ZpRowBean bean) {
        this.mType = type;
        this.mRowBean = bean;
    }

    public ZpRowBean getZpRowBean() {
        return mRowBean;
    }

    public ZpBaseRow.Type getType() {
        return mType;
    }
}
