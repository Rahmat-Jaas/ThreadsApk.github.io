package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.0sN  reason: invalid class name and case insensitive filesystem */
public final class C16040sN implements C14870qJ {
    public final C15350rA A00;
    public final int A01;
    public final C14880qK A02;

    private void A00(Context context, C15010qZ[] r4) {
        C15350rA r1 = this.A00;
        synchronized (r1) {
            r1.A00 = context;
        }
        for (int i = 0; i < r4.length; i++) {
            if (r4[i] instanceof C15090qh) {
                r4[i] = ((C15090qh) r4[i]).CZX(context);
            }
        }
    }

    public final boolean CZY(UnsatisfiedLinkError unsatisfiedLinkError, C15010qZ[] r8) {
        int i;
        C15350rA r4 = this.A00;
        Context A002 = r4.A00();
        C14880qK r3 = this.A02;
        if (r3.A01(A002.getApplicationInfo().sourceDir)) {
            Log.w("soloader.recovery.RefereshContext", "Application info was updated dynamically");
            A00(A002, r8);
            return true;
        }
        try {
            Context A003 = r4.A00();
            Context createPackageContext = A003.createPackageContext(A003.getPackageName(), 0);
            if (r3.A01(createPackageContext.getApplicationInfo().sourceDir)) {
                Log.w("soloader.recovery.RefereshContext", "Updating context to package context");
                A00(createPackageContext, r8);
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("soloader.recovery.RefereshContext", "Can not find the package ", e);
        }
        int i2 = this.A01;
        synchronized (r3) {
            i = r3.A00;
        }
        if (i2 == i) {
            return false;
        }
        Log.w("soloader.recovery.RefereshContext", "Context was updated (perhaps by another thread)");
        return true;
    }

    public C16040sN(C15350rA r2, C14880qK r3) {
        int i;
        this.A00 = r2;
        this.A02 = r3;
        synchronized (r3) {
            i = r3.A00;
        }
        this.A01 = i;
    }
}
