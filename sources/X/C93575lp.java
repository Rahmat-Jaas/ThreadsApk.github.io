package X;

import android.content.Context;
import android.os.Looper;
import android.util.Log;

/* renamed from: X.5lp  reason: invalid class name and case insensitive filesystem */
public final class C93575lp extends C93625lu {
    public final int Ave() {
        return 17895000;
    }

    public C93575lp(Context context, Looper looper, C145398kR r10, C143778hI r11, C110886mR r12) {
        super(context, looper, r10, r11, r12, 224);
    }

    public final void AI8(String str) {
        String str2;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "GoogleAuthServiceClientImpl disconnected with reason: ".concat(valueOf);
        } else {
            str2 = new String("GoogleAuthServiceClientImpl disconnected with reason: ");
        }
        Log.w("GoogleAuthSvcClientImpl", str2);
        super.AI8(str);
    }
}
