package X;

/* renamed from: X.1iC  reason: invalid class name */
public final class AnonymousClass1iC extends C63873iU {
    public final String A00;
    public final String A01;

    public AnonymousClass1iC(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public final void onFail(AnonymousClass3XX r7) {
        String str;
        int A03 = C14030oh.A03(255275751);
        C38040KHr kHr = C38040KHr.A01;
        String str2 = this.A01;
        Throwable th = r7.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        kHr.CWx(new AnonymousClass45R(str2, AnonymousClass006.A15, str));
        C14030oh.A0A(2037917536, A03);
    }

    public final void onFinish() {
        int A03 = C14030oh.A03(950062563);
        C38040KHr.A01.CWx(new AnonymousClass45D());
        C14030oh.A0A(277773874, A03);
    }

    public final void onStart() {
        int A03 = C14030oh.A03(-1832178710);
        C38040KHr.A01.CWx(new AnonymousClass45I(this.A00));
        C14030oh.A0A(-1587972338, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C38040KHr kHr;
        C81374ng r3;
        int A03 = C14030oh.A03(-937154622);
        AnonymousClass1U4 r8 = (AnonymousClass1U4) obj;
        int A032 = C14030oh.A03(566002071);
        if ((r8 instanceof C26661r0) || r8.A04) {
            kHr = C38040KHr.A01;
            r3 = new AnonymousClass45S((AnonymousClass1TY) null, this.A01, this.A00);
        } else {
            kHr = C38040KHr.A01;
            r3 = new AnonymousClass45R(this.A01, AnonymousClass006.A15, r8.getErrorMessage());
        }
        kHr.CWx(r3);
        C14030oh.A0A(-506244053, A032);
        C14030oh.A0A(885593177, A03);
    }
}
