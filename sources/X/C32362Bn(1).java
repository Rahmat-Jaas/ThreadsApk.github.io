package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.2Bn  reason: invalid class name and case insensitive filesystem */
public final class C32362Bn {
    public static final boolean A00(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        C40294Lbx lbx = C40294Lbx.A01;
        C15740ro r1 = new C15740ro();
        r1.A01 = lbx.A00();
        if (!r1.A00().A01(context, intent, (C16240si) null) || !intent.hasExtra("CrossAppFollowUtils.EXTRA_AUTO_FOLLOW")) {
            return false;
        }
        return intent.getBooleanExtra("CrossAppFollowUtils.EXTRA_AUTO_FOLLOW", false);
    }
}
