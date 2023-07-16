package X;

/* renamed from: X.3EZ  reason: invalid class name */
public final class AnonymousClass3EZ {
    public final /* synthetic */ C29261xe A00;

    public final void A00(String str, String str2, String str3) {
        C29261xe r3 = this.A00;
        C28541uY r4 = new C28541uY(r3.A01, this, str2, str, str3);
        C62423Zt.A03(r3.A02, "notifications", AnonymousClass00U.A0L(str2, "_setting_changed"));
        r3.A03.A01(str2, str, "radio");
        C32165H8c A01 = AnonymousClass3OP.A01(r3.A02, str2, str);
        A01.A00 = r4;
        r3.schedule(A01);
    }

    public AnonymousClass3EZ(C29261xe r1) {
        this.A00 = r1;
    }
}
