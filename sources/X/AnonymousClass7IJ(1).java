package X;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxIListenerShape487S0100000_2_I2;
import com.facebook.redex.IDxLListenerShape382S0100000_2_I2;
import com.fbpay.common.KeyboardHeightChangeDetector$3;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7IJ  reason: invalid class name */
public final class AnonymousClass7IJ {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public View.OnAttachStateChangeListener A03;
    public View A04;
    public View A05;
    public int A06;
    public WindowManager A07;
    public final Set A08 = new CopyOnWriteArraySet();
    public final int[] A09 = new int[2];
    public final ViewTreeObserver.OnGlobalLayoutListener A0A = new IDxLListenerShape382S0100000_2_I2(this, 5);
    public final C004402a A0B = new IDxIListenerShape487S0100000_2_I2(this, 0);

    public static void A01(AnonymousClass7IJ r3) {
        WindowManager windowManager;
        View.OnAttachStateChangeListener onAttachStateChangeListener;
        View view = r3.A05;
        if (!(view == null || (onAttachStateChangeListener = r3.A03) == null)) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        r3.A03 = null;
        View view2 = r3.A04;
        if (view2 != null) {
            view2.getViewTreeObserver().removeOnGlobalLayoutListener(r3.A0A);
            C006002r.A00(r3.A04, (C004402a) null);
            if (r3.A04.isAttachedToWindow() && (windowManager = r3.A07) != null) {
                windowManager.removeViewImmediate(r3.A04);
            }
            r3.A07 = null;
            r3.A04 = null;
            r3.A06 = 0;
        }
    }

    public static void A02(AnonymousClass7IJ r4, int i) {
        for (C143628h3 C46 : r4.A08) {
            C46.C46(i, AnonymousClass0wJ.A1T(r4.A06, 48));
        }
    }

    public static boolean A03(Activity activity) {
        if (activity == null || activity.getWindow() == null || (activity.getWindow().getDecorView().getSystemUiVisibility() & 1536) == 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass7IJ(Fragment fragment, boolean z) {
        if (z || A03(fragment.getActivity())) {
            fragment.mLifecycleRegistry.A07(new KeyboardHeightChangeDetector$3(fragment, this, z));
        }
    }

    public static void A00(Activity activity, AnonymousClass7IJ r8) {
        int i;
        A01(r8);
        View view = r8.A05;
        if (view != null) {
            IBinder windowToken = view.getWindowToken();
            if (!activity.isFinishing() && !activity.isDestroyed() && windowToken != null && activity.getWindow() != null) {
                int i2 = activity.getWindow().getAttributes().type;
                if (i2 < 1000 || i2 > 1999) {
                    if (activity.getWindow() == null) {
                        i = 0;
                    } else {
                        i = activity.getWindow().getAttributes().softInputMode & 240;
                    }
                    r8.A06 = i;
                    r8.A07 = (WindowManager) activity.getSystemService("window");
                    r8.A04 = new View(activity);
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1003, 131096, -3);
                    layoutParams.softInputMode = 16;
                    layoutParams.token = windowToken;
                    try {
                        r8.A07.addView(r8.A04, layoutParams);
                        r8.A04.getViewTreeObserver().addOnGlobalLayoutListener(r8.A0A);
                        C006002r.A00(r8.A04, r8.A0B);
                    } catch (WindowManager.BadTokenException unused) {
                        r8.A07 = null;
                        r8.A04 = null;
                        r8.A06 = 0;
                    }
                }
            }
        }
    }
}
