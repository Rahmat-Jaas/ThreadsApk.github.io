package X;

import android.content.Intent;

/* renamed from: X.0mG  reason: invalid class name and case insensitive filesystem */
public final class C12650mG implements C13660o5 {
    public final Intent A00;
    public final C12710mM A01;
    public final String A02;

    public final boolean BZk() {
        C15740ro r1 = new C15740ro();
        r1.A01 = C15760rq.A01(((C12530m4) C17250ua.A00).A07);
        r1.A04(this.A02);
        r1.A01();
        return r1.A00().A01(this.A01.A00, this.A00, (C16240si) null);
    }

    public final void DAV() {
        C14470pT r0;
        C15740ro r1 = new C15740ro();
        r1.A01 = C15760rq.A01(((C12530m4) C17250ua.A00).A07);
        r1.A04(this.A02);
        r1.A01();
        C15710rl A002 = r1.A00();
        C12640mF r2 = new C12640mF();
        if (!A002.A01(this.A01.A00, this.A00, r2) && (r0 = r2.A00) != null) {
            throw r0;
        }
    }

    public C12650mG(Intent intent, C12710mM r2, String str) {
        this.A01 = r2;
        this.A00 = intent;
        this.A02 = str == null ? "FBNS_DEFAULT_DOMAIN" : str;
    }

    public final boolean BZj() {
        try {
            DAV();
            return true;
        } catch (C14470pT e) {
            AnonymousClass0LU.A0G("FBNS_DEFAULT_DOMAIN", "Error verifying signature", e);
            return false;
        }
    }
}
