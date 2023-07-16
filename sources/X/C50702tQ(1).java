package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.2tQ  reason: invalid class name and case insensitive filesystem */
public final class C50702tQ {
    public static final void A00(Context context, String str) {
        String A0L = AnonymousClass00U.A0L("sms:", "");
        Intent A09 = C18210wN.A09("android.intent.action.VIEW");
        A09.setData(Uri.parse(A0L));
        if (str != null) {
            A09.putExtra("sms_body", str);
        }
        C10650ih.A01(context, A09);
    }
}
