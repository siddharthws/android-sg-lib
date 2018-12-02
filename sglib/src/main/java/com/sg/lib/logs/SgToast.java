package com.sg.lib.logs;

import android.content.Context;
import android.widget.Toast;

public class SgToast {
    // ----------------------- Public APIs ----------------------- //
    // method to show long & short toast
    public static void l(Context context, String msg) {
        if (context != null) { Toast.makeText(context, msg, Toast.LENGTH_LONG).show(); }
    }

    public static void s(Context context, String msg) {
        if (context != null) { Toast.makeText(context, msg, Toast.LENGTH_SHORT).show(); }
    }
}
