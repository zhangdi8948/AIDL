package com.zhangdi.aidl;

import com.zhangdi.aidl.MyUser;

interface Data {
	String getName ();
	void setNumber(String num);
	MyUser getUser();
	void setUser(in MyUser user);
}
