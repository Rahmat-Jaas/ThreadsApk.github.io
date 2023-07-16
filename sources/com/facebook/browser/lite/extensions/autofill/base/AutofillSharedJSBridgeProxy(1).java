package com.facebook.browser.lite.extensions.autofill.base;

import X.AnonymousClass00U;
import X.AnonymousClass0Dy;
import X.AnonymousClass0wJ;
import X.AnonymousClass78Q;
import X.AnonymousClass7Ep;
import X.AnonymousClass7K0;
import X.AnonymousClass7KI;
import X.C112646px;
import X.C14030oh;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C18250wR;
import X.C37252JnL;
import X.C39730Kys;
import X.C86114wI;
import X.C86154wM;
import X.C89405Ej;
import X.I17;
import X.IF5;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.callback.IDxSRunnableShape5S0300000_2_I2;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.businessextension.jscalls.GetNonceJSBridgeCall;
import com.facebook.businessextension.jscalls.HideAutofillBarJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AutofillSharedJSBridgeProxy extends BrowserLiteJSBridgeProxy {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public int A04;
    public String A05;
    public final Intent A06;
    public final C89405Ej A07;
    public final BrowserLiteJSBridgeCallback A08 = new AutofillJSBridgeCallback();
    public final boolean A09;

    public final class AutofillJSBridgeCallback extends BrowserLiteJSBridgeCallback.Stub {
        public /* synthetic */ AutofillJSBridgeCallback() {
            C14030oh.A0A(554923676, C14030oh.A03(2089537908));
            C14030oh.A0A(445986533, C14030oh.A03(180432862));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e5, code lost:
            if (r6 != null) goto L_0x00a9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void BnW(com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall r17, int r18, android.os.Bundle r19) {
            /*
                r16 = this;
                r0 = -382012831(0xffffffffe93af261, float:-1.41253E25)
                int r1 = X.C14030oh.A03(r0)
                r4 = r17
                java.lang.String r3 = r4.A04
                java.lang.String r0 = "requestAutoFill"
                boolean r0 = r3.equals(r0)
                r2 = r16
                if (r0 == 0) goto L_0x005c
                android.content.Context r11 = r4.A00
                java.lang.String r14 = r4.A03
                android.os.Bundle r12 = r4.A01
                java.lang.String r15 = r4.A05
                android.os.Bundle r13 = r4.A02
                com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r10 = new com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall
                r10.<init>((android.content.Context) r11, (android.os.Bundle) r12, (android.os.Bundle) r13, (java.lang.String) r14, (java.lang.String) r15)
                java.lang.String r3 = r10.A02()
                java.util.ArrayList r9 = X.AnonymousClass0wJ.A0v()
                java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
                r4 = r19
                java.util.ArrayList r0 = r4.getStringArrayList(r0)
                java.util.List r0 = X.AnonymousClass7KI.A03(r0)
                java.util.Iterator r5 = r0.iterator()
            L_0x003c:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x0079
                java.lang.Object r4 = r5.next()
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r4 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r4
                java.util.Map r0 = X.C86164wN.A0l(r4)
                java.lang.Object r0 = r0.get(r3)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x003c
                r9.add(r4)
                goto L_0x003c
            L_0x005c:
                java.lang.String r0 = "saveAutofillData"
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L_0x00dc
                java.lang.String r0 = "hideAutoFillBar"
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L_0x00dc
                com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy r0 = com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy.this
                X.5Ej r5 = r0.A07
            L_0x0070:
                X.7z6 r0 = new X.7z6
                r0.<init>(r5)
                X.C1189172u.A00(r0)
                goto L_0x00dc
            L_0x0079:
                com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy r8 = com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy.this
                X.5Ej r5 = r8.A07
                com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r5.A09
                if (r0 == 0) goto L_0x00e8
                com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r0 = r0.A02
                r7 = 0
                if (r0 == 0) goto L_0x00e8
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r6 = r0.A00
                boolean r0 = r9.isEmpty()
                if (r0 != 0) goto L_0x00e5
                if (r6 == 0) goto L_0x00e8
                java.lang.Object r0 = r9.get(r7)
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
                java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
                java.util.Map r0 = r0.A00
                r2.putAll(r0)
                java.util.Map r0 = r6.A00
                r2.putAll(r0)
                com.facebook.browser.lite.extensions.autofill.model.AutofillData r6 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
                r6.<init>((java.util.Map) r2)
            L_0x00a9:
                java.util.Map r0 = X.C86164wN.A0l(r6)
                java.lang.Object r0 = r0.get(r3)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x00e8
                com.instagram.service.session.UserSession r4 = r5.A0B
                X.0TJ r0 = X.AnonymousClass0TJ.A06
                r2 = 36310512515874932(0x810038001f0074, double:3.026252553512966E-306)
                java.lang.Boolean r0 = X.C63803iN.A05(r0, r4, r2)
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x00e8
                com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r5.A09
                if (r0 == 0) goto L_0x00e3
                com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r2 = r0.A02
            L_0x00d2:
                r2.getClass()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
                r5.A07(r2, r6, r0)
            L_0x00dc:
                r0 = -312531223(0xffffffffed5f26e9, float:-4.3163873E27)
                X.C14030oh.A0A(r0, r1)
                return
            L_0x00e3:
                r2 = 0
                goto L_0x00d2
            L_0x00e5:
                if (r6 == 0) goto L_0x00e8
                goto L_0x00a9
            L_0x00e8:
                boolean r0 = r9.isEmpty()
                if (r0 != 0) goto L_0x0070
                r5.A06(r8, r10, r9)
                goto L_0x00dc
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy.AutofillJSBridgeCallback.BnW(com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall, int, android.os.Bundle):void");
        }
    }

    public final void A09(Bundle bundle, BrowserLiteJSBridgeCall browserLiteJSBridgeCall) {
        C112646px r5;
        IF5 A042;
        BrowserLiteJSBridgeCall browserLiteJSBridgeCall2 = browserLiteJSBridgeCall;
        String str = browserLiteJSBridgeCall.A04;
        if (str.equals("getNonce") || str.equals("requestAutoFill")) {
            String str2 = this.A05;
            String string = bundle.getString("callbackID");
            if (string != null) {
                r5 = new C112646px(str2, string, bundle.getString("callback_result"), true);
                String str3 = this.A05;
                A042 = A04();
                if (A042 != null && r5 != null) {
                    ((SystemWebView) A042).A01.post(new AnonymousClass0Dy(this, r5, browserLiteJSBridgeCall2, A042, str3));
                    return;
                }
            }
        } else {
            Log.e("AutofillSharedJSBridgeProxy", AnonymousClass00U.A0L("No valid callback found for call: ", str));
        }
        r5 = null;
        String str32 = this.A05;
        A042 = A04();
        if (A042 != null) {
        }
    }

    public final SaveAutofillDataJSBridgeCall A08(JSONObject jSONObject) {
        C89405Ej r1 = this.A07;
        JSONObject jSONObject2 = jSONObject;
        AutofillData A002 = AnonymousClass7KI.A00(jSONObject);
        C39730Kys kys = r1.A03;
        if (kys != null) {
            r1.A0e.put(AnonymousClass7K0.A00(((BrowserLiteFragment) kys).A0e), A002);
        }
        return new SaveAutofillDataJSBridgeCall(A02(), A03(), this.A03, A05(), jSONObject2);
    }

    @JavascriptInterface
    public void requestAutoFill(String str) {
        String str2;
        String str3;
        C89405Ej r2 = this.A07;
        AnonymousClass78Q.A00(r2.A02("JS_REQUEST_AUTOFILL"));
        try {
            JSONObject A0j = C18250wR.A0j(str);
            if (A0j.optString("nonce").equals(this.A03)) {
                if (this.A00 == null) {
                    this.A00 = C18200wM.A0c();
                    AnonymousClass78Q A022 = r2.A02("FIRST_FORM_INTERACTION");
                    A022.A08 = this.A01;
                    try {
                        JSONArray jSONArray = new JSONArray(A0j.getString("allFields"));
                        ArrayList A0v = AnonymousClass0wJ.A0v();
                        for (int i = 0; i < jSONArray.length(); i = C86154wM.A07(A0v, jSONArray, i)) {
                        }
                        Collections.sort(A0v);
                        str2 = TextUtils.join(", ", A0v);
                    } catch (JSONException e) {
                        C37252JnL.A00("AutofillSharedUtil", "Failed to parseAllFields", e, e);
                        str2 = null;
                    }
                    A022.A04 = str2;
                    A022.A0D = AnonymousClass7KI.A02(A0j);
                    try {
                        str3 = A0j.getString("selectedAutoCompleteTag");
                    } catch (JSONException e2) {
                        C37252JnL.A00("AutofillSharedUtil", "Failed to get autofill tag", e2, e2);
                        str3 = null;
                    }
                    A022.A0E = str3;
                    A022.A06 = A05();
                    AnonymousClass78Q.A00(A022);
                }
                Intent intent = this.A06;
                if (intent != null && intent.getBooleanExtra(I17.A00(70), false)) {
                    Toast.makeText(A02(), "requestAutofill", 0).show();
                }
                if (!this.A09) {
                    RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = new RequestAutofillJSBridgeCall(A02(), A03(), this.A03, A05(), A0j);
                    BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback = this.A08;
                    AnonymousClass7Ep A002 = AnonymousClass7Ep.A00();
                    AnonymousClass7Ep.A01(new IDxSRunnableShape5S0300000_2_I2(A002, (BrowserLiteJSBridgeCall) requestAutofillJSBridgeCall, browserLiteJSBridgeCallback), A002);
                }
            }
        } catch (JSONException unused) {
        }
    }

    @JavascriptInterface
    public void saveAutofillData(String str) {
        long currentTimeMillis;
        String str2;
        Bundle bundle;
        C89405Ej r3 = this.A07;
        AnonymousClass78Q.A00(r3.A02("JS_SAVE_AUTOFILL_DATA"));
        try {
            JSONObject A0j = C18250wR.A0j(str);
            if (A0j.optString("nonce").equals(this.A03)) {
                Long l = this.A00;
                if (l == null) {
                    currentTimeMillis = 0;
                } else {
                    currentTimeMillis = System.currentTimeMillis() - l.longValue();
                }
                Long valueOf = Long.valueOf(currentTimeMillis);
                AnonymousClass78Q A022 = r3.A02("FORM_COMPLETION");
                A022.A02 = valueOf.longValue();
                int i = this.A04 + 1;
                this.A04 = i;
                A022.A00 = i;
                A022.A08 = this.A01;
                A022.A06 = A05();
                A022.A04 = AnonymousClass7KI.A02(A0j);
                A022.A0D = AnonymousClass7KI.A02(A0j);
                try {
                    str2 = A0j.getString("selectedAutoCompleteTag");
                } catch (JSONException e) {
                    C37252JnL.A00("AutofillSharedUtil", "Failed to get autofill tag", e, e);
                    str2 = null;
                }
                A022.A0E = str2;
                AnonymousClass78Q.A00(A022);
                Intent intent = this.A06;
                if (intent != null && intent.getBooleanExtra(I17.A00(70), false)) {
                    Toast.makeText(A02(), "saveAutofillData", 0).show();
                }
                if (!this.A09) {
                    AutofillData A002 = AnonymousClass7KI.A00(A0j);
                    r3.A07 = A002;
                    if (A0j.has("autofillFields")) {
                        try {
                            bundle = RequestAutofillJSBridgeCall.A00(A0j);
                        } catch (JSONException unused) {
                            bundle = Bundle.EMPTY;
                        }
                    } else {
                        bundle = Bundle.EMPTY;
                    }
                    r3.A04(bundle, this, A002);
                }
            }
        } catch (JSONException unused2) {
        }
    }

    public AutofillSharedJSBridgeProxy(Intent intent, C89405Ej r4, IF5 if5) {
        A06(if5);
        this.A07 = r4;
        this.A06 = intent;
        boolean z = false;
        if (intent != null && intent.getBooleanExtra(I17.A00(360), false)) {
            z = true;
        }
        this.A09 = z;
    }

    @JavascriptInterface
    public void getNonce(String str) {
        this.A03 = C18230wP.A0h();
        GetNonceJSBridgeCall getNonceJSBridgeCall = new GetNonceJSBridgeCall(A02(), A03(), this.A03, A05(), C18250wR.A0j(str));
        String str2 = (String) C86114wI.A0f(getNonceJSBridgeCall, "callbackID");
        String str3 = this.A03;
        JSONObject A0y = C18230wP.A0y();
        try {
            A0y.put("nonce", str3);
        } catch (JSONException e) {
            C37252JnL.A00("GetNonceJSBridgeCall", "Failed to set nonce result", e, e);
        }
        Bundle A062 = C18180wK.A06();
        A062.putString("callbackID", str2);
        A062.putString("callback_result", A0y.toString());
        A09(A062, getNonceJSBridgeCall);
        this.A00 = null;
        this.A04 = 0;
        String A0h = C18230wP.A0h();
        this.A01 = A0h;
        C89405Ej r0 = this.A07;
        r0.A0G = A0h;
        r0.A0H = null;
        r0.A0A = null;
    }

    @JavascriptInterface
    public void hideAutoFillBar(String str) {
        try {
            JSONObject A0j = C18250wR.A0j(str);
            if (A0j.optString("nonce").equals(this.A03)) {
                HideAutofillBarJSBridgeCall hideAutofillBarJSBridgeCall = new HideAutofillBarJSBridgeCall(A02(), A03(), this.A03, A05(), A0j);
                BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback = this.A08;
                AnonymousClass7Ep A002 = AnonymousClass7Ep.A00();
                AnonymousClass7Ep.A01(new IDxSRunnableShape5S0300000_2_I2(A002, (BrowserLiteJSBridgeCall) hideAutofillBarJSBridgeCall, browserLiteJSBridgeCallback), A002);
            }
        } catch (JSONException unused) {
        }
    }

    @JavascriptInterface
    public void initializeAutofillFrameworkFunction(String str) {
        try {
            this.A02 = C18250wR.A0j(str).getString("functionName");
        } catch (JSONException e) {
            Log.e("AutofillSharedJSBridgeProxy", "Exception parsing initializeAutofillFrameworkFunction call", e);
        }
    }

    @JavascriptInterface
    public void initializeCallbackHandler(String str) {
        try {
            this.A05 = C18250wR.A0j(str).getString(FXPFAccessLibraryDebugFragment.NAME);
        } catch (JSONException e) {
            Log.e("AutofillSharedJSBridgeProxy", "Exception parsing initializeCallbackHandler call", e);
        }
    }
}
