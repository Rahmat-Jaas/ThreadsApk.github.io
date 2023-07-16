package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.base.AutofillSharedJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.AutofillContactDataCallback;
import com.facebook.browser.lite.ipc.BrowserLiteCallback;
import com.facebook.browser.lite.webview.SystemWebView;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONException;

/* renamed from: X.6vd  reason: invalid class name and case insensitive filesystem */
public class C115616vd {
    public Context A00 = null;
    public Intent A01 = null;
    public L3B A02 = null;
    public C39730Kys A03 = null;
    public View A04 = null;
    public C39812L1f A05 = null;

    public void CAQ(boolean z) {
    }

    public void CDL(int i) {
    }

    public void CK3(String str) {
    }

    public final boolean CsT(IF5 if5, String str) {
        return false;
    }

    public boolean CsU(IF5 if5, Boolean bool, Boolean bool2, String str) {
        return false;
    }

    public void destroy() {
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A02 = null;
        this.A03 = null;
        this.A05 = null;
    }

    public final String getUrl() {
        return null;
    }

    public void AIX(IF5 if5, String str, boolean z) {
        if (this instanceof C89405Ej) {
            ((C89405Ej) this).A0X = false;
        }
    }

    public void Bho(IF5 if5) {
        C114926u8 r0;
        FragmentActivity fragmentActivity;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        ViewStub viewStub;
        if (this instanceof C89385Eh) {
            C89385Eh r4 = (C89385Eh) this;
            L3B l3b = r4.A02;
            if (l3b != null && (viewStub = (ViewStub) ((BrowserLiteFragment) l3b).A0D.findViewById(R.id.call_extension_iab_stub)) != null) {
                viewStub.setLayoutResource(R.layout.ig_call_extension_view);
                View inflate = viewStub.inflate();
                r4.A00 = (LinearLayout) inflate.findViewById(R.id.bottom_layout);
                ((IgdsBottomButtonLayout) inflate.findViewById(R.id.bottom_button)).setPrimaryAction(l3b.getActivity().getString(2131822854), C86164wN.A0L(l3b, r4, 3));
            }
        } else if (this instanceof C89395Ei) {
            C89395Ei r42 = (C89395Ei) this;
            L3B l3b2 = r42.A02;
            if (l3b2 != null) {
                r42.A00 = new C113336rB(r42);
                FragmentActivity activity = l3b2.getActivity();
                C04220Ms.A06(activity);
                C113116ql r8 = new C113116ql(activity, l3b2, r42.A03);
                C04530Oa A022 = AnonymousClass0OY.A02(C86154wM.A15(r8, r42, l3b2, 9));
                r42.A06 = A022;
                C113336rB r6 = r42.A00;
                if (r6 != null) {
                    UserSession userSession = r42.A03;
                    ArrayList arrayList = r42.A05;
                    C04220Ms.A0C(A022, "null cannot be cast to non-null type kotlin.Lazy<com.instagram.facebookpay.offsite.inappwebviewer.IgIAWCheckoutHandler>");
                    r42.A02 = new C92625ix(r6, l3b2, r8, userSession, arrayList, A022);
                    C113336rB r5 = r42.A00;
                    if (r5 != null) {
                        if (C63803iN.A0E(AnonymousClass0TJ.A05, AnonymousClass7HK.A00(), 36315855453948747L)) {
                            r0 = new AnonymousClass5EZ(r5);
                        } else {
                            r0 = new C114926u8(r5);
                        }
                        r0.A00(if5);
                        r42.A01 = r0;
                        C89395Ei.A00(r42, l3b2);
                        L3B l3b3 = r42.A02;
                        C148838sG r62 = null;
                        if (l3b3 != null) {
                            fragmentActivity = l3b3.getActivity();
                        } else {
                            fragmentActivity = null;
                        }
                        if (!(fragmentActivity instanceof AnonymousClass066) || fragmentActivity == null) {
                            lifecycleCoroutineScopeImpl = null;
                        } else {
                            lifecycleCoroutineScopeImpl = AnonymousClass3J3.A00(fragmentActivity.getLifecycle());
                        }
                        C148838sG r1 = r42.A07;
                        if (r1 != null) {
                            r1.AC7((CancellationException) null);
                        }
                        if (lifecycleCoroutineScopeImpl != null) {
                            r62 = C25237DiI.A00((Integer) null, C121437Gd.A00(), C86164wN.A0o(r42, (C146958n9) null, 29), lifecycleCoroutineScopeImpl, 2);
                        }
                        r42.A07 = r62;
                        return;
                    }
                }
                C04220Ms.A0E("messageHandlerCallback");
                throw null;
            }
        } else if (this instanceof C89405Ej) {
            C89405Ej r43 = (C89405Ej) this;
            AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy = new AutofillSharedJSBridgeProxy(r43.A01, r43, if5);
            String str = autofillSharedJSBridgeProxy.A03;
            C91235fr r12 = ((SystemWebView) if5).A01;
            r12.addJavascriptInterface(autofillSharedJSBridgeProxy, str);
            if (r43.A0K) {
                if5.A0D = new C112066ov(r43, if5);
                AnonymousClass7K3 r2 = r43.A06;
                if (r2 != null) {
                    Context context = r12.getContext();
                    if (r2.A04 == null) {
                        r2.A04 = if5;
                    }
                    new C1374688r(context, r2).start();
                }
            }
            r43.A0h.put(if5, autofillSharedJSBridgeProxy);
            if (r43.A0U) {
                if (C63803iN.A05(AnonymousClass0TJ.A05, r43.A0B, 36310512515940469L).booleanValue()) {
                    new C1374488p(r43).start();
                }
            }
        }
    }

