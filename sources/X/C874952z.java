package X;

/* renamed from: X.52z  reason: invalid class name and case insensitive filesystem */
public final class C874952z extends AnonymousClass7W1 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C874952z(AnonymousClass7Y3 r2) {
        super(r2);
        C04220Ms.A0B(r2, 1);
    }

    public final /* bridge */ /* synthetic */ void BQW(int i, Object obj) {
        AnonymousClass7Y3 r3 = (AnonymousClass7Y3) obj;
        C04220Ms.A0B(r3, 1);
        ((AnonymousClass7Y3) this.A00).A0L(r3, i);
    }

    public final void Bgb(int i, int i2, int i3) {
        ((AnonymousClass7Y3) this.A00).A0K(i, i2, i3);
    }

    public final void CbJ(int i, int i2) {
        AnonymousClass7Y3 r3 = (AnonymousClass7Y3) this.A00;
        if (i2 >= 0) {
            int i3 = (i2 + i) - 1;
            if (i <= i3) {
                while (true) {
                    C106826fg r2 = r3.A0Z;
                    Object A03 = r2.A00.A03(i3);
                    r2.A01.invoke();
                    AnonymousClass7Y3.A06(r3, (AnonymousClass7Y3) A03);
                    if (i3 != i) {
                        i3--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0S("count (", ") must be greater than 0", i2));
        }
    }

    public final /* bridge */ /* synthetic */ void BQd(int i, Object obj) {
    }
}
