package X;

import android.content.Intent;

/* renamed from: X.0mB  reason: invalid class name and case insensitive filesystem */
public final class C12600mB implements C13660o5 {
    public Integer A00 = null;
    public final Intent A01;
    public final C12710mM A02;

    public final boolean BZj() {
        Integer A012 = this.A02.A01(this.A01.getPackage());
        this.A00 = A012;
        return AnonymousClass006.A05.equals(A012);
    }

    public final boolean BZk() {
        Integer A012 = this.A02.A01(C12710mM.A00(this.A01));
        this.A00 = A012;
        return AnonymousClass006.A05.equals(A012);
    }

    public C12600mB(Intent intent, C12710mM r3) {
        this.A02 = r3;
        this.A01 = intent;
    }

    public final void DAV() {
        if (!BZj()) {
            Integer num = this.A00;
            if (num == null) {
                num = AnonymousClass006.A06;
            }
            throw new C14470pT(AnonymousClass00U.A0L("Invalid package ", this.A01.getPackage()), num);
        }
    }
}
