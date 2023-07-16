package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0MJ;
import X.AnonymousClass0YP;
import X.AnonymousClass5Ha;
import X.BLL;
import X.C11630kW;
import X.C146958n9;
import X.C150498wM;
import X.C18220wO;
import X.C19877BEd;
import X.C20062BMf;
import X.C39142Kno;
import android.content.Context;
import com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

public class KtSLambdaShape0S11001000_I2 extends C39142Kno implements AnonymousClass0YP {
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
    public Object A0A;
    public String A0B;
    public final int A0C = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S11001000_I2(Context context, AnonymousClass5Ha r3, C19877BEd bEd, C20062BMf bMf, BLL bll, C150498wM r7, C11630kW r8, UserSession userSession, String str, C146958n9 r11, AnonymousClass0MJ r12) {
        super(2, r11);
        this.A07 = r12;
        this.A08 = r3;
        this.A0A = userSession;
        this.A06 = context;
        this.A05 = bll;
        this.A04 = bMf;
        this.A09 = r7;
        this.A03 = bEd;
        this.A0B = str;
        this.A01 = r8;
    }

    public final C146958n9 create(Object obj, C146958n9 r15) {
        C146958n9 r11 = r15;
        if (this.A0C != 0) {
            String str = this.A0B;
            return new KtSLambdaShape0S11001000_I2((Context) this.A01, (IGQuickPromotionFetcherHelper) this.A02, (UserSession) this.A03, str, r15);
        }
        AnonymousClass5Ha r3 = (AnonymousClass5Ha) this.A08;
        UserSession userSession = (UserSession) this.A0A;
        Context context = (Context) this.A06;
        BLL bll = (BLL) this.A05;
        C20062BMf bMf = (C20062BMf) this.A04;
        C150498wM r7 = (C150498wM) this.A09;
        C19877BEd bEd = (C19877BEd) this.A03;
        String str2 = this.A0B;
        return new KtSLambdaShape0S11001000_I2(context, r3, bEd, bMf, bll, r7, (C11630kW) this.A01, userSession, str2, r11, (AnonymousClass0MJ) this.A07);
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005b, code lost:
        if (com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper.A00(r2, r3, (com.instagram.quickpromotion.intf.QuickPromotionSlot) r5.next(), r0, r7, r1) == r8) goto L_0x005d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            r42 = this;
            r1 = r42
            r11 = r43
            int r0 = r1.A0C
            X.D0E r8 = X.D0E.COROUTINE_SUSPENDED
            if (r0 == 0) goto L_0x009d
            int r0 = r1.A00
            r9 = 1
            if (r0 == 0) goto L_0x0069
            java.lang.Object r10 = r1.A0A
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r5 = r1.A09
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r1.A08
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r0 = r1.A07
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            java.lang.Object r2 = r1.A06
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r3 = r1.A05
            com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper r3 = (com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper) r3
            java.lang.Object r7 = r1.A04
            java.util.Map r7 = (java.util.Map) r7
            X.AnonymousClass0OU.A00(r11)
        L_0x002e:
            kotlin.Unit r4 = kotlin.Unit.A00
            r10.add(r4)
        L_0x0033:
            r10 = r6
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L_0x005e
            java.lang.Object r4 = r5.next()
            com.instagram.quickpromotion.intf.QuickPromotionSlot r4 = (com.instagram.quickpromotion.intf.QuickPromotionSlot) r4
            r1.A04 = r7
            r1.A05 = r3
            r1.A06 = r2
            r1.A07 = r0
            r1.A08 = r6
            r1.A09 = r5
            r1.A0A = r6
            r1.A00 = r9
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r0
            r15 = r7
            r16 = r1
            java.lang.Object r4 = com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper.A00(r11, r12, r13, r14, r15, r16)
            if (r4 != r8) goto L_0x002e
        L_0x005d:
            return r8
        L_0x005e:
            java.lang.String r0 = r1.A0B
            java.lang.Object r8 = r7.get(r0)
            if (r8 != 0) goto L_0x005d
            X.0ZV r8 = X.AnonymousClass0ZV.A00
            return r8
        L_0x0069:
            X.AnonymousClass0OU.A00(r11)
            java.util.LinkedHashMap r7 = X.C18220wO.A0y()
            com.instagram.quickpromotion.intf.QuickPromotionSlot[] r6 = com.instagram.quickpromotion.intf.QuickPromotionSlot.values()
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            int r4 = r6.length
            r3 = 0
        L_0x007a:
            if (r3 >= r4) goto L_0x0088
            r2 = r6[r3]
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0t
            if (r0 == r2) goto L_0x0085
            r5.add(r2)
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x007a
        L_0x0088:
            java.lang.Object r3 = r1.A02
            com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper r3 = (com.instagram.quickpromotion.debug.devtool.IGQuickPromotionFetcherHelper) r3
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r1.A03
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            java.util.ArrayList r6 = X.AnonymousClass0wJ.A0w(r5)
            java.util.Iterator r5 = r5.iterator()
            goto L_0x0033
        L_0x009d:
            int r2 = r1.A00
            r0 = 1
            if (r2 == 0) goto L_0x00d9
            java.lang.Object r7 = r1.A02
            X.0MJ r7 = (X.AnonymousClass0MJ) r7
            X.AnonymousClass0OU.A00(r11)
        L_0x00a9:
            r7.A00 = r11
            java.lang.Object r0 = r1.A07
            X.0MJ r0 = (X.AnonymousClass0MJ) r0
            java.lang.Object r4 = r0.A00
            X.93a r4 = (X.C1532193a) r4
            if (r4 == 0) goto L_0x00d6
            java.lang.Object r2 = r1.A06
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r9 = r1.A0A
            com.instagram.service.session.UserSession r9 = (com.instagram.service.session.UserSession) r9
            java.lang.Object r6 = r1.A05
            X.BLL r6 = (X.BLL) r6
            java.lang.Object r5 = r1.A04
            X.BMf r5 = (X.C20062BMf) r5
            java.lang.Object r7 = r1.A09
            X.8wM r7 = (X.C150498wM) r7
            java.lang.Object r3 = r1.A03
            X.BEd r3 = (X.C19877BEd) r3
            java.lang.String r10 = r1.A0B
            java.lang.Object r8 = r1.A01
            X.0kW r8 = (X.C11630kW) r8
            X.C19501AxO.A01(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L_0x00d6:
            kotlin.Unit r8 = kotlin.Unit.A00
            return r8
        L_0x00d9:
            X.AnonymousClass0OU.A00(r11)
            java.lang.Object r7 = r1.A07
            X.0MJ r7 = (X.AnonymousClass0MJ) r7
            com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil r9 = com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil.A00
            java.lang.Object r6 = r1.A08
            X.5Ha r6 = (X.AnonymousClass5Ha) r6
            java.lang.Object r4 = r1.A0A
            com.instagram.service.session.UserSession r4 = (com.instagram.service.session.UserSession) r4
            java.lang.Object r3 = r1.A06
            android.content.Context r3 = (android.content.Context) r3
            r1.A02 = r7
            r1.A00 = r0
            com.instagram.api.schemas.ClipsMidCardType r5 = r6.A04
            int r2 = r5.ordinal()
            r0 = 14
            if (r2 != r0) goto L_0x0103
            java.lang.Object r11 = com.instagram.clips.midcard.util.ClipsMidcardValidDisplayModelUtil.A00(r3, r6, r9, r4, r1)
        L_0x0100:
            if (r11 != r8) goto L_0x00a9
            return r8
        L_0x0103:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2500000_I2 r0 = r6.A02
            java.lang.Object r0 = r0.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x011d
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0w(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0113:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011f
            X.C86134wK.A1V(r4, r2)
            goto L_0x0113
        L_0x011d:
            X.0ZV r4 = X.AnonymousClass0ZV.A00
        L_0x011f:
            java.lang.String r3 = r6.A06
            java.lang.Integer r23 = X.AnonymousClass006.A03
            int r2 = r6.A00
            int r0 = r6.A01
            r40 = 0
            r12 = 0
            java.lang.Integer r24 = java.lang.Integer.valueOf(r0)
            r39 = 901775344(0x35bffff0, float:1.4305097E-6)
            X.93a r11 = new X.93a
            r13 = r12
            r14 = r12
            r15 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r25 = r3
            r26 = r12
            r27 = r12
            r28 = r12
            r29 = r12
            r30 = r12
            r31 = r12
            r32 = r12
            r33 = r4
            r34 = r12
            r35 = r12
            r36 = r12
            r37 = r12
            r38 = r2
            r41 = r40
            r16 = r5
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.KtSLambdaShape0S11001000_I2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((KtSLambdaShape0S11001000_I2) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape0S11001000_I2(Context context, IGQuickPromotionFetcherHelper iGQuickPromotionFetcherHelper, UserSession userSession, String str, C146958n9 r6) {
        super(2, r6);
        this.A0B = str;
        this.A02 = iGQuickPromotionFetcherHelper;
        this.A01 = context;
        this.A03 = userSession;
    }
}
