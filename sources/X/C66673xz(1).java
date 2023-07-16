package X;

import android.content.Context;
import androidx.preference.PreferenceScreen;

/* renamed from: X.3xz  reason: invalid class name and case insensitive filesystem */
public final class C66673xz implements MZS {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PreferenceScreen A01;
    public final /* synthetic */ C41174LyD A02;
    public final /* synthetic */ C84854ty A03;
    public final /* synthetic */ C81224nO A04;
    public final /* synthetic */ String A05;

    public C66673xz(Context context, PreferenceScreen preferenceScreen, C41174LyD lyD, C84854ty r4, C81224nO r5, String str) {
        this.A02 = lyD;
        this.A05 = str;
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = preferenceScreen;
        this.A00 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cd, code lost:
        if (r23 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0101, code lost:
        if (r27 == null) goto L_0x0103;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CBy(androidx.preference.Preference r46) {
        /*
            r45 = this;
            r2 = r45
            X.LyD r0 = r2.A02
            r44 = r0
            java.lang.String r5 = r2.A05
            X.4nO r1 = r2.A04
            X.4ty r3 = r2.A03
            androidx.preference.PreferenceScreen r0 = r2.A01
            r43 = r0
            android.content.Context r0 = r2.A00
            r42 = r0
            X.Luf r4 = new X.Luf
            r4.<init>(r0)
            r2 = r1
            X.18L r2 = (X.AnonymousClass18L) r2
            X.1u0 r0 = r2.A01
            java.lang.String r6 = r0.A0D
            X.C04220Ms.A06(r6)
            java.lang.String r8 = r3.AjR(r6)
            java.lang.String r7 = r0.A0D
            X.C04220Ms.A06(r7)
            r6 = 32
            java.lang.String r6 = X.AnonymousClass00U.A0N(r7, r8, r6)
            r4.A08(r6)
            java.lang.String r6 = "[\n"
            java.lang.StringBuilder r15 = X.C18190wL.A0s(r6)
            X.35q r6 = r2.A02
            if (r6 == 0) goto L_0x0045
            X.3Ah r6 = r6.A00
            java.util.List r6 = r6.A02
            if (r6 != 0) goto L_0x0047
        L_0x0045:
            X.0ZV r6 = X.AnonymousClass0ZV.A00
        L_0x0047:
            java.util.Iterator r9 = r6.iterator()
        L_0x004b:
            boolean r6 = r9.hasNext()
            r18 = 1
            if (r6 == 0) goto L_0x0074
            java.lang.Object r8 = r9.next()
            X.3Ag r8 = (X.C57233Ag) r8
            X.3HP r6 = r8.A00
            com.instagram.quickpromotion.model.FilterType r6 = r6.A00
            X.C04220Ms.A06(r6)
            java.lang.String r7 = r6.name()
            java.lang.String r6 = r8.A01
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r6}
            java.lang.String r6 = "{type: %s, value: %s}\n"
            java.lang.String r6 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r6, (java.lang.Object[]) r7)
            r15.append(r6)
            goto L_0x004b
        L_0x0074:
            java.lang.String r6 = "]"
            r15.append(r6)
            X.3DC r7 = r3.AZp(r1, r5)
            boolean r6 = r7.A08
            if (r6 == 0) goto L_0x020b
            X.3DC r7 = r3.AOl(r1, r5)
            boolean r6 = r7.A08
            if (r6 == 0) goto L_0x01fc
            boolean r6 = r0.A0H
            if (r6 == 0) goto L_0x01f8
            java.lang.String r37 = "false. Is in exposure holdout."
        L_0x008f:
            X.35r r6 = r2.A03
            X.1tt r7 = r6.A00
            X.1tw r6 = r7.A09
            if (r6 == 0) goto L_0x009b
            java.lang.String r14 = r6.A00
            if (r14 != 0) goto L_0x009d
        L_0x009b:
            java.lang.String r14 = ""
        L_0x009d:
            X.1tu r6 = r7.A03
            if (r6 == 0) goto L_0x00a5
            java.lang.String r13 = r6.A00
            if (r13 != 0) goto L_0x00a7
        L_0x00a5:
            java.lang.String r13 = ""
        L_0x00a7:
            int r6 = r0.A00
            java.lang.Integer r21 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r6 = X.AnonymousClass006.A00
            int r6 = r3.Aa4(r1, r6, r5)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r6)
            X.1tt r6 = r0.A08
            X.3CQ r7 = r6.A01
            if (r7 == 0) goto L_0x00cf
            java.lang.Integer r6 = r7.A02
            if (r6 == 0) goto L_0x01f5
            int r6 = r6.intValue()
        L_0x00c5:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r23 = r6.toString()
            if (r23 != 0) goto L_0x00d1
        L_0x00cf:
            java.lang.String r23 = "null"
        L_0x00d1:
            if (r7 == 0) goto L_0x00d7
            java.lang.String r12 = r7.A03
            if (r12 != 0) goto L_0x00d9
        L_0x00d7:
            java.lang.String r12 = "null"
        L_0x00d9:
            if (r7 == 0) goto L_0x01f1
            boolean r6 = r7.A04
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r6)
        L_0x00e1:
            java.lang.Integer r6 = X.AnonymousClass006.A01
            int r6 = r3.Aa4(r1, r6, r5)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r6)
            X.1tt r6 = r0.A08
            X.3CQ r6 = r6.A02
            if (r6 == 0) goto L_0x0103
            java.lang.Integer r7 = r6.A02
            if (r7 == 0) goto L_0x01ee
            int r7 = r7.intValue()
        L_0x00f9:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r27 = r7.toString()
            if (r27 != 0) goto L_0x0105
        L_0x0103:
            java.lang.String r27 = "null"
        L_0x0105:
            if (r6 == 0) goto L_0x010b
            java.lang.String r11 = r6.A03
            if (r11 != 0) goto L_0x010d
        L_0x010b:
            java.lang.String r11 = "null"
        L_0x010d:
            if (r6 == 0) goto L_0x01ea
            boolean r6 = r6.A04
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r6)
        L_0x0115:
            java.lang.Integer r6 = X.AnonymousClass006.A0C
            int r6 = r3.Aa4(r1, r6, r5)
            java.lang.Integer r30 = java.lang.Integer.valueOf(r6)
            java.lang.String r31 = "N"
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r18)
            long r6 = r2.A00
            java.lang.Long r35 = java.lang.Long.valueOf(r6)
            X.1tt r2 = r0.A08
            X.35l r2 = r2.A08
            if (r2 == 0) goto L_0x0135
            java.lang.String r10 = r2.A00
            if (r10 != 0) goto L_0x0137
        L_0x0135:
            java.lang.String r10 = "null"
        L_0x0137:
            java.lang.String r17 = ","
            java.lang.StringBuilder r16 = X.C18190wL.A0s(r17)
            java.util.List r2 = r0.A0F
            java.util.EnumSet r6 = java.util.EnumSet.copyOf(r2)
            X.C04220Ms.A06(r6)
            r2 = r16
            r2.append(r6)
            X.1tt r2 = r0.A08
            X.3TA r2 = r2.A07
            if (r2 != 0) goto L_0x01d1
            java.lang.String r40 = "null"
        L_0x0153:
            java.lang.StringBuilder r6 = X.C18200wM.A0r()
            r2 = r17
            r6.append(r2)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            boolean r7 = r0.A0L
            if (r7 == 0) goto L_0x0169
            X.20a r7 = X.C302020a.BYPASS_SURFACE_DELAY
            r2.add(r7)
        L_0x0169:
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x0172
            X.20a r0 = X.C302020a.IS_UNCANCELABLE
            r2.add(r0)
        L_0x0172:
            r6.append(r2)
            r28 = r11
            r32 = r31
            r34 = r33
            r36 = r10
            r38 = r16
            r39 = r15
            r41 = r6
            r19 = r14
            r20 = r13
            r24 = r12
            java.lang.Object[] r2 = new java.lang.Object[]{r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41}
            java.lang.String r0 = "Title: %s\n\nContent: %s\n\nMax Impressions: %s\nLocal Impressions: %s\n\nPrimary Action \nLimit: %s\nUrl: %s\nDismiss QP: %s\nLocal Count: %s\n\nSecondary Action \nLimit: %s\nUrl: %s\nDismiss QP: %s\nLocal Count: %s\n\nHas Native Template: %s\n\nHas Bloks: %s\n\nImpression Delay Met: %s\nDismiss Delay Met: %s\n\nPriority: %s\n\nSocial Context:%s\n\nEligible?: %s\n\nTriggers: %s\n\nFilters: %s\n\nImage: %s\n\nAttributes: %s"
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r0, (java.lang.Object[]) r2)
            X.Lpc r7 = r4.A01
            r7.A0C = r0
            java.lang.String r2 = "Reset Counters"
            r14 = 0
            com.facebook.redex.IDxCListenerShape4S1400000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape4S1400000_1_I2
            r8 = r0
            r9 = r42
            r10 = r44
            r11 = r3
            r12 = r1
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r4.A05(r0, r2)
            java.lang.String r6 = "JSON"
            r5 = 3
            com.facebook.redex.IDxCListenerShape48S0300000_1_I2 r0 = X.C18250wR.A0E(r9, r1, r10, r5)
            r4.A04(r0, r6)
            java.lang.String r2 = "Force Mode Options"
            com.facebook.redex.IDxCListenerShape9S0500000_1_I2 r0 = new com.facebook.redex.IDxCListenerShape9S0500000_1_I2
            r19 = r0
            r21 = r9
            r22 = r1
            r23 = r43
            r24 = r3
            r25 = r10
            r20 = r14
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r7.A0E = r2
            r7.A02 = r0
            X.C18250wR.A0u(r4)
            return r18
        L_0x01d1:
            java.lang.Integer r9 = r2.A01
            java.lang.Integer r8 = r2.A02
            java.lang.String r7 = r2.A03
            java.lang.String r6 = ""
            com.instagram.common.typedurl.ImageUrl r2 = r2.A00
            java.lang.Object[] r6 = new java.lang.Object[]{r9, r8, r7, r6, r2}
            java.lang.String r2 = "{\n height: %d,\n width %d,\n scale: %f,\n name: %s,\n url: %s\n}"
            java.lang.String r40 = X.C18180wK.A0j(r2, r6)
            X.C04220Ms.A06(r40)
            goto L_0x0153
        L_0x01ea:
            r29 = 0
            goto L_0x0115
        L_0x01ee:
            r7 = -1
            goto L_0x00f9
        L_0x01f1:
            r25 = 0
            goto L_0x00e1
        L_0x01f5:
            r6 = -1
            goto L_0x00c5
        L_0x01f8:
            java.lang.String r37 = "true"
            goto L_0x008f
        L_0x01fc:
            java.lang.Integer r6 = r7.A03
            if (r6 == 0) goto L_0x02a0
            java.lang.String r6 = X.AnonymousClass2CV.A00(r6)
            java.lang.Object[] r7 = new java.lang.Object[]{r6}
            java.lang.String r6 = "false.\nFailed Counter: %s"
            goto L_0x021e
        L_0x020b:
            X.3Ag r8 = r7.A01
            if (r8 == 0) goto L_0x0224
            X.3HP r6 = r8.A00
            com.instagram.quickpromotion.model.FilterType r7 = r6.A00
            X.C04220Ms.A06(r7)
            java.lang.String r6 = r8.A01
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r6}
            java.lang.String r6 = "false.\nFailed filter: %s, value: %s"
        L_0x021e:
            java.lang.String r37 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r6, (java.lang.Object[]) r7)
            goto L_0x008f
        L_0x0224:
            X.3Ah r9 = r7.A02
            if (r9 == 0) goto L_0x02a0
            r11 = r3
            com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler r11 = (com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler) r11
            X.3UH r8 = new X.3UH
            r8.<init>()
            X.0Oa r6 = X.C61563Ua.A03
            java.lang.Object r10 = r6.getValue()
            X.3Ua r10 = (X.C61563Ua) r10
            java.util.List r6 = r0.A0F
            java.util.EnumSet r24 = java.util.EnumSet.copyOf(r6)
            X.C04220Ms.A06(r24)
            android.content.Context r7 = r11.A00
            com.instagram.service.session.UserSession r6 = r11.A01
            X.3UU r21 = new X.3UU
            r21.<init>()
            r25 = 0
            r20 = r7
            r22 = r6
            r23 = r5
            r19 = r10
            X.1Pw r7 = r19.A00(r20, r21, r22, r23, r24, r25)
            java.lang.String r6 = "null cannot be cast to non-null type com.facebook.quickpromotion.sdk.eligibility.QPEligibilityContext<com.instagram.quickpromotion.intf.Trigger, com.facebook.quickpromotion.sdk.models.QuickPromotion<com.instagram.quickpromotion.intf.Trigger>>"
            X.C04220Ms.A0C(r7, r6)
            java.util.Map r7 = r8.A01(r7, r1, r9)
            java.lang.String r6 = "false.\nFailed filter clause. Contextual Filter Results:\n"
            java.lang.StringBuilder r9 = X.C18190wL.A0s(r6)
            java.util.Iterator r11 = X.AnonymousClass0wJ.A0z(r7)
        L_0x026b:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x029a
            java.util.Map$Entry r6 = X.C18180wK.A0o(r11)
            java.lang.Object r10 = r6.getKey()
            X.3Ag r10 = (X.C57233Ag) r10
            java.lang.Object r8 = r6.getValue()
            X.3HP r6 = r10.A00
            com.instagram.quickpromotion.model.FilterType r6 = r6.A00
            X.C04220Ms.A06(r6)
            java.lang.String r7 = r6.name()
            java.lang.String r6 = r10.A01
            java.lang.Object[] r7 = new java.lang.Object[]{r8, r7, r6}
            java.lang.String r6 = "result: %b, filter: %s, value: %s \n"
            java.lang.String r6 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r6, (java.lang.Object[]) r7)
            r9.append(r6)
            goto L_0x026b
        L_0x029a:
            java.lang.String r37 = r9.toString()
            goto L_0x008f
        L_0x02a0:
            java.lang.String r37 = "false"
            goto L_0x008f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66673xz.CBy(androidx.preference.Preference):boolean");
    }
}
