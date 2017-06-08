/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\workspace6\\AIDL·þÎñ\\src\\com\\zhangdi\\aidl\\Data.aidl
 */
package com.zhangdi.aidl;
public interface Data extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.zhangdi.aidl.Data
{
private static final java.lang.String DESCRIPTOR = "com.zhangdi.aidl.Data";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.zhangdi.aidl.Data interface,
 * generating a proxy if needed.
 */
public static com.zhangdi.aidl.Data asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.zhangdi.aidl.Data))) {
return ((com.zhangdi.aidl.Data)iin);
}
return new com.zhangdi.aidl.Data.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getName:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.getName();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_setNumber:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.setNumber(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getUser:
{
data.enforceInterface(DESCRIPTOR);
com.zhangdi.aidl.MyUser _result = this.getUser();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_setUser:
{
data.enforceInterface(DESCRIPTOR);
com.zhangdi.aidl.MyUser _arg0;
if ((0!=data.readInt())) {
_arg0 = com.zhangdi.aidl.MyUser.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.setUser(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.zhangdi.aidl.Data
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public java.lang.String getName() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getName, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setNumber(java.lang.String num) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(num);
mRemote.transact(Stub.TRANSACTION_setNumber, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public com.zhangdi.aidl.MyUser getUser() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.zhangdi.aidl.MyUser _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getUser, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.zhangdi.aidl.MyUser.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void setUser(com.zhangdi.aidl.MyUser user) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((user!=null)) {
_data.writeInt(1);
user.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setUser, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getName = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setNumber = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setUser = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public java.lang.String getName() throws android.os.RemoteException;
public void setNumber(java.lang.String num) throws android.os.RemoteException;
public com.zhangdi.aidl.MyUser getUser() throws android.os.RemoteException;
public void setUser(com.zhangdi.aidl.MyUser user) throws android.os.RemoteException;
}
