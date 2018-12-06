package com.mobileapps.services.Services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class MyNormalService extends Service {

    TextView tv1;

    public static final String TAG = MyNormalService.class.getSimpleName() + "_TAG";

    public MyNormalService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: Normal Service");

        try {
            Thread.sleep(10000);
        } catch (Exception e){

        }

        //complete
        Log.d(TAG, "onStartCommand: Normal Service COMPLETED");

        //stop self

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + Thread.currentThread().getName());
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
