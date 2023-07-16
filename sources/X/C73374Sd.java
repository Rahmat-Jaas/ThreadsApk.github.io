package X;

import android.app.Activity;

/* renamed from: X.4Sd  reason: invalid class name and case insensitive filesystem */
public final class C73374Sd implements Runnable {
    public final /* synthetic */ C24751jz A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C73374Sd(C24751jz r1, String str, String str2) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = str2;
    }

    public final void run() {
        C24751jz r3 = this.A00;
        Activity activity = r3.A04;
        C07530bf r7 = r3.A08;
        String str = this.A02;
        C32165H8c A0A = C63883iV.A0A(r7, (Boolean) null, (String) null, str, (String) null, (String) null, C09140ev.A00(activity), C18230wP.A0i(activity), "sign_up_continue_button", true, true, false, false, true);
        String str2 = this.A01;
        AnonymousClass5rZ r20 = AnonymousClass5rZ.A00;
        C34640IcN icN = r3.A06;
        C18330wh A012 = C18330wh.A01(icN);
        A012.A04(AnonymousClass0wJ.A0o(icN, icN.getString(2131826983), 2131824316));
        A0A.A00 = new C24441io(r20, r3, r7, A012, str2, str, (String) null, false, false, true);
        icN.schedule(A0A);
    }
}
