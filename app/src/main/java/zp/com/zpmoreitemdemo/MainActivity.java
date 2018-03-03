package zp.com.zpmoreitemdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;

import zp.com.zpmoreitemdemo.adapter.ZpRecyclerAdapter;
import zp.com.zpmoreitemdemo.bean.ZpRowBean;

/**
 * RecyclerView 异型列表页面
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ZpRowBean> zpData = new ArrayList<>();  // 假数据集合

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_rel_row);

        initData();
        initView();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.rl_view);

        ZpRecyclerAdapter recyclerViewAdapter = new ZpRecyclerAdapter(MainActivity.this, zpData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    /////////////////////////////   假数据   ////////////////////////////////////

    private void initData() {
        // 数据防护
        if (zpData != null && zpData.size() > 0) {
            zpData.clear();
        }
        for (int i = 1; i < 10; i++) {
            ZpRowBean zpRowBean = new ZpRowBean();
            zpRowBean.setType(i);
            zpData.add(zpRowBean);
        }
    }
}
