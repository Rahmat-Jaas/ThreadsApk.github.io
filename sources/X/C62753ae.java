package X;

import android.app.Activity;
import com.instagram.service.session.UserSession;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.3ae  reason: invalid class name and case insensitive filesystem */
public final class C62753ae {
    public static final AnonymousClass1v4 A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        return (AnonymousClass1v4) userSession.A01(AnonymousClass1v4.class, new KtLambdaShape116S0100000_I2_96(userSession, 32));
    }

    public final boolean A04(Activity activity, AnonymousClass2AC r16, UserSession userSession, C83004qd r18, boolean z) {
        AnonymousClass2AC r3 = r16;
        C83004qd r5 = r18;
        AnonymousClass0wJ.A1R(r3, r5);
        UserSession userSession2 = userSession;
        boolean z2 = z;
        Activity activity2 = activity;
        if (A05(r3, userSession2, z2, false)) {
            A03(activity2, r3, userSession2, r5, z2, false);
            return true;
        } else if (!A05(r3, userSession2, z2, true)) {
            return false;
        } else {
            A03(activity, r3, userSession2, r5, z2, true);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r13 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r14 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00df, code lost:
        if (r0.booleanValue() == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017a, code lost:
        if (r13 != null) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e1 A[EDGE_INSN: B:94:0x00e1->B:54:0x00e1 ?: BREAK  
    EDGE_INSN: B:96:0x00e1->B:54:0x00e1 ?: BREAK  , ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00b7 A[EDGE_INSN: B:95:0x00b7->B:39:0x00b7 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.AnonymousClass2AC r17, com.instagram.service.session.UserSession r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r11 = 3
            r6 = r17
            X.C04220Ms.A0B(r6, r11)
            r4 = r19
            r5 = r18
            boolean r0 = X.C63363hM.A06(r5, r4)
            if (r0 == 0) goto L_0x00e1
            X.1tl r10 = X.AnonymousClass3WS.A01(r5)
            r3 = r20
            if (r19 == 0) goto L_0x0184
            if (r20 == 0) goto L_0x0180
            X.22j r9 = X.C306522j.USER_MIGRATION_UPSELL_STORY_WAVE1
        L_0x001c:
            r7 = 3600(0xe10, double:1.7786E-320)
            r15 = 0
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            if (r20 == 0) goto L_0x0151
            r0 = 36322907789467164(0x810b7e00001e1c, double:3.034091374444454E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)
            if (r0 == 0) goto L_0x0061
            X.1v4 r13 = A00(r5)
            int r14 = X.C63363hM.A00(r10, r9)
            long r0 = X.C63363hM.A01(r10, r9)
            java.lang.Integer r12 = r13.A04
            java.lang.Float r13 = r13.A02
            if (r12 == 0) goto L_0x014e
            int r12 = r12.intValue()
            boolean r12 = X.C18230wP.A1W(r14, r12)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
        L_0x004c:
            if (r13 == 0) goto L_0x005f
        L_0x004e:
            float r12 = (float) r0
            float r1 = (float) r7
            float r0 = r13.floatValue()
            float r1 = r1 * r0
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x005b
            r0 = 1
        L_0x005b:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r0)
        L_0x005f:
            if (r14 != 0) goto L_0x0069
        L_0x0061:
            boolean r0 = X.C63363hM.A02(r6, r10, r5, r9)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
        L_0x0069:
            if (r15 != 0) goto L_0x0073
            boolean r0 = X.C63363hM.A03(r6, r10, r5, r9)
            java.lang.Boolean r15 = X.C18240wQ.A0X(r0)
        L_0x0073:
            boolean r0 = r14.booleanValue()
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r15.booleanValue()
            if (r0 == 0) goto L_0x00e1
            X.1tl r12 = X.AnonymousClass3WS.A01(r5)
            if (r19 == 0) goto L_0x0144
            if (r20 == 0) goto L_0x0140
            X.22j r10 = X.C306522j.USER_MIGRATION_UPSELL_STORY_WAVE1
        L_0x0089:
            r8 = 1
            X.C04220Ms.A0B(r12, r8)
            X.C04220Ms.A0B(r10, r11)
            r7 = 0
            r11 = 2
            X.22j[] r1 = new X.C306522j[r11]
            if (r19 == 0) goto L_0x0138
            X.22j r0 = X.C306522j.USER_MIGRATION_UPSELL_STORY_WAVE1
            r1[r7] = r0
            X.22j r0 = X.C306522j.USER_MIGRATION_UPSELL_STORY_WAVE2
        L_0x009c:
            r1[r8] = r0
            java.util.List r0 = X.C06750aI.A17(r1)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            boolean r0 = r1.contains(r10)
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x010c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x010c
        L_0x00b7:
            X.1v4 r7 = A00(r5)
            if (r20 == 0) goto L_0x00e3
            r0 = 36322907789467164(0x810b7e00001e1c, double:3.034091374444454E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)
            if (r0 == 0) goto L_0x0100
            java.lang.Boolean r0 = r7.A00
            if (r0 == 0) goto L_0x00d4
            java.lang.Integer r0 = r7.A04
            if (r0 == 0) goto L_0x00d4
            java.lang.Float r0 = r7.A02
            if (r0 != 0) goto L_0x00d7
        L_0x00d4:
            A01(r5)
        L_0x00d7:
            java.lang.Boolean r0 = r7.A00
        L_0x00d9:
            if (r0 == 0) goto L_0x0100
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0100
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            return r1
        L_0x00e3:
            r0 = 36322907789532701(0x810b7e00011e1d, double:3.0340913744859E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)
            if (r0 == 0) goto L_0x0100
            java.lang.Boolean r0 = r7.A01
            if (r0 == 0) goto L_0x00fa
            java.lang.Integer r0 = r7.A05
            if (r0 == 0) goto L_0x00fa
            java.lang.Float r0 = r7.A03
            if (r0 != 0) goto L_0x00fd
        L_0x00fa:
            A02(r5)
        L_0x00fd:
            java.lang.Boolean r0 = r7.A01
            goto L_0x00d9
        L_0x0100:
            X.2AD r0 = X.AnonymousClass3P0.A00(r4, r3)
            boolean r0 = X.C63423hS.A03(r6, r0, r5)
            r1 = 1
            if (r0 != 0) goto L_0x00e2
            goto L_0x00e1
        L_0x010c:
            java.util.Iterator r9 = r1.iterator()
        L_0x0110:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00b7
            java.lang.Object r8 = r9.next()
            X.22j r8 = (X.C306522j) r8
            if (r8 == r10) goto L_0x0110
            X.C04220Ms.A0B(r8, r11)
            int r0 = X.C63363hM.A00(r12, r8)
            boolean r7 = X.C18180wK.A1X(r0)
            boolean r1 = X.C63363hM.A02(r6, r12, r5, r8)
            boolean r0 = X.C63363hM.A03(r6, r12, r5, r8)
            if (r7 == 0) goto L_0x0110
            if (r1 != 0) goto L_0x00e1
            if (r0 == 0) goto L_0x0110
            goto L_0x00e1
        L_0x0138:
            X.22j r0 = X.C306522j.USER_MIGRATION_UPSELL_FEED_WAVE1
            r1[r7] = r0
            X.22j r0 = X.C306522j.USER_MIGRATION_UPSELL_FEED_WAVE2
            goto L_0x009c
        L_0x0140:
            X.22j r10 = X.C306522j.USER_MIGRATION_UPSELL_STORY_WAVE2
            goto L_0x0089
        L_0x0144:
            if (r20 == 0) goto L_0x014a
            X.22j r10 = X.C306522j.USER_MIGRATION_UPSELL_FEED_WAVE1
            goto L_0x0089
        L_0x014a:
            X.22j r10 = X.C306522j.USER_MIGRATION_UPSELL_FEED_WAVE2
            goto L_0x0089
        L_0x014e:
            r14 = r15
            goto L_0x004c
        L_0x0151:
            r0 = 36322907789532701(0x810b7e00011e1d, double:3.0340913744859E-306)
            boolean r0 = X.C63803iN.A0E(r2, r5, r0)
            if (r0 == 0) goto L_0x0061
            X.1v4 r13 = A00(r5)
            int r14 = X.C63363hM.A00(r10, r9)
            long r0 = X.C63363hM.A01(r10, r9)
            java.lang.Integer r12 = r13.A05
            java.lang.Float r13 = r13.A03
            if (r12 == 0) goto L_0x017e
            int r12 = r12.intValue()
            boolean r12 = X.C18230wP.A1W(r14, r12)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
        L_0x017a:
            if (r13 == 0) goto L_0x005f
            goto L_0x004e
        L_0x017e:
            r14 = r15
            goto L_0x017a
        L_0x0180:
            X.22j r9 = X.C306522j.USER_MIGRATION_UPSELL_STORY_WAVE2
            goto L_0x001c
        L_0x0184:
            if (r20 == 0) goto L_0x018a
            X.22j r9 = X.C306522j.USER_MIGRATION_UPSELL_FEED_WAVE1
            goto L_0x001c
        L_0x018a:
            X.22j r9 = X.C306522j.USER_MIGRATION_UPSELL_FEED_WAVE2
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62753ae.A05(X.2AC, com.instagram.service.session.UserSession, boolean, boolean):boolean");
    }

    public static final void A01(UserSession userSession) {
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r3, userSession, 36322907789467164L)) {
            Long l = A00(userSession).A06;
            if (l != null) {
                if (C18180wK.A04() - l.longValue() < AnonymousClass8bA.A04(((double) 3600) * C63803iN.A00(r3, userSession, 37167332719722730L))) {
                    return;
                }
            }
            H1T A0P = C18180wK.A0P(userSession);
            C18220wO.A1K(A0P, "ig_fb_xposting/xpost_migration_wave1_upsells/eligibility_parameters/");
            C63873iU.A0D(AnonymousClass0wJ.A0T(A0P, AnonymousClass1TQ.class, AnonymousClass3Ox.class), userSession, 167);
        }
    }

    public static final void A02(UserSession userSession) {
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r3, userSession, 36322907789532701L)) {
            Long l = A00(userSession).A07;
            if (l != null) {
                if (C18180wK.A04() - l.longValue() < AnonymousClass8bA.A04(((double) 3600) * C63803iN.A00(r3, userSession, 37167332719788267L))) {
                    return;
                }
            }
            H1T A0P = C18180wK.A0P(userSession);
            C18220wO.A1K(A0P, "ig_fb_xposting/xpost_migration_wave2_upsells/eligibility_parameters/");
            C63873iU.A0D(AnonymousClass0wJ.A0T(A0P, AnonymousClass1TQ.class, AnonymousClass3Ox.class), userSession, 168);
        }
    }

    public final void A03(Activity activity, AnonymousClass2AC r3, UserSession userSession, C83004qd r5, boolean z, boolean z2) {
        AnonymousClass0wJ.A1P(userSession, r3);
        C04220Ms.A0B(r5, 5);
        AnonymousClass1v4 A00 = A00(userSession);
        A00.A09 = z;
        A00.A08 = z2;
        A00.A00 = r3;
        A00.A04 = r5;
        A00.A06(activity);
    }
}
