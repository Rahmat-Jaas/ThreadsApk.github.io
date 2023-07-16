package X;

/* renamed from: X.5yZ  reason: invalid class name */
public final class AnonymousClass5yZ extends C63873iU {
    public final AnonymousClass0YP A00;

    public AnonymousClass5yZ(AnonymousClass0YP r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r6) {
        int A002 = AnonymousClass0wJ.A00(1523704109, r6);
        C94065th r3 = (C94065th) r6.A00;
        if (r3 != null) {
            this.A00.invoke(Integer.valueOf(r3.mStatusCode), r3.A00);
        }
        C14030oh.A0A(1696883023, A002);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(-1208443362);
        C94065th r6 = (C94065th) obj;
        int A002 = AnonymousClass0wJ.A00(-1996335718, r6);
        this.A00.invoke(Integer.valueOf(r6.mStatusCode), r6.A00);
        C14030oh.A0A(1293888449, A002);
        C14030oh.A0A(-1604139190, A03);
    }
}
