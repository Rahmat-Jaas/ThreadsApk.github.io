package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxCCallbackShape124S0300000_1_I2;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1rA  reason: invalid class name and case insensitive filesystem */
public final class C26761rA extends C24431ij {
    public final AnonymousClass3LL A00;
    public final C07530bf A01;
    public final String A02;
    public final AnonymousClass601 A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26761rA(X.AnonymousClass3LL r13, X.AnonymousClass601 r14, X.C07530bf r15, java.lang.String r16) {
        /*
            r12 = this;
            r0 = 1
            r6 = r15
            X.C04220Ms.A0B(r15, r0)
            androidx.fragment.app.FragmentActivity r1 = X.C63913ic.A05(r14)
            X.265 r7 = X.AnonymousClass265.A0z
            X.0kW r3 = X.C63913ic.A0A(r14)
            java.lang.Integer r8 = X.AnonymousClass006.A0j
            androidx.fragment.app.FragmentActivity r0 = X.C63913ic.A05(r14)
            android.net.Uri r2 = X.C67323zM.A00(r0)
            r4 = 0
            r0 = r12
            r9 = r16
            r5 = r4
            r10 = r4
            r11 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A01 = r15
            r12.A03 = r14
            r12.A02 = r9
            r12.A00 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26761rA.<init>(X.3LL, X.601, X.0bf, java.lang.String):void");
    }

    public final void A03(UserSession userSession, User user) {
        UserSession userSession2 = userSession;
        boolean A1Z = AnonymousClass0wJ.A1Z(userSession, user);
        AnonymousClass601 r0 = this.A03;
        C04220Ms.A0B(r0, 0);
        Fragment A012 = C63913ic.A01(r0);
        String BK7 = user.BK7();
        ImageUrl B4M = user.B4M();
        IDxCCallbackShape124S0300000_1_I2 iDxCCallbackShape124S0300000_1_I2 = new IDxCCallbackShape124S0300000_1_I2(0, this, userSession, user);
        if (!TextUtils.isEmpty(C551031t.A01)) {
            C551031t.A00(A012, userSession2, B4M, iDxCCallbackShape124S0300000_1_I2, (AnonymousClass265) null, BK7, C551031t.A01, A1Z);
        } else {
            iDxCCallbackShape124S0300000_1_I2.BrI(A1Z, "SmartLock account used for successful login; no need to save");
        }
    }

    public final void A04(UserSession userSession, User user) {
        super.A03(userSession, user);
    }
}
