package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

/* renamed from: X.78I  reason: invalid class name */
public final class AnonymousClass78I {
    public C112166p6 A00;
    public C112166p6 A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    public final C110986mb A01() {
        if (!TextUtils.isEmpty(this.A06) && !TextUtils.isEmpty(this.A05) && !TextUtils.isEmpty(this.A03)) {
            return new C110986mb(this);
        }
        throw C18190wL.A0a("The title, subtitle and description of PIN keypad screen should NOT be empty.");
    }

    public static void A00(Context context, AnonymousClass78I r2) {
        r2.A06 = context.getString(2131827235);
    }
}
