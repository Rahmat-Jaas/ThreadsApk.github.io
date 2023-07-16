package X;

/* renamed from: X.7mw  reason: invalid class name and case insensitive filesystem */
public final class C129867mw implements C143948hZ {
    public final /* synthetic */ C129857mr A00;
    public final /* synthetic */ String A01;

    public C129867mw(C129857mr r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final void BrF(C1202579k r4) {
        String str;
        if (r4.A03()) {
            str = "successful";
        } else if (r4.A03()) {
            str = "task was successful";
        } else {
            Exception A012 = r4.A01();
            if (A012 != null) {
                str = A012.toString();
            } else {
                str = "Task was not successful but there was no exception?";
            }
        }
        C129857mr.A00(this.A00, "deferredUninstall: %s result: %s", this.A01, str);
    }
}
