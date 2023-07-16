package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppFlag;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Yd  reason: invalid class name and case insensitive filesystem */
public final class C62293Yd {
    public static C62293Yd A05;
    public static final long A06;
    public static final long A07;
    public final ComponentName A00;
    public final SharedPreferences A01;
    public final PackageManager A02;
    public final C36477JWz A03;
    public final Context A04;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A07 = timeUnit.toMillis(7);
        A06 = timeUnit.toMillis(1);
    }

    public static synchronized C62293Yd A00(Context context) {
        C62293Yd r1;
        synchronized (C62293Yd.class) {
            r1 = A05;
            if (r1 == null) {
                Context applicationContext = context.getApplicationContext();
                r1 = new C62293Yd(applicationContext, new C36477JWz(applicationContext, applicationContext.getPackageManager()));
                A05 = r1;
            }
        }
        return r1;
    }

    public final boolean A01() {
        C36477JWz jWz = this.A03;
        boolean z = true;
        if (!jWz.A01().A05 || !jWz.A02(1)) {
            z = false;
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        synchronized (this) {
            if (this.A02.getComponentEnabledSetting(this.A00) == 1) {
                z2 = true;
            }
        }
        return z2;
    }

    public C62293Yd(Context context, C36477JWz jWz) {
        this.A04 = context;
        this.A03 = jWz;
        this.A01 = context.getSharedPreferences("oxygen_preloads_sdk", 0);
        this.A02 = context.getPackageManager();
        this.A00 = new ComponentName(context, IsManagedAppFlag.class);
    }

    public final boolean A02() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            C36477JWz jWz = this.A03;
            boolean z = true;
            if (!jWz.A01().A05 || !jWz.A02(1)) {
                z = false;
            }
            boolean z2 = false;
            if (!z) {
                return false;
            }
            boolean z3 = AnonymousClass3TJ.A00(this.A04).A07;
            synchronized (this) {
                long currentTimeMillis = System.currentTimeMillis();
                int i = 2;
                if (z3) {
                    i = 1;
                }
                PackageManager packageManager = this.A02;
                ComponentName componentName = this.A00;
                packageManager.setComponentEnabledSetting(componentName, i, 1);
                AnonymousClass0wJ.A12(this.A01.edit(), "/is_managed_app_cache/is_managed_app_last_check", currentTimeMillis);
                if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                    z2 = true;
                }
            }
            return z2;
        }
        throw C18180wK.A0a("Cannot block UI thread when waiting for service call.");
    }
}
