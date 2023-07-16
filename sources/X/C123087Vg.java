package X;

/* renamed from: X.7Vg  reason: invalid class name and case insensitive filesystem */
public final class C123087Vg implements C142778fZ {
    public AnonymousClass8d0 A00;
    public boolean A01;
    public final int A02;
    public final long A03;

    public final void cancel() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass8d0 r0 = this.A00;
            if (r0 != null) {
                AnonymousClass7Y6 r02 = (AnonymousClass7Y6) r0;
                AnonymousClass7H8 r5 = r02.A00;
                r5.A03();
                Object remove = r5.A08.remove(r02.A01);
                if (remove != null) {
                    if (C18180wK.A1X(r5.A01)) {
                        AnonymousClass84X r3 = r5.A06.A0Z.A00;
                        int indexOf = r3.A04().indexOf(remove);
                        int A002 = AnonymousClass84X.A00(r3);
                        int i = r5.A01;
                        if (indexOf >= A002 - i) {
                            r5.A02++;
                            r5.A01 = i - 1;
                            int A003 = (AnonymousClass84X.A00(r3) - r5.A01) - r5.A02;
                            AnonymousClass7H8.A01(r5, indexOf, A003);
                            r5.A04(A003);
                        } else {
                            throw C18180wK.A0a("Check failed.");
                        }
                    } else {
                        throw C18180wK.A0a("Check failed.");
                    }
                }
            }
            this.A00 = null;
        }
    }

    public C123087Vg(int i, long j) {
        this.A02 = i;
        this.A03 = j;
    }
}
