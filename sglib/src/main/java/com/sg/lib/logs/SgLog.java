package com.sg.lib.logs;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class SgLog {
    // ----------------------- Constants ----------------------- //
    // Toggle logging state
    public static boolean LOGS_ENABLED = true;

    // ----------------------- Public APIs ----------------------- //
    // methods to print error & info logs
    public static void i(String TAG, String msg) { if (LOGS_ENABLED) { Log.i(TAG, msg); } }
    public static void e(String TAG, String msg) { if (LOGS_ENABLED) { Log.e(TAG, msg); } }

    // method to print stacktrace
    public static void stack(Exception e) { if (LOGS_ENABLED) { e.printStackTrace(); } }
}
