package com.facebook.browser.lite.extensions.autofill.base;

import X.C14030oh;
import X.C89405Ej;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;

public final class AutofillControllerBase$3 extends BrowserLiteJSBridgeCallback.Stub {
    public final /* synthetic */ AutofillSharedJSBridgeProxy A00;
    public final /* synthetic */ C89405Ej A01;
    public final /* synthetic */ AutofillData A02;
    public final /* synthetic */ RequestAutofillJSBridgeCall A03;

    public AutofillControllerBase$3(AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, C89405Ej r4, AutofillData autofillData, RequestAutofillJSBridgeCall requestAutofillJSBridgeCall) {
        this.A01 = r4;
        this.A02 = autofillData;
        this.A00 = autofillSharedJSBridgeProxy;
        this.A03 = requestAutofillJSBridgeCall;
        C14030oh.A0A(1572206400, C14030oh.A03(1341596938));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e6, code lost:
        if (X.AnonymousClass7KI.A09((com.facebook.browser.lite.extensions.autofill.model.AutofillData) X.C18240wQ.A0b(r6), r4) == false) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x020c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BnW(com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall r15, int r16, android.os.Bundle r17) {
        /*
            r14 = this;
            r0 = 1072283326(0x3fe9bebe, float:1.8261335)
            int r7 = X.C14030oh.A03(r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
            r1 = r17
            java.util.ArrayList r0 = r1.getStringArrayList(r0)
            java.util.List r6 = X.AnonymousClass7KI.A03(r0)
            X.5Ej r5 = r14.A01
            r5.A0H = r6
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r4 = r14.A02
            java.lang.String r1 = r5.A0E
            java.lang.String r0 = "id"
            java.util.Map r3 = r4.A00
            if (r1 != 0) goto L_0x00cb
            r3.remove(r0)
        L_0x0024:
            java.lang.String r1 = r5.A0D
            java.lang.String r0 = "ent_id"
            if (r1 != 0) goto L_0x00c6
            r3.remove(r0)
        L_0x002d:
            X.Kys r0 = r5.A03
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            java.lang.String r2 = r0.A0e
            java.util.Map r9 = r5.A0d
            java.util.Map r8 = r5.A0g
            java.lang.String r11 = r5.A0c
            java.lang.String r1 = X.AnonymousClass7K0.A00(r2)
            boolean r0 = r9.containsKey(r1)
            java.lang.Integer r13 = X.AnonymousClass006.A00
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r9.get(r1)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r1 = r8.get(r2)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r1 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r1
            if (r1 == 0) goto L_0x00e8
            boolean r0 = X.AnonymousClass7KI.A09(r1, r4)
            if (r0 == 0) goto L_0x00e8
            java.util.Map r10 = r1.A00
            java.util.Map r9 = java.util.Collections.unmodifiableMap(r10)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r3)
            java.util.Iterator r12 = X.AnonymousClass0wJ.A0z(r0)
        L_0x006b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.util.Map$Entry r8 = X.C18180wK.A0o(r12)
            java.lang.Object r0 = r8.getKey()
            java.lang.String r1 = X.C18220wO.A0r(r0, r9)
            if (r1 == 0) goto L_0x006b
            java.lang.Object r0 = r8.getValue()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "EDITED_AUTOFILLED_FIELD"
            X.78Q r9 = new X.78Q
            r9.<init>(r0, r11)
            java.util.HashSet r11 = X.C18200wM.A0u()
            java.util.Map r10 = java.util.Collections.unmodifiableMap(r10)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r3)
            java.util.Iterator r12 = X.AnonymousClass0wJ.A0z(r0)
        L_0x00a0:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.util.Map$Entry r8 = X.C18180wK.A0o(r12)
            java.lang.Object r0 = r8.getKey()
            java.lang.String r1 = X.C18220wO.A0r(r0, r10)
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r0 = r8.getValue()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00a0
            java.lang.Object r0 = r8.getKey()
            r11.add(r0)
            goto L_0x00a0
        L_0x00c6:
            r3.put(r0, r1)
            goto L_0x002d
        L_0x00cb:
            r3.put(r0, r1)
            goto L_0x0024
        L_0x00d0:
            java.lang.Integer r13 = X.AnonymousClass006.A0N
            goto L_0x00fa
        L_0x00d3:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x00dc
            java.lang.Integer r13 = X.AnonymousClass006.A01
            goto L_0x00fa
        L_0x00dc:
            java.lang.Object r0 = X.C18240wQ.A0b(r6)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            boolean r0 = X.AnonymousClass7KI.A09(r0, r4)
            if (r0 != 0) goto L_0x00fa
        L_0x00e8:
            java.lang.Integer r13 = X.AnonymousClass006.A0C
            goto L_0x00fa
        L_0x00eb:
            java.lang.String r0 = X.AnonymousClass7KI.A01(r11)
            r9.A07 = r0
            r9.A06 = r2
            java.lang.String r0 = "CONTACT_AUTOFILL"
            r9.A0F = r0
            X.AnonymousClass78Q.A00(r9)
        L_0x00fa:
            com.instagram.service.session.UserSession r9 = r5.A0B
            X.0TJ r8 = X.AnonymousClass0TJ.A05
            r0 = 36310512514760810(0x810038000e006a, double:3.0262525528083905E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r8, r9, r0)
            boolean r11 = r0.booleanValue()
            boolean r12 = r5.A0K
            boolean r10 = r5.A0M
            boolean r9 = r5.A0A()
            X.5EW r8 = new X.5EW
            r8.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "is_payment_enabled"
            r1.putBoolean(r0, r12)
            java.lang.String r0 = "is_reconsent_enabled"
            r1.putBoolean(r0, r10)
            java.lang.String r0 = "is_consent_accepted"
            r1.putBoolean(r0, r9)
            java.lang.String r0 = "should_always_show_ads_disclosure"
            r1.putBoolean(r0, r11)
            r8.setArguments(r1)
            int r11 = r13.intValue()
            r10 = 3
            r1 = 2
            r0 = 1
            r9 = 0
            if (r11 == r0) goto L_0x0166
            if (r11 == r1) goto L_0x0189
            if (r11 == r10) goto L_0x0148
            r0 = -128403426(0xfffffffff858b81e, float:-1.7582351E34)
        L_0x0144:
            X.C14030oh.A0A(r0, r7)
            return
        L_0x0148:
            java.lang.String r0 = "PROMPTED_OVERWRITE"
            X.78Q r1 = r5.A02(r0)
            java.lang.String r0 = r5.A0G
            r1.A08 = r0
            r1.A06 = r2
            X.AnonymousClass78Q.A00(r1)
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x01e1
            X.7K3 r1 = r5.A06
            if (r1 == 0) goto L_0x01e1
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            r1.A0F = r0
            goto L_0x01e1
        L_0x0166:
            java.lang.String r0 = "PROMPTED_SAVE"
            X.78Q r1 = r5.A02(r0)
            java.lang.String r0 = r5.A0G
            r1.A08 = r0
            r1.A06 = r2
            X.AnonymousClass78Q.A00(r1)
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x0187
            X.7K3 r0 = r5.A06
            if (r0 == 0) goto L_0x0187
            boolean r0 = r0.A0E(r4, r2)
            if (r0 == 0) goto L_0x0187
            r0 = -1999455265(0xffffffff88d2bbdf, float:-1.2683084E-33)
            goto L_0x0144
        L_0x0187:
            r10 = 1
            goto L_0x01e1
        L_0x0189:
            java.lang.Object r0 = r6.get(r9)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            java.util.Map r0 = X.C86164wN.A0l(r0)
            java.util.HashMap r1 = X.C86164wN.A0j(r0)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r3)
            r1.putAll(r0)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r4 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r4.<init>((java.util.Map) r1)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0216
            java.lang.Object r1 = r6.get(r9)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r1 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r1
        L_0x01af:
            java.lang.String r0 = "PROMPTED_UPDATE"
            X.78Q r3 = r5.A02(r0)
            java.lang.String r0 = r5.A0G
            r3.A08 = r0
            java.util.Map r1 = r1.A00
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r0 = r0.keySet()
            java.lang.String r0 = X.AnonymousClass7KI.A01(r0)
            r3.A05 = r0
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Map r0 = X.C86164wN.A0l(r4)
            java.util.Set r0 = X.AnonymousClass7KI.A06(r1, r0)
            java.lang.String r0 = X.AnonymousClass7KI.A01(r0)
            r3.A0A = r0
            r3.A06 = r2
            X.AnonymousClass78Q.A00(r3)
            r10 = 2
        L_0x01e1:
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x020c
            java.lang.Object r3 = r6.get(r9)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r3 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r3
        L_0x01ed:
            com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy r1 = r14.A00
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r0 = r14.A03
            r8.A03 = r5
            r8.A02 = r1
            r8.A06 = r0
            r8.A04 = r4
            r8.A05 = r3
            r8.A00 = r10
            r8.A07 = r2
            r8.A08 = r6
            java.lang.String r1 = "AutofillBottomSheetDialogFragment"
            r0 = 0
            r5.A05(r8, r0, r1)
            r0 = -1342647170(0xffffffffaff8d47e, float:-4.5261922E-10)
            goto L_0x0144
        L_0x020c:
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r3 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r3.<init>((java.util.Map) r0)
            goto L_0x01ed
        L_0x0216:
            java.util.HashMap r0 = X.AnonymousClass0wJ.A0y()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r1 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r1.<init>((java.util.Map) r0)
            goto L_0x01af
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.base.AutofillControllerBase$3.BnW(com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall, int, android.os.Bundle):void");
    }
}
