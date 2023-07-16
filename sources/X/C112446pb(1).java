package X;

/* renamed from: X.6pb  reason: invalid class name and case insensitive filesystem */
public final class C112446pb {
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public C112446pb(Object obj, Object obj2, Object obj3) {
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final IllegalArgumentException A00() {
        StringBuilder A0s = C18190wL.A0s(AnonymousClass000.A00(667));
        Object obj = this.A00;
        A0s.append(obj);
        A0s.append("=");
        A0s.append(this.A01);
        A0s.append(" and ");
        A0s.append(obj);
        A0s.append("=");
        return C18190wL.A0a(C18200wM.A0m(this.A02, A0s));
    }
}
