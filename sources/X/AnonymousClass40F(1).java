package X;

/* renamed from: X.40F  reason: invalid class name */
public final class AnonymousClass40F implements AnonymousClass0UE {
    public C14090on A00;

    public final void CdI(String str, String str2, int i, String str3) {
        C14100oo ABJ = this.A00.ABJ("content_resolver", 817892585);
        if (ABJ.isSampled()) {
            ABJ.A8U("operation", str);
            ABJ.A8U("authority", str2);
            ABJ.A8S("callsite_id", i);
            ABJ.Ciu(new AnonymousClass2AZ(str3));
            ABJ.report();
        }
    }

    public AnonymousClass40F(C14090on r1) {
        this.A00 = r1;
    }
}
