package com.zhangdi.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public class MyUser implements Parcelable {

	private String name;
	private int age;
	
	public MyUser(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private MyUser(Parcel in) {
		name = in.readString();
		age = in.readInt();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MyUser [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel out, int flags) {
		// TODO Auto-generated method stub
		out.writeString(name);
		out.writeInt(age);
	}

	public static final Parcelable.Creator<MyUser> CREATOR 
		= new Parcelable.Creator<MyUser>() {

			@Override
			public MyUser createFromParcel(Parcel source) {
				// TODO Auto-generated method stub
				return new MyUser(source);
			}

			@Override
			public MyUser[] newArray(int size) {
				// TODO Auto-generated method stub
				return new MyUser[size];
			}
		};
}
