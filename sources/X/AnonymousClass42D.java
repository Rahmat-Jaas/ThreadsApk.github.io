package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;

/* renamed from: X.42D  reason: invalid class name */
public final class AnonymousClass42D implements C84094sX {
    public final /* synthetic */ C23441dq A00;

    public final void CAd(User user) {
        C04220Ms.A0B(user, 0);
        C23441dq r1 = this.A00;
        C23441dq.A00(r1, user, AnonymousClass006.A01);
        AnonymousClass3Vl A01 = AnonymousClass3WJ.A01();
        FragmentActivity requireActivity = r1.requireActivity();
        UserSession A0X = AnonymousClass0wJ.A0X(r1.A02);
        String id = user.getId();
        String A0q = C18200wM.A0q(r1.A01);
        C04220Ms.A06(A0q);
        A01.A04(requireActivity, A0X, (Boolean) null, (Boolean) null, id, A0q);
        C62793ak A0N = C18200wM.A0N(r1.A03);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(user, A0N, (C146958n9) null, 0), AnonymousClass3J5.A00(A0N), 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r2 == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CAe(com.instagram.user.model.User r6) {
        /*
            r5 = this;
            r0 = 0
            X.C04220Ms.A0B(r6, r0)
            X.1dq r4 = r5.A00
            X.0Oa r0 = r4.A02
            X.0i6 r0 = X.AnonymousClass0wJ.A0U(r0)
            X.3Iu r3 = new X.3Iu
            r3.<init>(r0)
            java.lang.String r0 = r6.BK7()
            r3.A06(r0)
            com.instagram.common.typedurl.ImageUrl r0 = r6.B4M()
            r3.A05(r0)
            X.MeW r0 = r6.A05
            java.lang.Boolean r0 = r0.BTy()
            if (r0 == 0) goto L_0x0032
            boolean r2 = r0.booleanValue()
            r1 = 2131836978(0x7f114032, float:1.9307138E38)
            r0 = 100
            if (r2 != 0) goto L_0x0037
        L_0x0032:
            r1 = 2131836988(0x7f11403c, float:1.9307158E38)
            r0 = 101(0x65, float:1.42E-43)
        L_0x0037:
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r4, r6, r0)
            r3.A03(r0, r1)
            r1 = 2131831590(0x7f112b26, float:1.929621E38)
            r0 = 102(0x66, float:1.43E-43)
            com.facebook.redex.IDxCListenerShape70S0200000_1_I2 r0 = X.C18200wM.A0R(r4, r6, r0)
            r3.A03(r0, r1)
            X.C62763ag.A00(r4, r3)
            X.495 r1 = r4.A00
            if (r1 != 0) goto L_0x0056
            X.C18240wQ.A0p()
            r0 = 0
            throw r0
        L_0x0056:
            java.lang.String r3 = "subscribed_creator_list_fragment"
            java.lang.String r2 = r6.getId()
            r0 = 1
            X.C04220Ms.A0B(r2, r0)
            X.0nS r1 = r1.A00
            java.lang.String r0 = "ig_fan_club_exclusive_content_notification_subs_tab_settings_impression"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 1190(0x4a6, float:1.668E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.C18230wP.A1H(r1, r3)
            java.lang.Long r0 = X.AnonymousClass0wJ.A0d(r2)
            X.C18250wR.A0x(r1, r0)
            r1.Bb4()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass42D.CAe(com.instagram.user.model.User):void");
    }

    public AnonymousClass42D(C23441dq r1) {
        this.A00 = r1;
    }

    public final void BhN(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        AnonymousClass0wJ.A1N(user, userSession);
        C23441dq r4 = this.A00;
        C23441dq.A00(r4, user, AnonymousClass006.A00);
        String id = user.getId();
        C04530Oa r2 = r4.A01;
        String A0q = C18200wM.A0q(r2);
        C04220Ms.A06(A0q);
        C25586DoM.A02(userSession, id, "user_list", A0q);
        r2.getValue();
        C60113Ns.A01(r4.requireActivity(), userSession);
        throw null;
    }
}
