package X;

import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.6xv  reason: invalid class name and case insensitive filesystem */
public final class C116976xv {
    public static void A00(View view) {
        Context context;
        if (view != null && (context = view.getContext()) != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            IBinder windowToken = view.getWindowToken();
            if (inputMethodManager != null && windowToken != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
    }

    public static void A01(View view) {
        Context context;
        if (view != null && (context = view.getContext()) != null) {
            Configuration A0B = C86114wI.A0B(context);
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager == null) {
                return;
            }
            if (A0B.keyboard == 1 || A0B.hardKeyboardHidden != 1) {
                inputMethodManager.showSoftInput(view, 2);
            }
        }
    }
}
