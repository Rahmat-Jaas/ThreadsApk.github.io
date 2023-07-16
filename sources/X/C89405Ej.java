package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.widget.Toast;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.callback.IDxSRunnableShape5S0300000_2_I2;
import com.facebook.browser.lite.extensions.autofill.base.AutofillControllerBase$3;
import com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.instagram.AutofillController$InstagramAutofillOptOutCallbackHandler;
import com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.extensions.autofill.model.AutofillSettings;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.IDxObjectShape120S0200000_2_I2;
import com.instagram.service.session.UserSession;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* renamed from: X.5Ej  reason: invalid class name and case insensitive filesystem */
public final class C89405Ej extends C115616vd implements L3Z, L3Y, L3X {
    public int A00 = 1;
    public int A01 = 0;
    public long A02;
    public AnonymousClass099 A03 = null;
    public C143158gC A04 = null;
    public C107046g3 A05;
    public AnonymousClass7K3 A06;
    public AutofillData A07;
    public C1200778k A08;
    public AutofillSettings A09;
    public RequestAutofillJSBridgeCall A0A;
    public UserSession A0B;
    public Integer A0C = AnonymousClass006.A01;
    public String A0D;
    public String A0E;
    public String A0F = "connect_opt_out";
    public String A0G;
    public List A0H;
    public Set A0I;
    public Set A0J;
    public boolean A0K = false;
    public boolean A0L = false;
    public boolean A0M = false;
    public boolean A0N = false;
    public boolean A0O = false;
    public boolean A0P = false;
    public boolean A0Q = false;
    public boolean A0R = false;
    public boolean A0S = false;
    public boolean A0T = false;
    public boolean A0U = false;
    public boolean A0V = false;
    public boolean A0W = false;
    public boolean A0X = false;
    public boolean A0Y = false;
    public boolean A0Z = false;
    public boolean A0a = true;
    public final C113056qe A0b;
    public final String A0c;
    public final Map A0d;
    public final Map A0e;
    public final Map A0f;
    public final Map A0g;
    public final Map A0h = AnonymousClass0wJ.A0y();
    public final Set A0i;

    public static void A00(C89405Ej r7, IF5 if5) {
        IF5 if52 = if5;
        String A002 = AnonymousClass7K0.A00(if5.A04(0));
        String A003 = AnonymousClass7K0.A00(if5.A03());
        if (!TextUtils.isEmpty(A002) && !TextUtils.isEmpty(A003)) {
            C89405Ej r5 = r7;
            Set set = r7.A0i;
            if (!set.contains(A002) && !set.contains(A003) && !r7.A0I.contains(A002) && !r7.A0I.contains(A003)) {
                boolean z = false;
                r7.A0W = false;
                Intent intent = r7.A01;
                if (intent != null) {
                    z = intent.getBooleanExtra(I17.A00(70), false);
                }
                Map map = r7.A0f;
                Boolean bool = (Boolean) map.get(A003);
                if (bool != null) {
                    if (z) {
                        Toast.makeText(r5.A00, AnonymousClass00U.A0o("Autofill Opt Out: ", bool.booleanValue()), 0).show();
                    }
                    if (!bool.booleanValue()) {
                        r5.A09(if52);
                        return;
                    }
                    return;
                }
                AnonymousClass7Ep A004 = AnonymousClass7Ep.A00();
                AutofillController$InstagramAutofillOptOutCallbackHandler autofillController$InstagramAutofillOptOutCallbackHandler = new AutofillController$InstagramAutofillOptOutCallbackHandler(r5.A00, r5, if52, map, z);
                BrowserLiteCallback browserLiteCallback = A004.A06;
                if (browserLiteCallback != null) {
                    try {
                        browserLiteCallback.Blw(A003, autofillController$InstagramAutofillOptOutCallbackHandler);
                    } catch (RemoteException unused) {
                    }
                }
            }
        }
    }

