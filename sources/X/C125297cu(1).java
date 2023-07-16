package X;

/* renamed from: X.7cu  reason: invalid class name and case insensitive filesystem */
public final class C125297cu implements C143218gJ {
    public final /* synthetic */ C104366bf A00;
    public final /* synthetic */ AnonymousClass6GJ A01;

    public C125297cu(C104366bf r1, AnonymousClass6GJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onLog(String str) {
        C113046qd r2;
        if (!AnonymousClass7CU.A00(str) && str.startsWith("IXLoadingListenerDomContentLoaded:") && (r2 = this.A00.A00.A00) != null) {
            r2.A00.execute(new C135227z5(r2));
        }
    }
}
