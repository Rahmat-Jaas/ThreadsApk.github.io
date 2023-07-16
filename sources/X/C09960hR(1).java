package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0hR  reason: invalid class name and case insensitive filesystem */
public final class C09960hR {
    public static List A00;

    public static int A00() {
        List<Rect> list = A00;
        int i = 0;
        if (list != null) {
            for (Rect rect : list) {
                if (rect.top == 0 && rect.height() > i) {
                    i = rect.height();
                }
            }
        }
        return i;
    }

    public static int A01(Context context) {
        Display display;
        DisplayCutout cutout;
        if (Build.VERSION.SDK_INT < 30 || (display = context.getDisplay()) == null || (cutout = display.getCutout()) == null) {
            return 0;
        }
        return cutout.getSafeInsetTop();
    }

    public static void A02(View view, Runnable runnable) {
        List<Rect> emptyList;
        DisplayCutout displayCutout;
        if (view.isAttachedToWindow()) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
                emptyList = Collections.emptyList();
            } else {
                emptyList = displayCutout.getBoundingRects();
            }
            A00 = emptyList;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        view.addOnAttachStateChangeListener(new C09980hU(runnable));
    }

    public static void A03(WindowManager.LayoutParams layoutParams, String str) {
        Class<?> cls = layoutParams.getClass();
        try {
            cls.getDeclaredField("layoutInDisplayCutoutMode").set(layoutParams, Integer.valueOf(cls.getDeclaredField(str).getInt(cls)));
        } catch (Exception e) {
            AnonymousClass0LU.A0E("DisplayCutoutUtil", "failed to set display cutout mode", e);
        }
    }

    public static boolean A04() {
        if (A00() > 0) {
            return true;
        }
        return false;
    }
}
