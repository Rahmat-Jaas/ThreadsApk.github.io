package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.2tJ  reason: invalid class name and case insensitive filesystem */
public final class C50632tJ {
    public static void A00(Context context, String str, String str2) {
        Intent A09 = C18210wN.A09("android.intent.action.SENDTO");
        A09.setData(Uri.parse("mailto:"));
        A09.putExtra("android.intent.extra.SUBJECT", str);
        A09.putExtra("android.intent.extra.TEXT", str2);
        C10650ih.A0B(context, A09);
    }
}
