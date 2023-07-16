package X;

/* renamed from: X.6o5  reason: invalid class name and case insensitive filesystem */
public final class C111646o5 {
    public final AnonymousClass84X A00 = AnonymousClass84X.A01(new C112006oo[16]);

    public final void A00(Throwable th) {
        AnonymousClass84X r5 = this.A00;
        int i = r5.A00;
        AnonymousClass8s9[] r3 = new AnonymousClass8s9[i];
        for (int i2 = 0; i2 < i; i2++) {
            r3[i2] = ((C112006oo) r5.A01[i2]).A01;
        }
        for (int i3 = 0; i3 < i; i3++) {
            r3[i3].AC9(th);
        }
        if (r5.A00 != 0) {
            throw C18180wK.A0a("Check failed.");
        }
    }
}
