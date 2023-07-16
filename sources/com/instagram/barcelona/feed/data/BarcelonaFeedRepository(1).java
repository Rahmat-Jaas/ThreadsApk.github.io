package com.instagram.barcelona.feed.data;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass2LT;
import X.AnonymousClass3LY;
import X.AnonymousClass3V6;
import X.AnonymousClass5I1;
import X.AnonymousClass5IF;
import X.AnonymousClass6O2;
import X.AnonymousClass7C0;
import X.AnonymousClass8bW;
import X.AnonymousClass8s2;
import X.BKS;
import X.BKU;
import X.C04220Ms;
import X.C08830eN;
import X.C10440iL;
import X.C110706m8;
import X.C132447tu;
import X.C146958n9;
import X.C148838sG;
import X.C18190wL;
import X.C18220wO;
import X.C18230wP;
import X.C20309BYl;
import X.C21839C2o;
import X.C25239DiK;
import X.C25240DiL;
import X.C27457Enn;
import X.C37415JrZ;
import X.C84714tk;
import X.C86074wE;
import X.C86094wG;
import X.C86144wL;
import X.C86154wM;
import X.D0E;
import X.JSG;
import android.content.Context;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0110000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1420000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3210000_I2;
import com.facebook.redex.IDxFlowShape93S0200000_1_I2;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape6S0200000_I2_1;
import kotlin.coroutines.jvm.internal.KtSLambdaShape8S0401000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;
import kotlin.jvm.internal.KtLambdaShape32S0100000_I2_12;

public final class BarcelonaFeedRepository {
    public final Context A00;
    public final C132447tu A01;
    public final AnonymousClass3V6 A02;
    public final AnonymousClass3V6 A03;
    public final C21839C2o A04;
    public final UserSession A05;
    public final C20309BYl A06 = C20309BYl.A00();
    public final C84714tk A07;
    public final C86074wE A08;
    public final C86074wE A09;
    public final C86094wG A0A;
    public final C110706m8 A0B;
    public final C10440iL A0C;
    public final C84714tk A0D;

