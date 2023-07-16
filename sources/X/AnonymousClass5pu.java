package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: X.5pu  reason: invalid class name */
public final class AnonymousClass5pu extends C86854zE {
    public final Context A00;
    public final /* synthetic */ GoogleApiAvailability A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5pu(android.content.Context r2, com.google.android.gms.common.GoogleApiAvailability r3) {
        /*
            r1 = this;
            r1.A01 = r3
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L_0x0016
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L_0x000c:
            r1.<init>(r0)
            android.content.Context r0 = r2.getApplicationContext()
            r1.A00 = r0
            return
        L_0x0016:
            android.os.Looper r0 = android.os.Looper.myLooper()
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5pu.<init>(android.content.Context, com.google.android.gms.common.GoogleApiAvailability):void");
    }

    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", C86104wH.A10("Don't know how to handle this message: ", C86114wI.A0s(50), i));
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.A01;
        Context context = this.A00;
        int A02 = googleApiAvailability.A02(context, 12451000);
        if (A02 == 1 || A02 == 2 || A02 == 3 || A02 == 9) {
            Intent A03 = googleApiAvailability.A03(context, "n", A02);
            if (A03 == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(context, 0, A03, C102966Xg.A00 | 134217728);
            }
            googleApiAvailability.A06(activity, context, A02);
        }
    }
}
