package com.ajinkya.axxesscodingapp.interfaces;

import androidx.annotation.StringRes;

public interface IToastUtils {
    void show(String message, int type);

    void show(@StringRes int message, int type);
}
