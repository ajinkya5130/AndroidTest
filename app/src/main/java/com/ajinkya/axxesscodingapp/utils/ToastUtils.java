package com.ajinkya.axxesscodingapp.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.Gravity;

import com.ajinkya.axxesscodingapp.interfaces.IToastUtils;
import com.valdesekamdem.library.mdtoast.MDToast;
public class ToastUtils implements IToastUtils {

    private static ToastUtils toastUtils;
    private Context context;

    private ToastUtils() {
    }

    public ToastUtils(Context context) {
        this.context = context.getApplicationContext();
    }

    public static ToastUtils getInstance(Context context) {
        if (toastUtils == null) {
            toastUtils = new ToastUtils(context.getApplicationContext());
        }
        return toastUtils;
    }

    @Override
    public void show(String message, int type) {
        if (!TextUtils.isEmpty(message)) {
            MDToast mdToast = MDToast.makeText(context, message, MDToast.LENGTH_SHORT, type);
            mdToast.setGravity(Gravity.CENTER, 0, 0);
            mdToast.show();
        }
    }

    @Override
    public void show(int message, int type) {
        MDToast mdToast = MDToast.makeText(context, context.getString(message), MDToast.LENGTH_SHORT, type);
        mdToast.setGravity(Gravity.CENTER, 0, 0);
        mdToast.show();
    }
}
