package X;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.5lE  reason: invalid class name and case insensitive filesystem */
public final class C93235lE extends C129167lR {
    public static int A00 = 1;

    public static final synchronized int A00(C93235lE r7) {
        int i;
        synchronized (r7) {
            i = A00;
            if (i == 1) {
                Context context = r7.A01;
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                int A02 = googleApiAvailability.A02(context, 12451000);
                if (A02 == 0) {
                    A00 = 4;
                    i = 4;
                } else if (googleApiAvailability.A03(context, (String) null, A02) != null || AnonymousClass7KA.A00(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    A00 = 2;
                    i = 2;
                } else {
                    A00 = 3;
                    i = 3;
                }
            }
        }
        return i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C93235lE(android.app.Activity r9, com.google.android.gms.auth.api.signin.GoogleSignInOptions r10) {
        /*
            r8 = this;
            X.6jD r6 = X.C103876as.A05
            X.7lg r2 = new X.7lg
            r2.<init>()
            r3 = r9
            android.os.Looper r1 = r9.getMainLooper()
            java.lang.String r0 = "Looper must not be null."
            X.C13320nQ.A02(r1, r0)
            if (r1 != 0) goto L_0x0017
            android.os.Looper r1 = android.os.Looper.getMainLooper()
        L_0x0017:
            X.75p r7 = new X.75p
            r7.<init>(r1, r2)
            r2 = r8
            r5 = r10
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93235lE.<init>(android.app.Activity, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    public C93235lE(Context context, GoogleSignInOptions googleSignInOptions) {
        super((Activity) null, context, googleSignInOptions, C103876as.A05, new C1195075p(Looper.getMainLooper(), new C129317lg()));
    }
}
