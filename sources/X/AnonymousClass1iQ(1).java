package X;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1iQ  reason: invalid class name */
public final class AnonymousClass1iQ extends C63873iU {
    public FragmentActivity A00;
    public C11630kW A01;
    public K6u A02;
    public C07530bf A03;
    public boolean A04;
    public final Uri A05;
    public final String A06;
    public final C18330wh A07;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(1749067234);
        C26601qu r5 = (C26601qu) obj;
        int A033 = C14030oh.A03(1315927710);
        User user = r5.A00;
        C18210wN.A1K(user);
        C07530bf r8 = this.A03;
        C63313hF.A00(r8, "log_in").A0D("instagram_id", user.getId());
        AnonymousClass3V1 r9 = new AnonymousClass3V1();
        r9.A01();
        r9.A00.putString(C18240wQ.A0g("RECOVERY_TYPE"), C18240wQ.A0g("EMAIL_LINK_ONETAP"));
        C54182z2.A00(r8, r9, "", user.getId(), (String) null, (String) null, (String) null);
        FragmentActivity fragmentActivity = this.A00;
        String str = r5.A06;
        C11630kW r13 = this.A01;
        UserSession A034 = C67323zM.A03(fragmentActivity, r13, r8, user, str, false);
        if (r5.A00 == null || r5.A01 == null) {
            C67323zM.A05(fragmentActivity, this.A05, r13, A034);
        } else {
            C18250wR.A08().post(new AnonymousClass4SV(r5, this, A034));
        }
        AnonymousClass0wJ.A13(C18200wM.A0C().edit(), "has_one_clicked_logged_in", true);
        C14030oh.A0A(1701975600, A033);
        C14030oh.A0A(672191894, A032);
    }

    public AnonymousClass1iQ(Uri uri, FragmentActivity fragmentActivity, C11630kW r5, K6u k6u, C07530bf r7, String str, boolean z) {
        C18330wh r1 = new C18330wh(fragmentActivity);
        this.A07 = r1;
        C18330wh.A02(fragmentActivity, r1, 2131830126);
        this.A05 = uri;
        this.A06 = str;
        this.A03 = r7;
        this.A01 = r5;
        this.A00 = fragmentActivity;
        this.A04 = z;
        this.A02 = k6u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.AnonymousClass3XX r7) {
        /*
            r6 = this;
            r0 = -223606684(0xfffffffff2ac0864, float:-6.8149204E30)
            int r5 = X.C14030oh.A03(r0)
            X.0bf r3 = r6.A03
            java.lang.String r0 = "next_blocked"
            X.0rn r2 = X.C63313hF.A00(r3, r0)
            java.lang.String r0 = "landing"
            X.C18250wR.A19(r2, r0)
            java.lang.String r1 = "event_type"
            java.lang.String r0 = "one_click"
            r2.A0D(r1, r0)
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "uid_encoded"
            r2.A0D(r0, r1)
            X.C18180wK.A1K(r2, r3)
            java.lang.Object r2 = r7.A00
            if (r2 == 0) goto L_0x004d
            r1 = r2
            X.1j3 r1 = (X.AnonymousClass1j3) r1
            java.lang.String r4 = r1.getErrorMessage()
            X.1TP r2 = (X.AnonymousClass1TP) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0054
            X.3DR r3 = r2.A01
            X.3Um r2 = r2.A00
            android.os.Handler r1 = X.C18250wR.A08()
            X.4SW r0 = new X.4SW
            r0.<init>(r2, r3, r6)
            r1.post(r0)
            r0 = -204418036(0xfffffffff3d0d40c, float:-3.3090166E31)
        L_0x0049:
            X.C14030oh.A0A(r0, r5)
            return
        L_0x004d:
            r0 = 2131837305(0x7f114179, float:1.9307801E38)
            X.C63813iO.A04(r0)
            goto L_0x0089
        L_0x0054:
            java.lang.String r1 = r1.mErrorType
            java.lang.String r0 = "invalid_link"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "show_invalid_one_tap_link_dialog"
            X.0rn r0 = X.C63313hF.A00(r3, r0)
            X.C18180wK.A1K(r0, r3)
            androidx.fragment.app.FragmentActivity r0 = r6.A00
            X.Dsm r2 = X.C18190wL.A0W(r0)
            r0 = 2131826970(0x7f11191a, float:1.928684E38)
            r2.A0L(r0)
            r2.A0p(r4)
            r1 = 2131835485(0x7f113a5d, float:1.930411E38)
            r0 = 117(0x75, float:1.64E-43)
            X.C18180wK.A1O(r2, r6, r0, r1)
            r1 = 2131823054(0x7f1109ce, float:1.9278897E38)
            r0 = 116(0x74, float:1.63E-43)
            X.C18180wK.A1N(r2, r6, r0, r1)
            X.AnonymousClass0wJ.A1K(r2)
        L_0x0089:
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x00b2
            X.0BO r0 = r3.A00
            int r0 = r0.A0B()
            if (r0 <= 0) goto L_0x00b2
            X.3Yi r1 = X.C62333Yi.A01()
            androidx.fragment.app.FragmentActivity r4 = r6.A00
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            android.content.Intent r3 = r1.A03(r4, r0)
            android.net.Uri r2 = r6.A05
            r1 = 1
            java.lang.String r0 = "redirect_on_fail"
            boolean r0 = r2.getBooleanQueryParameter(r0, r1)
            if (r0 == 0) goto L_0x00af
            r3.setData(r2)
        L_0x00af:
            X.C10650ih.A02(r4, r3)
        L_0x00b2:
            r0 = -1973546034(0xffffffff8a5e13ce, float:-1.0692636E-32)
            goto L_0x0049
        L_0x00b6:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "checkpoint_required"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x004d
            X.C63813iO.A0F(r4)
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1iQ.onFail(X.3XX):void");
    }

    public final void onFinish() {
        int A032 = C14030oh.A03(-10864417);
        super.onFinish();
        C18330wh r1 = this.A07;
        if (r1.isShowing()) {
            r1.hide();
        }
        C14030oh.A0A(-1898441754, A032);
    }

    public final void onStart() {
        int A032 = C14030oh.A03(1220440710);
        super.onStart();
        C18330wh r1 = this.A07;
        if (!r1.isShowing()) {
            C13950oZ.A00(r1);
        }
        C14030oh.A0A(-1426610705, A032);
    }
}
