package X;

import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository;
import java.util.Map;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0101000_I2_6;

/* renamed from: X.3aV  reason: invalid class name and case insensitive filesystem */
public final class C62673aV {
    public final UserSession A00;
    public final AnonymousClass3ZL A01;
    public final CXPNoticeStateRepository A02;
    public final Map A03;
    public final C84874u0 A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (X.C63803iN.A0E(X.AnonymousClass0TJ.A05, r6.A00, 36319991507588658L) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C207916c A00(X.C62673aV r6, X.C313425p r7) {
        /*
            X.25p r5 = X.C313425p.A0P
            if (r7 != r5) goto L_0x0029
            com.instagram.service.session.UserSession r3 = r6.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36319991507588658(0x8108d7000e1632, double:3.032247106041562E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 != 0) goto L_0x0029
        L_0x0013:
            X.3ZL r2 = r6.A01
            android.content.SharedPreferences r1 = r2.A04
            java.lang.String r0 = "PREFERENCE_REELS_RECOMMEND_ON_FACEBOOK_COMMENT_DISCLOSURE_VERSION"
            long r0 = X.C18180wK.A05(r1, r0)
            int r3 = (int) r0
            int r2 = r2.A02()
            r0 = 0
            X.16c r1 = new X.16c
            r1.<init>(r3, r2, r0, r0)
        L_0x0028:
            return r1
        L_0x0029:
            com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository r0 = r6.A02
            r4 = 0
            X.C04220Ms.A0B(r7, r4)
            X.3Ee r0 = r0.A02
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = r7.toString()
            java.lang.String r0 = X.C18200wM.A0h(r1, r0)
            if (r0 == 0) goto L_0x0047
            X.MMo r0 = X.C18180wK.A0L(r0)
            X.16c r1 = X.AnonymousClass3P4.parseFromJson(r0)
            if (r1 != 0) goto L_0x0028
        L_0x0047:
            if (r7 == r5) goto L_0x0013
            com.instagram.service.session.UserSession r3 = r6.A00
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36601466484100792(0x8208d7000b0eb8, double:3.210253014596592E-306)
            int r0 = X.C63803iN.A01(r2, r3, r0)
            X.16c r1 = new X.16c
            r1.<init>(r0, r4, r4, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62673aV.A00(X.3aV, X.25p):X.16c");
    }

    public static final C207916c A01(C62673aV r7, C313425p r8, C207916c r9) {
        int i = r9.A01;
        UserSession userSession = r7.A00;
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (i >= C63803iN.A01(r3, userSession, 36601466484100792L)) {
            return r9;
        }
        C207916c r92 = new C207916c(C63803iN.A01(r3, userSession, 36601466484100792L), 0, 0, false);
        r7.A02.A03(r8, r92);
        return r92;
    }

    public static final boolean A02(C62673aV r5, int i) {
        UserSession userSession = r5.A00;
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        if (C63803iN.A01(r4, userSession, 36601466483838647L) == 0 || i < C63803iN.A01(r4, userSession, 36601466483838647L)) {
            return false;
        }
        return true;
    }

    public final void onUserSessionStart() {
        if (C63803iN.A0E(AnonymousClass0TJ.A05, this.A00, 36326275043829234L)) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0101000_I2_6(this, (C146958n9) null, 32), C84874u0.A00(this.A04, 1158112076, 3), 3);
        }
    }

    public C62673aV(C84874u0 r1, UserSession userSession, AnonymousClass3ZL r3, CXPNoticeStateRepository cXPNoticeStateRepository, Map map) {
        AnonymousClass0wJ.A1P(userSession, r3);
        this.A00 = userSession;
        this.A02 = cXPNoticeStateRepository;
        this.A01 = r3;
        this.A04 = r1;
        this.A03 = map;
    }
}
