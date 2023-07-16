package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.redex.IDxAListenerShape459S0100000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.nux.activity.SignedOutFragmentActivity;

/* renamed from: X.1cQ  reason: invalid class name */
public final class AnonymousClass1cQ extends C34640IcN implements C82424pb, L56, CallerContextable {
    public static final CallerContext A0A = CallerContext.A00(AnonymousClass1cQ.class);
    public static final String __redex_internal_original_name = "FindFacebookFriendsPromptFragment";
    public TextView A00;
    public AnonymousClass3Zp A01;
    public C67083yq A02;
    public C690346m A03;
    public C24661jn A04;
    public C24611jh A05;
    public final C04530Oa A06 = C80644m9.A00(this);
    public final View.OnClickListener A07 = C18210wN.A0H(this, 287);
    public final C82394pY A08 = C18220wO.A0P(this, 77);
    public final C71874Kp A09 = new C71874Kp(this);

    public final boolean BR2() {
        return true;
    }

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.CtO(false);
    }

    public final String getModuleName() {
        return "register_flow_find_friends_facebook_prompt";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            C67363zQ.A06(intent, AnonymousClass0wJ.A0U(this.A06), this.A09, i2);
        }
        super.onActivityResult(i, i2, intent);
    }

    public static final void A00(AnonymousClass264 r6, AnonymousClass1cQ r7) {
        boolean A032;
        C04530Oa r4 = r7.A06;
        C10300i6 A0U = AnonymousClass0wJ.A0U(r4);
        AnonymousClass0TJ r5 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r5, A0U, 36319957147063836L)) {
            A032 = C35692Ol.A00(AnonymousClass0wJ.A0X(r4)).A05(A0A, "ig_android_linking_cache_ig_onboarding_find_fb_friends");
        } else {
            A032 = C62963bD.A03(A0A, AnonymousClass0wJ.A0U(r4), "ig_to_fb_connect");
        }
        if (A032) {
            A01(r7);
            return;
        }
        r4.getValue();
        AnonymousClass01V r3 = AnonymousClass01V.A0p;
        C04220Ms.A06(r3);
        r3.markerStart(857802076);
        r3.markerAnnotate(857802076, "entry_point", "ig_fb_nux_find_friends");
        if (C63173fJ.A05(r5, 18310506439910164L)) {
            C35762Os.A00().A00(r7, AnonymousClass0wJ.A0U(r4), new IDxAListenerShape459S0100000_1_I2(r7, 15)).A06(r6.A00());
            return;
        }
        C67363zQ.A08(r7, AnonymousClass0wJ.A0U(r4), r6, C29771zH.A05);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A06);
    }

    public final boolean onBackPressed() {
        C62223Xv.A00(AnonymousClass0wJ.A0U(this.A06), (C313625r) null, (Boolean) null, (Integer) null, "find_friends_fb");
        return false;
    }

    public static final void A01(AnonymousClass1cQ r2) {
        C82844qM r1;
        FragmentActivity requireActivity = r2.requireActivity();
        if (!(requireActivity instanceof C82844qM) || (r1 = (C82844qM) requireActivity) == null) {
            C67083yq r0 = r2.A02;
            if (r0 == null) {
                C04220Ms.A0E("nuxHelper");
                throw null;
            } else {
                r0.A01();
            }
        } else {
            r1.Ben(1);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        int A022 = C14030oh.A02(538908435);
        super.onActivityCreated(bundle);
        try {
            FragmentActivity requireActivity = requireActivity();
            C04220Ms.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.nux.activity.SignedOutFragmentActivity");
            ((SignedOutFragmentActivity) requireActivity).A09();
        } catch (ClassCastException unused) {
        }
        C14030oh.A09(940600058, A022);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(139894342);
        super.onCreate(bundle);
        this.A01 = new AnonymousClass3Zp();
        this.A05 = new C24611jh(this);
        AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(this.A06)).A01(this.A08, AnonymousClass464.class);
        C14030oh.A09(1987730881, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009c, code lost:
        if (r5.equals("improve_suggestions") == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0139, code lost:
        if (r5.equals("find_people_you_know") == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0146, code lost:
        if (r6.equals("get_suggestions") == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0066, code lost:
        if (r6.equals("find_facebook_friends") == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r14, android.view.ViewGroup r15, android.os.Bundle r16) {
        /*
            r13 = this;
            r0 = -1218553359(0xffffffffb75e59f1, float:-1.3253172E-5)
            int r4 = X.C14030oh.A02(r0)
            r0 = 0
            X.C04220Ms.A0B(r14, r0)
            r0 = 2131496674(0x7f0c0ee2, float:1.861692E38)
            android.view.View r3 = X.AnonymousClass0wJ.A0H(r14, r15, r0)
            X.C04220Ms.A06(r3)
            android.view.ViewGroup r1 = X.C18190wL.A0E(r3)
            r0 = 2131495980(0x7f0c0c2c, float:1.8615512E38)
            r2 = 1
            r14.inflate(r0, r1, r2)
            r0 = 2131298963(0x7f090a93, float:1.8215914E38)
            android.view.View r7 = X.AnonymousClass0wJ.A0J(r3, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 0
            r7.setCompoundDrawables(r8, r8, r8, r8)
            r6 = 2131827496(0x7f111b28, float:1.9287906E38)
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 18311661786244499(0x410e5c00042593, double:1.897553145060607E-307)
            boolean r0 = X.C63173fJ.A05(r5, r0)
            if (r0 == 0) goto L_0x0040
            r6 = 2131827497(0x7f111b29, float:1.9287908E38)
        L_0x0040:
            r7.setText(r6)
            X.C63403hQ.A04(r7)
            r0 = 18874611739460087(0x430e5c000101f7, double:2.120060530830014E-307)
            java.lang.String r6 = X.C63173fJ.A04(r5, r0)
            int r1 = r6.hashCode()
            r0 = -685173882(0xffffffffd7291386, float:-1.85901318E14)
            if (r1 == r0) goto L_0x013d
            r0 = 1252973282(0x4aaedae2, float:5729649.0)
            if (r1 != r0) goto L_0x0068
            java.lang.String r0 = "find_facebook_friends"
            boolean r0 = r6.equals(r0)
            r1 = 2131826993(0x7f111931, float:1.9286886E38)
            if (r0 != 0) goto L_0x006b
        L_0x0068:
            r1 = 2131826992(0x7f111930, float:1.9286884E38)
        L_0x006b:
            r6 = 2131300544(0x7f0910c0, float:1.821912E38)
            android.view.View r0 = r3.requireViewById(r6)
            java.lang.String r7 = "null cannot be cast to non-null type com.instagram.igds.components.headline.IgdsHeadline"
            X.C04220Ms.A0C(r0, r7)
            com.instagram.igds.components.headline.IgdsHeadline r0 = (com.instagram.igds.components.headline.IgdsHeadline) r0
            r0.setHeadline((int) r1)
            r0 = 18874611739525624(0x430e5c000201f8, double:2.1200605308559177E-307)
            java.lang.String r5 = X.C63173fJ.A04(r5, r0)
            int r1 = r5.hashCode()
            r0 = -1782573099(0xffffffff95c017d5, float:-7.758578E-26)
            if (r1 == r0) goto L_0x0130
            r0 = 1985393832(0x7656b4a8, float:1.0886872E33)
            if (r1 != r0) goto L_0x009e
            java.lang.String r0 = "improve_suggestions"
            boolean r0 = r5.equals(r0)
            r1 = 2131826991(0x7f11192f, float:1.9286882E38)
            if (r0 != 0) goto L_0x00a1
        L_0x009e:
            r1 = 2131826989(0x7f11192d, float:1.9286878E38)
        L_0x00a1:
            android.view.View r0 = r3.requireViewById(r6)
            X.C04220Ms.A0C(r0, r7)
            com.instagram.igds.components.headline.IgdsHeadline r0 = (com.instagram.igds.components.headline.IgdsHeadline) r0
            r0.setBody((int) r1)
            r0 = 2131307274(0x7f092b0a, float:1.823277E38)
            android.widget.TextView r0 = X.AnonymousClass0wJ.A0L(r3, r0)
            r13.A00 = r0
            X.0Oa r6 = r13.A06
            X.0i6 r5 = X.AnonymousClass0wJ.A0U(r6)
            X.265 r1 = X.AnonymousClass265.A0f
            X.1jn r0 = new X.1jn
            r0.<init>(r5, r13, r1)
            r13.A04 = r0
            r13.registerLifecycleListener(r0)
            r0 = 2131298948(0x7f090a84, float:1.8215884E38)
            android.view.View r1 = r3.requireViewById(r0)
            android.view.View$OnClickListener r0 = r13.A07
            r1.setOnClickListener(r0)
            r0 = 2131300544(0x7f0910c0, float:1.821912E38)
            android.view.View r1 = r3.requireViewById(r0)
            X.C04220Ms.A0C(r1, r7)
            com.instagram.igds.components.headline.IgdsHeadline r1 = (com.instagram.igds.components.headline.IgdsHeadline) r1
            r0 = 2131231729(0x7f0803f1, float:1.8079547E38)
            r1.A08(r0, r2)
            r0 = 2131307206(0x7f092ac6, float:1.8232633E38)
            android.view.View r1 = X.AnonymousClass0wJ.A0K(r3, r0)
            r0 = 288(0x120, float:4.04E-43)
            X.AnonymousClass0wJ.A17(r1, r0, r13)
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r6)
            X.3yq r0 = new X.3yq
            r0.<init>(r13, r13, r1)
            r13.A02 = r0
            X.KHr r5 = X.C38040KHr.A01
            java.lang.Class<X.45Q> r2 = X.AnonymousClass45Q.class
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r6)
            X.46m r0 = new X.46m
            r0.<init>(r1)
            r13.A03 = r0
            r5.A03(r0, r2)
            X.0i6 r7 = X.AnonymousClass0wJ.A0U(r6)
            java.lang.String r11 = "find_friends_fb"
            r9 = r8
            r10 = r8
            r12 = r8
            X.AnonymousClass3YT.A00(r7, r8, r9, r10, r11, r12)
            androidx.fragment.app.FragmentActivity r1 = r13.requireActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.C04220Ms.A0C(r1, r0)
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            X.1jh r0 = r13.A05
            if (r0 != 0) goto L_0x014a
            java.lang.String r0 = "nuxCalFragmentLifecycleListener"
            X.C04220Ms.A0E(r0)
            throw r8
        L_0x0130:
            java.lang.String r0 = "find_people_you_know"
            boolean r0 = r5.equals(r0)
            r1 = 2131826990(0x7f11192e, float:1.928688E38)
            if (r0 != 0) goto L_0x00a1
            goto L_0x009e
        L_0x013d:
            java.lang.String r0 = "get_suggestions"
            boolean r0 = r6.equals(r0)
            r1 = 2131826994(0x7f111932, float:1.9286888E38)
            if (r0 != 0) goto L_0x006b
            goto L_0x0068
        L_0x014a:
            r1.A0E(r0)
            X.0i6 r2 = X.AnonymousClass0wJ.A0U(r6)
            X.2A8 r1 = X.AnonymousClass2A8.A04
            X.2A9 r0 = X.AnonymousClass2A9.A0G
            X.C62383Zj.A01(r0, r1, r2)
            r0 = 1703666302(0x658be27e, float:8.257337E22)
            X.C14030oh.A09(r0, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1cQ.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-338016907);
        super.onDestroyView();
        C24661jn r0 = this.A04;
        if (r0 == null) {
            C04220Ms.A0E("bigBlueTokenHelper");
            throw null;
        }
        unregisterLifecycleListener(r0);
        this.A00 = null;
        C690346m r2 = this.A03;
        if (r2 != null) {
            C38040KHr.A01.A04(r2, AnonymousClass45Q.class);
            this.A03 = null;
        }
        FragmentActivity requireActivity = requireActivity();
        C04220Ms.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) requireActivity;
        C24611jh r02 = this.A05;
        if (r02 == null) {
            C04220Ms.A0E("nuxCalFragmentLifecycleListener");
            throw null;
        }
        baseFragmentActivity.A0F(r02);
        C82394pY r22 = this.A08;
        if (r22 != null) {
            AnonymousClass3LY.A00(AnonymousClass0wJ.A0U(this.A06)).A02(r22, AnonymousClass464.class);
        }
        C14030oh.A09(-549710858, A022);
    }

    public final void onPause() {
        int A022 = C14030oh.A02(1187621379);
        FragmentActivity activity = getActivity();
        if (activity instanceof SignedOutFragmentActivity) {
            ((SignedOutFragmentActivity) activity).A07 = true;
        }
        super.onPause();
        C14030oh.A09(-2029966663, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1373638557);
        FragmentActivity activity = getActivity();
        if (activity instanceof SignedOutFragmentActivity) {
            SignedOutFragmentActivity signedOutFragmentActivity = (SignedOutFragmentActivity) activity;
            signedOutFragmentActivity.A07 = false;
            Window window = signedOutFragmentActivity.getWindow();
            if (window != null) {
                window.setSoftInputMode(3);
            }
        }
        super.onResume();
        C14030oh.A09(-306571730, A022);
    }
}