    public final int A03(String str) {
        C04220Ms.A0B(str, 0);
        Iterator A0y = C86144wL.A0y(this.A09.getValue());
        int i = 0;
        while (A0y.hasNext()) {
            if (C04220Ms.A0I(AnonymousClass5IF.A00(A0y).A01(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final KtCSuperShape0S0110000_I2 A00(KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2) {
        Iterable<C37415JrZ> iterable = (Iterable) ktCSuperShape0S2100000_I2.A00;
        ArrayList A0w = AnonymousClass0wJ.A0w(iterable);
        for (C37415JrZ jrZ : iterable) {
            KtCSuperShape0S3210000_I2 ktCSuperShape0S3210000_I2 = ((BKS) jrZ.A0O).A00;
            A0w.add(new AnonymousClass5I1(AnonymousClass6O2.A00(ktCSuperShape0S3210000_I2), AnonymousClass006.A00));
        }
        return new KtCSuperShape0S0110000_I2(AnonymousClass7C0.A00(A0w), C18220wO.A1U(ktCSuperShape0S2100000_I2.A01));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.barcelona.feed.data.BarcelonaFeedRepository r28, java.lang.Integer r29, java.lang.String r30, java.lang.String r31, X.C146958n9 r32) {
        /*
            r3 = 48
            r4 = r32
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2.A00(r3, r4)
            r8 = r28
            if (r0 == 0) goto L_0x00e3
            r7 = r4
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = (kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00e3
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r7.A02
            X.D0E r6 = X.D0E.COROUTINE_SUSPENDED
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 != r5) goto L_0x00e9
            java.lang.Object r4 = r7.A01
            X.0MJ r4 = (X.AnonymousClass0MJ) r4
            X.AnonymousClass0OU.A00(r1)
        L_0x002c:
            java.lang.Object r6 = r4.A00
            if (r6 != 0) goto L_0x003a
            java.lang.String r0 = "Didn't receive a feed response."
            java.lang.RuntimeException r0 = X.C18250wR.A0V(r0)
            X.1jB r6 = X.C86164wN.A0R(r0)
        L_0x003a:
            return r6
        L_0x003b:
            X.AnonymousClass0OU.A00(r1)
            X.BYl r0 = r8.A06
            java.lang.String r12 = r0.A00
            X.C04220Ms.A06(r12)
            X.0MJ r4 = X.C86144wL.A17()
            X.6m8 r3 = r8.A0B
            r15 = r31
            r1 = r15
            r0 = 2
            r8 = r29
            X.C04220Ms.A0B(r8, r0)
            r18 = r30
            boolean r14 = X.C18220wO.A1U(r18)
            X.0iL r0 = r3.A01
            X.0eO r13 = new X.0eO
            r13.<init>(r0)
            android.content.Context r0 = r3.A00
            r32 = r0
            X.C04220Ms.A05(r32)
            X.GWa r0 = r3.A04
            r21 = r0
            com.instagram.service.session.UserSession r11 = r3.A03
            X.8nE r17 = X.C121757Hz.A01(r11, r14)
            r0 = 798(0x31e, float:1.118E-42)
            java.lang.String r0 = X.I17.A00(r0)
            if (r31 != 0) goto L_0x007c
            java.lang.String r1 = "text_post_feed_threads"
        L_0x007c:
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r1)
            java.util.Map r10 = X.AnonymousClass4WK.A0O(r0)
            r2 = 0
            r9 = 0
            r0 = r18
            X.76X r19 = X.AnonymousClass6T8.A00(r11, r8, r0, r2, r9)
            X.JSG r0 = r3.A02
            java.lang.String r26 = r0.A00()
            java.util.HashMap r30 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = r3.A05
            r0 = 15
            X.C04220Ms.A0B(r1, r0)
            X.JiP r0 = new X.JiP
            r0.<init>(r8, r12, r10)
            java.lang.String r10 = r0.A04
            r16 = r10
            java.lang.String r12 = r0.A05
            java.lang.Integer r10 = r0.A02
            java.util.Map r0 = r0.A06
            r25 = r18
            r27 = r2
            r28 = r1
            r29 = r0
            r31 = r9
            r18 = r13
            r20 = r11
            r22 = r10
            r23 = r16
            r24 = r12
            r16 = r32
            X.H8c r11 = X.C37326JpT.A00(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r13 = 6
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2 r9 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S0311000_I2
            r10 = r3
            r12 = r2
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (X.C146958n9) r12, (int) r13, (boolean) r14)
            X.86y r1 = new X.86y
            r1.<init>(r9)
            kotlin.coroutines.jvm.internal.KtSLambdaShape1S1300000_I2 r0 = new kotlin.coroutines.jvm.internal.KtSLambdaShape1S1300000_I2
            r0.<init>(r8, r15, r2, r4)
            r7.A01 = r4
            r7.A00 = r5
            java.lang.Object r0 = X.C25817DsW.A00(r7, r0, r1)
            if (r0 != r6) goto L_0x002c
            return r6
        L_0x00e3:
            kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2 r7 = X.C86164wN.A0n(r8, r4, r3)
            goto L_0x001a
        L_0x00e9:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelona.feed.data.BarcelonaFeedRepository.A01(com.instagram.barcelona.feed.data.BarcelonaFeedRepository, java.lang.Integer, java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    public static final void A02(BarcelonaFeedRepository barcelonaFeedRepository, Integer num, Integer num2, AnonymousClass8s2 r19) {
        Object value;
        Integer num3;
        KtCSuperShape0S0410000_I2 A002;
        Integer num4;
        BarcelonaFeedRepository barcelonaFeedRepository2 = barcelonaFeedRepository;
        C86074wE r2 = barcelonaFeedRepository2.A08;
        do {
            value = r2.getValue();
            KtCSuperShape0S0410000_I2 ktCSuperShape0S0410000_I2 = (KtCSuperShape0S0410000_I2) value;
            Integer num5 = AnonymousClass006.A0C;
            Integer num6 = num2;
            AnonymousClass8s2 r9 = r19;
            if (num == num5) {
                if (num6 == num5) {
                    num4 = AnonymousClass006.A00;
                } else {
                    num4 = (Integer) ((KtCSuperShape0S0410000_I2) barcelonaFeedRepository2.A0A.getValue()).A03;
                }
                A002 = KtCSuperShape0S0410000_I2.A00(ktCSuperShape0S0410000_I2, num4, (Integer) null, num6, r9, 10, false);
            } else {
                if (num6 == num5) {
                    num3 = AnonymousClass006.A00;
                } else {
                    num3 = (Integer) ((KtCSuperShape0S0410000_I2) barcelonaFeedRepository2.A0A.getValue()).A02;
                }
                A002 = KtCSuperShape0S0410000_I2.A00(ktCSuperShape0S0410000_I2, num6, (Integer) null, num3, r9, 10, false);
            }
        } while (!r2.ADi(value, A002));
    }

    public final C37415JrZ A04(String str) {
        Object obj;
        BKU bku;
        Iterator A0q = C86154wM.A0q(this.A01.A00().A00);
        while (A0q.hasNext()) {
            Iterator A0q2 = C86154wM.A0q(((BKS) ((C37415JrZ) A0q.next()).A0O).A00.A00);
            while (true) {
                if (!A0q2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = A0q2.next();
                if (C04220Ms.A0I(((BKU) ((KtCSuperShape0S1420000_I2) obj).A01).A0f.A4Y, str)) {
                    break;
                }
            }
            KtCSuperShape0S1420000_I2 ktCSuperShape0S1420000_I2 = (KtCSuperShape0S1420000_I2) obj;
            if (ktCSuperShape0S1420000_I2 != null && (bku = (BKU) ktCSuperShape0S1420000_I2.A01) != null) {
                return C37415JrZ.A02(bku);
            }
        }
        return null;
    }

    public BarcelonaFeedRepository(Context context, C21839C2o c2o, JSG jsg, UserSession userSession) {
        this.A00 = context;
        this.A05 = userSession;
        this.A04 = c2o;
        C10440iL A002 = C08830eN.A00(userSession);
        this.A0C = A002;
        this.A01 = (C132447tu) userSession.A01(C132447tu.class, new KtLambdaShape32S0100000_I2_12(userSession, 24));
        this.A0B = new C110706m8(context, A002, jsg, userSession);
        this.A03 = AnonymousClass2LT.A00();
        this.A02 = AnonymousClass2LT.A00();
        this.A09 = C18190wL.A0z(AnonymousClass8bW.A01);
        C27457Enn A0z = C18190wL.A0z(new KtCSuperShape0S0410000_I2());
        this.A08 = A0z;
        this.A0A = C18230wP.A0x((C148838sG) null, A0z);
        IDxFlowShape93S0200000_1_I2 A0O = C86154wM.A0O(new KtSLambdaShape6S0200000_I2_1(this, (C146958n9) null, 14), C25239DiK.A00(new KtSLambdaShape4S0401000_I2((Object) this, (C146958n9) null, 23)));
        this.A0D = A0O;
        this.A07 = C25240DiL.A01(C25239DiK.A01(new KtSLambdaShape4S0401000_I2((C146958n9) null, (Object) this, (Object) C25240DiL.A01(C25239DiK.A01(new KtSLambdaShape4S0401000_I2((C146958n9) null, (Object) this, (Object) C25240DiL.A01(C25239DiK.A01(new KtSLambdaShape9S0301000_I2_1((Object) AnonymousClass3LY.A00(userSession), (Object) A0O, (C146958n9) null, 29))), (Object) AnonymousClass3LY.A00(userSession), 25))), (Object) AnonymousClass3LY.A00(userSession), 27)));
    }

    public final Object A05(Integer num, C146958n9 r6) {
        Integer num2;
        int intValue = num.intValue();
        if (intValue == 1 || intValue == 3) {
            num2 = AnonymousClass006.A00;
        } else {
            num2 = AnonymousClass006.A0C;
        }
        AnonymousClass3V6 r3 = this.A03;
        KtSLambdaShape8S0401000_I2 ktSLambdaShape8S0401000_I2 = new KtSLambdaShape8S0401000_I2(this, num, num2, (C146958n9) null);
        Unit unit = Unit.A00;
        Object A002 = r3.A00(unit, r6, ktSLambdaShape8S0401000_I2);
        if (A002 != D0E.COROUTINE_SUSPENDED) {
            return unit;
        }
        return A002;
    }
}
