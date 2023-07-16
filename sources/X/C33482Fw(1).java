package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.2Fw  reason: invalid class name and case insensitive filesystem */
public final class C33482Fw {
    public static final void A00(Context context, String str) {
        C04220Ms.A0B(context, 0);
        if (C09650fs.A05(context)) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("instagram://user?id=%s&id_type=igid", (Object) str);
            C04220Ms.A06(formatStrLocaleSafe);
            C37412JrW.A01(context, formatStrLocaleSafe);
            return;
        }
        C09650fs.A01(context, "com.instagram.android", "com.instagram.barcelona");
    }
}
