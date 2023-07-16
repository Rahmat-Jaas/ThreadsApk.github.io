package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.77w  reason: invalid class name and case insensitive filesystem */
public final class C1199777w {
    public String A00;
    public String A01;
    public String A02;

    public final C108756it A01() {
        if (!TextUtils.isEmpty(this.A02) && !TextUtils.isEmpty(this.A01) && !TextUtils.isEmpty(this.A00)) {
            return new C108756it(this);
        }
        throw C18190wL.A0a("The title, subtitle and action button text of auth dialog screen should NOT be empty.");
    }

    public static void A00(Context context, C1199777w r1, int i) {
        r1.A02 = context.getString(i);
    }
}
