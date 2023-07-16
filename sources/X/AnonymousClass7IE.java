package X;

import android.app.Activity;
import android.view.Window;
import com.facebook.forker.Process;
import com.instagram.barcelona.R;

/* renamed from: X.7IE  reason: invalid class name */
public final class AnonymousClass7IE {
    public static Integer A00;
    public static Integer A01;

    public static void A02(Activity activity) {
        Integer num = A00;
        if (num == null) {
            num = C86134wK.A0b(activity, R.color.igds_transparent_navigation_bar);
            A00 = num;
        }
        A03(activity, num.intValue());
        A04(activity, false);
    }

    public static int A00(Activity activity) {
        activity.getClass();
        Window window = activity.getWindow();
        window.getClass();
        return window.getNavigationBarColor();
    }

    public static void A01(Activity activity) {
        int color;
        if (!C30975Gcb.A03()) {
            Integer num = A01;
            if (num == null) {
                if (C18220wO.A0q(activity).equals(C18170wI.A00(337))) {
                    color = C121907Is.A00(activity, 16843858);
                } else {
                    color = activity.getColor(R.color.direct_widget_primary_background);
                }
                num = Integer.valueOf(color);
                A01 = num;
            }
            A03(activity, num.intValue());
            A04(activity, true);
            return;
        }
        A02(activity);
    }

    public static void A03(Activity activity, int i) {
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        Window window = activity.getWindow();
        window.getClass();
        window.addFlags(Process.WAIT_RESULT_TIMEOUT);
        window.setNavigationBarColor(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.C30975Gcb.A03() != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(android.app.Activity r2, boolean r3) {
        /*
            android.view.Window r1 = r2.getWindow()
            r1.getClass()
            android.view.View r0 = r1.getDecorView()
            X.03c r2 = new X.03c
            r2.<init>(r0, r1)
            if (r3 == 0) goto L_0x0019
            boolean r0 = X.C30975Gcb.A03()
            r1 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            X.03a r0 = r2.A00
            r0.A04(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IE.A04(android.app.Activity, boolean):void");
    }
}
