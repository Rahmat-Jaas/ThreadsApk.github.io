package X;

/* renamed from: X.419  reason: invalid class name */
public final class AnonymousClass419 implements C143888hT {
    public final /* synthetic */ C106336es A00;
    public final /* synthetic */ String A01;

    public AnonymousClass419(C106336es r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void ByD(Exception exc) {
        StringBuilder A0s = C18190wL.A0s("API_ERROR: ");
        A0s.append(exc.getClass());
        A0s.append(":");
        String A0i = C18180wK.A0i(exc.getMessage(), A0s);
        String str = this.A01;
        C38040KHr.A01.CWx(new AnonymousClass45Q(A0i, AnonymousClass006.A0C, str));
    }
}
