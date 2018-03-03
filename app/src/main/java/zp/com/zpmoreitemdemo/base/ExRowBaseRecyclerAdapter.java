package zp.com.zpmoreitemdemo.base;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2018/3/3 0003.
 */
public abstract class ExRowBaseRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    protected Context mContext; // 上下文
    protected ExRowManager mExRowManager; // Row 管理对象

    public ExRowBaseRecyclerAdapter(Context context) {
        mContext = context;
        mExRowManager = ExRowManager.newInstance();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return mExRowManager.getRowItemView(viewType).getViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (!holder.isRecyclable()) {
            return;
        }
        ExRowBaseRecyclerView row = (ExRowBaseRecyclerView) mExRowManager.getRow(position);
        if (row != null) {
            row.onBindViewHolder(holder, position);
        }
    }

    @Override
    public int getItemCount() {
        return mExRowManager.getRowCount();
    }

    @Override
    public int getItemViewType(int position) {
        ExRowBaseRecyclerView row = (ExRowBaseRecyclerView) mExRowManager.getRow(position);
        return (row == null) ? -1 : row.getViewType();
    }
}
