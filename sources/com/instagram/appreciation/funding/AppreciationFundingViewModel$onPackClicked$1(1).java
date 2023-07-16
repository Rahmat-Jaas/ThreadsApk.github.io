package com.instagram.appreciation.funding;

import X.AnonymousClass006;
import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass4WJ;
import X.AnonymousClass76R;
import X.AnonymousClass7J0;
import X.C04220Ms;
import X.C131987t8;
import X.C13330nS;
import X.C146958n9;
import X.C18200wM;
import X.C18220wO;
import X.C18230wP;
import X.C25239DiK;
import X.C39142Kno;
import X.C57943Dd;
import X.C83234r0;
import X.C84714tk;
import X.C86074wE;
import X.C86104wH;
import X.C86154wM;
import X.C881757a;
import X.C89195Ch;
import X.C94395uq;
import X.D0E;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4110000_I2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S2201000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape25S0201000_I2;

@DebugMetadata(c = "com.instagram.appreciation.funding.AppreciationFundingViewModel$onPackClicked$1", f = "AppreciationFundingViewModel.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
public final class AppreciationFundingViewModel$onPackClicked$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C881757a A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ List A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppreciationFundingViewModel$onPackClicked$1(C881757a r2, String str, String str2, String str3, String str4, String str5, String str6, List list, C146958n9 r10, int i) {
        super(2, r10);
        this.A02 = r2;
        this.A01 = i;
        this.A05 = str;
        this.A03 = str2;
        this.A09 = list;
        this.A06 = str3;
        this.A08 = str4;
        this.A04 = str5;
        this.A07 = str6;
    }

    public final C146958n9 create(Object obj, C146958n9 r13) {
        C881757a r1 = this.A02;
        int i = this.A01;
        return new AppreciationFundingViewModel$onPackClicked$1(r1, this.A05, this.A03, this.A06, this.A08, this.A04, this.A07, this.A09, r13, i);
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            C881757a r7 = this.A02;
            AnonymousClass76R r15 = r7.A01;
            int i = this.A01;
            String str = this.A05;
            C04220Ms.A0B(str, 1);
            Integer num = AnonymousClass006.A00;
            C89195Ch A002 = AnonymousClass76R.A00(r15, num, num);
            Long A0f = C18230wP.A0f(i);
            A002.A09("balance", A0f);
            A002.A0A("star_package_id", str);
            A002.A0B("star_package_options", r15.A00);
            C13330nS r4 = r15.A02;
            C04220Ms.A05(r4);
            String str2 = r15.A01.A03;
            C86104wH.A1I(AnonymousClass0wJ.A0M(r4, "user_click_appreciationgiver_atomic"), A002, str2, AnonymousClass4WJ.A0A(), 2819);
            C89195Ch A003 = AnonymousClass76R.A00(r15, AnonymousClass006.A01, (Integer) null);
            A003.A09("balance", A0f);
            A003.A0A("star_package_id", str);
            A003.A0B("star_package_options", r15.A00);
            C86104wH.A1I(AnonymousClass0wJ.A0M(r4, "client_load_appreciationgiver_init"), A003, str2, AnonymousClass4WJ.A0A(), 255);
            C86074wE r12 = r7.A06;
            String str3 = this.A03;
            List list = this.A09;
            Iterator it = list.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (C04220Ms.A0I(((KtCSuperShape0S4110000_I2) it.next()).A02, str)) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            ArrayList A0s = C18200wM.A0s(list);
            if (i2 >= 0) {
                KtCSuperShape0S4110000_I2 ktCSuperShape0S4110000_I2 = (KtCSuperShape0S4110000_I2) A0s.get(i2);
                String str4 = ktCSuperShape0S4110000_I2.A03;
                String str5 = ktCSuperShape0S4110000_I2.A04;
                String str6 = ktCSuperShape0S4110000_I2.A01;
                C57943Dd r1 = (C57943Dd) ktCSuperShape0S4110000_I2.A00;
                C04220Ms.A0B(str4, 0);
                AnonymousClass0wJ.A1Q(str5, str6);
                C04220Ms.A0B(r1, 4);
                A0s.set(i2, new KtCSuperShape0S4110000_I2(r1, str4, ktCSuperShape0S4110000_I2.A02, str5, str6, true));
            }
            r12.CrC(new C94395uq(A0s, i, str3));
            C131987t8 r0 = r7.A03;
            String str7 = this.A06;
            C84714tk A022 = AnonymousClass7J0.A02(new KtSLambdaShape25S0201000_I2(1, (C146958n9) null), C25239DiK.A00(new KtSLambdaShape0S2201000_I2((Object) r0.A00, str7, str, (C146958n9) null, C86154wM.A1Y(1, str7, str) ? 1 : 0)));
            String str8 = this.A08;
            final List list2 = list;
            final int i3 = i;
            final C881757a r122 = r7;
            final String str9 = str;
            final String str10 = str8;
            final String str11 = this.A04;
            final String str12 = this.A07;
            final String str13 = str3;
            AnonymousClass1 r11 = new C83234r0() {
                /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
                /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
                /* renamed from: A00 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(X.AnonymousClass8eY r23, X.C146958n9 r24) {
                    /*
                        r22 = this;
                        r9 = r23
                        r3 = 25
                        r5 = r24
                        boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r5)
                        r6 = r22
                        if (r0 == 0) goto L_0x0030
                        r4 = r5
                        kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r4
                        int r2 = r4.A00
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r2 & r1
                        if (r0 == 0) goto L_0x0030
                        int r2 = r2 - r1
                        r4.A00 = r2
                    L_0x001c:
                        java.lang.Object r1 = r4.A02
                        X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
                        int r0 = r4.A00
                        r5 = 0
                        r2 = 2
                        r8 = 1
                        if (r0 == 0) goto L_0x003e
                        if (r0 == r8) goto L_0x0035
                        if (r0 == r2) goto L_0x0035
                        java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
                        throw r0
                    L_0x0030:
                        kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r4 = X.C86164wN.A0n(r6, r5, r3)
                        goto L_0x001c
                    L_0x0035:
                        java.lang.Object r0 = r4.A01
                        com.instagram.appreciation.funding.AppreciationFundingViewModel$onPackClicked$1$1 r0 = (com.instagram.appreciation.funding.AppreciationFundingViewModel$onPackClicked$1.AnonymousClass1) r0
                        X.AnonymousClass0OU.A00(r1)
                        goto L_0x0129
                    L_0x003e:
                        X.AnonymousClass0OU.A00(r1)
                        boolean r0 = r9 instanceof X.C130077oe
                        if (r0 == 0) goto L_0x0084
                        X.57a r10 = X.C881757a.this
                        X.76R r11 = r10.A01
                        int r7 = r19
                        java.lang.String r2 = r13
                        java.lang.Integer r1 = X.AnonymousClass006.A01
                        r0 = 0
                        X.5Ch r9 = X.AnonymousClass76R.A00(r11, r1, r0)
                        X.C86134wK.A1F(r9, r7)
                        java.lang.String r0 = "star_package_id"
                        r9.A0A(r0, r2)
                        java.util.List r1 = r11.A00
                        java.lang.String r0 = "star_package_options"
                        r9.A0B(r0, r1)
                        X.7Jn r7 = X.C122017Jn.A02
                        X.0nS r2 = r11.A02
                        X.C04220Ms.A05(r2)
                        com.instagram.appreciation.analytics.LoggingFanData r0 = r11.A01
                        java.lang.String r1 = r0.A03
                        java.util.Map r0 = X.AnonymousClass4WJ.A0A()
                        r7.A05(r9, r2, r1, r0)
                        X.4wD r9 = r10.A04
                        X.5up r7 = X.C94385up.A00
                        r4.A01 = r6
                        r4.A00 = r8
                    L_0x007d:
                        java.lang.Object r0 = r9.Cgt(r7, r4)
                        if (r0 != r3) goto L_0x0128
                        return r3
                    L_0x0084:
                        boolean r0 = r9 instanceof X.AnonymousClass5LJ
                        if (r0 == 0) goto L_0x0112
                        X.57a r7 = X.C881757a.this
                        X.76R r12 = r7.A01
                        int r1 = r19
                        java.lang.String r13 = r13
                        X.5LJ r9 = (X.AnonymousClass5LJ) r9
                        java.lang.String r14 = r9.A01
                        r15 = 0
                        java.lang.String r0 = r9.A00
                        java.lang.Integer r9 = X.AnonymousClass006.A01
                        X.5Ch r11 = X.AnonymousClass76R.A00(r12, r9, r15)
                        X.C86134wK.A1F(r11, r1)
                        java.lang.String r9 = "star_package_id"
                        r11.A0A(r9, r13)
                        java.util.List r10 = r12.A00
                        java.lang.String r9 = "star_package_options"
                        r11.A0B(r9, r10)
                        X.0nS r10 = r12.A02
                        X.C04220Ms.A05(r10)
                        com.instagram.appreciation.analytics.LoggingFanData r9 = r12.A01
                        java.lang.String r9 = r9.A03
                        r16 = r11
                        r17 = r10
                        r18 = r9
                        r19 = r14
                        r20 = r15
                        r21 = r0
                        X.C122017Jn.A04(r16, r17, r18, r19, r20, r21)
                        X.7pP r9 = r7.A02
                        java.lang.String r10 = r14
                        java.lang.String r11 = r15
                        java.lang.String r12 = r16
                        X.C04220Ms.A0B(r10, r5)
                        X.C04220Ms.A0B(r11, r8)
                        X.C04220Ms.A0B(r12, r2)
                        kotlin.jvm.internal.KtLambdaShape0S7101000_I2 r8 = new kotlin.jvm.internal.KtLambdaShape0S7101000_I2
                        r18 = r5
                        r17 = r1
                        r16 = r0
                        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                        com.instagram.service.session.UserSession r0 = r9.A00
                        boolean r0 = X.C19573AyZ.A02(r0)
                        if (r0 == 0) goto L_0x00eb
                        r8.invoke()
                    L_0x00eb:
                        X.4wE r10 = r7.A06
                        java.lang.String r9 = r17
                        java.util.List r8 = r18
                        X.5uq r0 = new X.5uq
                        r0.<init>(r8, r1, r9)
                        r10.CrC(r0)
                        X.4wD r9 = r7.A04
                        java.lang.Object[] r7 = new java.lang.Object[r5]
                        r0 = 2131821383(0x7f110347, float:1.9275508E38)
                        X.1kC r1 = new X.1kC
                        r1.<init>(r7, r0)
                        java.lang.String r0 = "appreciation_funding_purchase_failure"
                        X.5un r7 = new X.5un
                        r7.<init>(r1, r0)
                        r4.A01 = r6
                        r4.A00 = r2
                        goto L_0x007d
                    L_0x0112:
                        boolean r0 = r9 instanceof X.AnonymousClass7od
                        if (r0 == 0) goto L_0x0128
                        X.57a r0 = X.C881757a.this
                        X.4wE r4 = r0.A06
                        java.lang.String r3 = r17
                        int r2 = r19
                        java.util.List r1 = r18
                        X.5uq r0 = new X.5uq
                        r0.<init>(r1, r2, r3)
                        r4.CrC(r0)
                    L_0x0128:
                        r0 = r6
                    L_0x0129:
                        X.57a r0 = X.C881757a.this
                        r0.A00 = r5
                        kotlin.Unit r0 = kotlin.Unit.A00
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.funding.AppreciationFundingViewModel$onPackClicked$1.AnonymousClass1.emit(X.8eY, X.8n9):java.lang.Object");
                }
            };
            this.A00 = 1;
            if (A022.collect(r11, this) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AppreciationFundingViewModel$onPackClicked$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
