package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.3FL  reason: invalid class name */
public final class AnonymousClass3FL {
    public final AnonymousClass3HX A00;
    public final AnonymousClass601 A01;
    public final C109326jp A02;

    public final void A00(String str) {
        String str2 = "timeout";
        if (!str2.equals(str)) {
            str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE;
        }
        C109326jp r2 = this.A02;
        C61043Rr.A00(this.A01, new C63893iY(C06750aI.A17(null, str2, this.A00)), r2);
    }

    public AnonymousClass3FL(AnonymousClass3HX r1, AnonymousClass601 r2, C109326jp r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
