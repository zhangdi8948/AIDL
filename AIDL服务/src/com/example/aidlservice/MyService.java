package com.example.aidlservice;

import com.zhangdi.aidl.Data;
import com.zhangdi.aidl.MyUser;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class MyService extends Service {

	private MyUser user;
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		user = new MyUser("zhangdi", 11);
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return new Mybinder();
	}

	private class Mybinder extends Data.Stub {

		@Override
		public String getName() throws RemoteException {
			// TODO Auto-generated method stub
			return "zhangdi";
		}

		@Override
		public void setNumber(String num) throws RemoteException {
			Log.i("zhangdi", "num = " + num);
		}

		@Override
		public MyUser getUser() throws RemoteException {
			// TODO Auto-generated method stub
			return user;
		}

		@Override
		public void setUser(MyUser user) throws RemoteException {
			Log.i("zhangdi", user.toString());
		}
		
	}
}
