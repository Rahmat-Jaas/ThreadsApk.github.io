package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.share.facebook.upsell.noticestate.internal.CXPNoticeStateRepository;
import kotlin.coroutines.jvm.internal.KtSLambdaShape5S0401000_I2_1;

/* renamed from: X.3HR  reason: invalid class name */
public final class AnonymousClass3HR {
    public final UserSession A00;
    public final AnonymousClass3VY A01;
    public final CXPNoticeStateRepository A02;
    public final C83224qz A03;

    public AnonymousClass3HR(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        CXPNoticeStateRepository cXPNoticeStateRepository = new CXPNoticeStateRepository(userSession, AnonymousClass006.A00);
        C83224qz A032 = AnonymousClass7Ja.A03(C18250wR.A0J((AnonymousClass0gW) null, 3).BQy(664689487, 3));
        AnonymousClass3VY r0 = new AnonymousClass3VY(userSession, 479857365);
        this.A00 = userSession;
        this.A02 = cXPNoticeStateRepository;
        this.A03 = A032;
        this.A01 = r0;
    }

    public final void A00(Context context, UserSession userSession, AnonymousClass25U r12) {
        UserSession userSession2 = userSession;
        C04220Ms.A0B(userSession, 1);
        AnonymousClass25U r6 = r12;
        if (r12.A00(userSession) != 0 || r12.A01(userSession)) {
            AnonymousClass3VY r2 = this.A01;
            AnonymousClass3VY.A00(r2, (String) null, (String) null, r12.toString(), 3);
            r2.A01("is_prefetch_endpoint");
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape5S0401000_I2_1(context, this, userSession2, r6, (C146958n9) null, 43), this.A03, 3);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        if (X.C63803iN.A0E(r3, r2, r0) != false) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cb, code lost:
        if (X.C18210wN.A1W(X.C63803iN.A0E(r3, r2, r0)) == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cd, code lost:
        r6 = r9.A00;
        r4 = r11.A01;
        X.AnonymousClass3VY.A00(r4, r7.toString(), (java.lang.String) null, (java.lang.String) null, 6);
        r12 = X.C61843Wa.A01(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        if (r12 != null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e0, code lost:
        X.AnonymousClass0LU.A0B("CLNoticeManager", "Unexpected Failure: Unmapped notice entrypoint on the client");
        r4.A02(com.facebook.proxygen.TraceFieldType.FailureReason, "unmapped_entrypoint");
        r4.A03(3);
        r0 = X.AnonymousClass006.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f6, code lost:
        r16 = X.C63803iN.A0E(r3, r2, 36325720994817244L);
        r5 = X.AnonymousClass25U.values();
        r4 = r5.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0105, code lost:
        if (r3 >= r4) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0107, code lost:
        r1 = r5[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r10.CGx(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010f, code lost:
        if (r1.A00.contains(r12) == false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0111, code lost:
        r8 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0113, code lost:
        if (r8 != null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0115, code lost:
        r8 = com.google.common.collect.ImmutableList.of(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0119, code lost:
        if (r1 != null) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011b, code lost:
        r14 = 0;
        r17 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011f, code lost:
        X.C25237DiI.A00((java.lang.Integer) null, (X.C27952Ew2) null, new com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1(r6, r7, r8, r9, r10, r11, r12, (X.C146958n9) null, r14, r16, r17), r11.A03, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012b, code lost:
        r14 = r1.A00(r2);
        r17 = r1.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0134, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0137, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass3CX r19, X.C83024qf r20) {
        /*
            r18 = this;
            r9 = r19
            X.2AC r7 = r9.A02
            r11 = r18
            com.instagram.service.session.UserSession r2 = r11.A00
            int r0 = r7.ordinal()
            r10 = r20
            switch(r0) {
                case 11: goto L_0x0046;
                case 13: goto L_0x0071;
                case 14: goto L_0x0017;
                case 18: goto L_0x0056;
                case 27: goto L_0x003e;
                case 35: goto L_0x008f;
                case 40: goto L_0x005e;
                case 43: goto L_0x00b1;
                case 47: goto L_0x004e;
                case 52: goto L_0x009e;
                case 55: goto L_0x0036;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.Integer r0 = X.AnonymousClass006.A00
        L_0x0013:
            r10.CGx(r0)
            return
        L_0x0017:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720994948317(0x810e0d001d24dd, double:3.035870456918604E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            if (r0 != 0) goto L_0x00cd
            r0 = 36325720994227412(0x810e0d001224d4, double:3.035870456462701E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            if (r0 != 0) goto L_0x00cd
            r0 = 36325720993506509(0x810e0d000724cd, double:3.035870456006799E-306)
            goto L_0x00c3
        L_0x0036:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720993899730(0x810e0d000d24d2, double:3.0358704562554736E-306)
            goto L_0x0096
        L_0x003e:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720993834193(0x810e0d000c24d1, double:3.035870456214028E-306)
            goto L_0x0096
        L_0x0046:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720993768656(0x810e0d000b24d0, double:3.035870456172582E-306)
            goto L_0x0096
        L_0x004e:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720993703119(0x810e0d000a24cf, double:3.035870456131136E-306)
            goto L_0x0096
        L_0x0056:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720993637582(0x810e0d000924ce, double:3.03587045608969E-306)
            goto L_0x0096
        L_0x005e:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720995013854(0x810e0d001e24de, double:3.03587045696005E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            if (r0 != 0) goto L_0x00cd
            r0 = 36325720993440972(0x810e0d000624cc, double:3.035870455965353E-306)
            goto L_0x00c3
        L_0x0071:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720994948317(0x810e0d001d24dd, double:3.035870456918604E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            if (r0 != 0) goto L_0x00cd
            r0 = 36325720994227412(0x810e0d001224d4, double:3.035870456462701E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            if (r0 != 0) goto L_0x00cd
            r0 = 36325720993375435(0x810e0d000524cb, double:3.035870455923907E-306)
            goto L_0x00c3
        L_0x008f:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720993309898(0x810e0d000424ca, double:3.0358704558824615E-306)
        L_0x0096:
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            if (r0 != 0) goto L_0x00cd
            goto L_0x0011
        L_0x009e:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720995013854(0x810e0d001e24de, double:3.03587045696005E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            if (r0 != 0) goto L_0x00cd
            r0 = 36325720993178825(0x810e0d000224c9, double:3.0358704557995704E-306)
            goto L_0x00c3
        L_0x00b1:
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r0 = 36325720995013854(0x810e0d001e24de, double:3.03587045696005E-306)
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            if (r0 != 0) goto L_0x00cd
            r0 = 36325720993113288(0x810e0d000124c8, double:3.0358704557581245E-306)
        L_0x00c3:
            boolean r0 = X.C63803iN.A0E(r3, r2, r0)
            boolean r0 = X.C18210wN.A1W(r0)
            if (r0 == 0) goto L_0x0011
        L_0x00cd:
            android.app.Activity r6 = r9.A00
            X.3VY r4 = r11.A01
            java.lang.String r1 = r7.toString()
            r13 = 0
            r0 = 6
            X.AnonymousClass3VY.A00(r4, r1, r13, r13, r0)
            java.lang.String r12 = X.C61843Wa.A01(r7)
            if (r12 != 0) goto L_0x00f6
            java.lang.String r1 = "CLNoticeManager"
            java.lang.String r0 = "Unexpected Failure: Unmapped notice entrypoint on the client"
            X.AnonymousClass0LU.A0B(r1, r0)
            java.lang.String r1 = "failure_reason"
            java.lang.String r0 = "unmapped_entrypoint"
            r4.A02(r1, r0)
            r0 = 3
            r4.A03(r0)
            java.lang.Integer r0 = X.AnonymousClass006.A01
            goto L_0x0013
        L_0x00f6:
            r0 = 36325720994817244(0x810e0d001b24dc, double:3.035870456835713E-306)
            boolean r16 = X.C63803iN.A0E(r3, r2, r0)
            X.25U[] r5 = X.AnonymousClass25U.values()
            int r4 = r5.length
            r3 = 0
        L_0x0105:
            if (r3 >= r4) goto L_0x0137
            r1 = r5[r3]
            com.google.common.collect.ImmutableList r0 = r1.A00
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x0134
            com.google.common.collect.ImmutableList r8 = r1.A00
            if (r8 != 0) goto L_0x012b
        L_0x0115:
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of(r12)
            if (r1 != 0) goto L_0x012b
            r14 = 0
            r17 = 0
        L_0x011f:
            X.4qz r1 = r11.A03
            com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1 r5 = new com.instagram.share.facebook.upsell.manager.CLNoticeManager$maybeFetchAndDisplayServerProvidedUpsells$1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17)
            r0 = 3
            X.C25237DiI.A00(r13, r13, r5, r1, r0)
            return
        L_0x012b:
            long r14 = r1.A00(r2)
            boolean r17 = r1.A01(r2)
            goto L_0x011f
        L_0x0134:
            int r3 = r3 + 1
            goto L_0x0105
        L_0x0137:
            r1 = 0
            goto L_0x0115
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HR.A01(X.3CX, X.4qf):void");
    }
}
