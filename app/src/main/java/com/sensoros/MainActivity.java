package com.sensoros;

import android.os.Bundle;
import android.os.BatteryManager;
import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setTextSize(20);

        BatteryManager bm = (BatteryManager) getSystemService(Context.BATTERY_SERVICE);
        int level = bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);

        String msg = "SensorOS Live\n\nBattery Level: " + level + "%\nDevice Online";
        tv.setText(msg);

        setContentView(tv);
    }
}
