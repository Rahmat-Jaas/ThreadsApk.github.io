package com.instagram.react.modules.base;

import X.AnonymousClass0wJ;
import X.C122217Lp;
import X.C13950oZ;
import X.C25828Dsm;
import X.C86144wL;
import X.IPD;
import android.app.Activity;
import android.app.Dialog;
import com.facebook.fbreact.specs.NativeIgDialogSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "IgDialog")
public class IgReactDialogModule extends NativeIgDialogSpec {
    public static final String CANCELABLE_KEY = "IS_CANCELABLE";
    public static final String CANCELED_ON_TOUCH_OUTSIDE_KEY = "CANCELED_ON_TOUCH_OUTSIDE";
    public static final String GRAVITY_BOTTOM = "BOTTOM";
    public static final String GRAVITY_CENTER = "CENTER";
    public static final String GRAVITY_TOP = "TOP";
    public static final String MODULE_NAME = "IgDialog";
    public static final String NEGATIVE_BUTTON_KEY = "NEGATIVE_BUTTON";
    public static final String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT";
    public static final String POSITIVE_BUTTON_KEY = "POSITIVE_BUTTON";
    public static final String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT";

    public String getName() {
        return "IgDialog";
    }

    public Map getTypedExportedConstants() {
        HashMap A0y = AnonymousClass0wJ.A0y();
        A0y.put(CANCELABLE_KEY, CANCELABLE_KEY);
        A0y.put(CANCELED_ON_TOUCH_OUTSIDE_KEY, CANCELED_ON_TOUCH_OUTSIDE_KEY);
        A0y.put(NEGATIVE_BUTTON_TEXT_KEY, NEGATIVE_BUTTON_TEXT_KEY);
        A0y.put(NEGATIVE_BUTTON_KEY, -2);
        A0y.put(POSITIVE_BUTTON_KEY, C86144wL.A0b());
        A0y.put(POSITIVE_BUTTON_TEXT_KEY, POSITIVE_BUTTON_TEXT_KEY);
        A0y.put("TOP", 48);
        A0y.put("CENTER", 17);
        A0y.put("BOTTOM", 80);
        return A0y;
    }

    public Dialog showDialogHelper(String str, String str2, ReadableMap readableMap, Callback callback, Callback callback2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        C25828Dsm dsm = new C25828Dsm(currentActivity);
        if (str != null && !str.isEmpty()) {
            dsm.A02 = str;
        }
        if (str2 != null && !str2.isEmpty()) {
            dsm.A0p(str2);
        }
        if (readableMap.hasKey(CANCELABLE_KEY)) {
            dsm.A0q(readableMap.getBoolean(CANCELABLE_KEY));
        }
        if (readableMap.hasKey(CANCELED_ON_TOUCH_OUTSIDE_KEY)) {
            dsm.A0r(readableMap.getBoolean(CANCELED_ON_TOUCH_OUTSIDE_KEY));
        }
        C122217Lp r2 = new C122217Lp(callback2, callback);
        if (readableMap.hasKey(NEGATIVE_BUTTON_TEXT_KEY)) {
            dsm.A0b(r2, readableMap.getString(NEGATIVE_BUTTON_TEXT_KEY));
        }
        if (readableMap.hasKey(POSITIVE_BUTTON_TEXT_KEY)) {
            dsm.A0c(r2, readableMap.getString(POSITIVE_BUTTON_TEXT_KEY));
        }
        dsm.A0e(r2);
        Dialog A0G = dsm.A0G();
        C13950oZ.A00(A0G);
        return A0G;
    }

    public IgReactDialogModule(IPD ipd) {
        super(ipd);
    }

    public void showDialog(String str, String str2, ReadableMap readableMap, Callback callback, Callback callback2) {
        showDialogHelper(str, str2, readableMap, callback, callback2);
    }
}
