package test.adapter;

import adapter.Android;
import adapter.iPhone6s;
import adapter.iPhoneAdapter;
import adapter.iPhoneAdapter2;

public class test2 {
    public static void main(String args[]){
        Android android = new iPhoneAdapter2(new iPhone6s());
        android.isAndroid();
    }
}
