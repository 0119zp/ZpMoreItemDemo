package zp.com.zpmoreitemdemo.base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2018/3/3 0003
 * Row 模式 管理类
 */
public final class ExRowManager {

    // Row 管理集合
    private final List<ExRowBaseView> mExRows = new ArrayList<>();
    // RowViewHolder 键值集合
    private final ConcurrentHashMap<Integer, ExRowBaseRecyclerView> mRowsViewHolderMaps = new ConcurrentHashMap<>();

    private ExRowManager() {
    }

    private static class Holder {
        private static final ExRowManager instance = new ExRowManager();
    }

    /**
     * Method_创建新实例
     *
     * @return 实例对象
     */
    public static ExRowManager newInstance() {
        return Holder.instance;
    }

    /**
     * Method_获取 Row 集合长度
     *
     * @return 长度
     */
    public int getRowCount() {
        return mExRows.size();
    }

    /**
     * Method_通过位置获取 Row
     *
     * @param index 位置
     * @return Row
     */
    public ExRowBaseView getRow(int index) {
        return 0 <= index && index < getRowCount() ? mExRows.get(index) : null;
    }

    /**
     * Method_获取 RowView 适用于 RecyclerView
     *
     * @param viewType 类型
     * @return RowView
     */
    public ExRowBaseRecyclerView getRowItemView(int viewType) {
        return mRowsViewHolderMaps.get(viewType);
    }

    /**
     * Method_添加最后位置 Row
     *
     * @param row Row
     * @return 插入后位置
     */
    public void addRowView(ExRowBaseView row) {
        putRowViewHolderMap(row);

        if (row != null) {
            mExRows.add(row);
        }
    }

    /**
     * Method_添加 Row ViewHolder 通过 Row
     *
     * @param row Row
     */
    private void putRowViewHolderMap(ExRowBaseView row) {
        if (row == null || !(row instanceof ExRowBaseRecyclerView)) {
            return;
        }

        ExRowBaseRecyclerView recyclerViewRow = (ExRowBaseRecyclerView) row;
        if (!mRowsViewHolderMaps.containsKey(recyclerViewRow.getViewType())) {
            mRowsViewHolderMaps.put(recyclerViewRow.getViewType(), recyclerViewRow);
        }
    }

    /**
     * Method_清空 Row 集合
     */
    public void clear() {
        mExRows.clear();
        mRowsViewHolderMaps.clear();
    }

}
