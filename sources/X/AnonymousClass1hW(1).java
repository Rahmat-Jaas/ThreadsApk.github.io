package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1hW  reason: invalid class name */
public final class AnonymousClass1hW extends C63873iU {
    public String A00;
    public final Context A01;
    public final C11630kW A02;
    public final UserSession A03;
    public final User A04;

    public AnonymousClass1hW(Context context, C11630kW r3, UserSession userSession, String str) {
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = AnonymousClass0wJ.A0Y(userSession);
        this.A02 = r3;
        this.A00 = str;
    }

    public final void onFailInBackground(C26743EUq eUq) {
        int A032 = C14030oh.A03(1218902420);
        UserSession userSession = this.A03;
        C15730rn A002 = C15730rn.A00(this.A02, "ig_onetap_nonce_response_failed");
        A002.A09("multi_tap_enabled", C18180wK.A0Y());
        A002.A0D("guid", C18200wM.A0g());
        C18180wK.A1K(A002, userSession);
        String BAY = this.A04.A05.BAY();
        if (BAY != null) {
            AnonymousClass0g9.A00().A01(new C25201mh(this, userSession.getUserId(), BAY, 0), 3600000);
        }
        C14030oh.A0A(1495634786, A032);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        if (X.C32572Cj.A00(r2.A03, r10.A00) != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        r8 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = -37598220(0xfffffffffdc24bf4, float:-3.2283075E37)
            int r7 = X.C14030oh.A03(r0)
            X.1T4 r10 = (X.AnonymousClass1T4) r10
            r0 = 55454407(0x34e2ac7, float:6.0587065E-37)
            int r6 = X.C14030oh.A03(r0)
            com.instagram.service.session.UserSession r5 = r9.A03
            java.util.Iterator r3 = X.C63533hk.A04(r5)
        L_0x0016:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0039
            X.3ac r2 = X.C18250wR.A0Q(r3)
            com.instagram.user.model.User r0 = r9.A04
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r2.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r1 = r2.A03
            java.lang.String r0 = r10.A00
            boolean r0 = X.C32572Cj.A00(r1, r0)
            r8 = 1
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            r8 = 0
        L_0x003a:
            if (r8 == 0) goto L_0x004c
            com.instagram.user.model.User r2 = r9.A04
            java.lang.String r0 = r10.A00
            X.3ac r1 = new X.3ac
            r1.<init>(r2, r0)
            X.3hk r0 = X.C63533hk.A02(r5)
            r0.A0F(r1)
        L_0x004c:
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0096
            java.util.Iterator r3 = X.C63533hk.A04(r5)
        L_0x0054:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0096
            X.3ac r2 = X.C18250wR.A0Q(r3)
            com.instagram.user.model.User r0 = r9.A04
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r2.A05
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = r9.A00
            r2.A04 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A01 = r0
            X.3hk r0 = X.C63533hk.A02(r5)
            r0.A0F(r2)
            X.224 r0 = X.AnonymousClass224.A03
            X.224[] r4 = new X.AnonymousClass224[]{r0}
            X.3YQ r3 = new X.3YQ
            r3.<init>()
            java.lang.String r2 = "UpdateOneTapLoginNonceCallback"
            X.0gW r1 = X.AnonymousClass0gN.A00()
            X.1mg r0 = new X.1mg
            r0.<init>(r3, r5, r2, r4)
            r1.AKp(r0)
        L_0x0096:
            X.0kW r1 = r9.A02
            java.lang.String r0 = "ig_onetap_nonce_received"
            X.0rn r2 = X.C15730rn.A00(r1, r0)
            java.lang.Boolean r1 = X.C18180wK.A0Y()
            java.lang.String r0 = "multi_tap_enabled"
            r2.A09(r0, r1)
            java.lang.String r1 = X.C18200wM.A0g()
            java.lang.String r0 = "guid"
            r2.A0D(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            java.lang.String r0 = "updated"
            r2.A09(r0, r1)
            X.C18180wK.A1K(r2, r5)
            r0 = -1287726482(0xffffffffb33eda6e, float:-4.4436483E-8)
            X.C14030oh.A0A(r0, r6)
            r0 = 1278936881(0x4c3b0731, float:4.9028292E7)
            X.C14030oh.A0A(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1hW.onSuccessInBackground(java.lang.Object):void");
    }
}
