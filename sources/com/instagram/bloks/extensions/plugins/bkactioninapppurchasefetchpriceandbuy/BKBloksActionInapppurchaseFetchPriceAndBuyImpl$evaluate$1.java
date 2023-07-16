package com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy;

import X.AnonymousClass0YP;
import X.AnonymousClass601;
import X.C107866hR;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy.BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1", f = "BKBloksActionInapppurchaseFetchPriceAndBuyImpl.kt", i = {1}, l = {85, 98, 130}, m = "invokeSuspend", n = {"inAppPurchasesController"}, s = {"L$0"})
public final class BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public final /* synthetic */ C107866hR A02;
    public final /* synthetic */ AnonymousClass601 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ Map A0A;
    public final /* synthetic */ Map A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1(C107866hR r2, AnonymousClass601 r3, String str, String str2, String str3, String str4, List list, List list2, Map map, Map map2, C146958n9 r12) {
        super(2, r12);
        this.A03 = r3;
        this.A07 = str;
        this.A0A = map;
        this.A04 = str2;
        this.A0B = map2;
        this.A02 = r2;
        this.A08 = list;
        this.A09 = list2;
        this.A06 = str3;
        this.A05 = str4;
    }

    public final C146958n9 create(Object obj, C146958n9 r14) {
        AnonymousClass601 r2 = this.A03;
        String str = this.A07;
        Map map = this.A0A;
        String str2 = this.A04;
        Map map2 = this.A0B;
        return new BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1(this.A02, r2, str, str2, this.A06, this.A05, this.A08, this.A09, map, map2, r14);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d1, code lost:
        if (X.C04220Ms.A0I(r10, "FETCH_PRICE") != false) goto L_0x01b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r10 = r27
            X.D0E r3 = X.D0E.COROUTINE_SUSPENDED
            r4 = r26
            int r7 = r4.A00
            java.lang.String r6 = "FETCH_PRICE_AND_BUY"
            java.lang.String r0 = "FETCH_PRICE"
            r5 = 3
            r1 = 2
            r8 = 1
            java.lang.String r2 = "status"
            if (r7 == 0) goto L_0x003e
            if (r7 == r8) goto L_0x00ea
            if (r7 == r1) goto L_0x018c
            X.AnonymousClass0OU.A00(r10)
        L_0x001a:
            boolean r0 = X.AnonymousClass0wJ.A1X(r10)
            java.util.Map r1 = r4.A0B
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "PURCHASE_SUCCESS"
        L_0x0024:
            r1.put(r2, r0)
        L_0x0027:
            X.6hR r3 = r4.A02
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.6jp r2 = r3.A01
            X.3iY r1 = X.C86114wI.A0V(r1)
            X.601 r0 = r3.A00
            X.C61043Rr.A00(r0, r1, r2)
        L_0x0038:
            kotlin.Unit r3 = kotlin.Unit.A00
            return r3
        L_0x003b:
            java.lang.String r0 = "PURCHASE_FAILURE"
            goto L_0x0024
        L_0x003e:
            X.AnonymousClass0OU.A00(r10)
            X.601 r9 = r4.A03
            r7 = 0
            X.C04220Ms.A0B(r9, r7)
            androidx.fragment.app.FragmentActivity r12 = X.C63913ic.A05(r9)
            X.0i6 r13 = X.C63913ic.A0F(r9)
            java.lang.String r9 = r4.A07
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r11 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2
            r11.<init>(r9, r8)
            java.util.Map r10 = r4.A0A
            java.lang.String r9 = "app_name"
            java.lang.String r14 = X.C18220wO.A0r(r9, r10)
            if (r14 != 0) goto L_0x0062
            java.lang.String r14 = ""
        L_0x0062:
            X.C04220Ms.A0B(r12, r8)
            X.C04220Ms.A0B(r13, r1)
            r15 = 7
            kotlin.jvm.internal.KtLambdaShape4S1300000_I2 r10 = new kotlin.jvm.internal.KtLambdaShape4S1300000_I2
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.Class<X.7tF> r9 = X.C132057tF.class
            java.lang.Object r11 = r13.A01(r9, r10)
            X.7tF r11 = (X.C132057tF) r11
            java.lang.String r10 = r4.A04
            java.util.Map r9 = r4.A0B
            r4.A00 = r8
            boolean r8 = r11.A03
            java.lang.String r16 = "params"
            r15 = 0
            if (r8 == 0) goto L_0x009a
            java.lang.String r12 = r11.A02
            java.lang.String r8 = r11.A07
            boolean r8 = X.C04220Ms.A0I(r12, r8)
            if (r8 == 0) goto L_0x009a
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r12 = r11.A00
            if (r12 == 0) goto L_0x00b3
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r8 = r11.A05
            if (r12 != r8) goto L_0x009a
            X.E1T r10 = r11.A01
        L_0x0097:
            if (r10 != r3) goto L_0x00ed
            return r3
        L_0x009a:
            java.lang.String r8 = r11.A07
            r11.A02 = r8
            r11.A03 = r7
            X.E1T r8 = r11.A01
            if (r8 == 0) goto L_0x00a9
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase r8 = r8.A00
            r8.A0C()
        L_0x00a9:
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r8 = r11.A05
            r11.A00 = r8
            X.6o4 r12 = X.C111636o4.A00
            if (r12 != 0) goto L_0x00b7
            java.lang.String r16 = "plugin"
        L_0x00b3:
            X.C04220Ms.A0E(r16)
            throw r15
        L_0x00b7:
            com.instagram.service.session.UserSession r8 = r11.A06
            X.E1T r8 = r12.A00(r8)
            r11.A01 = r8
            X.EnC r17 = X.C18220wO.A11(r4)
            X.Jil r12 = X.C37010Jil.A00()
            X.E1T r14 = r11.A01
            X.C04220Ms.A0A(r14)
            androidx.fragment.app.FragmentActivity r13 = r11.A04
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1000000_I2 r8 = r11.A00
            if (r8 == 0) goto L_0x00b3
            X.Gh5 r8 = r14.A00(r13, r8)
            com.facebook.redex.IDxConsumerShape9S1300000_2_I2 r14 = new com.facebook.redex.IDxConsumerShape9S1300000_2_I2
            r19 = r7
            r18 = r10
            r16 = r9
            r15 = r11
            r14.<init>(r15, r16, r17, r18, r19)
            r12.A02(r14, r8)
            java.lang.Object r10 = r17.A0B()
            goto L_0x0097
        L_0x00ea:
            X.AnonymousClass0OU.A00(r10)
        L_0x00ed:
            r8 = r10
            X.E1T r8 = (X.E1T) r8
            if (r8 != 0) goto L_0x0107
            X.6hR r3 = r4.A02
            java.util.Map r1 = r4.A0B
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.6jp r2 = r3.A01
            X.3iY r1 = X.C86114wI.A0V(r1)
            X.601 r0 = r3.A00
            X.C61043Rr.A00(r0, r1, r2)
            goto L_0x0038
        L_0x0107:
            java.lang.String r10 = r4.A04
            boolean r7 = X.C04220Ms.A0I(r10, r0)
            if (r7 != 0) goto L_0x0115
            boolean r7 = X.C04220Ms.A0I(r10, r6)
            if (r7 == 0) goto L_0x01d4
        L_0x0115:
            java.util.Map r15 = r4.A0B
            java.util.List r11 = r4.A08
            java.util.List r14 = r4.A09
            r4.A01 = r8
            r4.A00 = r1
            int r9 = r11.size()
            int r7 = r14.size()
            if (r9 == r7) goto L_0x012e
            java.lang.String r10 = "SIZE_MISMATCH"
        L_0x012b:
            if (r10 != r3) goto L_0x0193
            return r3
        L_0x012e:
            java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            r7 = 0
            java.util.Iterator r16 = r11.iterator()
        L_0x013b:
            boolean r11 = r16.hasNext()
            if (r11 == 0) goto L_0x015f
            java.lang.Object r13 = r16.next()
            int r12 = r7 + 1
            if (r7 >= 0) goto L_0x014e
            X.C06750aI.A1A()
            r15 = 0
            throw r15
        L_0x014e:
            X.68V r11 = X.AnonymousClass68V.ITEM_TYPE_SUBS
            java.lang.Object r7 = r14.get(r7)
            if (r13 != r11) goto L_0x015b
            r10.add(r7)
        L_0x0159:
            r7 = r12
            goto L_0x013b
        L_0x015b:
            r9.add(r7)
            goto L_0x0159
        L_0x015f:
            boolean r7 = r10.isEmpty()
            r13 = 1
            r7 = r7 ^ 1
            r12 = 0
            if (r7 == 0) goto L_0x018a
            com.google.common.collect.ImmutableList r11 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r10)
        L_0x016d:
            boolean r7 = X.C18250wR.A1K(r9)
            if (r7 == 0) goto L_0x0177
            com.google.common.collect.ImmutableList r12 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r9)
        L_0x0177:
            X.EnC r10 = X.C18220wO.A11(r4)
            com.facebook.redex.IDxQListenerShape138S0300000_2_I2 r9 = new com.facebook.redex.IDxQListenerShape138S0300000_2_I2
            r9.<init>(r13, r14, r15, r10)
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerBase r7 = r8.A00
            r7.A0D(r9, r12, r11)
            java.lang.Object r10 = r10.A0B()
            goto L_0x012b
        L_0x018a:
            r11 = r12
            goto L_0x016d
        L_0x018c:
            java.lang.Object r8 = r4.A01
            X.E1T r8 = (X.E1T) r8
            X.AnonymousClass0OU.A00(r10)
        L_0x0193:
            java.lang.String r9 = "SIZE_MISMATCH"
            boolean r7 = X.C04220Ms.A0I(r10, r9)
            if (r7 == 0) goto L_0x01a2
            java.util.Map r1 = r4.A0B
            r1.put(r2, r9)
            goto L_0x0027
        L_0x01a2:
            java.util.Map r9 = r4.A0B
            java.lang.String r7 = "product_status"
            java.lang.Object r10 = r9.get(r7)
            java.lang.String r7 = "AVAILABLE"
            boolean r7 = X.C04220Ms.A0I(r10, r7)
            if (r7 != 0) goto L_0x01c6
            java.lang.String r0 = "ERROR_IN_FETCH"
            r9.put(r2, r0)
        L_0x01b7:
            X.6hR r0 = r4.A02
            X.6jp r2 = r0.A01
            X.3iY r1 = X.C86114wI.A0V(r9)
            X.601 r0 = r0.A00
            X.C61043Rr.A00(r0, r1, r2)
            goto L_0x0038
        L_0x01c6:
            java.lang.String r7 = "FETCHED"
            r9.put(r2, r7)
            java.lang.String r10 = r4.A04
            boolean r0 = X.C04220Ms.A0I(r10, r0)
            if (r0 == 0) goto L_0x01d4
            goto L_0x01b7
        L_0x01d4:
            java.lang.String r0 = "BUY"
            boolean r0 = X.C04220Ms.A0I(r10, r0)
            if (r0 != 0) goto L_0x01e2
            boolean r0 = X.C04220Ms.A0I(r10, r6)
            if (r0 == 0) goto L_0x0038
        L_0x01e2:
            X.601 r6 = r4.A03
            java.util.Map r0 = r4.A0B
            r25 = r0
            java.util.List r0 = r4.A08
            java.lang.Object r11 = X.AnonymousClass00J.A0C(r0)
            X.68V r11 = (X.AnonymousClass68V) r11
            java.util.List r0 = r4.A09
            java.lang.Object r10 = X.AnonymousClass00J.A0C(r0)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r0 = r4.A06
            r17 = r0
            java.lang.String r12 = r4.A05
            java.util.Map r0 = r4.A0A
            r9 = 0
            r4.A01 = r9
            r4.A00 = r5
            r7 = 0
            X.C04220Ms.A0B(r0, r7)
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r0)
            java.lang.String r5 = "product_id"
            r0 = r17
            r13.put(r5, r0)
            java.lang.String r0 = "payee_id"
            r13.put(r0, r12)
            X.EnC r16 = X.C86104wH.A17(r4)
            X.C04220Ms.A0B(r6, r7)
            androidx.fragment.app.FragmentActivity r7 = X.C63913ic.A05(r6)
            X.Kq4 r14 = X.C36975Ji8.A03
            X.76V r15 = r14.A02
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.0FL r5 = X.C86154wM.A16(r0)
            X.0FL r0 = X.C86154wM.A16(r0)
            X.0AD r0 = X.C03970Ls.A01(r6, r5, r0)
            X.0JX r12 = r0.A03
            java.util.List r6 = r0.A01
            X.0AD r5 = r0.A02
            X.0AD r0 = new X.0AD
            r0.<init>(r6, r5, r12, r1)
            X.8sP r0 = X.AnonymousClass72C.A00(r0, r15)
            java.lang.String r20 = r14.A01(r13, r0)
            r24 = 2024(0x7e8, float:2.836E-42)
            X.CJj r6 = new X.CJj
            r19 = r10
            r21 = r17
            r22 = r9
            r23 = r9
            r17 = r6
            r18 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            X.7gW r5 = new X.7gW
            r1 = r25
            r0 = r16
            r5.<init>(r1, r0)
            r8.BaP(r7, r6, r5, r9)
            java.lang.Object r10 = r16.A0B()
            if (r10 != r3) goto L_0x001a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bloks.extensions.plugins.bkactioninapppurchasefetchpriceandbuy.BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BKBloksActionInapppurchaseFetchPriceAndBuyImpl$evaluate$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
