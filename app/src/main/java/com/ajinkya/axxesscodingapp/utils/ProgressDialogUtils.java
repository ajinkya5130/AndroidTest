package com.ajinkya.axxesscodingapp.utils;

import android.app.AlertDialog;
import android.content.Context;

import com.ajinkya.axxesscodingapp.R;

import dmax.dialog.SpotsDialog;

public class ProgressDialogUtils {
    private AlertDialog waiting_dialog;
    private Context context;

    public ProgressDialogUtils(Context context) {
        this.context = context;
    }

    public void show() {
        waiting_dialog = new SpotsDialog.Builder()
                .setContext(context)
                .setMessage(R.string.loading)
                .setCancelable(false)
                .build();
        waiting_dialog.show();
    }

    public void dismiss() {
        if (waiting_dialog.isShowing())
            waiting_dialog.dismiss();
    }
}
