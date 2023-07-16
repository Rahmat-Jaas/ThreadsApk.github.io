package X;

/* renamed from: X.5Id  reason: invalid class name */
public final class AnonymousClass5Id extends AnonymousClass0Sf {
    public static final C98616Gg Companion = new C98616Gg();
    public final Object A00;
    public final String A01;
    public final boolean A02;

    public static AnonymousClass5Id A00(Object obj) {
        return new AnonymousClass5Id(obj, (String) null, true);
    }

    public static AnonymousClass5Id A01(Object obj, String str, boolean z) {
        return new AnonymousClass5Id(obj, str, z);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DcpResult(result=");
        A0s.append(this.A00);
        A0s.append(", isSuccess=");
        A0s.append(this.A02);
        A0s.append(", error=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public AnonymousClass5Id(Object obj, String str, boolean z) {
        this.A00 = obj;
        this.A02 = z;
        this.A01 = str;
    }
}
