package com.example.lithium.anichartunofficial.Utils;

import android.util.Log;

public class LoggerUtil {

    public static void debug(String log, String message) {
        Log.d(log, message);
    }

    public static void error(String log, String message) {
        Log.e(log, message);
    }
}