    public final void BlP(Fragment fragment) {
        if (this instanceof C89395Ei) {
            C89395Ei r1 = (C89395Ei) this;
            C04220Ms.A0B(fragment, 0);
            if (fragment instanceof AnonymousClass5jB) {
                AnonymousClass5jB r3 = (AnonymousClass5jB) fragment;
                C92625ix r0 = r1.A02;
                if (r0 != null) {
                    r3.A0F(r0.getEcpHandler());
                } else {
                    C04220Ms.A0E("messageHandler");
                    throw null;
                }
            }
        }
    }

    public void Bn8() {
        C114926u8 r3;
        if ((this instanceof C89395Ei) && (r3 = ((C89395Ei) this).A01) != null && (r3 instanceof AnonymousClass5EZ)) {
            AnonymousClass5EZ r32 = (AnonymousClass5EZ) r3;
            if (r32.A04) {
                WeakReference weakReference = r32.A00;
                if (weakReference != null) {
                    C36428JUn jUn = (C36428JUn) weakReference.get();
                    C91235fr r2 = null;
                    if (jUn != null) {
                        r2 = ((SystemWebView) jUn).A01;
                    }
                    if ((r2 instanceof WebView) && r2 != null) {
                        if (WebViewFeatureInternal.WEB_MESSAGE_LISTENER.A01()) {
                            AnonymousClass07Q.A01(r2).removeWebMessageListener("fbpayIAWIFrameBridge");
                        } else {
                            throw C86134wK.A0s("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    }
                } else {
                    C04220Ms.A0E("browserLiteWebView");
                    throw null;
                }
            }
            WeakReference weakReference2 = r32.A00;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
        }
    }

    public void BuR(IF5 if5) {
        if (this instanceof C89405Ej) {
            C89405Ej.A00((C89405Ej) this, if5);
        }
    }

    public final void BxT(Context context, Intent intent, View view, L3B l3b, C39812L1f l1f, C39730Kys kys) {
        this.A00 = context;
        this.A01 = intent;
        this.A04 = view;
        this.A02 = l3b;
        this.A03 = kys;
        this.A05 = l1f;
    }

    public final boolean C15() {
        if (!(this instanceof C89395Ei)) {
            return false;
        }
        C92625ix r0 = ((C89395Ei) this).A02;
        if (r0 != null) {
            r0.A04();
            return false;
        }
        C04220Ms.A0E("messageHandler");
        throw null;
    }

    public final void C52(IF5 if5, String str) {
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy;
        if ((this instanceof C89405Ej) && (browserLiteJSBridgeProxy = (BrowserLiteJSBridgeProxy) ((C89405Ej) this).A0h.get(if5)) != null) {
            browserLiteJSBridgeProxy.A07(str);
        }
    }

    public void C9w(IF5 if5, String str) {
        if (this instanceof C89405Ej) {
            C89405Ej.A00((C89405Ej) this, if5);
        }
    }

    public void C9z(IF5 if5, long j) {
        if (this instanceof C89405Ej) {
            C89405Ej r2 = (C89405Ej) this;
            C89405Ej.A00(r2, if5);
            r2.A02 = SystemClock.elapsedRealtime();
        }
    }

    public void CA8(String str) {
        String str2;
        L3B l3b;
        if (this instanceof C89395Ei) {
            C89395Ei r2 = (C89395Ei) this;
            C04220Ms.A0B(str, 0);
            if (!C04220Ms.A0I(r2.A04, str)) {
                if (!C04220Ms.A0I(AnonymousClass6IU.A00(r2.A04), AnonymousClass6IU.A00(str)) && (l3b = r2.A02) != null) {
                    C89395Ei.A00(r2, l3b);
                }
                r2.A04 = str;
                C92625ix r0 = r2.A02;
                if (r0 != null) {
                    r0.A04();
                } else {
                    C04220Ms.A0E("messageHandler");
                    throw null;
                }
            }
        } else if (this instanceof C89405Ej) {
            C89405Ej r3 = (C89405Ej) this;
            AnonymousClass7K3 r4 = r3.A06;
            if (r3.A0K && r4 != null) {
                AutofillData autofillData = null;
                C39730Kys kys = r3.A03;
                if (kys != null) {
                    C1200778k r02 = (C1200778k) r4.A0T.get(((BrowserLiteFragment) kys).A0e);
                    if (r02 == null || (autofillData = r02.A00) == null) {
                        Map map = r3.A0g;
                        C39730Kys kys2 = r3.A03;
                        if (kys2 != null) {
                            str2 = ((BrowserLiteFragment) kys2).A0e;
                        } else {
                            str2 = null;
                        }
                        autofillData = (AutofillData) map.get(AnonymousClass7K0.A00(str2));
                    }
                }
                AutofillData autofillData2 = new AutofillData(r4.A0F);
                if (r3.A0P) {
                    AnonymousClass7K3.A04(r4, "CONNECT_PAYMENT_FORM_COMPLETION");
                    r3.A0P = false;
                }
                if (r3.A0O) {
                    AnonymousClass7K3.A04(r4, "USAGE_PAYMENT_FORM_COMPLETION");
                    r3.A0O = false;
                }
                AutofillData autofillData3 = r3.A07;
                if (autofillData3 != null && autofillData3.A02()) {
                    autofillData = r3.A07;
                } else if (autofillData2.A02()) {
                    autofillData = autofillData2;
                }
                r4.A0E(autofillData, str);
                r4.A0Q = false;
                r4.A0N = false;
                r4.A0A = C18230wP.A0h();
                r4.A08 = null;
                r4.A0K = C18200wM.A0u();
                r4.A0I.clear();
                r4.A0O = false;
                r4.A0P = false;
                r4.A0H = AnonymousClass0wJ.A0y();
                r4.A0G = AnonymousClass0wJ.A0y();
                r4.A0F = AnonymousClass0wJ.A0y();
            }
            C113056qe r03 = r3.A0b;
            if (r03 != null) {
                r03.A05 = false;
                r03.A04.clear();
            }
            r3.A0X = false;
        }
    }

    public final void CIl(int i, int i2, int i3, int i4) {
        boolean z;
        if (this instanceof C89385Eh) {
            C89385Eh r3 = (C89385Eh) this;
            float f = (float) (i2 - i4);
            if (Math.abs((float) (i - i3)) <= Math.abs(f)) {
                int i5 = (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (f == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1));
                LinearLayout linearLayout = r3.A00;
                if (i5 < 0) {
                    if (linearLayout != null) {
                        if (!r3.A01) {
                            linearLayout.setVisibility(0);
                            TranslateAnimation translateAnimation = new TranslateAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) linearLayout.getHeight(), (float) 0);
                            translateAnimation.setDuration(500);
                            translateAnimation.setFillAfter(true);
                            translateAnimation.setInterpolator(new AccelerateInterpolator());
                            linearLayout.startAnimation(translateAnimation);
                        }
                        z = true;
                    } else {
                        return;
                    }
                } else if (linearLayout != null) {
                    z = false;
                    if (r3.A01) {
                        linearLayout.setVisibility(8);
                        TranslateAnimation translateAnimation2 = new TranslateAnimation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) 0, (float) linearLayout.getHeight());
                        translateAnimation2.setDuration(500);
                        translateAnimation2.setFillAfter(true);
                        translateAnimation2.setInterpolator(new AccelerateInterpolator());
                        linearLayout.startAnimation(translateAnimation2);
                    }
                } else {
                    return;
                }
                r3.A01 = z;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r7 = (X.AnonymousClass5Eg) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CLR(boolean r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass5Eg
            if (r0 == 0) goto L_0x0052
            r7 = r8
            X.5Eg r7 = (X.AnonymousClass5Eg) r7
            android.content.Intent r1 = r7.A01
            r2 = 0
            if (r1 == 0) goto L_0x0052
            r0 = 630(0x276, float:8.83E-43)
            java.lang.String r0 = X.I17.A00(r0)
            boolean r0 = r1.getBooleanExtra(r0, r2)
            if (r0 == 0) goto L_0x0052
            X.L3B r0 = r7.A02
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r6 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.graphics.Rect r5 = X.C86134wK.A0D()
            r0.getWindowVisibleDisplayFrame(r5)
            int r4 = r5.height()
            int r0 = r7.A00
            if (r4 == r0) goto L_0x0052
            r1.height = r4
            int r3 = r5.left
            int r2 = r5.top
            int r1 = r5.right
            int r0 = r5.bottom
            r6.layout(r3, r2, r1, r0)
            r6.requestLayout()
            r7.A00 = r4
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115616vd.CLR(boolean, int, boolean, boolean, boolean):void");
    }

    public final void CPc(MotionEvent motionEvent, View view) {
        AnonymousClass7K3 r4;
        IF5 if5;
        if (this instanceof C89405Ej) {
            C89405Ej r1 = (C89405Ej) this;
            if (r1.A0K && (r4 = r1.A06) != null && r4.A0N && 1 == motionEvent.getAction() && (if5 = r4.A04) != null) {
                C89405Ej r12 = r4.A02;
                if (!r12.A0C(if5) && !r12.A0D(AnonymousClass7K3.A02(r4))) {
                    SystemWebView systemWebView = (SystemWebView) r4.A04;
                    C872350v r3 = new C872350v();
                    boolean z = systemWebView.A0I;
                    C91235fr r0 = systemWebView.A01;
                    if (z) {
                        C91235fr.A00(r3, r0);
                    } else {
                        r0.onProvideAutofillVirtualStructure(r3, 0);
                    }
                    r4.A0A(r3);
                }
            }
        }
    }

    public void Csd(IF5 if5, Boolean bool, Boolean bool2, String str) {
        BrowserLiteJSBridgeProxy browserLiteJSBridgeProxy;
        if ((this instanceof C89405Ej) && (browserLiteJSBridgeProxy = (BrowserLiteJSBridgeProxy) ((C89405Ej) this).A0h.get(if5)) != null) {
            browserLiteJSBridgeProxy.A07(str);
        }
    }

    public final void DB4(IF5 if5) {
        if (this instanceof C89405Ej) {
            ((C89405Ej) this).A0h.remove(if5);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass7K3 r1;
        if (this instanceof C89405Ej) {
            C89405Ej r3 = (C89405Ej) this;
            if (i2 == -1 && i == 1000) {
                String stringExtra = intent.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE");
                if ("save_autofill_request_fragment".equals(stringExtra)) {
                    try {
                        IF5 BHU = r3.A03.BHU();
                        AutofillData autofillData = new AutofillData(C18250wR.A0j(intent.getStringExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRING")));
                        r3.A04(Bundle.EMPTY, (AutofillSharedJSBridgeProxy) r3.A0h.get(BHU), autofillData);
                    } catch (JSONException unused) {
                        throw C18180wK.A0a("Illegal JSON for autofill save");
                    }
                } else if ("autofill_request_fragment".equals(stringExtra)) {
                    IF5 BHU2 = r3.A03.BHU();
                    List A032 = AnonymousClass7KI.A03(intent.getStringArrayListExtra("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"));
                    RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = (RequestAutofillJSBridgeCall) intent.getParcelableExtra("BrowserLiteIntent.EXTRA_AUTOFILL_REQUEST_AUTOFILL_JS_BRIDGE_CALL");
                    if (!A032.isEmpty()) {
                        r3.A06((AutofillSharedJSBridgeProxy) r3.A0h.get(BHU2), requestAutofillJSBridgeCall, A032);
                    }
                }
            }
            if (r3.A0K && (r1 = r3.A06) != null) {
                if (i == 1001) {
                    r1.A08(i2, intent);
                }
                AutofillContactDataCallback autofillContactDataCallback = r3.A06.A0R;
                BrowserLiteCallback browserLiteCallback = AnonymousClass7Ep.A00().A06;
                if (browserLiteCallback != null) {
                    try {
                        browserLiteCallback.AMH(autofillContactDataCallback);
                    } catch (RemoteException unused2) {
                    }
                }
            }
        }
    }
}
