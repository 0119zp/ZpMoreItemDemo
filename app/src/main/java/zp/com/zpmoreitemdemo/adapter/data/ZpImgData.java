package zp.com.zpmoreitemdemo.adapter.data;

import zp.com.zpmoreitemdemo.adapter.row.ZpBaseRow;
import zp.com.zpmoreitemdemo.bean.ZpRowBean;

/**
 * Created by Administrator on 2018/3/3 0003.
 * 图片广告数据
 */
public class ZpImgData extends ZpBaseData{

    public ZpImgData(ZpRowBean rowBean) {
        super(ZpBaseRow.Type.ZP_ROW_IMG, rowBean);
    }

}
