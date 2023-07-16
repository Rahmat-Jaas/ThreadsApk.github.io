package com.facebook.react.bridge;

import X.AnonymousClass0JV;
import java.lang.reflect.Method;

public class ReactCxxErrorHandler {
    public static Method mHandleErrorFunc;
    public static Object mObject;

    public static void handleError(String str) {
        if (mHandleErrorFunc != null) {
            try {
                mHandleErrorFunc.invoke(mObject, new Object[]{new Exception(str)});
            } catch (Exception e) {
                AnonymousClass0JV.A03("ReactCxxErrorHandler", "Failed to invoke error handler function", e);
            }
        }
    }

    public static void setHandleErrorFunc(Object obj, Method method) {
        mObject = obj;
        mHandleErrorFunc = method;
    }
}
