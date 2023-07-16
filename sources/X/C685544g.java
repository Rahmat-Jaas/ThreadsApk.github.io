package X;

import java.net.URI;

/* renamed from: X.44g  reason: invalid class name and case insensitive filesystem */
public final class C685544g implements C82334pS {
    public final C10300i6 A00;
    public final AnonymousClass47k A01;
    public final C82334pS A02;
    public final String A03;

    public final C39768Kzc startRequest(GXK gxk, JWQ jwq, C36491JXy jXy) {
        String str = this.A03;
        URI uri = gxk.A08;
        boolean equals = str.equals(uri.getHost());
        boolean z = false;
        if (C09120et.A02().A0X() && str.contains(":")) {
            z = str.split(":")[0].equals(uri.getHost());
        }
        if (equals || z) {
            jXy.A01(new AnonymousClass1j6(this));
        }
        return this.A02.startRequest(gxk, jwq, jXy);
    }

    public C685544g(C10300i6 r4, C82334pS r5) {
        AnonymousClass47k r1;
        this.A00 = r4;
        this.A02 = r5;
        synchronized (AnonymousClass47k.class) {
            r1 = AnonymousClass47k.A06;
            if (r1 == null) {
                r1 = new AnonymousClass47k(C08360dF.A00());
                AnonymousClass47k.A06 = r1;
            }
        }
        this.A01 = r1;
        this.A03 = AnonymousClass3h3.A00();
    }
}
