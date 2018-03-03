package zp.com.zpmoreitemdemo.base;

/**
 * Created by Administrator on 2018/3/3 0003.
 * RecyclerView、ListView 抽象类
 * 抽象模块布局Id，模块类型
 */
public abstract class ExRowBaseView {

    /**
     * Method_初始化 Row 布局Id
     *
     * @return 布局Id
     */
    public abstract int initRowView();

    /**
     * Method_获取 Row 类型
     *
     * @return 类型值
     */
    public abstract int getViewType();

}
