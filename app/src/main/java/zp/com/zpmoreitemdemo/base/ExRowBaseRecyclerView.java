package zp.com.zpmoreitemdemo.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2018/3/3 0003.
 * RecyclerView 抽象类
 * 抽象获取 ViewHolder 对象，绑定数据
 */
public abstract class ExRowBaseRecyclerView extends ExRowBaseView {

    /**
     * 获得 Row 布局
     *
     * @param parent 父容器
     * @return row 布局
     */
    public abstract View getRowView(ViewGroup parent);

    /**
     * Method_获取 ViewHolder 对象
     *
     * @param parent 父级容器
     * @return ViewHolder 对象
     */
    public abstract RecyclerView.ViewHolder getViewHolder(ViewGroup parent);

    /**
     * Method_绑定数据
     *
     * @param holder   ViewHolder 对象
     * @param position 位置
     */
    public abstract void onBindViewHolder(RecyclerView.ViewHolder holder, int position);


}
