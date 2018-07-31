package test.adapter;

import adapter.Android;
import adapter.iPhoneAdapter;

public class test {
    public static void main(String args[]){
        Android android = new iPhoneAdapter();
        android.isAndroid();
    }
}
