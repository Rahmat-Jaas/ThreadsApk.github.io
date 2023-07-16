package X;

/* renamed from: X.2tN  reason: invalid class name and case insensitive filesystem */
public final class C50672tN {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0077, code lost:
        if (r1 == 0) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.content.Context r10, X.C10300i6 r11, X.AnonymousClass265 r12) {
        /*
            java.lang.String r0 = "phone"
            java.lang.Object r8 = r10.getSystemService(r0)
            if (r8 == 0) goto L_0x00a7
            android.telephony.TelephonyManager r8 = (android.telephony.TelephonyManager) r8
            int r7 = r8.getSimState()
            switch(r7) {
                case 1: goto L_0x0087;
                case 2: goto L_0x008a;
                case 3: goto L_0x008d;
                case 4: goto L_0x0090;
                case 5: goto L_0x0093;
                case 6: goto L_0x0097;
                case 7: goto L_0x009b;
                case 8: goto L_0x009f;
                case 9: goto L_0x00a3;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r9 = "unknown"
        L_0x0013:
            boolean r10 = X.AnonymousClass7K8.A04(r10)
            long r4 = java.lang.System.currentTimeMillis()
            double r2 = X.AnonymousClass269.A00()
            X.0nS r1 = X.C13330nS.A02(r11)
            java.lang.String r0 = "sim_card_state"
            X.0A2 r1 = X.AnonymousClass0wJ.A0M(r1, r0)
            r0 = 2727(0xaa7, float:3.821E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r6 = X.C18180wK.A0I(r1, r0)
            X.AnonymousClass269.A05(r6)
            X.C18230wP.A1F(r6, r4)
            double r0 = (double) r4
            X.AnonymousClass0wJ.A1A(r6, r0, r2)
            X.C63683i7.A08(r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            r0 = 660(0x294, float:9.25E-43)
            java.lang.String r0 = X.I17.A00(r0)
            r6.A0Q(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Long r1 = X.C18230wP.A0f(r0)
            java.lang.String r0 = "os_version"
            r6.A0S(r0, r1)
            X.C18180wK.A19(r6)
            java.lang.String r0 = "sim_state"
            r6.A0T(r0, r9)
            X.C18200wM.A1K(r6, r2)
            java.lang.String r0 = r12.A01
            X.C18190wL.A1I(r6, r0)
            X.C63683i7.A09(r6, r11)
            if (r10 == 0) goto L_0x0083
            r0 = 5
            if (r7 != r0) goto L_0x0083
            java.lang.String r0 = r8.getLine1Number()
            if (r0 == 0) goto L_0x0079
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x007a
        L_0x0079:
            r0 = 1
        L_0x007a:
            java.lang.Boolean r1 = X.C18240wQ.A0X(r0)
            java.lang.String r0 = "has_phone_number"
            r6.A0Q(r0, r1)
        L_0x0083:
            r6.Bb4()
            return
        L_0x0087:
            java.lang.String r9 = "absent"
            goto L_0x0013
        L_0x008a:
            java.lang.String r9 = "pin_required"
            goto L_0x0013
        L_0x008d:
            java.lang.String r9 = "puk_required"
            goto L_0x0013
        L_0x0090:
            java.lang.String r9 = "network_locked"
            goto L_0x0013
        L_0x0093:
            java.lang.String r9 = "ready"
            goto L_0x0013
        L_0x0097:
            java.lang.String r9 = "not_ready"
            goto L_0x0013
        L_0x009b:
            java.lang.String r9 = "perm_disabled"
            goto L_0x0013
        L_0x009f:
            java.lang.String r9 = "card_id_error"
            goto L_0x0013
        L_0x00a3:
            java.lang.String r9 = "card_restricted"
            goto L_0x0013
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50672tN.A00(android.content.Context, X.0i6, X.265):void");
    }
}
