package X;

/* renamed from: X.0gf  reason: invalid class name and case insensitive filesystem */
public final class C09780gf {
    public final /* synthetic */ AnonymousClass0W6[] A00;
    public final /* synthetic */ int[] A01;

    public C09780gf(int[] iArr, AnonymousClass0W6[] r2) {
        this.A01 = iArr;
        this.A00 = r2;
    }

    public final AnonymousClass0W6 A00(int i) {
        AnonymousClass0W6 r0 = this.A00[i];
        if (r0 != null) {
            return r0;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0J("Unknown provider with id = ", i));
    }
}
