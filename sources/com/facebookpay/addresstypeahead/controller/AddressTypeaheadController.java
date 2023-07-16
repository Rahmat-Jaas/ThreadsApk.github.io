package com.facebookpay.addresstypeahead.controller;

import X.AnonymousClass000;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass7Ja;
import X.AnonymousClass7Kz;
import X.AnonymousClass8bH;
import X.AnonymousClass8bb;
import X.C04220Ms;
import X.C146958n9;
import X.C148798sC;
import X.C148838sG;
import X.C148848sH;
import X.C18190wL;
import X.C18210wN;
import X.C25235DiG;
import X.C25237DiI;
import X.C27952Ew2;
import X.C83224qz;
import X.C86074wE;
import X.C86164wN;
import X.C880856r;
import X.DIV;
import X.M5J;
import com.facebook.pando.TreeJNI;
import com.facebookpay.addresstypeahead.repositoryimpl.AddressTypeaheadRepositoryImpl;
import com.fbpay.logging.LoggingContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AddressTypeaheadController {
    public String A00;
    public C148838sG A01;
    public boolean A02;
    public final M5J A03;
    public final M5J A04;
    public final C880856r A05;
    public final AddressTypeaheadRepositoryImpl A06 = AnonymousClass7Kz.A05().A00;
    public final LoggingContext A07;
    public final AnonymousClass0ZU A08;
    public final AnonymousClass0YY A09;
    public final C83224qz A0A;
    public final C86074wE A0B;
    public final C880856r A0C;

    public AddressTypeaheadController(LoggingContext loggingContext, AnonymousClass0ZU r7, AnonymousClass0YY r8) {
        this.A07 = loggingContext;
        this.A09 = r8;
        this.A08 = r7;
        C880856r A032 = C880856r.A03();
        this.A0C = A032;
        this.A04 = A032;
        C880856r A033 = C880856r.A03();
        this.A05 = A033;
        this.A03 = A033;
        AnonymousClass8bb r4 = new AnonymousClass8bb((C148838sG) null);
        C148848sH AOA = AnonymousClass7Kz.A0H().A00.A00.AHN(568, 3).AOA(C148798sC.A00);
        C04220Ms.A0C(AOA, AnonymousClass000.A00(1021));
        C83224qz A034 = AnonymousClass7Ja.A03(C25235DiG.A01(r4, AOA));
        this.A0A = A034;
        this.A0B = C18190wL.A0z(DIV.A01);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C86164wN.A0o(this, (C146958n9) null, 32), A034, 3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v47, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v46 */
    /* JADX WARNING: type inference failed for: r0v51, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r0v56 */
    /* JADX WARNING: type inference failed for: r0v57 */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d9, code lost:
        if (r12 == r9) goto L_0x0160;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0270  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebookpay.addresstypeahead.controller.AddressTypeaheadController r19, java.lang.String r20, java.lang.String r21, X.C146958n9 r22) {
        /*
            r5 = r19
            r6 = r20
            r3 = 14
            r7 = r22
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2.A00(r3, r7)
            if (r0 == 0) goto L_0x01dc
            r4 = r7
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = (kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x01dc
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001c:
            java.lang.Object r2 = r4.A03
            X.D0E r9 = X.D0E.COROUTINE_SUSPENDED
            r8 = r9
            r15 = r9
            int r0 = r4.A00
            r7 = 1
            if (r0 == 0) goto L_0x00e0
            if (r0 != r7) goto L_0x026b
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r4.A01
            com.facebookpay.addresstypeahead.controller.AddressTypeaheadController r5 = (com.facebookpay.addresstypeahead.controller.AddressTypeaheadController) r5
            X.AnonymousClass0OU.A00(r2)
        L_0x0034:
            X.7Kx r2 = (X.AnonymousClass7Kx) r2
            boolean r0 = X.AnonymousClass7Kx.A0R(r2)
            if (r0 == 0) goto L_0x0270
            java.lang.Object r3 = r2.A01
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x0239
            java.lang.Class<com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl$FetchAddressSuggestions$Suggestions> r2 = com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl.FetchAddressSuggestions.Suggestions.class
            java.lang.String r1 = "suggestions"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r1, r2)
            if (r0 == 0) goto L_0x0239
            boolean r0 = X.C18250wR.A1K(r0)
            if (r0 != r7) goto L_0x0239
            X.56r r7 = r5.A0C
            java.util.ArrayList r4 = X.AnonymousClass0wJ.A0v()
            com.google.common.collect.ImmutableList r0 = X.C18230wP.A0P(r3, r2, r1)
            java.util.ArrayList r10 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r16 = r0.iterator()
            r21 = 0
        L_0x0066:
            boolean r1 = r16.hasNext()
            r0 = 0
            if (r1 == 0) goto L_0x01e3
            java.lang.Object r9 = r16.next()
            int r15 = r21 + 1
            if (r21 >= 0) goto L_0x0079
            X.C06750aI.A1A()
            throw r0
        L_0x0079:
            com.facebook.pando.TreeJNI r9 = (com.facebook.pando.TreeJNI) r9
            java.lang.Class<com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl$FetchAddressSuggestions$Suggestions$MainText> r2 = com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl.FetchAddressSuggestions.Suggestions.MainText.class
            java.lang.String r1 = "main_text"
            com.facebook.pando.TreeJNI r1 = r9.getTreeValue(r1, r2)
            if (r1 == 0) goto L_0x00da
            java.lang.Class<com.facebook.graphql.impls.TypeaheadMatchedStringImpl> r13 = com.facebook.graphql.impls.TypeaheadMatchedStringImpl.class
            com.facebook.pando.TreeJNI r2 = r1.reinterpret(r13)
            if (r2 == 0) goto L_0x00da
            java.lang.String r11 = "value"
            java.lang.String r12 = r2.getStringValue(r11)
            if (r12 == 0) goto L_0x00da
            java.lang.Class<com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl$FetchAddressSuggestions$Suggestions$SecondaryText> r8 = com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl.FetchAddressSuggestions.Suggestions.SecondaryText.class
            java.lang.String r1 = "secondary_text"
            com.facebook.pando.TreeJNI r1 = r9.getTreeValue(r1, r8)
            if (r1 == 0) goto L_0x00dd
            com.facebook.pando.TreeJNI r14 = r1.reinterpret(r13)
            if (r14 == 0) goto L_0x00de
            java.lang.String r11 = r14.getStringValue(r11)
        L_0x00a9:
            java.lang.Class<com.facebook.graphql.impls.TypeaheadMatchedStringImpl$MatchedSubstring> r13 = com.facebook.graphql.impls.TypeaheadMatchedStringImpl.MatchedSubstring.class
            java.lang.String r8 = "matched_substring"
            com.google.common.collect.ImmutableList r1 = X.C18230wP.A0P(r2, r13, r8)
            java.util.List r2 = A01(r1)
            if (r14 == 0) goto L_0x00c1
            com.google.common.collect.ImmutableList r1 = r14.getTreeList(r8, r13)
            if (r1 == 0) goto L_0x00c1
            java.util.List r0 = A01(r1)
        L_0x00c1:
            X.5hw r1 = new X.5hw
            r1.<init>(r12, r11, r2, r0)
            r22 = 0
            kotlin.jvm.internal.KtLambdaShape5S1201000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape5S1201000_I2
            r19 = r9
            r20 = r6
            r17 = r0
            r18 = r5
            r17.<init>(r18, r19, r20, r21, r22)
            r1.A00 = r0
            r10.add(r1)
        L_0x00da:
            r21 = r15
            goto L_0x0066
        L_0x00dd:
            r14 = r0
        L_0x00de:
            r11 = r0
            goto L_0x00a9
        L_0x00e0:
            X.AnonymousClass0OU.A00(r2)
            boolean r0 = X.AnonymousClass8bQ.A0n(r6)
            if (r0 == 0) goto L_0x00f2
            X.56r r1 = r5.A0C
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            r1.A0G(r0)
            goto L_0x0299
        L_0x00f2:
            X.7ke r0 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r2 = r5.A07
            r10 = 0
            java.lang.String r3 = "address_typeahead"
            X.09x r1 = r0.A00
            java.lang.String r0 = "client_load_ecpaddresstypeahead_init"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 270(0x10e, float:3.78E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 23
            X.C128957ke.A03(r1, r2, r10, r3, r0)
            com.facebookpay.addresstypeahead.repositoryimpl.AddressTypeaheadRepositoryImpl r11 = r5.A06
            java.lang.String r14 = r5.A00
            if (r14 != 0) goto L_0x011a
            java.lang.String r14 = X.C18230wP.A0h()
            r5.A00 = r14
        L_0x011a:
            X.C18240wQ.A1I(r14)
            java.lang.String r3 = r2.A02
            long r0 = r2.A00
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r0 = 3
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r0)
            r1 = r21
            X.AnonymousClass0wJ.A1M(r6, r7, r1)
            X.C04220Ms.A0B(r14, r0)
            X.C86124wJ.A1S(r5, r6, r4, r7)
            r12 = 19
            boolean r0 = kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2.A00(r12, r4)
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = "i2"
            java.lang.NullPointerException r0 = X.C18210wN.A0W(r0)
            throw r0
        L_0x0145:
            kotlin.coroutines.jvm.internal.KtCImplShape2S0201000_I2 r4 = X.C86114wI.A0x(r11, r4, r12)
            java.lang.Object r12 = r4.A01
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0164
            if (r0 != r7) goto L_0x029c
            X.AnonymousClass0OU.A00(r12)
        L_0x0154:
            X.7EC r12 = (X.AnonymousClass7EC) r12
            X.7Kx r1 = r12.A02()
            X.7SS r0 = X.AnonymousClass7SS.A00
            X.7Kx r9 = X.AnonymousClass7Kx.A02(r0, r1)
        L_0x0160:
            r2 = r9
            if (r9 != r8) goto L_0x0034
            return r15
        L_0x0164:
            X.AnonymousClass0OU.A00(r12)
            X.75F r11 = r11.A01
            r4.A00 = r7
            java.lang.Class<X.6x9> r12 = X.C116546x9.class
            java.lang.String r0 = "create"
            java.lang.Object r12 = X.C86114wI.A0g(r10, r12, r0)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x02a1 }
            X.7fC r12 = (X.C126407fC) r12     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x02a1 }
            X.3zb r10 = r12.A00
            java.lang.String r0 = "query_input"
            r10.A05(r0, r6)
            r12.A05 = r7
            java.lang.String r0 = "country"
            r10.A05(r0, r1)
            r12.A03 = r7
            X.3zb r1 = r12.A01
            java.lang.String r0 = X.AnonymousClass7C6.A00()
            r1.A05(r0, r14)
            r12.A06 = r7
            java.lang.String r0 = "upl_session_id"
            r1.A05(r0, r3)
            r12.A07 = r7
            java.lang.String r0 = "payment_product_id"
            r1.A05(r0, r2)
            boolean r0 = X.AnonymousClass0wJ.A1W(r2)
            r12.A04 = r0
            X.0Oa r0 = X.C550231j.A01
            java.lang.Object r0 = r0.getValue()
            double r2 = X.C86124wJ.A00(r0)
            java.lang.Double r1 = new java.lang.Double
            r1.<init>(r2)
            java.lang.String r0 = "attribution_icon_scale"
            r10.A04(r0, r1)
            r12.A02 = r7
            r0 = 989(0x3dd, float:1.386E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.A04(r0, r13)
            X.8mD r1 = r12.build()
            X.6p4 r0 = X.AnonymousClass75F.A01
            X.C04220Ms.A06(r1)
            r0.A00(r1)
            X.0Oa r0 = r11.A00
            java.lang.Object r0 = r0.getValue()
            com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor r0 = (com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor) r0
            java.lang.Object r12 = r0.A00(r1, r4)
            if (r12 != r9) goto L_0x0154
            goto L_0x0160
        L_0x01dc:
            kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2 r4 = new kotlin.coroutines.jvm.internal.KtCImplShape0S0401000_I2
            r4.<init>(r5, r7, r3)
            goto L_0x001c
        L_0x01e3:
            r4.addAll(r10)
            java.lang.Class<com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl$FetchAddressSuggestions$Attribution> r11 = com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl.FetchAddressSuggestions.Attribution.class
            java.lang.String r10 = "attribution"
            com.facebook.pando.TreeJNI r8 = r3.getTreeValue(r10, r11)
            if (r8 == 0) goto L_0x0269
            java.lang.Class<com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl$FetchAddressSuggestions$Attribution$IconLight> r2 = com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl.FetchAddressSuggestions.Attribution.IconLight.class
            java.lang.String r1 = "icon_light(scale:$attribution_icon_scale)"
            com.facebook.pando.TreeJNI r2 = r8.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0269
            java.lang.Class<com.facebook.graphql.impls.TypeaheadAttributionIconImpl> r1 = com.facebook.graphql.impls.TypeaheadAttributionIconImpl.class
            com.facebook.pando.TreeJNI r2 = r2.reinterpret(r1)
            if (r2 == 0) goto L_0x0269
            java.lang.String r1 = "uri"
            java.lang.String r9 = r2.getStringValue(r1)
        L_0x0208:
            com.facebook.pando.TreeJNI r8 = r3.getTreeValue(r10, r11)
            if (r8 == 0) goto L_0x0226
            java.lang.Class<com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl$FetchAddressSuggestions$Attribution$IconDark> r2 = com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl.FetchAddressSuggestions.Attribution.IconDark.class
            java.lang.String r1 = "icon_dark(scale:$attribution_icon_scale)"
            com.facebook.pando.TreeJNI r2 = r8.getTreeValue(r1, r2)
            if (r2 == 0) goto L_0x0226
            java.lang.Class<com.facebook.graphql.impls.TypeaheadAttributionIconImpl> r1 = com.facebook.graphql.impls.TypeaheadAttributionIconImpl.class
            com.facebook.pando.TreeJNI r1 = r2.reinterpret(r1)
            if (r1 == 0) goto L_0x0226
            java.lang.String r0 = "uri"
            java.lang.String r0 = r1.getStringValue(r0)
        L_0x0226:
            X.5hv r2 = new X.5hv
            r2.<init>(r9, r0)
            r1 = 2
            kotlin.jvm.internal.KtLambdaShape5S1200000_I2 r0 = new kotlin.jvm.internal.KtLambdaShape5S1200000_I2
            r0.<init>(r4, r5, r6, r1)
            r2.A00 = r0
            r4.add(r2)
            r7.A0G(r4)
        L_0x0239:
            X.7ke r2 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r5 = r5.A07
            if (r3 == 0) goto L_0x0267
            java.lang.Class<com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl$FetchAddressSuggestions$Suggestions> r1 = com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl.FetchAddressSuggestions.Suggestions.class
            java.lang.String r0 = "suggestions"
            com.google.common.collect.ImmutableList r0 = r3.getTreeList(r0, r1)
            if (r0 == 0) goto L_0x0267
            int r8 = r0.size()
        L_0x024f:
            r6 = 0
            java.lang.String r7 = "address_typeahead"
            r9 = 0
            X.09x r1 = r2.A00
            java.lang.String r0 = "client_load_ecpaddresstypeahead_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 271(0x10f, float:3.8E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            kotlin.jvm.internal.KtLambdaShape6S1201000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape6S1201000_I2
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0296
        L_0x0267:
            r8 = 0
            goto L_0x024f
        L_0x0269:
            r9 = r0
            goto L_0x0208
        L_0x026b:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x0270:
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r5 = r5.A07
            java.lang.Throwable r0 = r2.A02
            java.util.LinkedHashMap r3 = X.C18220wO.A0y()
            X.C86114wI.A1P(r0, r3)
            java.lang.String r2 = "address_typeahead"
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_ecpaddresstypeahead_fail"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 269(0x10d, float:3.77E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 22
            kotlin.jvm.internal.KtLambdaShape3S1200000_I2 r4 = new kotlin.jvm.internal.KtLambdaShape3S1200000_I2
            r4.<init>(r5, r3, r2, r0)
        L_0x0296:
            X.C128957ke.A04(r1, r5, r4)
        L_0x0299:
            kotlin.Unit r15 = kotlin.Unit.A00
            return r15
        L_0x029c:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0a()
            throw r0
        L_0x02a1:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C86114wI.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.addresstypeahead.controller.AddressTypeaheadController.A00(com.facebookpay.addresstypeahead.controller.AddressTypeaheadController, java.lang.String, java.lang.String, X.8n9):java.lang.Object");
    }

    public static final List A01(List list) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TreeJNI A0G = C18210wN.A0G(it);
            if (A0G.getIntValue("length") > 0) {
                A0v.add(AnonymousClass8bH.A02(A0G.getIntValue("offset"), (A0G.getIntValue("offset") + A0G.getIntValue("length")) - 1));
            }
        }
        return A0v;
    }
}
