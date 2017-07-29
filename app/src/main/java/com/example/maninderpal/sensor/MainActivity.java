package com.example.maninderpal.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Sensor mSensor;
    private SensorManager mSensorManager;

    private static  final float NS2S = 1.0f /1000000000.0f;
    private final float[] deltaRotaVector = new float[4];
    private float time_stamp;

    public void onSensorChanged(SensorEvent event) {

        if(time_stamp != 0) {

        }
    }







    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE);



        mSensor.toString();
        //tv.setText(stringFromJNI());
        tv.setText(mSensor.toString());

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
