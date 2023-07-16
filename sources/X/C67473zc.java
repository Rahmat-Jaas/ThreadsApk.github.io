package X;

/* renamed from: X.3zc  reason: invalid class name and case insensitive filesystem */
public final class C67473zc implements C146418mD, C85754vi {
    public final C67463zb A00;
    public final Class A01;
    public final String A02;

    public final String getSchema() {
        return null;
    }

    public static C67473zc A00(C67463zb r1, Class cls, String str) {
        return new C67473zc(r1, cls, str);
    }

    public static C32165H8c A01(C67463zb r1, C63873iU r2, C10300i6 r3, Class cls, String str) {
        C67473zc r0 = new C67473zc(r1, cls, str);
        C31082GfJ gfJ = new C31082GfJ(r3);
        gfJ.A06(r0);
        C32165H8c A05 = gfJ.A05(AnonymousClass006.A01);
        A05.A00 = r2;
        return A05;
    }

    public final String getCallName() {
        return this.A02;
    }

    public final C33366HmR getQueryParams() {
        return this.A00;
    }

    public final Class getTreeModelType() {
        return this.A01;
    }

    public C67473zc(C67463zb r1, Class cls, String str) {
        this.A02 = str;
        this.A00 = r1;
        this.A01 = cls;
    }

    public final /* bridge */ /* synthetic */ C146418mD setFreshCacheAgeMs(long j) {
        throw C18240wQ.A0j();
    }

    public final /* bridge */ /* synthetic */ C146418mD setMaxToleratedCacheAgeMs(long j) {
        throw C18240wQ.A0j();
    }
}
