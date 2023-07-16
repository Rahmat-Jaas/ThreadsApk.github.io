package X;

import java.util.Locale;

/* renamed from: X.7ka  reason: invalid class name and case insensitive filesystem */
public final class C128917ka implements C143688h9 {
    public final C021209x A00;
    public final AnonymousClass286 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x046a, code lost:
        if (X.AnonymousClass0wJ.A1U(r15) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x046c, code lost:
        r15.A0T(r58, r57);
        X.C86104wH.A1G(X.AnonymousClass6BP.A0E, r15);
        X.C86114wI.A1C(r15, r2);
        r15.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x047e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02f6, code lost:
        if (X.AnonymousClass0wJ.A1U(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02f8, code lost:
        r1.A0T(r58, r57);
        X.C86104wH.A1G(X.AnonymousClass6BP.A0E, r1);
        X.C86114wI.A1C(r1, r10);
        r1.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x030a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0368, code lost:
        if (X.AnonymousClass0wJ.A1U(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x036a, code lost:
        r1.A0T(r58, r57);
        X.C86104wH.A1G(X.AnonymousClass6BP.A0E, r1);
        X.C86114wI.A1C(r1, r10);
        r1.Bb4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x037c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bb8(java.lang.String r61, java.util.Map r62) {
        /*
            r60 = this;
            r0 = 0
            r1 = r61
            X.C04220Ms.A0B(r1, r0)
            java.lang.String r59 = "Required value was null."
            r14 = r62
            if (r62 == 0) goto L_0x04cd
            r3 = 9
            r2 = 10
            r0 = 62
            java.lang.String r58 = X.AnonymousClass3QB.A00(r3, r2, r0)
            r0 = r58
            java.lang.Object r57 = r14.get(r0)
            if (r57 == 0) goto L_0x04c8
            r0 = r57
            java.lang.String r0 = (java.lang.String) r0
            r57 = r0
            java.lang.String r0 = "financial_entity_id"
            java.lang.String r13 = X.C18210wN.A0g(r0, r14)
            java.lang.String r12 = "managed_merchant_account_id"
            java.lang.String r11 = X.C18210wN.A0g(r12, r14)
            java.lang.String r0 = "view_name"
            java.lang.String r2 = X.C18220wO.A0r(r0, r14)
            if (r2 == 0) goto L_0x047f
            java.lang.String r10 = X.C86114wI.A0o(r2)
        L_0x003c:
            java.lang.String r9 = "batch_item_id"
            java.lang.String r8 = X.C18220wO.A0r(r9, r14)
            java.lang.String r56 = "payout_status"
            r2 = r56
            java.lang.String r55 = X.C18210wN.A0g(r2, r14)
            java.lang.String r54 = "target_name"
            r2 = r54
            java.lang.String r53 = X.C18210wN.A0g(r2, r14)
            java.lang.String r2 = "ref"
            java.lang.String r52 = X.C18210wN.A0g(r2, r14)
            java.lang.String r7 = "payout_record_id"
            java.lang.String r6 = X.C18210wN.A0g(r7, r14)
            java.lang.String r2 = "filter_type"
            java.lang.String r51 = X.C18210wN.A0g(r2, r14)
            java.lang.String r50 = "start_cursor"
            r2 = r50
            java.lang.String r5 = X.C18210wN.A0g(r2, r14)
            java.lang.String r49 = "end_cursor"
            r2 = r49
            java.lang.String r4 = X.C18210wN.A0g(r2, r14)
            java.lang.String r48 = "has_next_page"
            r2 = r48
            java.lang.Object r3 = r14.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.String r47 = "target_url"
            r2 = r47
            java.lang.String r46 = X.C18210wN.A0g(r2, r14)
            java.lang.String r45 = "notification_identifier"
            r2 = r45
            java.lang.String r44 = X.C18210wN.A0g(r2, r14)
            java.lang.String r43 = "notification_source"
            r2 = r43
            java.lang.String r42 = X.C18210wN.A0g(r2, r14)
            java.lang.String r41 = "cta_text"
            r2 = r41
            java.lang.String r40 = X.C18210wN.A0g(r2, r14)
            java.lang.String r39 = "cta_uri"
            r2 = r39
            java.lang.String r38 = X.C18210wN.A0g(r2, r14)
            java.lang.String r37 = "cta_title"
            r2 = r37
            java.lang.String r36 = X.C18210wN.A0g(r2, r14)
            java.lang.String r35 = "notification_id_list"
            r2 = r35
            java.lang.Object r34 = r14.get(r2)
            r2 = r34
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r34 = r2
            java.lang.String r33 = "holds_list"
            r2 = r33
            java.lang.Object r32 = r14.get(r2)
            r2 = r32
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r32 = r2
            java.lang.String r31 = "error_message"
            r2 = r31
            java.lang.String r30 = X.C18220wO.A0r(r2, r14)
            java.lang.String r29 = "exception_class"
            r2 = r29
            java.lang.String r28 = X.C18220wO.A0r(r2, r14)
            java.lang.String r27 = "error_stacktrace"
            r2 = r27
            java.lang.String r18 = X.C18210wN.A0g(r2, r14)
            java.lang.String r2 = "endpoint"
            java.lang.String r2 = X.C18220wO.A0r(r2, r14)
            java.lang.String r26 = "earning_summary"
            r15 = r26
            java.lang.Object r25 = r14.get(r15)
            r15 = r25
            java.util.Map r15 = (java.util.Map) r15
            r25 = r15
            java.lang.String r24 = "earning_summary_breakdown"
            r15 = r24
            java.lang.Object r23 = r14.get(r15)
            r15 = r23
            java.util.Map r15 = (java.util.Map) r15
            r23 = r15
            java.lang.String r22 = "payout_summary"
            r15 = r22
            java.lang.Object r21 = r14.get(r15)
            r15 = r21
            java.util.Map r15 = (java.util.Map) r15
            r21 = r15
            java.lang.String r15 = "transactions_id_list"
            java.lang.Object r20 = r14.get(r15)
            r15 = r20
            java.util.Map r15 = (java.util.Map) r15
            r20 = r15
            java.lang.String r15 = "financial_entities_id_list"
            java.lang.Object r19 = r14.get(r15)
            r15 = r19
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            r19 = r15
            java.lang.String r17 = "is_valid"
            r15 = r17
            java.lang.Object r15 = r14.get(r15)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            int r16 = r1.hashCode()
            r14 = r60
            switch(r16) {
                case -559811674: goto L_0x013e;
                case -552250925: goto L_0x01ad;
                case -552149051: goto L_0x01d2;
                case 201917415: goto L_0x0225;
                case 202019289: goto L_0x0297;
                case 375891437: goto L_0x030b;
                case 1131924782: goto L_0x033a;
                case 1587016346: goto L_0x037d;
                default: goto L_0x013d;
            }
        L_0x013d:
            return
        L_0x013e:
            java.lang.String r2 = "user_click_payouthub_atomic"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x013d
            if (r53 == 0) goto L_0x0482
            X.09x r1 = r14.A00
            X.0A2 r2 = X.C86104wH.A0K(r1, r2)
            r1 = 2851(0xb23, float:3.995E-42)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r15 = X.C18180wK.A0I(r2, r1)
            r2 = r54
            r1 = r53
            X.5DS r2 = A01(r14, r2, r1, r13)
            A03(r2, r11, r12)
            A03(r2, r8, r9)
            A03(r2, r6, r7)
            A02(r2, r10, r0)
            if (r51 == 0) goto L_0x0181
            int r0 = r51.length()
            if (r0 == 0) goto L_0x0181
            java.util.Locale r1 = java.util.Locale.ROOT
            r0 = r51
            java.lang.String r0 = X.C18220wO.A0u(r1, r0)
            X.27T r1 = X.AnonymousClass27T.valueOf(r0)
            java.lang.String r0 = "transaction_filter_type"
            r2.A04(r1, r0)
        L_0x0181:
            r1 = r46
            r0 = r47
            A02(r2, r1, r0)
            r1 = r44
            r0 = r45
            A02(r2, r1, r0)
            r1 = r42
            r0 = r43
            A02(r2, r1, r0)
            r1 = r40
            r0 = r41
            A02(r2, r1, r0)
            r1 = r38
            r0 = r39
            A02(r2, r1, r0)
            r1 = r36
            r0 = r37
            A02(r2, r1, r0)
            goto L_0x0466
        L_0x01ad:
            java.lang.String r2 = "client_load_payouthub_fail"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x013d
            if (r10 == 0) goto L_0x0487
            X.09x r1 = r14.A00
            X.0A2 r2 = X.C86104wH.A0K(r1, r2)
            r1 = 343(0x157, float:4.8E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r2, r1)
            X.5DS r10 = A01(r14, r0, r10, r13)
            A03(r10, r11, r12)
            A03(r10, r6, r7)
            A03(r10, r8, r9)
            goto L_0x02f2
        L_0x01d2:
            java.lang.String r2 = "client_load_payouthub_init"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x013d
            if (r10 == 0) goto L_0x048c
            X.09x r1 = r14.A00
            X.0A2 r2 = X.C86104wH.A0K(r1, r2)
            r1 = 344(0x158, float:4.82E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r2, r1)
            X.5DS r10 = A01(r14, r0, r10, r13)
            A03(r10, r11, r12)
            if (r52 == 0) goto L_0x0208
            int r0 = r52.length()
            if (r0 == 0) goto L_0x0208
            java.util.Locale r2 = java.util.Locale.ROOT
            r0 = r52
            java.lang.String r0 = X.C18220wO.A0u(r2, r0)
            X.27V r2 = X.AnonymousClass27V.valueOf(r0)
            java.lang.String r0 = "referrer"
            r10.A04(r2, r0)
        L_0x0208:
            A03(r10, r6, r7)
            A03(r10, r8, r9)
            r2 = r53
            r0 = r54
            A02(r10, r2, r0)
            r2 = r46
            r0 = r47
            A02(r10, r2, r0)
            if (r15 == 0) goto L_0x0364
            r0 = r17
            r10.A07(r0, r15)
            goto L_0x0364
        L_0x0225:
            java.lang.String r15 = "client_fetch_payouthub_fail"
            boolean r0 = r1.equals(r15)
            if (r0 == 0) goto L_0x013d
            if (r10 == 0) goto L_0x049b
            if (r2 == 0) goto L_0x0496
            X.09x r0 = r14.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r15)
            r0 = 241(0xf1, float:3.38E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.5DS r10 = A00(r14, r10, r2)
            if (r13 == 0) goto L_0x0252
            int r0 = r13.length()
            if (r0 == 0) goto L_0x0252
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r13)
            java.lang.String r0 = "financial_id"
            r10.A09(r0, r2)
        L_0x0252:
            A03(r10, r11, r12)
            A03(r10, r6, r7)
            A03(r10, r8, r9)
            r2 = r30
            r0 = r31
            A02(r10, r2, r0)
            r2 = r28
            r0 = r29
            A02(r10, r2, r0)
            r2 = r18
            r0 = r27
            A02(r10, r2, r0)
            if (r5 == 0) goto L_0x0364
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0364
            X.5Di r2 = new X.5Di
            r2.<init>()
            r0 = r50
            r2.A0A(r0, r5)
            if (r4 == 0) goto L_0x0491
            r0 = r49
            r2.A0A(r0, r4)
            if (r3 == 0) goto L_0x0290
            r0 = r48
            r2.A07(r0, r3)
        L_0x0290:
            java.lang.String r0 = "page_info"
            r10.A06(r2, r0)
            goto L_0x0364
        L_0x0297:
            java.lang.String r15 = "client_fetch_payouthub_init"
            boolean r0 = r1.equals(r15)
            if (r0 == 0) goto L_0x013d
            if (r10 == 0) goto L_0x04aa
            if (r2 == 0) goto L_0x04a5
            X.09x r0 = r14.A00
            X.0A2 r1 = X.C86104wH.A0K(r0, r15)
            r0 = 242(0xf2, float:3.39E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            X.5DS r10 = A00(r14, r10, r2)
            if (r13 == 0) goto L_0x02c4
            int r0 = r13.length()
            if (r0 == 0) goto L_0x02c4
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r13)
            java.lang.String r0 = "financial_id"
            r10.A09(r0, r2)
        L_0x02c4:
            A03(r10, r11, r12)
            A03(r10, r6, r7)
            A03(r10, r8, r9)
            if (r5 == 0) goto L_0x02f2
            int r0 = r5.length()
            if (r0 == 0) goto L_0x02f2
            X.5Di r2 = new X.5Di
            r2.<init>()
            r0 = r50
            r2.A0A(r0, r5)
            if (r4 == 0) goto L_0x04a0
            r0 = r49
            r2.A0A(r0, r4)
            if (r3 == 0) goto L_0x02ed
            r0 = r48
            r2.A07(r0, r3)
        L_0x02ed:
            java.lang.String r0 = "page_info"
            r10.A06(r2, r0)
        L_0x02f2:
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x013d
            r2 = r58
            r0 = r57
            r1.A0T(r2, r0)
            X.6BP r0 = X.AnonymousClass6BP.A0E
            X.C86104wH.A1G(r0, r1)
            X.C86114wI.A1C(r1, r10)
            r1.Bb4()
            return
        L_0x030b:
            java.lang.String r2 = "client_load_payouthub_display"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x013d
            if (r10 == 0) goto L_0x04af
            X.09x r1 = r14.A00
            X.0A2 r2 = X.C86104wH.A0K(r1, r2)
            r1 = 342(0x156, float:4.79E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r2, r1)
            X.5DS r10 = A01(r14, r0, r10, r13)
            A03(r10, r8, r9)
            A03(r10, r6, r7)
            r2 = r44
            r0 = r45
            A02(r10, r2, r0)
            r2 = r42
            r0 = r43
            A02(r10, r2, r0)
            goto L_0x0364
        L_0x033a:
            java.lang.String r2 = "client_load_payouthub_success"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x013d
            if (r10 == 0) goto L_0x04b4
            X.09x r1 = r14.A00
            X.0A2 r2 = X.C86104wH.A0K(r1, r2)
            r1 = 345(0x159, float:4.83E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r2, r1)
            X.5DS r10 = A01(r14, r0, r10, r13)
            A03(r10, r11, r12)
            A03(r10, r6, r7)
            A03(r10, r8, r9)
            r2 = r55
            r0 = r56
            A02(r10, r2, r0)
        L_0x0364:
            boolean r0 = X.AnonymousClass0wJ.A1U(r1)
            if (r0 == 0) goto L_0x013d
            r2 = r58
            r0 = r57
            r1.A0T(r2, r0)
            X.6BP r0 = X.AnonymousClass6BP.A0E
            X.C86104wH.A1G(r0, r1)
            X.C86114wI.A1C(r1, r10)
            r1.Bb4()
            return
        L_0x037d:
            java.lang.String r18 = "client_fetch_payouthub_success"
            r0 = r18
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x013d
            if (r10 == 0) goto L_0x04c3
            if (r2 == 0) goto L_0x04be
            if (r34 == 0) goto L_0x03a1
            java.util.ArrayList r17 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r34.iterator()
        L_0x0395:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03a3
            r0 = r17
            X.C86124wJ.A1V(r0, r1)
            goto L_0x0395
        L_0x03a1:
            r17 = 0
        L_0x03a3:
            if (r32 == 0) goto L_0x03b9
            java.util.ArrayList r16 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r1 = r32.iterator()
        L_0x03ad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03bb
            r0 = r16
            X.C86124wJ.A1V(r0, r1)
            goto L_0x03ad
        L_0x03b9:
            r16 = 0
        L_0x03bb:
            if (r19 == 0) goto L_0x03cf
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r15 = r19.iterator()
        L_0x03c5:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x03d0
            X.C86124wJ.A1V(r1, r15)
            goto L_0x03c5
        L_0x03cf:
            r1 = 0
        L_0x03d0:
            X.09x r0 = r14.A00
            r15 = r0
            r0 = r18
            X.0A2 r15 = X.C86104wH.A0K(r15, r0)
            r0 = 243(0xf3, float:3.4E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r15 = X.C18180wK.A0I(r15, r0)
            X.5DS r2 = A00(r14, r10, r2)
            if (r13 == 0) goto L_0x03f4
            int r0 = r13.length()
            if (r0 == 0) goto L_0x03f4
            java.lang.Long r10 = X.AnonymousClass0wJ.A0d(r13)
            java.lang.String r0 = "financial_id"
            r2.A09(r0, r10)
        L_0x03f4:
            A03(r2, r11, r12)
            A03(r2, r6, r7)
            A03(r2, r8, r9)
            r6 = r55
            r0 = r56
            A02(r2, r6, r0)
            if (r17 == 0) goto L_0x040d
            r6 = r35
            r0 = r17
            r2.A0B(r6, r0)
        L_0x040d:
            if (r16 == 0) goto L_0x0416
            r6 = r33
            r0 = r16
            r2.A0B(r6, r0)
        L_0x0416:
            if (r25 == 0) goto L_0x041f
            r6 = r26
            r0 = r25
            r2.A0C(r6, r0)
        L_0x041f:
            if (r23 == 0) goto L_0x0428
            r6 = r24
            r0 = r23
            r2.A0C(r6, r0)
        L_0x0428:
            if (r21 == 0) goto L_0x0431
            r6 = r22
            r0 = r21
            r2.A0C(r6, r0)
        L_0x0431:
            if (r20 == 0) goto L_0x043a
            java.lang.String r6 = "payout_record_list"
            r0 = r20
            r2.A0C(r6, r0)
        L_0x043a:
            if (r5 == 0) goto L_0x045f
            int r0 = r5.length()
            if (r0 == 0) goto L_0x045f
            X.5Di r6 = new X.5Di
            r6.<init>()
            r0 = r50
            r6.A0A(r0, r5)
            if (r4 == 0) goto L_0x04b9
            r0 = r49
            r6.A0A(r0, r4)
            if (r3 == 0) goto L_0x045a
            r0 = r48
            r6.A07(r0, r3)
        L_0x045a:
            java.lang.String r0 = "page_info"
            r2.A06(r6, r0)
        L_0x045f:
            if (r1 == 0) goto L_0x0466
            java.lang.String r0 = "financial_id_list"
            r2.A0B(r0, r1)
        L_0x0466:
            boolean r0 = X.AnonymousClass0wJ.A1U(r15)
            if (r0 == 0) goto L_0x013d
            r1 = r58
            r0 = r57
            r15.A0T(r1, r0)
            X.6BP r1 = X.AnonymousClass6BP.A0E
            X.C86104wH.A1G(r1, r15)
            X.C86114wI.A1C(r15, r2)
            r15.Bb4()
            return
        L_0x047f:
            r10 = 0
            goto L_0x003c
        L_0x0482:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x0487:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x048c:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x0491:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x0496:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x049b:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x04a0:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x04a5:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x04aa:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x04af:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x04b4:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x04b9:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x04be:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x04c3:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x04c8:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        L_0x04cd:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r59)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C128917ka.Bb8(java.lang.String, java.util.Map):void");
    }

    public static AnonymousClass5DS A00(C128917ka r4, String str, String str2) {
        C317728x r1;
        AnonymousClass5DS r2 = new AnonymousClass5DS();
        r2.A0A("view_name", str);
        AnonymousClass286 r12 = r4.A01;
        r2.A04(r12, "payout_interface_type");
        if (r12 == AnonymousClass286.IG_ANDROID) {
            r1 = C317728x.IG_ONLY_LOGIN;
        } else {
            r1 = C317728x.FB_LOGIN;
        }
        r2.A04(r1, "login_mode");
        String upperCase = str2.toUpperCase(Locale.ROOT);
        C04220Ms.A06(upperCase);
        r2.A04(AnonymousClass6BM.valueOf(upperCase), "endpoint");
        return r2;
    }

    public static AnonymousClass5DS A01(C128917ka r3, String str, String str2, String str3) {
        C317728x r1;
        AnonymousClass5DS r2 = new AnonymousClass5DS();
        r2.A0A(str, str2);
        AnonymousClass286 r12 = r3.A01;
        r2.A04(r12, "payout_interface_type");
        if (r12 == AnonymousClass286.IG_ANDROID) {
            r1 = C317728x.IG_ONLY_LOGIN;
        } else {
            r1 = C317728x.FB_LOGIN;
        }
        r2.A04(r1, "login_mode");
        if (!(str3 == null || str3.length() == 0)) {
            r2.A09("financial_id", Long.valueOf(Long.parseLong(str3)));
        }
        return r2;
    }

    public static void A02(AnonymousClass0V3 r1, String str, String str2) {
        if (str != null && str.length() != 0) {
            r1.A0A(str2, str);
        }
    }

    public static void A03(AnonymousClass0V3 r2, String str, String str2) {
        if (str != null && str.length() != 0) {
            r2.A09(str2, Long.valueOf(Long.parseLong(str)));
        }
    }

    public C128917ka(C021209x r1, AnonymousClass286 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
