package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.BKU;
import X.BZI;
import X.C105826e3;
import X.C106646fN;
import X.C13330nS;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C568338s;
import android.app.Activity;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.instagram.quickpromotion.sdk.IGSlotFetcher;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;

public class KtSLambdaShape0S0911000_I2 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public boolean A0A;
    public final int A0B = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0911000_I2(Activity activity, C105826e3 r3, C13330nS r4, BZI bzi, BKU bku, UserSession userSession, C106646fN r8, Integer num, List list, C146958n9 r11, boolean z) {
        super(2, r11);
        this.A06 = bku;
        this.A03 = bzi;
        this.A04 = list;
        this.A07 = num;
        this.A09 = userSession;
        this.A0A = z;
        this.A08 = r4;
        this.A05 = r3;
        this.A01 = activity;
        this.A02 = r8;
    }

    public final C146958n9 create(Object obj, C146958n9 r16) {
        C146958n9 r12 = r16;
        if (this.A0B != 0) {
            BZI bzi = (BZI) this.A03;
            Integer num = (Integer) this.A07;
            UserSession userSession = (UserSession) this.A09;
            boolean z = this.A0A;
            C13330nS r5 = (C13330nS) this.A08;
            C105826e3 r4 = (C105826e3) this.A05;
            return new KtSLambdaShape0S0911000_I2((Activity) this.A01, r4, r5, bzi, (BKU) this.A06, userSession, (C106646fN) this.A02, num, (List) this.A04, r12, z);
        }
        return new KtSLambdaShape0S0911000_I2((KtCSuperShape0S2100000_I2) this.A02, (IGSlotFetcher) this.A09, (C568338s) this.A03, r12, (AnonymousClass0YY) this.A01, this.A0A);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.5wk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.5wt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.5wk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.5wk} */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0106, code lost:
        if (((X.C35189Ipf) r1).A0M != true) goto L_0x0108;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x025a A[Catch:{ all -> 0x0282 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r11 = r18
            r9 = r19
            int r0 = r11.A0B
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            if (r0 == 0) goto L_0x01d3
            int r1 = r11.A00
            r0 = 1
            if (r1 == 0) goto L_0x0197
            if (r1 != r0) goto L_0x01c7
            X.AnonymousClass0OU.A00(r9)
        L_0x0014:
            X.68I r9 = (X.AnonymousClass68I) r9
            r2 = 4
            X.68I r5 = X.AnonymousClass68I.LWN_WELCOME
            X.68I r4 = X.AnonymousClass68I.LWN_WARNING
            X.68I r3 = X.AnonymousClass68I.PERSISTENT_WELCOME_LIGHTWEIGHT
            X.68I r1 = X.AnonymousClass68I.PERSISTENT_WARNING_LIGHTWEIGHT
            r6 = 3
            X.68I[] r1 = new X.AnonymousClass68I[]{r5, r4, r3, r1}
            java.util.List r1 = X.C06750aI.A17(r1)
            boolean r1 = r1.contains(r9)
            if (r1 == 0) goto L_0x00c3
            int r1 = r9.ordinal()
            if (r1 == r6) goto L_0x00bf
            if (r1 == r2) goto L_0x00bc
            r0 = 5
            if (r1 == r0) goto L_0x00b9
            r0 = 6
            if (r1 != r0) goto L_0x00a9
            java.lang.Integer r6 = X.AnonymousClass006.A0N
        L_0x003e:
            java.lang.Object r4 = r11.A06
            X.BKU r4 = (X.BKU) r4
            java.lang.Object r5 = r11.A03
            X.BZI r5 = (X.BZI) r5
            boolean r0 = r11.A0A
            java.lang.Object r3 = r11.A08
            X.0nS r3 = (X.C13330nS) r3
            X.C18210wN.A0n(r2, r4, r3)
            java.lang.String r1 = "is_launched_from_bottomsheet"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            kotlin.Pair r2 = X.C18180wK.A0p(r1, r0)
            java.lang.String r1 = "view_variant"
            java.lang.String r0 = X.C102456Vg.A00(r6)
            kotlin.Pair r0 = X.C18180wK.A0p(r1, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r2, r0}
            java.util.Map r2 = X.AnonymousClass4WJ.A0I(r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000.A0L(r3)
            java.lang.String r1 = "comment_reply"
            java.lang.String r0 = "source_of_action"
            r3.A0T(r0, r1)
            r3.A1h(r2)
            r2 = 0
            if (r5 == 0) goto L_0x00b7
            java.lang.String r0 = r5.A0e
            if (r0 == 0) goto L_0x00b7
            java.lang.Long r1 = X.AnonymousClass0wJ.A0d(r0)
        L_0x0084:
            java.lang.String r0 = "parent_comment_id"
            r3.A0S(r0, r1)
            if (r5 == 0) goto L_0x0093
            java.lang.String r0 = r5.A0f
            if (r0 == 0) goto L_0x0093
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r0)
        L_0x0093:
            java.lang.String r0 = "replied_to_comment_id"
            r3.A0S(r0, r2)
            X.BKN r0 = r4.A0f
            java.lang.String r1 = r0.A4Y
            java.lang.String r0 = "media_id"
            r3.A0T(r0, r1)
            java.lang.String r0 = "impression"
            X.C18190wL.A1I(r3, r0)
            r3.Bb4()
        L_0x00a9:
            java.lang.Object r0 = r11.A05
            X.6e3 r0 = (X.C105826e3) r0
            if (r0 == 0) goto L_0x00b4
            com.instagram.comments.controller.CommentComposerController r0 = r0.A00
            com.instagram.comments.controller.CommentComposerController.A0C(r0, r9)
        L_0x00b4:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x00b7:
            r1 = r2
            goto L_0x0084
        L_0x00b9:
            java.lang.Integer r6 = X.AnonymousClass006.A0C
            goto L_0x003e
        L_0x00bc:
            java.lang.Integer r6 = X.AnonymousClass006.A01
            goto L_0x003e
        L_0x00bf:
            java.lang.Integer r6 = X.AnonymousClass006.A00
            goto L_0x003e
        L_0x00c3:
            java.lang.Object r7 = r11.A01
            android.app.Activity r7 = (android.app.Activity) r7
            if (r7 == 0) goto L_0x00b4
            java.lang.Object r14 = r11.A06
            X.BKU r14 = (X.BKU) r14
            java.lang.Object r13 = r11.A03
            X.BZI r13 = (X.BZI) r13
            java.lang.Object r4 = r11.A09
            X.0i6 r4 = (X.C10300i6) r4
            java.lang.Object r12 = r11.A08
            X.0nS r12 = (X.C13330nS) r12
            java.lang.Object r2 = r11.A02
            X.6fN r2 = (X.C106646fN) r2
            boolean r1 = r7.isFinishing()
            if (r1 != 0) goto L_0x00b4
            boolean r1 = r7.isDestroyed()
            if (r1 != 0) goto L_0x00b4
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl r15 = com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl.A02
            if (r15 == 0) goto L_0x01cc
            boolean r3 = X.C86154wM.A1Y(r0, r9, r14)
            X.C18190wL.A1S(r4, r6, r12)
            r1 = 6
            X.C04220Ms.A0B(r2, r1)
            X.GVD r8 = X.C25745DrH.A00
            X.DrH r1 = r8.A01(r7)
            if (r1 == 0) goto L_0x0108
            X.Ipf r1 = (X.C35189Ipf) r1
            boolean r1 = r1.A0M
            r17 = 1
            if (r1 == r0) goto L_0x010a
        L_0x0108:
            r17 = 0
        L_0x010a:
            int r5 = r9.ordinal()
            if (r5 == r3) goto L_0x0127
            r1 = 2
            if (r5 == r1) goto L_0x0140
            if (r5 == r0) goto L_0x00b4
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
            r1.append(r9)
            java.lang.String r0 = " cannot be shown"
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            java.lang.UnsupportedOperationException r0 = X.C86134wK.A0s(r0)
            throw r0
        L_0x0127:
            android.os.Bundle r1 = X.C18180wK.A06()
            X.AnonymousClass3W9.A01(r1, r4)
            X.5wk r5 = new X.5wk
            r5.<init>()
            r5.setArguments(r1)
            X.6mK r11 = new X.6mK
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r5.A00 = r11
            goto L_0x015d
        L_0x0140:
            android.os.Bundle r1 = X.C18180wK.A06()
            X.AnonymousClass3W9.A01(r1, r4)
            X.5wt r5 = new X.5wt
            r5.<init>()
            r5.setArguments(r1)
            X.6lo r1 = new X.6lo
            r9 = r1
            r10 = r12
            r11 = r14
            r12 = r15
            r13 = r2
            r14 = r17
            r9.<init>(r10, r11, r12, r13, r14)
            r5.A00 = r1
        L_0x015d:
            if (r17 == 0) goto L_0x016e
            X.0TJ r9 = X.AnonymousClass0TJ.A05
            r1 = 36324492632400403(0x810cef00002213, double:3.0350936354970844E-306)
            boolean r1 = X.C63803iN.A0E(r9, r4, r1)
            if (r1 != 0) goto L_0x016e
            goto L_0x00b4
        L_0x016e:
            X.DrH r1 = r8.A01(r7)
            X.Jqm r9 = X.C37383Jqm.A02(r1)
            X.Jj9 r8 = new X.Jj9
            r8.<init>(r4)
            r8.A0e = r0
            if (r9 == 0) goto L_0x0192
            int[] r4 = X.C37032Jj9.A0t
            r3 = r4[r3]
            r2 = r4[r0]
            r0 = 2
            r1 = r4[r0]
            r0 = r4[r6]
            r8.A02(r3, r2, r1, r0)
            r9.A09(r5, r8)
            goto L_0x00b4
        L_0x0192:
            X.C18200wM.A16(r7, r5, r8)
            goto L_0x00b4
        L_0x0197:
            X.AnonymousClass0OU.A00(r9)
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl r4 = com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl.A02
            if (r4 == 0) goto L_0x01cc
            java.lang.Object r7 = r11.A06
            X.BKU r7 = (X.BKU) r7
            java.lang.Object r6 = r11.A03
            X.BZI r6 = (X.BZI) r6
            java.lang.Object r2 = r11.A04
            java.util.List r2 = (java.util.List) r2
            r1 = 100
            java.util.List r10 = X.AnonymousClass00J.A0Z(r2, r1)
            java.lang.Object r9 = r11.A07
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r8 = r11.A09
            com.instagram.service.session.UserSession r8 = (com.instagram.service.session.UserSession) r8
            boolean r12 = r11.A0A
            java.lang.Object r5 = r11.A08
            X.0nS r5 = (X.C13330nS) r5
            r11.A00 = r0
            java.lang.Object r9 = r4.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r9 != r3) goto L_0x0014
            return r3
        L_0x01c7:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x01cc:
            java.lang.String r0 = "instance"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x01d3:
            int r0 = r11.A00
            r5 = 0
            r8 = 2
            r4 = 1
            if (r0 == 0) goto L_0x01f4
            if (r0 == r4) goto L_0x021e
            java.lang.Object r2 = r11.A08
            X.0YY r2 = (X.AnonymousClass0YY) r2
            java.lang.Object r10 = r11.A07
            X.38s r10 = (X.C568338s) r10
            java.lang.Object r4 = r11.A06
            com.instagram.quickpromotion.sdk.IGSlotFetcher r4 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r4
            java.lang.Object r7 = r11.A05
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r7
            java.lang.Object r6 = r11.A04
            X.Dnh r6 = (X.C25549Dnh) r6
            X.AnonymousClass0OU.A00(r9)
            goto L_0x0246
        L_0x01f4:
            X.AnonymousClass0OU.A00(r9)
            java.lang.Object r2 = r11.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r2
            r0 = 852(0x354, float:1.194E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.1u6 r1 = new X.1u6
            r1.<init>(r2, r0)
            java.lang.Object r0 = r11.A01
            X.C86134wK.A1L(r0, r1)
            java.lang.Object r2 = r11.A09
            com.instagram.quickpromotion.sdk.IGSlotFetcher r2 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r2
            java.lang.Object r1 = r11.A03
            X.38s r1 = (X.C568338s) r1
            boolean r0 = r11.A0A
            r11.A00 = r4
            java.lang.Object r0 = com.instagram.quickpromotion.sdk.IGSlotFetcher.A01(r2, r1, r11, r0)
            if (r0 != r3) goto L_0x0221
            return r3
        L_0x021e:
            X.AnonymousClass0OU.A00(r9)
        L_0x0221:
            java.lang.Object r4 = r11.A09
            com.instagram.quickpromotion.sdk.IGSlotFetcher r4 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r4
            X.Dnh r6 = r4.A08
            java.lang.Object r7 = r11.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r7 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r7
            java.lang.Object r10 = r11.A03
            X.38s r10 = (X.C568338s) r10
            java.lang.Object r2 = r11.A01
            X.0YY r2 = (X.AnonymousClass0YY) r2
            r11.A04 = r6
            r11.A05 = r7
            r11.A06 = r4
            r11.A07 = r10
            r11.A08 = r2
            r11.A00 = r8
            java.lang.Object r0 = r6.A00(r5, r11)
            if (r0 != r3) goto L_0x0246
            return r3
        L_0x0246:
            java.lang.String r1 = "inside_lock"
            X.1u6 r0 = new X.1u6     // Catch:{ all -> 0x0282 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x0282 }
            r2.invoke(r0)     // Catch:{ all -> 0x0282 }
            java.lang.Integer r0 = X.AnonymousClass006.A0C     // Catch:{ all -> 0x0282 }
            r4.A01 = r0     // Catch:{ all -> 0x0282 }
            java.util.Set r1 = r4.A07     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x0282 }
            if (r0 != 0) goto L_0x0260
            r0 = 1020(0x3fc, float:1.43E-42)
            java.lang.String r0 = X.C18170wI.A00(r0)     // Catch:{ all -> 0x0282 }
        L_0x0260:
            r1.add(r0)     // Catch:{ all -> 0x0282 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0282 }
            r4.A00 = r0     // Catch:{ all -> 0x0282 }
            com.instagram.quickpromotion.sdk.IGSlotFetcher.A02(r7, r4, r2)     // Catch:{ all -> 0x0282 }
            kotlin.Unit r3 = kotlin.Unit.A00     // Catch:{ all -> 0x0282 }
            r6.A02(r5)
            java.lang.Object r2 = r11.A02
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2 r2 = (com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2) r2
            java.lang.String r0 = "lock_complete"
            X.1u6 r1 = new X.1u6
            r1.<init>(r2, r0)
            java.lang.Object r0 = r11.A01
            X.C86134wK.A1L(r0, r1)
            return r3
        L_0x0282:
            r0 = move-exception
            r6.A02(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S0911000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S0911000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S0911000_I2(KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2, IGSlotFetcher iGSlotFetcher, C568338s r4, C146958n9 r5, AnonymousClass0YY r6, boolean z) {
        super(2, r5);
        this.A02 = ktCSuperShape0S2100000_I2;
        this.A09 = iGSlotFetcher;
        this.A03 = r4;
        this.A0A = z;
        this.A01 = r6;
    }
}
