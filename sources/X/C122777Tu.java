package X;

/* renamed from: X.7Tu  reason: invalid class name and case insensitive filesystem */
public final class C122777Tu implements C147218oz {
    public final float A00;
    public final float A01;
    public final Object A02;

    public final /* bridge */ /* synthetic */ C146248lu DAN(AnonymousClass8cW r5) {
        C1203479u A002;
        C04220Ms.A0B(r5, 0);
        float f = this.A00;
        float f2 = this.A01;
        Object obj = this.A02;
        if (obj == null) {
            A002 = null;
        } else {
            A002 = AnonymousClass7U0.A00(r5, obj);
        }
        return new AnonymousClass7U1(A002, f, f2);
    }

    public static C122777Tu A00(Object obj) {
        return new C122777Tu(obj, 1.0f, 1500.0f);
    }

    public static C122777Tu A01(Object obj) {
        return new C122777Tu(obj, 1.0f, 400.0f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C122777Tu)) {
            return false;
        }
        C122777Tu r4 = (C122777Tu) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01 && C04220Ms.A0I(r4.A02, this.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C86144wL.A03(C86104wH.A05(C18230wP.A05(this.A02) * 31, this.A00), this.A01);
    }

    public C122777Tu(Object obj, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = obj;
    }

    public C122777Tu() {
        this((Object) null, 1.0f, 1500.0f);
    }
}
