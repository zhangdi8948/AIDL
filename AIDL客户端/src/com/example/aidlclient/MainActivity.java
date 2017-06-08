package com.example.aidlclient;

import com.zhangdi.aidl.Data;
import com.zhangdi.aidl.MyUser;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

	private ServiceConnection conn;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View v) {
    	Intent intent = new Intent("com.zhangdi.startService");
    	conn = new ServiceConnection() {
			
			@Override
			public void onServiceDisconnected(ComponentName name) {
			}
			
			@Override
			public void onServiceConnected(ComponentName name, IBinder service) {
				try{
					Data data = Data.Stub.asInterface(service);
					Log.i("zhangdi", data.getUser().toString());
					data.setUser(new MyUser("lilei", 15));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		};
    	bindService(intent, conn, BIND_AUTO_CREATE);
    }
    
}
