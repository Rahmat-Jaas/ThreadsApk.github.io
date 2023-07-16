package X;

import android.content.SharedPreferences;

/* renamed from: X.2Ho  reason: invalid class name and case insensitive filesystem */
public final class C33922Ho {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        SharedPreferences.Editor putBoolean;
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r6);
        C28161tl A01 = AnonymousClass3WS.A01(C05030Qo.A02(C63913ic.A0F(r6)));
        int A04 = AnonymousClass0wJ.A04(C63893iY.A0A(r7, 0));
        if (A04 > 0) {
            putBoolean = C28161tl.A02(A01).putBoolean("seen_contact_import_dialog", A1Z);
        } else {
            if (A04 == 0) {
                putBoolean = C28161tl.A02(A01).putBoolean("seen_contact_import_dialog", false);
            }
            AnonymousClass0wJ.A11(C28161tl.A02(A01), "num_times_seen_contact_import_weekly_upsell", A04);
            return null;
        }
        putBoolean.apply();
        AnonymousClass0wJ.A11(C28161tl.A02(A01), "num_times_seen_contact_import_weekly_upsell", A04);
        return null;
    }
}
