package X;

import android.os.SystemClock;

/* renamed from: X.0jX  reason: invalid class name and case insensitive filesystem */
public final class C11120jX implements C39453Ktq {
    public final /* synthetic */ C15320r7 A00;
    public final /* synthetic */ C10300i6 A01;

    public C11120jX(C15320r7 r1, C10300i6 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void CRo(AnonymousClass3FH r8, AnonymousClass3FH r9, Integer num, String str) {
        C15320r7 r4 = this.A00;
        C11140ja A03 = r4.A06;
        C10300i6 r3 = this.A01;
        String str2 = r9.A01;
        A03.A00(r3, str2);
        C15730rn A012 = C15730rn.A01("phoneid_update", (String) null);
        A012.A0D("new_id", str2);
        A012.A0C("new_ts", Long.valueOf(r9.A00));
        A012.A0C("ts", Long.valueOf(SystemClock.elapsedRealtime() - r4.A01));
        A012.A0D("src_pkg", str);
        A012.A0D("type", "global_sync");
        A012.A0D("custom_uuid", C09140ev.A02.A04(C10600ic.A00));
        A012.A0D("waterfall_id", r4.A04);
        if (r8 != null) {
            A012.A0D("old_id", r8.A01);
            A012.A0C("old_ts", Long.valueOf(r8.A00));
        }
        r4.A03.Asq(r3).Cd7(A012);
        C38040KHr.A00().CWx(new AnonymousClass0jT());
    }
}
