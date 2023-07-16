package X;

/* renamed from: X.471  reason: invalid class name */
public final class AnonymousClass471 implements C82394pY {
    public final /* synthetic */ C692747q A00;
    public final /* synthetic */ String A01;

    public AnonymousClass471(C692747q r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C14030oh.A03(357586532);
        int A032 = C14030oh.A03(-1012291805);
        C692747q r2 = this.A00;
        String str = this.A01;
        if (str != null) {
            C692747q.A00(r2, str);
            C82394pY r22 = r2.A01;
            if (r22 != null) {
                C38040KHr.A01.A04(r22, AnonymousClass45A.class);
            }
            C14030oh.A0A(-1338334006, A032);
            C14030oh.A0A(-362672682, A03);
            return;
        }
        IllegalStateException A0a = C18180wK.A0a("Required value was null.");
        C14030oh.A0A(548181470, A032);
        throw A0a;
    }
}
