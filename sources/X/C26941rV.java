package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.1rV  reason: invalid class name and case insensitive filesystem */
public final class C26941rV extends C26951rX {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C10300i6 A01;
    public final /* synthetic */ AnonymousClass0BO A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26941rV(android.net.Uri r11, androidx.fragment.app.FragmentActivity r12, androidx.fragment.app.FragmentActivity r13, X.C11630kW r14, X.C10300i6 r15, X.C84634tZ r16, X.C07530bf r17, X.AnonymousClass0BO r18, com.instagram.service.session.UserSession r19, X.AnonymousClass265 r20, java.lang.Long r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            r10 = this;
            r1 = r10
            r0 = r24
            r10.A06 = r0
            r10.A01 = r15
            r0 = r25
            r10.A05 = r0
            r0 = r21
            r10.A04 = r0
            r0 = r26
            r10.A07 = r0
            r0 = r18
            r10.A02 = r0
            r10.A00 = r13
            r0 = r19
            r10.A03 = r0
            r8 = r22
            r3 = r12
            r9 = r23
            r2 = r11
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26941rV.<init>(android.net.Uri, androidx.fragment.app.FragmentActivity, androidx.fragment.app.FragmentActivity, X.0kW, X.0i6, X.4tZ, X.0bf, X.0BO, com.instagram.service.session.UserSession, X.265, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void A02(C26641qy r20) {
        long j;
        int A032 = C14030oh.A03(-825766996);
        super.A02(r20);
        String str = this.A06;
        if (str != null) {
            C10300i6 r6 = this.A01;
            AnonymousClass28R r5 = AnonymousClass28R.INTRA_APP;
            synchronized (C63453hV.class) {
                j = C63453hV.A00;
            }
            String str2 = this.A05;
            Long l = this.A04;
            Long l2 = l;
            C63453hV.A01(r5, r6, l, l2, str2, "horizontal_switch", str, "logged_out", this.A07, (double) j, false, true, true);
        }
        C14030oh.A0A(222909054, A032);
    }

    public final void onFail(AnonymousClass3XX r7) {
        int A032 = C14030oh.A03(27063791);
        AnonymousClass0BO r1 = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A03;
        AnonymousClass3YR.A00.A03(fragmentActivity, r1.A0C(fragmentActivity, userSession, (String) null, false).A00, userSession, false);
        C14030oh.A0A(-386136276, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C14030oh.A0A(1944878022, C63873iU.A04(this, obj, -13936645));
    }
}
