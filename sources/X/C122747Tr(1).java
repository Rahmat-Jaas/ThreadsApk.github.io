package X;

/* renamed from: X.7Tr  reason: invalid class name and case insensitive filesystem */
public final class C122747Tr implements C147208oy {
    public final int A00;
    public final int A01;
    public final C142658fN A02;

    public C122747Tr(C142658fN r2, int i, int i2) {
        C04220Ms.A0B(r2, 3);
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ C146248lu DAN(AnonymousClass8cW r5) {
        return new AnonymousClass7U7(this.A02, this.A01, this.A00);
    }

    public final /* bridge */ /* synthetic */ C147238p1 DAO(AnonymousClass8cW r5) {
        return new AnonymousClass7U7(this.A02, this.A01, this.A00);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C122747Tr)) {
            return false;
        }
        C122747Tr r4 = (C122747Tr) obj;
        if (r4.A01 == this.A01 && r4.A00 == this.A00) {
            return C86134wK.A1a(r4.A02, this.A02, false);
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A05(this.A02, this.A01 * 31) + this.A00;
    }

    public static C122747Tr A00(C142658fN r1, int i, int i2, int i3) {
        C04220Ms.A0B(r1, i);
        return new C122747Tr(r1, i2, i3);
    }

    public C122747Tr() {
        this(AnonymousClass6aT.A00, 300, 0);
    }
}
