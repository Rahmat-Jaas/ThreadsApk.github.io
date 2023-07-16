package com.facebook.common.dextricks;

import android.content.Context;

public class ZOptEagerInvoke {
    public static void run(Context context) {
        try {
            Class.forName("com.facebook.common.zopt.ZOpt").getMethod("notePostColdStart", new Class[]{Context.class, Boolean.class}).invoke((Object) null, new Object[]{context, null});
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
