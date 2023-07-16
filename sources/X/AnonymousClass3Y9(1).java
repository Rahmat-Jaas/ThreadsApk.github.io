package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.endtoend.EndToEnd;

/* renamed from: X.3Y9  reason: invalid class name */
public final class AnonymousClass3Y9 {
    public final Activity A00;
    public final JSP A01;
    public final C10300i6 A02;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.AnonymousClass3Y9 r4) {
        /*
            r3 = 0
            X.19m r1 = new X.19m
            r1.<init>()
            X.JSP r0 = r4.A01
            int r2 = r0.A00(r1, r3)
            r0 = 5
            if (r2 < 0) goto L_0x003b
            if (r2 < r0) goto L_0x0033
            r1 = 8
            r0 = 7
            if (r0 > r2) goto L_0x002b
            if (r2 < r1) goto L_0x0033
            r0 = 10
            if (r2 >= r0) goto L_0x003b
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 18308045424106854(0x410b1200091d66, double:1.8961237688245017E-307)
        L_0x0023:
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 != 0) goto L_0x002a
            r3 = 1
        L_0x002a:
            return r3
        L_0x002b:
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 18308045424172391(0x410b12000a1d67, double:1.8961237688504054E-307)
            goto L_0x0023
        L_0x0033:
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 18308045424041317(0x410b1200081d65, double:1.896123768798598E-307)
            goto L_0x0023
        L_0x003b:
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 18308045423975780(0x410b1200071d64, double:1.8961237687726944E-307)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y9.A01(X.3Y9):boolean");
    }

    public final boolean A02(Integer num) {
        Application application = this.A00.getApplication();
        C04220Ms.A06(application);
        AnonymousClass3R8.A00(application);
        if (((EndToEnd.isRunningEndToEndTest() || EndToEnd.A02()) && C63173fJ.A05(AnonymousClass0TJ.A06, 18308857172336372L)) || AnonymousClass006.A0Y == num) {
            return false;
        }
        return A01(this);
    }

    public AnonymousClass3Y9(Activity activity, C10300i6 r4) {
        AnonymousClass0wJ.A1O(activity, r4);
        this.A00 = activity;
        this.A02 = r4;
        Context baseContext = activity.getBaseContext();
        C04220Ms.A06(baseContext);
        this.A01 = new JSP(baseContext, r4);
        Application application = activity.getApplication();
        C04220Ms.A06(application);
        AnonymousClass3R8.A00(application);
    }

    public static String A00(AnonymousClass3Y9 r0) {
        if (A01(r0)) {
            return "caa_iteration_v3_perf_ig_4";
        }
        return "not_in_experiment";
    }
}
