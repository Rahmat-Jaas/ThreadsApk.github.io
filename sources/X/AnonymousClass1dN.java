package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2;

/* renamed from: X.1dN  reason: invalid class name */
public final class AnonymousClass1dN extends C34640IcN implements C21735BzM {
    public static final C11630kW A0J = new C15720rm("direct_interop_upgrade_interstitial");
    public static final String __redex_internal_original_name = "DirectInteropUpgradeContainerFragment";
    public long A00;
    public Context A01;
    public C23261cr A02;
    public AnonymousClass34F A03;
    public C63323hG A04;
    public AnonymousClass3DE A05;
    public C307322r A06 = null;
    public UserSession A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public C34640IcN A0B;
    public C09810gi A0C;
    public C565637r A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Intent A0I = C18230wP.A0B();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        X.C35722Oo.A00(X.C67253zE.A00(r7), r6, X.AnonymousClass2A8.A08, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r4 != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        X.C35722Oo.A00(X.C67253zE.A00(r7), r6, X.AnonymousClass2A8.A09, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        switch(r5) {
            case 1: goto L_0x00d7;
            case 2: goto L_0x00d7;
            case 3: goto L_0x008d;
            case 4: goto L_0x008b;
            case 5: goto L_0x008d;
            case 6: goto L_0x008d;
            case 7: goto L_0x008d;
            default: goto L_0x008b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        r1 = X.AnonymousClass39J.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        if (r1.A01 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        r1.A01 = new X.AnonymousClass2P2();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        new X.C26151q8();
        r6 = X.AnonymousClass264.INTEROP;
        r5 = r6.A00();
        r1 = r3.token;
        X.AnonymousClass0wJ.A1M(r5, r2 ? 1 : 0, r1);
        r4 = X.C18180wK.A06();
        r4.putString("flow", r5);
        X.C18190wL.A13(r4, r1);
        r1 = X.C63863iT.A02(r9.requireActivity(), r4, X.C18190wL.A0S(r4), com.instagram.modal.ModalActivity.class, "fxim_flow");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r5.equals(r6.A00()) == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r1.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        r1.A0J(r9, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d7, code lost:
        X.C35762Os.A00().A00(r9, r3, new com.facebook.redex.IDxAListenerShape163S0000000_1_I2(0)).A06("IG_INTEROP".toLowerCase(java.util.Locale.US));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f0, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f1, code lost:
        r9.A0F = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f3, code lost:
        if (r0 == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f5, code lost:
        r3 = r9.getActivity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f9, code lost:
        if (r3 == null) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
        r2 = r9.A0I;
        r2.putExtra("suppress_messaging_updated_toast", true);
        r3.setResult(-1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A02(X.AnonymousClass1dN r9) {
        /*
            monitor-enter(r9)
            boolean r0 = r9.A09     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0185
            boolean r1 = r9.A0H     // Catch:{ all -> 0x0187 }
            if (r1 == 0) goto L_0x000d
            boolean r0 = r9.A08     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0185
        L_0x000d:
            boolean r0 = r9.A0A     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0140
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0140
            if (r1 == 0) goto L_0x0108
            X.22r r0 = X.C307322r.CAL_FLOW     // Catch:{ all -> 0x0187 }
            X.22r r7 = r9.A06     // Catch:{ all -> 0x0187 }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x004b
            X.22r r0 = X.C307322r.CAL_FLOW_CHECK_QE     // Catch:{ all -> 0x0187 }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x004b
            X.22r r0 = X.C307322r.CP_FLOW     // Catch:{ all -> 0x0187 }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x004b
            X.22r r0 = X.C307322r.CP_FLOW_CHECK_QE     // Catch:{ all -> 0x0187 }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x004b
            X.22r r0 = X.C307322r.CP_FLOW_NAME     // Catch:{ all -> 0x0187 }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x004b
            X.22r r0 = X.C307322r.CP_FLOW_NAME_CHECK_QE     // Catch:{ all -> 0x0187 }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0140
        L_0x004b:
            android.content.Context r0 = r9.A01     // Catch:{ all -> 0x0187 }
            com.instagram.service.session.UserSession r3 = r9.A07     // Catch:{ all -> 0x0187 }
            r7.getClass()     // Catch:{ all -> 0x0187 }
            X.2A9 r6 = X.AnonymousClass2A9.A0E     // Catch:{ all -> 0x0187 }
            boolean r2 = X.AnonymousClass0wJ.A1Z(r0, r3)     // Catch:{ all -> 0x0187 }
            int r5 = r7.ordinal()     // Catch:{ all -> 0x0187 }
            switch(r5) {
                case 1: goto L_0x0069;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x005f;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                default: goto L_0x005f;
            }     // Catch:{ all -> 0x0187 }
        L_0x005f:
            X.2A8 r1 = X.AnonymousClass2A8.A08     // Catch:{ all -> 0x0187 }
            X.29h r0 = X.C67253zE.A00(r7)     // Catch:{ all -> 0x0187 }
            X.C35722Oo.A00(r0, r6, r1, r3)     // Catch:{ all -> 0x0187 }
            goto L_0x008b
        L_0x0069:
            boolean r4 = X.C67253zE.A01(r0, r3)     // Catch:{ all -> 0x0187 }
            if (r4 == 0) goto L_0x0079
            X.2A8 r1 = X.AnonymousClass2A8.A0A     // Catch:{ all -> 0x0187 }
        L_0x0071:
            X.29h r0 = X.C67253zE.A00(r7)     // Catch:{ all -> 0x0187 }
            X.C35722Oo.A00(r0, r6, r1, r3)     // Catch:{ all -> 0x0187 }
            goto L_0x007c
        L_0x0079:
            X.2A8 r1 = X.AnonymousClass2A8.A0B     // Catch:{ all -> 0x0187 }
            goto L_0x0071
        L_0x007c:
            if (r4 == 0) goto L_0x005f
        L_0x007e:
            X.2A8 r1 = X.AnonymousClass2A8.A09     // Catch:{ all -> 0x0187 }
            X.29h r0 = X.C67253zE.A00(r7)     // Catch:{ all -> 0x0187 }
            X.C35722Oo.A00(r0, r6, r1, r3)     // Catch:{ all -> 0x0187 }
            r7 = 1
            switch(r5) {
                case 1: goto L_0x00d7;
                case 2: goto L_0x00d7;
                case 3: goto L_0x008d;
                case 4: goto L_0x008b;
                case 5: goto L_0x008d;
                case 6: goto L_0x008d;
                case 7: goto L_0x008d;
                default: goto L_0x008b;
            }     // Catch:{ all -> 0x0187 }
        L_0x008b:
            r0 = 0
            goto L_0x00f1
        L_0x008d:
            X.39J r1 = X.AnonymousClass39J.A02     // Catch:{ all -> 0x0187 }
            X.2P2 r0 = r1.A01     // Catch:{ all -> 0x0187 }
            if (r0 != 0) goto L_0x009a
            X.2P2 r0 = new X.2P2     // Catch:{ all -> 0x0187 }
            r0.<init>()     // Catch:{ all -> 0x0187 }
            r1.A01 = r0     // Catch:{ all -> 0x0187 }
        L_0x009a:
            X.1q8 r0 = new X.1q8     // Catch:{ all -> 0x0187 }
            r0.<init>()     // Catch:{ all -> 0x0187 }
            X.264 r6 = X.AnonymousClass264.INTEROP     // Catch:{ all -> 0x0187 }
            java.lang.String r5 = r6.A00()     // Catch:{ all -> 0x0187 }
            java.lang.String r1 = r3.token     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "flow"
            X.AnonymousClass0wJ.A1M(r5, r2, r1)     // Catch:{ all -> 0x0187 }
            android.os.Bundle r4 = X.C18180wK.A06()     // Catch:{ all -> 0x0187 }
            r4.putString(r0, r5)     // Catch:{ all -> 0x0187 }
            X.C18190wL.A13(r4, r1)     // Catch:{ all -> 0x0187 }
            X.0i6 r3 = X.C18190wL.A0S(r4)     // Catch:{ all -> 0x0187 }
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r9.requireActivity()     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "fxim_flow"
            X.3iT r1 = X.C63863iT.A02(r1, r4, r3, r2, r0)     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = r6.A00()     // Catch:{ all -> 0x0187 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x00d3
            r1.A0G()     // Catch:{ all -> 0x0187 }
        L_0x00d3:
            r1.A0J(r9, r7)     // Catch:{ all -> 0x0187 }
            goto L_0x00f0
        L_0x00d7:
            X.3Ej r2 = X.C35762Os.A00()     // Catch:{ all -> 0x0187 }
            r1 = 0
            com.facebook.redex.IDxAListenerShape163S0000000_1_I2 r0 = new com.facebook.redex.IDxAListenerShape163S0000000_1_I2     // Catch:{ all -> 0x0187 }
            r0.<init>(r1)     // Catch:{ all -> 0x0187 }
            X.1q7 r2 = r2.A00(r9, r3, r0)     // Catch:{ all -> 0x0187 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "IG_INTEROP"
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch:{ all -> 0x0187 }
            r2.A06(r0)     // Catch:{ all -> 0x0187 }
        L_0x00f0:
            r0 = 1
        L_0x00f1:
            r9.A0F = r0     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0140
            androidx.fragment.app.FragmentActivity r3 = r9.getActivity()     // Catch:{ all -> 0x0187 }
            if (r3 == 0) goto L_0x0185
            android.content.Intent r2 = r9.A0I     // Catch:{ all -> 0x0187 }
            r1 = 1
            java.lang.String r0 = "suppress_messaging_updated_toast"
            r2.putExtra(r0, r1)     // Catch:{ all -> 0x0187 }
            r0 = -1
            r3.setResult(r0, r2)     // Catch:{ all -> 0x0187 }
            goto L_0x0185
        L_0x0108:
            java.lang.String r1 = "inbox"
            java.lang.String r0 = r9.A0E     // Catch:{ all -> 0x0187 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0140
            android.content.Context r8 = r9.A01     // Catch:{ all -> 0x0187 }
            com.instagram.service.session.UserSession r0 = r9.A07     // Catch:{ all -> 0x0187 }
            X.2A9 r7 = X.AnonymousClass2A9.A0E     // Catch:{ all -> 0x0187 }
            r3 = 0
            boolean r6 = X.AnonymousClass0wJ.A1Z(r8, r0)     // Catch:{ all -> 0x0187 }
            com.instagram.service.session.UserSession r5 = X.C05030Qo.A02(r0)     // Catch:{ all -> 0x0187 }
            X.29h r4 = X.C318729h.CAL_FLOW     // Catch:{ all -> 0x0187 }
            X.2A8 r0 = X.AnonymousClass2A8.A07     // Catch:{ all -> 0x0187 }
            X.C35722Oo.A00(r4, r7, r0, r5)     // Catch:{ all -> 0x0187 }
            X.1z6 r2 = X.C35692Ol.A00(r5)     // Catch:{ all -> 0x0187 }
            com.facebook.common.callercontext.CallerContext r1 = X.C67253zE.A00     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "ig_android_linking_cache_fx_internal"
            boolean r0 = r2.A05(r1, r0)     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0144
            X.2A8 r0 = X.AnonymousClass2A8.A05     // Catch:{ all -> 0x0187 }
        L_0x0138:
            X.C35722Oo.A00(r4, r7, r0, r5)     // Catch:{ all -> 0x0187 }
            X.2A8 r0 = X.AnonymousClass2A8.A08     // Catch:{ all -> 0x0187 }
            X.C35722Oo.A00(r4, r7, r0, r5)     // Catch:{ all -> 0x0187 }
        L_0x0140:
            A01(r9)     // Catch:{ all -> 0x0187 }
            goto L_0x0185
        L_0x0144:
            boolean r0 = X.C67253zE.A01(r8, r5)     // Catch:{ all -> 0x0187 }
            if (r0 == 0) goto L_0x0182
            X.2A8 r0 = X.AnonymousClass2A8.A0A     // Catch:{ all -> 0x0187 }
            X.C35722Oo.A00(r4, r7, r0, r5)     // Catch:{ all -> 0x0187 }
            X.2A8 r0 = X.AnonymousClass2A8.A09     // Catch:{ all -> 0x0187 }
            X.C35722Oo.A00(r4, r7, r0, r5)     // Catch:{ all -> 0x0187 }
            r9.A0F = r6     // Catch:{ all -> 0x0187 }
            androidx.fragment.app.FragmentActivity r2 = r9.getActivity()     // Catch:{ all -> 0x0187 }
            if (r2 == 0) goto L_0x0167
            android.content.Intent r1 = r9.A0I     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "suppress_messaging_updated_toast"
            r1.putExtra(r0, r6)     // Catch:{ all -> 0x0187 }
            r0 = -1
            r2.setResult(r0, r1)     // Catch:{ all -> 0x0187 }
        L_0x0167:
            com.instagram.service.session.UserSession r2 = r9.A07     // Catch:{ all -> 0x0187 }
            X.3Ej r1 = X.C35762Os.A00()     // Catch:{ all -> 0x0187 }
            com.facebook.redex.IDxAListenerShape163S0000000_1_I2 r0 = new com.facebook.redex.IDxAListenerShape163S0000000_1_I2     // Catch:{ all -> 0x0187 }
            r0.<init>(r3)     // Catch:{ all -> 0x0187 }
            X.1q7 r2 = r1.A00(r9, r2, r0)     // Catch:{ all -> 0x0187 }
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ all -> 0x0187 }
            java.lang.String r0 = "IG_INTEROP"
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch:{ all -> 0x0187 }
            r2.A06(r0)     // Catch:{ all -> 0x0187 }
            goto L_0x0185
        L_0x0182:
            X.2A8 r0 = X.AnonymousClass2A8.A0B     // Catch:{ all -> 0x0187 }
            goto L_0x0138
        L_0x0185:
            monitor-exit(r9)
            return
        L_0x0187:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1dN.A02(X.1dN):void");
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public static void A01(AnonymousClass1dN r1) {
        if (r1.A0G) {
            Context context = r1.A01;
            if (context != null) {
                C18210wN.A0p(context);
                return;
            }
            return;
        }
        FragmentActivity activity = r1.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static void A03(AnonymousClass1dN r5, AnonymousClass3BM r6) {
        if (r6 != null) {
            String str = r6.A00;
            if (!TextUtils.isEmpty(str)) {
                A04(r5, Long.valueOf(SystemClock.elapsedRealtime() - r5.A00), str, "upgrade");
            }
            C565637r r2 = r5.A0D;
            Context context = r5.A01;
            String str2 = r6.A01;
            C04220Ms.A0B(context, 0);
            if (str2 != null) {
                C83714rr r1 = r2.A00;
                C82924qU AlJ = r1.AlJ(AnonymousClass268.A01(str2, r1.BF6()));
                if (AlJ != null) {
                    AlJ.BN1(C15430rJ.A01(str2), (Bundle) null);
                } else {
                    C10450iM.A03("DirectInteropInterstitialIntentHandler", AnonymousClass00U.A0L("No action handler for url: ", str2));
                }
            }
            if (r6.A03) {
                A01(r5);
            }
        }
    }

    public static void A04(AnonymousClass1dN r2, Long l, String str, String str2) {
        C63473hX A012 = C63473hX.A01(r2.A07);
        AnonymousClass3DE r0 = r2.A05;
        r0.A04 = str;
        r0.A05 = str2;
        r0.A00 = l;
        A012.A08(r0);
    }

    public final C10300i6 getSession() {
        return this.A07;
    }

    public final boolean isScrolledToTop() {
        C34640IcN icN = this.A0B;
        if (!(icN instanceof AnonymousClass1YF) || !(!((AnonymousClass1YF) icN).A01.canScrollVertically(-1))) {
            return false;
        }
        return true;
    }

    public static void A00(Bundle bundle, AnonymousClass1dN r6, Integer num) {
        int i;
        FragmentActivity activity = r6.getActivity();
        if (activity != null) {
            Intent intent = r6.A0I;
            switch (num.intValue()) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                default:
                    i = 2;
                    break;
            }
            intent.putExtra("UPGRADE_STATUS", i).putExtra("qp_source_upsell", bundle.getString("qp_source_upsell")).putExtra("static_source_upsell", bundle.getString("static_source_upsell")).putExtra("deeplink_campaign", bundle.getString("deeplink_campaign")).putExtra("deeplink_source", bundle.getString("deeplink_source"));
            if (bundle.getString("deeplink_source") != null) {
                AnonymousClass0wJ.A0F().postDelayed(new AnonymousClass4RO(r6, num), 300);
            } else {
                activity.setResult(-1, intent);
            }
        }
    }

    public final String getModuleName() {
        return C18220wO.A0q(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.A0F) {
            A01(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0113, code lost:
        if ("profile_menu_options".equals(r1) != false) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -1221190483(0xffffffffb7361cad, float:-1.0854722E-5)
            int r4 = X.C14030oh.A02(r0)
            super.onCreate(r9)
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0W(r8)
            r8.A07 = r0
            android.content.Context r0 = r8.requireContext()
            r8.A01 = r0
            X.0gi r0 = X.C09820gj.A00
            r8.A0C = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8.A00 = r0
            android.os.Bundle r5 = r8.requireArguments()
            java.lang.String r7 = "qp_source_upsell"
            java.lang.String r2 = r5.getString(r7)
            java.lang.String r3 = "static_source_upsell"
            java.lang.String r0 = r5.getString(r3)
            X.3DE r1 = new X.3DE
            r1.<init>(r2, r0)
            r8.A05 = r1
            java.lang.String r0 = "deeplink_campaign"
            java.lang.String r0 = r5.getString(r0)
            r1.A02 = r0
            X.3DE r1 = r8.A05
            java.lang.String r0 = "deeplink_source"
            java.lang.String r0 = r5.getString(r0)
            r1.A03 = r0
            com.instagram.service.session.UserSession r6 = r8.A07
            X.1tl r2 = X.AnonymousClass3WS.A01(r6)
            r1 = 1
            X.3hG r0 = new X.3hG
            r0.<init>(r2, r6, r1)
            r8.A04 = r0
            java.lang.String r0 = "nux_view_type"
            int r0 = r5.getInt(r0)
            r2 = 3
            if (r0 == r2) goto L_0x00e6
            com.instagram.service.session.UserSession r6 = r8.A07
            int r0 = X.C63473hX.A00(r6)
            if (r0 != r1) goto L_0x00e3
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36312221912335226(0x8101c60017037a, double:3.027333582717643E-306)
            boolean r0 = X.C63803iN.A0E(r2, r6, r0)
            if (r0 == 0) goto L_0x00e3
            android.os.Bundle r0 = r8.requireArguments()
            java.lang.String r6 = r0.getString(r3)
            android.os.Bundle r0 = r8.requireArguments()
            java.lang.String r2 = r0.getString(r7)
            X.3hG r0 = r8.A04
            X.3Cn r0 = r0.A06()
            if (r0 == 0) goto L_0x00e3
            java.util.ArrayList r1 = r0.A04
            if (r1 == 0) goto L_0x00e3
            if (r6 == 0) goto L_0x0099
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L_0x00a3
        L_0x0099:
            if (r2 == 0) goto L_0x00e3
            java.lang.String r0 = "qp"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00e3
        L_0x00a3:
            X.3hG r0 = r8.A04
            X.3Cn r0 = r0.A06()
            if (r0 == 0) goto L_0x00e3
            java.util.ArrayList r0 = r0.A05
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00e3
            X.Lwp r0 = X.C41117Lwp.A02
            if (r0 != 0) goto L_0x00c0
            X.Lwp r0 = new X.Lwp
            r0.<init>()
            X.C41117Lwp.A02 = r0
        L_0x00c0:
            java.util.Map r0 = r0.A01
            java.util.Collection r0 = r0.values()
            java.util.Iterator r2 = r0.iterator()
        L_0x00ca:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r1 = r2.next()
            X.KKq r1 = (X.C38089KKq) r1
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r0 = r1.A00()
            if (r0 == 0) goto L_0x00e3
            goto L_0x00ca
        L_0x00e3:
            r2 = 1
            goto L_0x00e6
        L_0x00e5:
            r2 = 2
        L_0x00e6:
            X.3hG r0 = r8.A04
            r0.A00 = r2
            X.3DE r1 = r8.A05
            r0 = 2
            if (r2 == r0) goto L_0x015f
            r0 = 3
            if (r2 == r0) goto L_0x015c
            java.lang.String r0 = "text_interstitial"
        L_0x00f4:
            r1.A06 = r0
            java.lang.String r2 = "upgrade_screen_launched"
            java.lang.String r1 = "upgrade"
            r0 = 0
            A04(r8, r0, r2, r1)
            java.lang.String r1 = r5.getString(r3)
            r8.A0E = r1
            java.lang.String r0 = "inbox"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "profile_menu_options"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x0116
        L_0x0115:
            r0 = 1
        L_0x0116:
            r8.A0H = r0
            if (r0 == 0) goto L_0x0142
            com.instagram.service.session.UserSession r6 = r8.A07
            X.34E r3 = new X.34E
            r3.<init>(r8)
            X.2A8 r2 = X.AnonymousClass2A8.A07
            X.2A9 r1 = X.AnonymousClass2A9.A0E
            X.29h r0 = X.C318729h.NONE
            X.C35722Oo.A00(r0, r1, r2, r6)
            X.3zb r2 = X.C67463zb.A00()
            java.lang.Class<X.15c> r1 = X.C205315c.class
            java.lang.String r0 = "FxUpSellTargeting"
            X.3zc r0 = X.C67473zc.A00(r2, r1, r0)
            X.H8c r1 = X.C18210wN.A0K(r0, r6)
            r0 = 15
            X.C63873iU.A0F(r1, r3, r6, r0)
            r8.schedule(r1)
        L_0x0142:
            java.lang.String r0 = "is_bottom_sheet"
            boolean r0 = r5.getBoolean(r0)
            r8.A0G = r0
            X.0kW r2 = A0J
            com.instagram.service.session.UserSession r1 = r8.A07
            X.37r r0 = new X.37r
            r0.<init>(r8, r2, r1)
            r8.A0D = r0
            r0 = -1091113616(0xffffffffbef6ed70, float:-0.48228025)
            X.C14030oh.A09(r0, r4)
            return
        L_0x015c:
            java.lang.String r0 = "post_auto_upgrade"
            goto L_0x00f4
        L_0x015f:
            java.lang.String r0 = "video_interstitial"
            goto L_0x00f4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1dN.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        String str2;
        String str3;
        int A022 = C14030oh.A02(-1594002986);
        View A0H2 = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.interop_container);
        this.A03 = new AnonymousClass34F(A0H2.requireViewById(R.id.interop_actions_container));
        AnonymousClass3D0 A052 = this.A04.A05(this.A01);
        AnonymousClass3BM r1 = A052.A01;
        AnonymousClass34F r3 = this.A03;
        if (r3 != null) {
            if (r1 != null) {
                str3 = r1.A02;
            } else {
                str3 = null;
            }
            r3.A00.setPrimaryAction(str3, C18200wM.A0R(r1, this, 76));
        }
        AnonymousClass3BM r12 = A052.A02;
        AnonymousClass34F r32 = this.A03;
        if (r32 != null) {
            if (r12 != null) {
                str2 = r12.A02;
            } else {
                str2 = null;
            }
            r32.A00.setSecondaryAction(str2, C18200wM.A0R(r12, this, 77));
        }
        String str4 = A052.A03;
        AnonymousClass3BM r7 = A052.A00;
        SpannableStringBuilder spannableStringBuilder2 = str4;
        this.A03.getClass();
        if (r7 != null) {
            str = r7.A02;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str)) {
            String A0V = AnonymousClass00U.A0V(str4, "\n", str);
            r7.getClass();
            spannableStringBuilder = C18200wM.A0E(A0V);
        } else if (!TextUtils.isEmpty(str)) {
            r7.getClass();
            spannableStringBuilder = C18200wM.A0E(str);
        } else {
            if (TextUtils.isEmpty(str4)) {
                this.A03.A00.setFooterText((CharSequence) null);
                C14030oh.A09(1605560704, A022);
                return A0H2;
            }
            this.A03.A00.setFooterText(spannableStringBuilder2);
            C14030oh.A09(1605560704, A022);
            return A0H2;
        }
        AnonymousClass3Zw.A01(spannableStringBuilder, new IDxCSpanShape63S0200000_1_I2(C18210wN.A01(requireActivity()), 2, (Object) this, (Object) r7), r7.A02);
        spannableStringBuilder2 = spannableStringBuilder;
        this.A03.A00.setFooterText(spannableStringBuilder2);
        C14030oh.A09(1605560704, A022);
        return A0H2;
    }

    public final void onDestroy() {
        int A022 = C14030oh.A02(1636657047);
        super.onDestroy();
        A04(this, (Long) null, "upgrade_screen_dismissed", "upgrade");
        C14030oh.A09(-1456098942, A022);
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(2111951955);
        super.onDestroyView();
        this.A0B = null;
        C14030oh.A09(1595507526, A022);
    }

    public final void onDetach() {
        int A022 = C14030oh.A02(2101442015);
        super.onDetach();
        C14030oh.A09(-926953720, A022);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.1YF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.1cr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.1YF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.1YF} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            super.onViewCreated(r12, r13)
            android.os.Bundle r7 = r11.requireArguments()
            X.3hG r0 = r11.A04
            int r0 = r0.A00
            r2 = 2
            if (r0 != r2) goto L_0x00b9
            X.Lwp r1 = X.C41117Lwp.A02
            if (r1 != 0) goto L_0x0019
            X.Lwp r1 = new X.Lwp
            r1.<init>()
            X.C41117Lwp.A02 = r1
        L_0x0019:
            com.instagram.service.session.UserSession r6 = r11.A07
            android.content.Context r0 = r11.A01
            boolean r10 = X.C34822La.A00(r0)
            java.util.Map r5 = r1.A01
            java.util.ArrayList r4 = X.C18220wO.A0w(r5)
            X.1tl r1 = X.AnonymousClass3WS.A01(r6)
            X.3hG r0 = new X.3hG
            r0.<init>(r1, r6, r2)
            X.3Cn r0 = r0.A06()
            if (r0 == 0) goto L_0x00ac
            java.util.ArrayList r0 = r0.A05
            if (r0 == 0) goto L_0x00ac
            java.util.Iterator r9 = r0.iterator()
        L_0x003e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r8 = r9.next()
            X.3A3 r8 = (X.AnonymousClass3A3) r8
            java.lang.Integer r1 = r8.A00
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0097
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0097
        L_0x0062:
            if (r10 == 0) goto L_0x0094
            java.lang.String r1 = "SCREEN%d_DARK"
        L_0x0066:
            java.lang.Integer r0 = r8.A00
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe((java.lang.String) r1, (java.lang.Object) r0)
            java.lang.Object r0 = r5.get(r0)
            r0.getClass()
            X.KKq r0 = (X.C38089KKq) r0
            java.lang.Object r1 = r0.A00()
            X.3A2 r1 = (X.AnonymousClass3A2) r1
            java.io.File r0 = r1.A01
            android.net.Uri r3 = r1.A00
            if (r3 != 0) goto L_0x0087
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            r1.A00 = r3
        L_0x0087:
            java.lang.String r2 = r8.A02
            java.lang.String r1 = r8.A01
            com.instagram.direct.fragment.interop.video.DirectInteropVideoSlide r0 = new com.instagram.direct.fragment.interop.video.DirectInteropVideoSlide
            r0.<init>(r3, r2, r1)
            r4.add(r0)
            goto L_0x003e
        L_0x0094:
            java.lang.String r1 = "SCREEN%d"
            goto L_0x0066
        L_0x0097:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36312221911614325(0x8101c6000c0375, double:3.027333582261742E-306)
            boolean r0 = X.C63803iN.A0E(r2, r6, r0)
            if (r0 == 0) goto L_0x0062
            if (r10 == 0) goto L_0x00a9
            java.lang.String r1 = "SCREEN%d_REBRAND_DARK"
            goto L_0x0066
        L_0x00a9:
            java.lang.String r1 = "SCREEN%d_REBRAND"
            goto L_0x0066
        L_0x00ac:
            X.1cr r2 = new X.1cr
            r2.<init>()
            java.lang.String r0 = "ARG_DIRECT_INTEROP_VIDEO_CONTENT"
            r7.putParcelableArrayList(r0, r4)
            r11.A02 = r2
            goto L_0x00be
        L_0x00b9:
            X.1YF r2 = new X.1YF
            r2.<init>()
        L_0x00be:
            r2.setArguments(r7)
            X.0m7 r0 = r11.getChildFragmentManager()
            X.01J r1 = new X.01J
            r1.<init>(r0)
            r0 = 2131300800(0x7f0911c0, float:1.821964E38)
            r1.A0D(r2, r0)
            r1.A00()
            r11.A0B = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1dN.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
