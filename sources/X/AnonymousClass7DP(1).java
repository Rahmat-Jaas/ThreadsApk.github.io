package X;

import com.facebookpay.otc.models.OtcInput;

/* renamed from: X.7DP  reason: invalid class name */
public final class AnonymousClass7DP {
    public final String A00;
    public final boolean A01;

    public static AnonymousClass7DP A00(OtcInput otcInput) {
        return new AnonymousClass7DP(true, otcInput.A01);
    }

    public AnonymousClass7DP(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    public AnonymousClass7DP() {
        this(false, (String) null);
    }
}
