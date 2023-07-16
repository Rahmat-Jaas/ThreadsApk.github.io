package X;

/* renamed from: X.7YH  reason: invalid class name */
public final class AnonymousClass7YH implements C145118js {
    public int A00;
    public AnonymousClass84X A01;
    public AnonymousClass84X A02;
    public AnonymousClass7YG A03;
    public final /* synthetic */ AnonymousClass7IW A04;

    public AnonymousClass7YH(AnonymousClass84X r1, AnonymousClass84X r2, AnonymousClass7YG r3, AnonymousClass7IW r4, int i) {
        this.A04 = r4;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r1;
        this.A01 = r2;
    }

    public final boolean A9C(int i, int i2) {
        Object obj = this.A02.A01[i];
        Object obj2 = this.A01.A01[i2];
        AnonymousClass0wJ.A1N(obj, obj2);
        if (obj.equals(obj2) || obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }

    public final void BQS(int i, int i2) {
        AnonymousClass7YG A002 = AnonymousClass7IW.A00((C147538pV) this.A01.A01[i2], this.A03);
        this.A03 = A002;
        if (!A002.A08) {
            A002.A07 = true;
            int i3 = this.A00 | A002.A01;
            this.A00 = i3;
            A002.A00 = i3;
            return;
        }
        throw C18180wK.A0a("Check failed.");
    }
}
