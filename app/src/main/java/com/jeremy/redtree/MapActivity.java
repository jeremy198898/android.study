package com.jeremy.redtree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.model.LatLng;

public class MapActivity extends AppCompatActivity
{

    private MapView mapview;

    private BaiduMap baiduMap;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现
        SDKInitializer.initialize(getApplicationContext());

        setContentView(R.layout.activity_map);

        mapview = (MapView) findViewById(R.id.baidu_map_view);

        baiduMap = mapview.getMap();

        //定义Marker坐标点
        LatLng location = new LatLng(31.195557, 121.271262);

        //构建Marker图标
        BitmapDescriptor locationMark = BitmapDescriptorFactory.fromResource(R.drawable.icon_gcoding);

        //构建MarkerOption , 用于在地图上添加 Marker
        OverlayOptions options = new MarkerOptions().position(location).icon(locationMark);

        baiduMap.addOverlay(options);
    }

    /**
     * 设置底图显示模式
     *
     * @param view
     */
    public void setMapMode(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId())
        {
            case R.id.normal:
                if (checked)
                {
                    baiduMap.setMapType(BaiduMap.MAP_TYPE_NORMAL);
                }
                break;

            case R.id.satellite:
                if (checked)
                {
                    baiduMap.setMapType(BaiduMap.MAP_TYPE_SATELLITE);
                }
                break;
            default:
                break;
        }
    }

    /**
     * 设置是否显示交通图
     *
     * @param view
     */
    public void setTraffic(View view)
    {
        baiduMap.setTrafficEnabled(((CheckBox) view).isChecked());
    }

    /**
     * 设置是否显示百度热力图
     *
     * @param view
     */
    public void setBaiduHeatMap(View view)
    {
        baiduMap.setBaiduHeatMapEnabled(((CheckBox) view).isChecked());
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mapview.onDestroy();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        mapview.onResume();
    }

    @Override
    protected void onPause()
    {
        super.onPause();

        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        mapview.onPause();
    }
}
