package X;

import android.content.DialogInterface;

/* renamed from: X.41L  reason: invalid class name */
public final class AnonymousClass41L implements C41836MeS {
    public final /* synthetic */ C34640IcN A00;
    public final /* synthetic */ C84634tZ A01;
    public final /* synthetic */ C81574o1 A02;
    public final /* synthetic */ C27221sA A03;
    public final /* synthetic */ C07530bf A04;
    public final /* synthetic */ AnonymousClass265 A05;

    public AnonymousClass41L(C34640IcN icN, C84634tZ r2, C81574o1 r3, C27221sA r4, C07530bf r5, AnonymousClass265 r6) {
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = icN;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        C27151s3 r4 = (C27151s3) obj;
        AnonymousClass3HF r0 = this.A03.A00;
        if (r0 != null) {
            r0.A00();
        }
        r4.getClass();
        Object obj2 = r4.A02.get();
        obj2.getClass();
        if (obj2 == AnonymousClass21L.SUCCESSFUL) {
            throw null;
        }
        C25828Dsm A0W = C18190wL.A0W(this.A00.getContext());
        A0W.A0K(2131826853);
        A0W.A0P((DialogInterface.OnClickListener) null, 17039370);
        AnonymousClass0wJ.A1K(A0W);
        return false;
    }
}
