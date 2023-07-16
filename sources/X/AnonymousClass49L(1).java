package X;

import com.instagram.service.session.UserSession;

/* renamed from: X.49L  reason: invalid class name */
public final class AnonymousClass49L implements AnonymousClass0i4 {
    public final UserSession A00;

    public AnonymousClass49L(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void onSessionWillEnd() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004b, code lost:
        if (X.C63803iN.A03(r7, r9, 36601707003842287L) > (X.C18190wL.A07() - X.C18180wK.A05(r2.A00, "eb_education_soft_block_last_shown_timestamp_utc_s"))) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A01() {
        /*
            r12 = this;
            com.instagram.service.session.UserSession r9 = r12.A00
            X.34C r0 = new X.34C
            r0.<init>(r9)
            android.content.SharedPreferences r0 = r0.A00
            java.lang.String r2 = "eb_education_soft_block_times_shown"
            r1 = 0
            int r8 = r0.getInt(r2, r1)
            boolean r0 = r12.A02()
            if (r0 == 0) goto L_0x004d
            X.34C r0 = new X.34C
            r0.<init>(r9)
            android.content.SharedPreferences r0 = r0.A00
            int r1 = r0.getInt(r2, r1)
            X.0TJ r7 = X.AnonymousClass0TJ.A05
            r5 = 36601707001614058(0x82090f00010eea, double:3.210405118840468E-306)
            int r0 = X.C63803iN.A01(r7, r9, r5)
            if (r1 > r0) goto L_0x0050
            X.34C r2 = new X.34C
            r2.<init>(r9)
            r0 = 36601707003842287(0x82090f00230eef, double:3.210405120249609E-306)
            long r10 = X.C63803iN.A03(r7, r9, r0)
            android.content.SharedPreferences r1 = r2.A00
            java.lang.String r0 = "eb_education_soft_block_last_shown_timestamp_utc_s"
            long r3 = X.C18180wK.A05(r1, r0)
            long r1 = X.C18190wL.A07()
            long r1 = r1 - r3
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
        L_0x004d:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            return r0
        L_0x0050:
            int r0 = X.C63803iN.A01(r7, r9, r5)
            if (r8 >= r0) goto L_0x0059
            java.lang.Integer r0 = X.AnonymousClass006.A01
            return r0
        L_0x0059:
            java.lang.Integer r0 = X.AnonymousClass006.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass49L.A01():java.lang.Integer");
    }

    public final boolean A02() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, this.A00, 36320232024840019L);
    }

    public static UserSession A00(C04530Oa r0) {
        return ((AnonymousClass49L) r0.getValue()).A00;
    }
}
