package X;

/* renamed from: X.6ov  reason: invalid class name and case insensitive filesystem */
public final class C112066ov {
    public final /* synthetic */ C89405Ej A00;
    public final /* synthetic */ IF5 A01;

    public C112066ov(C89405Ej r1, IF5 if5) {
        this.A00 = r1;
        this.A01 = if5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02b7, code lost:
        if (r3 != false) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016c, code lost:
        if (r19 != false) goto L_0x016e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0336  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r23 = this;
            r1 = r23
            X.5Ej r0 = r1.A00
            X.7K3 r11 = r0.A06
            if (r11 == 0) goto L_0x0296
            X.IF5 r1 = r1.A01
            java.util.Map r0 = r0.A0h
            java.lang.Object r12 = r0.get(r1)
            com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy r12 = (com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy) r12
            r11.A04 = r1
            r0 = r1
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.50v r3 = new X.50v
            r3.<init>()
            boolean r2 = r0.A0I
            r10 = 0
            X.5fr r0 = r0.A01
            if (r2 == 0) goto L_0x008e
            X.C91235fr.A00(r3, r0)
        L_0x0026:
            r11.A01 = r3
            java.util.Set r6 = X.C103836ao.A03
            X.5Ej r0 = r11.A03
            r22 = r0
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()
            java.util.List r0 = r3.A08
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x003c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r3 = r8.next()
            X.50v r3 = (X.C872350v) r3
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x003c
            r0 = r22
            java.lang.String r0 = X.C122097Kc.A04(r3, r0, r6)
            if (r0 == 0) goto L_0x003c
            java.lang.Object r7 = r5.get(r0)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x0063
            java.util.ArrayList r7 = X.AnonymousClass0wJ.A0v()
            r5.put(r0, r7)
        L_0x0063:
            android.view.autofill.AutofillValue r2 = r3.A03
            java.lang.CharSequence[] r4 = r3.A06
            r3 = 0
            if (r2 == 0) goto L_0x0078
            boolean r0 = r2.isText()
            if (r0 == 0) goto L_0x007c
            java.lang.CharSequence r0 = r2.getTextValue()
        L_0x0074:
            java.lang.String r3 = r0.toString()
        L_0x0078:
            r7.add(r3)
            goto L_0x003c
        L_0x007c:
            boolean r0 = r2.isList()
            if (r0 == 0) goto L_0x0078
            int r2 = r2.getListValue()
            if (r4 == 0) goto L_0x0078
            int r0 = r4.length
            if (r2 >= r0) goto L_0x0078
            r0 = r4[r2]
            goto L_0x0074
        L_0x008e:
            r0.onProvideAutofillVirtualStructure(r3, r10)
            goto L_0x0026
        L_0x0092:
            java.util.HashSet r21 = X.C18200wM.A0u()
            java.util.HashSet r9 = X.C18200wM.A0u()
            java.util.Iterator r4 = X.AnonymousClass0wJ.A0z(r5)
        L_0x009e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.util.Map$Entry r3 = X.C18180wK.A0o(r4)
            java.lang.Object r2 = r3.getKey()
            r0 = r21
            r0.add(r2)
            java.lang.Object r0 = r3.getValue()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r3.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x009e
            java.lang.Object r2 = r3.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            X.7nV r0 = new X.7nV
            r0.<init>()
            java.lang.Object r0 = X.AnonymousClass3W7.A00(r0, r2)
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r3.getKey()
            r9.add(r0)
            goto L_0x009e
        L_0x00dc:
            java.lang.String r0 = X.AnonymousClass7KI.A01(r21)
            r11.A09 = r0
            java.lang.String r0 = X.AnonymousClass7KI.A01(r9)
            r11.A0C = r0
            java.util.Set r8 = X.C103836ao.A05
            java.lang.String r20 = "set1"
            java.lang.String r7 = "set2"
            X.AnonymousClass7Ko.A07(r8, r7)
            X.5rf r0 = new X.5rf
            r0.<init>(r9, r8)
            boolean r0 = X.C18250wR.A1K(r0)
            if (r0 == 0) goto L_0x03ee
            java.util.Set r0 = X.C103836ao.A01
            boolean r0 = java.util.Collections.disjoint(r9, r0)
            if (r0 != 0) goto L_0x03ea
            java.lang.String r0 = "CONTACT_AND_PAYMENT_AUTOFILL"
        L_0x0106:
            r11.A0B = r0
            r6 = 1
            r11.A0N = r6
            X.50v r0 = r11.A01
            r11.A0A(r0)
            X.5Ej r5 = r11.A02
            boolean r0 = r5.A0C(r1)
            java.lang.String r4 = "cc-number"
            if (r0 != 0) goto L_0x03d8
            java.lang.String r0 = X.AnonymousClass7K3.A02(r11)
            boolean r0 = r5.A0D(r0)
            if (r0 != 0) goto L_0x03d8
            X.50v r0 = r11.A01
            if (r0 != 0) goto L_0x03d0
            r3 = 0
        L_0x0129:
            java.util.Set r0 = r5.A0J
            boolean r0 = r0.contains(r3)
            r19 = r0 ^ 1
            java.lang.Integer r15 = r5.A03()
            boolean r18 = r11.A0D()
            com.instagram.service.session.UserSession r2 = r5.A0B
            X.0TJ r13 = X.AnonymousClass0TJ.A06
            r0 = 36310512516137078(0x81003800230076, double:3.026252553678748E-306)
            java.lang.Boolean r2 = X.C63803iN.A05(r13, r2, r0)
            boolean r17 = r2.booleanValue()
            boolean r16 = r5.A0E(r10)
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x0168
            java.lang.Integer r2 = X.AnonymousClass006.A0C
            boolean r14 = r15.equals(r2)
            if (r14 == 0) goto L_0x015e
            if (r17 == 0) goto L_0x0168
        L_0x015e:
            java.lang.Integer r14 = X.AnonymousClass006.A01
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x03c2
            if (r16 != 0) goto L_0x03c2
        L_0x0168:
            java.lang.Integer r16 = X.AnonymousClass006.A0C
            r2 = r16
            if (r19 == 0) goto L_0x019f
        L_0x016e:
            boolean r14 = r11.A0D()
            if (r14 == 0) goto L_0x0187
            boolean r14 = r9.contains(r4)
            if (r14 == 0) goto L_0x0187
            java.lang.Integer r14 = r5.A03()
            if (r14 != r2) goto L_0x0187
            com.instagram.service.session.UserSession r14 = r5.A0B
            X.0TJ r15 = X.AnonymousClass0TJ.A05
            X.C63803iN.A0E(r15, r14, r0)
        L_0x0187:
            boolean r0 = r11.A0D()
            if (r0 == 0) goto L_0x0196
            boolean r0 = r9.contains(r4)
            if (r0 == 0) goto L_0x0196
            r5.A0E(r6)
        L_0x0196:
            boolean r0 = r11.A0D()
            if (r0 == 0) goto L_0x019f
            r9.contains(r4)
        L_0x019f:
            com.instagram.service.session.UserSession r14 = r5.A0B
            r0 = 36310512515874932(0x810038001f0074, double:3.026252553512966E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r13, r14, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01d2
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r5.A09
            if (r0 == 0) goto L_0x01d2
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r0 = r0.A02
            if (r0 == 0) goto L_0x01d2
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01d2
            boolean r0 = r9.contains(r4)
            if (r0 == 0) goto L_0x01d2
            boolean r0 = r5.A0S
            if (r0 != 0) goto L_0x01d2
            boolean r1 = r5.A0T
            boolean r0 = r5.A0R
            if (r1 != 0) goto L_0x03b8
            java.lang.Integer r16 = X.AnonymousClass006.A0N
        L_0x01d2:
            X.AnonymousClass7Ko.A07(r8, r7)
            X.5rf r1 = new X.5rf
            r0 = r21
            r1.<init>(r0, r8)
            boolean r0 = X.C18250wR.A1K(r1)
            if (r0 == 0) goto L_0x01fe
            java.util.Set r1 = r11.A0I
            boolean r0 = r1.contains(r3)
            if (r0 != 0) goto L_0x01fe
            r1.add(r3)
            java.lang.String r0 = "PAYMENT_AUTOFILL_DOMAIN_REQUEST"
            X.78Q r13 = X.AnonymousClass7K3.A01(r11, r0)
            r13.A0B = r3
            long r0 = X.C86114wI.A09(r19)
            r13.A03 = r0
            X.AnonymousClass78Q.A00(r13)
        L_0x01fe:
            java.lang.Long r0 = r11.A08
            if (r0 != 0) goto L_0x0223
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0223
            if (r19 == 0) goto L_0x0223
            X.AnonymousClass7Ko.A07(r8, r7)
            X.5rf r0 = new X.5rf
            r0.<init>(r9, r8)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0223
            java.lang.Long r0 = X.C18200wM.A0c()
            r11.A08 = r0
            java.lang.String r0 = "FIRST_FORM_INTERACTION"
            X.AnonymousClass7K3.A04(r11, r0)
        L_0x0223:
            int r1 = r16.intValue()
            if (r1 == r6) goto L_0x0391
            r0 = 3
            if (r1 == r0) goto L_0x03fc
            r0 = 4
            if (r1 == r0) goto L_0x035e
            if (r1 == r10) goto L_0x0297
            r0 = 2
            if (r1 != r0) goto L_0x0296
            java.util.Set r0 = r11.A0I
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0296
            boolean r0 = r11.A0P
            if (r0 != 0) goto L_0x0296
            boolean r0 = r11.A0D()
            if (r0 != 0) goto L_0x024f
            java.util.Map r7 = r11.A0G
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_USER_HAS_NO_CARDS"
            java.lang.String r0 = "USER_HAS_NO_CARDS"
            r7.put(r1, r0)
        L_0x024f:
            java.lang.Integer r1 = r5.A03()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x0260
            java.util.Map r7 = r11.A0G
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_USER_OPTED_OUT"
            java.lang.String r0 = "USER_OPTED_OUT"
            r7.put(r1, r0)
        L_0x0260:
            java.lang.Integer r0 = r5.A03()
            if (r0 != r2) goto L_0x026f
            java.util.Map r2 = r11.A0G
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_USER_NOT_OPT_IN"
            java.lang.String r0 = "USER_NOT_OPT_IN"
            r2.put(r1, r0)
        L_0x026f:
            boolean r0 = r9.contains(r4)
            if (r0 != 0) goto L_0x027e
            java.util.Map r2 = r11.A0G
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_UNDETECTED_CC_NUMBER"
            java.lang.String r0 = "UNDETECTED_CC_NUMBER"
            r2.put(r1, r0)
        L_0x027e:
            if (r19 != 0) goto L_0x0289
            java.util.Map r2 = r11.A0G
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_DOMAIN_BLOCKED_LISTED"
            java.lang.String r0 = "DOMAIN_BLOCKED_LISTED"
            r2.put(r1, r0)
        L_0x0289:
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            X.78Q r0 = X.AnonymousClass7K3.A01(r11, r0)
            r0.A0B = r3
        L_0x0291:
            X.AnonymousClass78Q.A00(r0)
            r11.A0P = r6
        L_0x0296:
            return
        L_0x0297:
            java.lang.String r0 = X.AnonymousClass7K3.A02(r11)
            if (r0 == 0) goto L_0x0296
            java.util.Map r7 = r11.A0S
            boolean r3 = r11.A0Q
            java.lang.String r1 = X.AnonymousClass7K0.A00(r0)
            boolean r0 = r7.containsKey(r1)
            java.lang.Integer r4 = X.AnonymousClass006.A00
            if (r0 == 0) goto L_0x02f9
            java.lang.Object r0 = r7.get(r1)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x02f7
            if (r3 == 0) goto L_0x02f9
        L_0x02b9:
            boolean r0 = r5.A0X
            if (r0 != 0) goto L_0x02d4
            if (r2 != r4) goto L_0x02d4
            com.instagram.service.session.UserSession r3 = r5.A0B
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36591987493240887(0x82003800290037, double:3.2042584626079556E-306)
            X.C63803iN.A03(r2, r3, r0)
            int r0 = r5.A00
            if (r0 <= r6) goto L_0x02f5
            int r0 = r0 - r6
            r5.A00 = r0
            java.lang.Integer r2 = X.AnonymousClass006.A01
        L_0x02d4:
            int r1 = r2.intValue()
            if (r1 == r6) goto L_0x0336
            r0 = 2
            if (r1 == r0) goto L_0x02fc
            if (r1 != r10) goto L_0x0296
            boolean r0 = r11.A0P
            if (r0 != 0) goto L_0x0296
            if (r2 != r4) goto L_0x02ee
            java.util.Map r2 = r11.A0G
            java.lang.String r1 = "NO_AUTOFILL_PROMPT_REASON_DECLINED_AUTOFILL_ONCE"
            java.lang.String r0 = "DECLINED_AUTOFILL_ONCE"
            r2.put(r1, r0)
        L_0x02ee:
            java.lang.String r0 = "NO_PROMPTED_AUTOFILL"
            X.78Q r0 = X.AnonymousClass7K3.A01(r11, r0)
            goto L_0x0291
        L_0x02f5:
            r2 = r4
            goto L_0x02d4
        L_0x02f7:
            r2 = r4
            goto L_0x02b9
        L_0x02f9:
            java.lang.Integer r2 = X.AnonymousClass006.A01
            goto L_0x02b9
        L_0x02fc:
            java.lang.String r5 = X.AnonymousClass7K3.A02(r11)
            if (r5 == 0) goto L_0x0296
            java.util.Map r2 = r11.A0T
            java.lang.Object r0 = r2.get(r5)
            if (r0 == 0) goto L_0x0296
            java.util.Set r1 = X.C103836ao.A02
            r0 = r20
            X.AnonymousClass7Ko.A07(r1, r0)
            X.5rf r4 = new X.5rf
            r4.<init>(r1, r9)
            X.50v r3 = r11.A01
            java.lang.Object r0 = r2.get(r5)
            X.78k r0 = (X.C1200778k) r0
            java.util.Map r2 = r0.A02()
            java.util.Set r1 = X.C103836ao.A04
            r0 = r22
            android.util.SparseArray r1 = X.C122097Kc.A01(r3, r0, r2, r4, r1)
            X.IF5 r0 = r11.A04
            if (r0 == 0) goto L_0x0296
            com.facebook.browser.lite.webview.SystemWebView r0 = (com.facebook.browser.lite.webview.SystemWebView) r0
            X.5fr r0 = r0.A01
            r0.autofill(r1)
            return
        L_0x0336:
            java.util.Set r2 = X.C103836ao.A01
            java.util.Iterator r1 = r9.iterator()
        L_0x033c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03f3
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x033c
            com.facebook.browser.lite.extensions.autofill.base.AutofillFrameworkControllerBase$3 r1 = new com.facebook.browser.lite.extensions.autofill.base.AutofillFrameworkControllerBase$3
            r1.<init>(r11, r9)
            X.7Ep r0 = X.AnonymousClass7Ep.A00()
            com.facebook.browser.lite.ipc.BrowserLiteCallback r0 = r0.A06
            if (r0 == 0) goto L_0x0296
            r0.AMH(r1)     // Catch:{ RemoteException -> 0x0296 }
            goto L_0x03f2
        L_0x035e:
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r5.A09
            if (r0 == 0) goto L_0x0296
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r0 = r0.A02
            if (r0 == 0) goto L_0x0296
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0296
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r5.A09
            if (r0 == 0) goto L_0x038f
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r0 = r0.A02
        L_0x0374:
            java.util.List r0 = r0.A03
            java.lang.Object r2 = r0.get(r10)
            com.fbpay.w3c.CardDetails r2 = (com.fbpay.w3c.CardDetails) r2
            X.5Ej r1 = r11.A02
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x0296
            java.lang.String r0 = "ACCEPTED_AUTOFILL"
            X.AnonymousClass7K3.A04(r11, r0)
            r1.A0S = r6
            java.lang.String r0 = r2.A07
            X.AnonymousClass7K3.A03(r11, r2, r0)
            return
        L_0x038f:
            r0 = 0
            goto L_0x0374
        L_0x0391:
            if (r12 == 0) goto L_0x0296
            java.lang.String r0 = r12.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0296
            X.IF5 r2 = r12.A04()
            if (r2 == 0) goto L_0x0296
            java.lang.String r1 = r12.A02
            java.util.Set r0 = X.AnonymousClass3RQ.A01
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0296
            X.80Y r1 = new X.80Y
            r1.<init>(r12, r2)
            com.facebook.browser.lite.webview.SystemWebView r2 = (com.facebook.browser.lite.webview.SystemWebView) r2
            X.5fr r0 = r2.A01
            r0.post(r1)
            return
        L_0x03b8:
            if (r0 == 0) goto L_0x03be
            java.lang.Integer r16 = X.AnonymousClass006.A0Y
            goto L_0x01d2
        L_0x03be:
            r16 = r2
            goto L_0x01d2
        L_0x03c2:
            if (r19 == 0) goto L_0x0168
            if (r18 == 0) goto L_0x0168
            boolean r14 = r9.contains(r4)
            if (r14 == 0) goto L_0x0168
            java.lang.Integer r16 = X.AnonymousClass006.A00
            goto L_0x016e
        L_0x03d0:
            java.lang.String r0 = r0.A05
            java.lang.String r3 = X.AnonymousClass7K0.A00(r0)
            goto L_0x0129
        L_0x03d8:
            boolean r0 = r9.contains(r4)
            if (r0 == 0) goto L_0x0296
            boolean r0 = r11.A0O
            if (r0 != 0) goto L_0x0296
            java.lang.String r0 = "DOMAIN_OPTED_OUT"
            X.AnonymousClass7K3.A04(r11, r0)
            r11.A0O = r6
            return
        L_0x03ea:
            java.lang.String r0 = "PAYMENT_AUTOFILL"
            goto L_0x0106
        L_0x03ee:
            java.lang.String r0 = "CONTACT_AUTOFILL"
            goto L_0x0106
        L_0x03f2:
            return
        L_0x03f3:
            r1 = 0
            boolean r0 = r11.A0D()
            X.AnonymousClass7K3.A05(r11, r1, r9, r0)
            return
        L_0x03fc:
            java.util.List r1 = r11.A0D
            if (r1 != 0) goto L_0x0404
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
        L_0x0404:
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r5.A09
            if (r0 == 0) goto L_0x0443
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r0 = r0.A02
        L_0x040a:
            r0.getClass()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r2 = r0.A00
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0430
            if (r2 == 0) goto L_0x0430
            java.lang.Object r0 = r1.get(r10)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            java.util.HashMap r1 = X.AnonymousClass0wJ.A0y()
            java.util.Map r0 = r0.A00
            r1.putAll(r0)
            java.util.Map r0 = r2.A00
            r1.putAll(r0)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r2 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r2.<init>((java.util.Map) r1)
        L_0x0430:
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r5.A09
            if (r0 == 0) goto L_0x0441
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r1 = r0.A02
        L_0x0436:
            r1.getClass()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r5.A07(r1, r2, r0)
            return
        L_0x0441:
            r1 = 0
            goto L_0x0436
        L_0x0443:
            r0 = 0
            goto L_0x040a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112066ov.A00():void");
    }
}