    public final Integer A03() {
        boolean booleanValue;
        int i;
        AutofillSettings autofillSettings;
        if (!this.A0U) {
            booleanValue = false;
        } else {
            booleanValue = C63803iN.A05(AnonymousClass0TJ.A06, this.A0B, 36310512515940469L).booleanValue();
        }
        if (!booleanValue || (autofillSettings = this.A09) == null) {
            SharedPreferences A042 = C28161tl.A04(this.A0B);
            if (!A042.getBoolean(C18170wI.A00(857), false)) {
                i = A042.getInt(C18170wI.A00(78), 0);
            }
            return AnonymousClass006.A00;
        }
        if (!autofillSettings.A04) {
            i = autofillSettings.A01;
        }
        return AnonymousClass006.A00;
        if (i >= 3) {
            return AnonymousClass006.A01;
        }
        return AnonymousClass006.A0C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d0, code lost:
        if (r1 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r0 != null) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy r12, com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall r13, java.util.List r14) {
        /*
            r11 = this;
            r6 = r11
            r10 = r14
            r11.A0H = r14
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r11.A02
            long r3 = r3 - r0
            r1 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0072
            X.Kys r0 = r11.A03
            java.lang.String r9 = ""
            if (r0 == 0) goto L_0x0076
            com.facebook.browser.lite.BrowserLiteFragment r0 = (com.facebook.browser.lite.BrowserLiteFragment) r0
            java.lang.String r0 = r0.A0e
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r9 = r0
        L_0x001e:
            java.util.Map r5 = r11.A0d
            boolean r4 = r11.A0W
            r3 = 0
            java.lang.String r2 = X.AnonymousClass7K0.A00(r9)
            boolean r0 = r5.containsKey(r2)
            java.lang.Integer r1 = X.AnonymousClass006.A00
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r5.get(r2)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x003d
            if (r4 == 0) goto L_0x0073
            java.lang.Integer r1 = X.AnonymousClass006.A0C
        L_0x003d:
            int r1 = r1.intValue()
            r0 = 1
            r5 = r12
            r8 = r13
            if (r1 == r0) goto L_0x0078
            r0 = 2
            if (r1 != r0) goto L_0x0072
            java.util.Map r0 = r11.A0g
            java.lang.Object r0 = r0.get(r9)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            if (r0 == 0) goto L_0x0072
            java.lang.String r3 = "callbackID"
            java.lang.Object r1 = X.C86114wI.A0f(r13, r3)
            java.lang.String r1 = (java.lang.String) r1
            org.json.JSONObject r0 = r0.A01()
            android.os.Bundle r2 = X.C18180wK.A06()
            r2.putString(r3, r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "callback_result"
            r2.putString(r0, r1)
            r12.A09(r2, r13)
        L_0x0072:
            return
        L_0x0073:
            java.lang.Integer r1 = X.AnonymousClass006.A01
            goto L_0x003d
        L_0x0076:
            r0 = r9
            goto L_0x001d
        L_0x0078:
            java.lang.String r0 = "PROMPTED_AUTOFILL"
            X.78Q r2 = r11.A02(r0)
            java.lang.String r0 = r13.A02()
            r2.A0E = r0
            java.util.LinkedHashSet r0 = r13.A03()
            java.lang.String r0 = X.AnonymousClass7KI.A01(r0)
            r2.A04 = r0
            java.util.LinkedHashSet r0 = r13.A04()
            java.lang.String r0 = X.AnonymousClass7KI.A01(r0)
            r2.A0D = r0
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x00bd
            r1 = 0
            java.lang.Object r0 = r14.get(r1)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            java.util.Map r0 = X.C86164wN.A0l(r0)
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r14.get(r1)
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r0 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r0
            java.util.Map r0 = X.C86164wN.A0l(r0)
            java.util.Set r0 = r0.keySet()
            java.lang.String r3 = X.AnonymousClass7KI.A01(r0)
        L_0x00bd:
            r2.A05 = r3
            java.lang.String r0 = r11.A0G
            r2.A08 = r0
            int r0 = r14.size()
            r2.A00 = r0
            boolean r0 = r11.A0M
            boolean r1 = r11.A0N
            if (r0 == 0) goto L_0x00d2
            r0 = 1
            if (r1 == 0) goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            r2.A0L = r0
            X.6n8 r7 = r2.A01()
            X.838 r4 = new X.838
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.C1189172u.A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89405Ej.A06(com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy, com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall, java.util.List):void");
    }

    public final boolean A0C(IF5 if5) {
        String A002;
        Boolean bool;
        String A003 = AnonymousClass7K0.A00(if5.A04(0));
        String A004 = AnonymousClass7K0.A00(if5.A03());
        if (TextUtils.isEmpty(A003) || TextUtils.isEmpty(A004)) {
            return true;
        }
        Set set = this.A0i;
        if (set.contains(A003) || set.contains(A004) || (A002 = AnonymousClass7K0.A00(if5.A03())) == null || (bool = (Boolean) this.A0f.get(A002)) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static void A01(C89405Ej r1, String str, boolean z) {
        String str2;
        AnonymousClass78Q A022;
        AnonymousClass7K3 r0;
        if (!z || (r0 = r1.A06) == null) {
            C39730Kys kys = r1.A03;
            if (kys != null) {
                str2 = ((BrowserLiteFragment) kys).A0e;
            } else {
                str2 = "";
            }
            A022 = r1.A02(str);
            A022.A06 = str2;
        } else {
            A022 = AnonymousClass7K3.A01(r0, str);
        }
        AnonymousClass78Q.A00(A022);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass78Q A02(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.A0c
            X.78Q r5 = new X.78Q
            r5.<init>(r7, r0)
            java.lang.String r0 = "CONTACT_AUTOFILL"
            r5.A0F = r0
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            int r0 = r7.hashCode()
            switch(r0) {
                case -1993895147: goto L_0x004f;
                case -1824420039: goto L_0x004c;
                case -1796214034: goto L_0x0049;
                case -1654021070: goto L_0x0046;
                case -1057706804: goto L_0x0043;
                case -936146503: goto L_0x0040;
                case -511727928: goto L_0x003d;
                case 592348558: goto L_0x003a;
                default: goto L_0x0016;
            }
        L_0x0016:
            r5.A0I = r4
            X.7K3 r0 = r6.A06
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.A0L
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "credit_card_pux"
        L_0x0022:
            r5.A0H = r0
            boolean r0 = r6.A0V
            r0 = r0 ^ 1
            r5.A0J = r0
            java.lang.Integer r1 = r6.A03()
            java.lang.Integer r0 = X.AnonymousClass006.A00
            boolean r0 = r1.equals(r0)
            r5.A0K = r0
            return r5
        L_0x0037:
            java.lang.String r0 = "credit_card_nux"
            goto L_0x0022
        L_0x003a:
            java.lang.String r0 = "PROMPTED_CONNECT"
            goto L_0x0051
        L_0x003d:
            java.lang.String r0 = "FAILED_CONNECT"
            goto L_0x0051
        L_0x0040:
            java.lang.String r0 = "DECLINED_CONNECT"
            goto L_0x0051
        L_0x0043:
            java.lang.String r0 = "SUCCEEDED_CONNECT"
            goto L_0x0051
        L_0x0046:
            java.lang.String r0 = "ACCEPTED_CONNECT"
            goto L_0x0051
        L_0x0049:
            java.lang.String r0 = "DECLINED_SAVE"
            goto L_0x0051
        L_0x004c:
            java.lang.String r0 = "PROMPTED_SAVE"
            goto L_0x0051
        L_0x004f:
            java.lang.String r0 = "ACCEPTED_SAVE"
        L_0x0051:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0016
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r6.A09
            if (r0 == 0) goto L_0x00a1
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r0 = r0.A02
            if (r0 == 0) goto L_0x00a1
            java.lang.String r1 = "Yes"
        L_0x0061:
            java.lang.String r0 = "connect_eligibility"
            r4.put(r0, r1)
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r6.A09
            if (r0 == 0) goto L_0x009e
            java.lang.String r1 = ""
            int r0 = r0.A00
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r0)
        L_0x0072:
            java.lang.String r0 = "connect_neg_count"
            r4.put(r0, r1)
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r6.A09
            if (r0 == 0) goto L_0x0016
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r0 = r0.A02
            if (r0 == 0) goto L_0x0016
            com.instagram.service.session.UserSession r3 = r6.A0B
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36310512515874932(0x810038001f0074, double:3.026252553512966E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = "connect_qe_ineligible"
        L_0x0094:
            java.lang.String r1 = "connect_status"
            r4.put(r1, r0)
            goto L_0x0016
        L_0x009b:
            java.lang.String r0 = r6.A0F
            goto L_0x0094
        L_0x009e:
            java.lang.String r1 = "0"
            goto L_0x0072
        L_0x00a1:
            java.lang.String r1 = "No"
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89405Ej.A02(java.lang.String):X.78Q");
    }

    public final void A04(Bundle bundle, AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy, AutofillData autofillData) {
        RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = new RequestAutofillJSBridgeCall(this.A00, (Bundle) null, bundle, "_AutofillExtensions", "");
        this.A0A = requestAutofillJSBridgeCall;
        AutofillControllerBase$3 autofillControllerBase$3 = new AutofillControllerBase$3(autofillSharedJSBridgeProxy, this, autofillData, requestAutofillJSBridgeCall);
        AnonymousClass7Ep A002 = AnonymousClass7Ep.A00();
        AnonymousClass7Ep.A01(new IDxSRunnableShape5S0300000_2_I2(A002, (BrowserLiteJSBridgeCall) requestAutofillJSBridgeCall, (BrowserLiteJSBridgeCallback) autofillControllerBase$3), A002);
    }

    public final void A05(AnonymousClass099 r4, C111316n8 r5, String str) {
        Dialog dialog;
        AnonymousClass7K3 r0;
        C113056qe r2;
        if (this.A0X && (r4 instanceof AnonymousClass5ES)) {
            return;
        }
        if (!this.A0K || !this.A0Q || this.A0C != AnonymousClass006.A00 || (r0 = this.A06) == null || !r0.A0D() || (r4 instanceof AnonymousClass5EU) || (r4 instanceof AnonymousClass5EX)) {
            AnonymousClass099 r02 = this.A03;
            if (!(r02 == null || (dialog = r02.A02) == null || !dialog.isShowing())) {
                AnonymousClass099 r1 = this.A03;
                if (!r1.mRemoving) {
                    r1.A06();
                }
            }
            this.A03 = r4;
            L3B l3b = this.A02;
            if (l3b != null) {
                if (r4 instanceof AnonymousClass5ES) {
                    this.A0X = true;
                }
                r4.A0A(l3b.getParentFragmentManager(), str);
                if (r5 != null) {
                    AnonymousClass7KI.A08(r5);
                }
            }
        } else if ((r4 instanceof AnonymousClass55x) && (r2 = this.A0b) != null) {
            AnonymousClass55x r42 = (AnonymousClass55x) r4;
            if (C18180wK.A1Z(Looper.myLooper(), Looper.getMainLooper())) {
                r2.A00(r42, r5, str);
            } else {
                C1189172u.A00(new C1363682l(r2, r42, r5, str));
            }
        }
    }

    public final void A07(AutofillConnectPayload autofillConnectPayload, AutofillData autofillData, Boolean bool) {
        C12560m7 r1;
        L3B l3b = this.A02;
        if (l3b != null) {
            l3b.getParentFragmentManager();
            if (!this.A0T && !autofillConnectPayload.A03.isEmpty() && this.A06 != null) {
                this.A0T = true;
                this.A0H = Arrays.asList(new AutofillData[]{autofillData});
                boolean booleanValue = bool.booleanValue();
                A01(this, "PROMPTED_CONNECT", booleanValue);
                UserSession userSession = this.A0B;
                C04220Ms.A0B(userSession, 0);
                Bundle A062 = C18180wK.A06();
                AnonymousClass5EV r2 = new AnonymousClass5EV();
                A062.putParcelable("connect_payload", autofillConnectPayload);
                C86134wK.A15(A062, userSession);
                A062.putBoolean("is_payment_form", booleanValue);
                r2.setArguments(A062);
                r2.A06 = new IDxObjectShape120S0200000_2_I2(0, this, bool);
                r2.A04 = new IDxObjectShape120S0200000_2_I2(1, this, bool);
                r2.A08 = new AnonymousClass86B(this, autofillConnectPayload, autofillData, bool);
                r2.A05 = new IDxObjectShape120S0200000_2_I2(2, this, bool);
                r2.A07 = new IDxObjectShape120S0200000_2_I2(3, this, autofillConnectPayload);
                L3B l3b2 = this.A02;
                if (l3b2 != null) {
                    r1 = l3b2.getParentFragmentManager();
                } else {
                    r1 = null;
                }
                r2.A0A(r1, "IGConnectAndAutofillDialogFragment");
            }
        }
    }

    public final void A08(AutofillData autofillData) {
        IF5 BHU;
        AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy;
        C39730Kys kys = this.A03;
        if (kys != null && (BHU = kys.BHU()) != null && autofillData != null && (autofillSharedJSBridgeProxy = (AutofillSharedJSBridgeProxy) this.A0h.get(BHU)) != null) {
            try {
                SaveAutofillDataJSBridgeCall A082 = autofillSharedJSBridgeProxy.A08(AnonymousClass7KI.A07(autofillData));
                BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback = autofillSharedJSBridgeProxy.A08;
                AnonymousClass7Ep A002 = AnonymousClass7Ep.A00();
                AnonymousClass7Ep.A01(new IDxSRunnableShape5S0300000_2_I2(A002, (BrowserLiteJSBridgeCall) A082, browserLiteJSBridgeCallback), A002);
            } catch (JSONException unused) {
                throw C18180wK.A0a("Illegal JSON for autofill save");
            }
        }
    }

    public final void A09(IF5 if5) {
        String str;
        if (this.A01 != null) {
            if (this.A0Y || !this.A0a) {
                str = "//connect.facebook.net/en_US/iab.autofill.beta.enhanced.js";
            } else {
                str = "//connect.facebook.net/en_US/iab.autofill.enhanced.js";
            }
            if5.A0B(StringFormatUtil.formatStrLocaleSafe("(function(d, s, id){    var sdkURL = \"%s\";    var js, fjs = d.getElementsByTagName(s)[0];    if (d.getElementById(id)) {return;}    js = d.createElement(s); js.id = id;    js.src = sdkURL;    fjs.parentNode.insertBefore(js, fjs);}(document, 'script', 'instagram-autofill-sdk'));", (Object) str));
        }
    }

    public final boolean A0A() {
        return C18190wL.A1X(C28161tl.A04(this.A0B), C18170wI.A00(855));
    }

    public final boolean A0B() {
        if (!this.A0L || C28161tl.A04(this.A0B).getBoolean(C18170wI.A00(856), true)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2.contains(r1) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0D(java.lang.String r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0004
            r1 = 1
        L_0x0003:
            return r1
        L_0x0004:
            java.util.Map r3 = r4.A0f
            java.util.Set r2 = r4.A0i
            java.lang.String r1 = X.AnonymousClass7K0.A00(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0019
            boolean r1 = r2.contains(r1)
            r0 = 0
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            r1 = 1
            if (r0 != 0) goto L_0x0003
            java.lang.String r0 = X.AnonymousClass7K0.A00(r5)
            if (r0 == 0) goto L_0x0003
            java.lang.Object r0 = r3.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0003
            boolean r1 = r0.booleanValue()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89405Ej.A0D(java.lang.String):boolean");
    }

    public final void destroy() {
        this.A0h.clear();
        super.destroy();
    }

    public C89405Ej(String str, String str2, Map map) {
        Set emptySet;
        this.A0c = str;
        if (!TextUtils.isEmpty(str2)) {
            emptySet = C86114wI.A0t(str2.trim().split(" "));
        } else {
            emptySet = Collections.emptySet();
        }
        this.A0i = emptySet;
        this.A0f = new ConcurrentHashMap(map);
        this.A0d = AnonymousClass0wJ.A0y();
        this.A0g = AnonymousClass0wJ.A0y();
        this.A0e = AnonymousClass0wJ.A0y();
        this.A0J = C18200wM.A0u();
        this.A0I = C18200wM.A0u();
        this.A0b = new C113056qe(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(boolean r6) {
        /*
            r5 = this;
            java.lang.Integer r1 = r5.A03()
            java.lang.Integer r0 = X.AnonymousClass006.A01
            if (r1 != r0) goto L_0x005e
            r4 = 0
            boolean r0 = r5.A0U
            if (r0 == 0) goto L_0x004d
            com.instagram.service.session.UserSession r3 = r5.A0B
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36310512515940469(0x81003800200075, double:3.0262525535544116E-306)
            java.lang.Boolean r0 = X.C63803iN.A05(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r0 = r5.A09
            if (r0 == 0) goto L_0x004d
            int r4 = r0.A01
        L_0x0026:
            com.instagram.service.session.UserSession r3 = r5.A0B
            X.0TJ r2 = X.AnonymousClass0TJ.A06
            r0 = 36591987493306424(0x820038002a0038, double:3.2042584626494015E-306)
            java.lang.Long r0 = X.C63803iN.A07(r2, r3, r0)
            int r0 = r0.intValue()
            if (r4 >= r0) goto L_0x005e
            com.instagram.service.session.UserSession r3 = r5.A0B
            if (r6 == 0) goto L_0x003f
            X.0TJ r2 = X.AnonymousClass0TJ.A05
        L_0x003f:
            r0 = 36310512516464759(0x81003800280077, double:3.026252553885975E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            boolean r0 = X.C18210wN.A1W(r0)
            return r0
        L_0x004d:
            com.instagram.service.session.UserSession r0 = r5.A0B
            android.content.SharedPreferences r1 = X.C28161tl.A04(r0)
            r0 = 78
            java.lang.String r0 = X.C18170wI.A00(r0)
            int r4 = r1.getInt(r0, r4)
            goto L_0x0026
        L_0x005e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89405Ej.A0E(boolean):boolean");
    }
}
