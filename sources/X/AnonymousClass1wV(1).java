package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.1wV  reason: invalid class name */
public final class AnonymousClass1wV extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "PrivacyOptionsFragment";
    public C115576vV A00;
    public AnonymousClass3EF A01;
    public UserSession A02;
    public C62693aX A03;
    public String A04;
    public AnonymousClass368 A05;
    public boolean A06;

    public final String getModuleName() {
        return "privacy_options";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C23411dm.A04(this, r2, 2131832773);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0033, code lost:
        if (r3.A01() == X.AnonymousClass22X.A05) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = 1482023009(0x5855e061, float:9.4063871E14)
            int r2 = X.C14030oh.A02(r0)
            r8 = r13
            super.onCreate(r14)
            android.os.Bundle r4 = r13.requireArguments()
            com.instagram.service.session.UserSession r10 = X.C18180wK.A0V(r4)
            r13.A02 = r10
            androidx.fragment.app.FragmentActivity r6 = r13.requireActivity()
            r7 = 0
            X.6vV r5 = new X.6vV
            r9 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r13.A00 = r5
            X.78u r3 = r5.A05
            X.22X r1 = r3.A01()
            X.22X r0 = X.AnonymousClass22X.CONSENTED
            if (r1 == r0) goto L_0x0035
            X.22X r3 = r3.A01()
            X.22X r1 = X.AnonymousClass22X.WITHDRAWN
            r0 = 0
            if (r3 != r1) goto L_0x0036
        L_0x0035:
            r0 = 1
        L_0x0036:
            r3 = 0
            if (r0 == 0) goto L_0x00a8
            X.368 r1 = new X.368
            r1.<init>(r13)
            r13.A05 = r1
            X.6vV r0 = r13.A00
            r0.A03(r1)
            r12 = 1
        L_0x0046:
            com.instagram.service.session.UserSession r9 = r13.A02
            java.lang.String r0 = "OpenPrivacySettingsActionHandler.QPID"
            java.lang.String r10 = r4.getString(r0)
            java.lang.String r0 = "OpenPrivacySettingsActionHandler.SHOULD_SET_PBD_FLAG"
            boolean r11 = r4.getBoolean(r0, r3)
            X.3aX r7 = new X.3aX
            r7.<init>(r8, r9, r10, r11, r12)
            r13.A03 = r7
            X.369 r0 = new X.369
            r0.<init>(r13)
            r7.A01 = r0
            com.instagram.service.session.UserSession r0 = r13.A02
            X.C04220Ms.A0B(r0, r3)
            X.H1T r4 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "users/get_is_eligible_restrict_message_settings/"
            r4.A0J(r0)
            java.lang.Class<X.1Sh> r1 = X.C21821Sh.class
            java.lang.Class<X.3Oh> r0 = X.C60253Oh.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r4, r1, r0)
            r0 = 145(0x91, float:2.03E-43)
            X.C63873iU.A0C(r13, r1, r0)
            com.instagram.service.session.UserSession r1 = r13.A02
            X.3EF r0 = new X.3EF
            r0.<init>(r1)
            r13.A01 = r0
            com.instagram.service.session.UserSession r4 = r13.A02
            X.C04220Ms.A0B(r4, r3)
            X.H1T r3 = X.AnonymousClass0wJ.A0P(r4)
            java.lang.String r0 = "friendships/pending_follow_requests_count/"
            r3.A0J(r0)
            java.lang.Class<X.1Sp> r1 = X.C21901Sp.class
            java.lang.Class<X.3PK> r0 = X.AnonymousClass3PK.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r3, r1, r0)
            r0 = 141(0x8d, float:1.98E-43)
            X.C63873iU.A0D(r1, r4, r0)
            r0 = -1767966751(0xffffffff969ef7e1, float:-2.568271E-25)
            X.C14030oh.A09(r0, r2)
            return
        L_0x00a8:
            r12 = 0
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1wV.onCreate(android.os.Bundle):void");
    }

    public final void onPause() {
        boolean z;
        int A022 = C14030oh.A02(1314514522);
        super.onPause();
        if (this.A03.A00 != null) {
            z = C29371xr.A0A;
        } else {
            z = false;
        }
        this.A06 = z;
        AnonymousClass368 r1 = this.A05;
        if (r1 != null) {
            this.A00.A03(r1);
        }
        C14030oh.A09(-1900187797, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1729686378);
        super.onResume();
        UserSession userSession = this.A02;
        AnonymousClass0TJ r4 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r4, userSession, 36316409504336996L)) {
            C63873iU.A0C(this, C18180wK.A0R(C67473zc.A00(C67463zb.A00(), AnonymousClass15U.class, "FxSettingsCookiesSubtitle"), this.A02), 143);
        }
        this.A01.A00(C63873iU.A06(this, 142));
        C62693aX r1 = this.A03;
        boolean z = this.A06;
        C29371xr r12 = r1.A00;
        if (r12 != null && z && !C29371xr.A0A) {
            C29371xr.A00(r12, AnonymousClass0wJ.A0Y(r12.A04));
        }
        if (C63803iN.A05(r4, this.A02, 36315202618132949L).booleanValue()) {
            C63873iU.A0C(this, C18200wM.A0S(C67473zc.A00(C67463zb.A00(), AnonymousClass16P.class, "IGUserConsentQuery"), this.A02), 144);
        }
        AnonymousClass368 r13 = this.A05;
        if (r13 != null) {
            this.A00.A03(r13);
        }
        C14030oh.A09(1998994652, A022);
    }
}
