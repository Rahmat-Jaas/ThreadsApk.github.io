package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.3Wz  reason: invalid class name and case insensitive filesystem */
public final class C62063Wz {
    public static final C62063Wz A00 = new C62063Wz();

    public static final void A00(Context context, String str) {
        Intent A0B = C18230wP.A0B();
        A0B.setPackage(str);
        A0B.setAction("com.whatsapp.otp.OTP_REQUESTED");
        Bundle extras = A0B.getExtras();
        if (extras == null) {
            extras = C18180wK.A06();
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 67108864;
        }
        C16230sh A0I = C18210wN.A0I(context, A0B);
        A0I.A05();
        extras.putParcelable("_ci_", A0I.A02(context, 0, i));
        A0B.putExtras(extras);
        context.sendBroadcast(A0B);
    }
}
