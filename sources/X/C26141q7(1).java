package X;

import android.app.Activity;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;
import com.instagram.service.session.UserSession;
import java.util.HashMap;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;

/* renamed from: X.1q7  reason: invalid class name and case insensitive filesystem */
public final class C26141q7 extends AnonymousClass3VG implements CallerContextable {
    public static final CallerContext A03 = CallerContext.A00(C26141q7.class);
    public static final String __redex_internal_original_name = "FxCalControllerImpl";
    public AnonymousClass01V A00;
    public C697149s A01;
    public C83964sH A02;

    public final void A04(String str) {
        C04220Ms.A0B(str, 0);
        this.A05 = str;
        C10300i6 r0 = this.A06;
        C18200wM.A1R(r0);
        if (!A01((UserSession) r0)) {
            C697149s.A00(AnonymousClass29X.INITIAL_ASYNC_CONTROLLER_REQUEST_START, this.A01, "", str, AnonymousClass0wJ.A0y());
            this.A05 = str;
            C63643hy.A04(new AnonymousClass4P3(this));
        }
    }

    public final boolean A06(String str) {
        C04220Ms.A0B(str, 0);
        C10300i6 r6 = this.A06;
        boolean z = false;
        if (!r6.isLoggedIn()) {
            return false;
        }
        this.A05 = str;
        C04220Ms.A0C(r6, "null cannot be cast to non-null type com.instagram.service.session.UserSession");
        UserSession userSession = (UserSession) r6;
        String A032 = C35692Ol.A00(userSession).A03(A03, FXPFLinkageCacheDebugFragment.callerName);
        if (A032 == null || A032.length() == 0) {
            z = true;
            AnonymousClass01V r2 = this.A00;
            r2.markerStart(444800256);
            r2.markerAnnotate(444800256, "entrypoint", str);
            C04220Ms.A0C(r6, "null cannot be cast to non-null type com.instagram.service.session.UserSession");
            if (!A01(userSession)) {
                C697149s.A00(AnonymousClass29X.INITIAL_ASYNC_CONTROLLER_REQUEST_START, this.A01, "", str, AnonymousClass0wJ.A0y());
                this.A05 = str;
                C63643hy.A04(new AnonymousClass4P3(this));
                return true;
            }
        } else {
            A05(A032);
        }
        return z;
    }

    public static void A00(C10300i6 r2, C26141q7 r3, C83964sH r4) {
        r3.A02 = r4;
        r3.A01 = (C697149s) r2.A01(C697149s.class, new KtLambdaShape75S0100000_I2_55(r2, 45));
        SparseArray sparseArray = new SparseArray();
        r3.A02 = sparseArray;
        sparseArray.put(R.id.fx_linking_unified_launcher, r3);
        AnonymousClass01V r0 = AnonymousClass01V.A0p;
        C04220Ms.A06(r0);
        r3.A00 = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c9, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006a, code lost:
        if (X.C59713Ma.A01(r3.A02, true) == false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A01(com.instagram.service.session.UserSession r11) {
        /*
            r10 = this;
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36326240684090849(0x810e86000025e1, double:3.0361991104249617E-306)
            boolean r0 = X.C63803iN.A0E(r2, r11, r0)
            r9 = 0
            if (r0 == 0) goto L_0x00da
            X.C04220Ms.A0B(r11, r9)
            r0 = 36
            kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55 r1 = new kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55
            r1.<init>(r11, r0)
            java.lang.Class<X.4nF> r0 = X.C81154nF.class
            java.lang.Object r3 = r11.A01(r0, r1)
            X.4nF r3 = (X.C81154nF) r3
            androidx.fragment.app.Fragment r0 = r10.A04
            if (r0 == 0) goto L_0x00c7
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
        L_0x0028:
            X.3BR r1 = new X.3BR
            r1.<init>(r0, r10)
            r3.A02 = r1
            android.app.Activity r0 = r1.A00
            X.C04220Ms.A0B(r0, r9)
            r3.A00 = r0
            android.view.Window r0 = r0.getWindow()
            X.C04220Ms.A06(r0)
            r3.A01 = r0
            X.49s r5 = r3.A01
            java.lang.String r4 = r3.A01()
            r3.A00()
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            X.C04220Ms.A0B(r4, r9)
            X.29X r1 = X.AnonymousClass29X.INITIAL_ASYNC_CONTROLLER_REQUEST_START
            java.lang.String r0 = ""
            X.C697149s.A00(r1, r5, r0, r4, r2)
            java.lang.String r1 = r3.A01()
            java.lang.String r0 = "ig_interop"
            boolean r0 = r0.equals(r1)
            r7 = 1
            if (r0 != 0) goto L_0x006c
            com.instagram.service.session.UserSession r0 = r3.A02
            boolean r0 = X.C59713Ma.A01(r0, r7)
            r8 = 1
            if (r0 != 0) goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            X.01V r2 = r3.A00
            r1 = 444800256(0x1a831d00, float:5.422718E-23)
            java.lang.String r0 = "show_loading_state"
            r2.markerPoint(r1, r0)
            X.3Gl r4 = X.C35682Ok.A00()
            android.app.Activity r5 = r3.A00
            if (r5 == 0) goto L_0x00d0
            android.view.Window r6 = r3.A01
            if (r6 == 0) goto L_0x00cd
            r4.A00(r5, r6, r7, r8, r9)
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r0 = 2131300943(0x7f09124f, float:1.821993E38)
            r4.put(r0, r3)
            com.instagram.service.session.UserSession r2 = r3.A02
            android.app.Activity r1 = r3.A00
            if (r1 == 0) goto L_0x00d0
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            X.C04220Ms.A0C(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.0kW r0 = X.C81154nF.A03
            X.7qT r2 = X.C130667qT.A00(r4, r1, r0, r2)
            java.lang.String r0 = r3.A00()
            X.C04220Ms.A0B(r0, r9)
            X.3Fe r1 = new X.3Fe
            r1.<init>(r0)
            X.3BR r0 = r3.A02
            if (r0 == 0) goto L_0x00d3
            java.util.Map r0 = r0.A03
            r1.A02 = r0
            com.facebook.redex.IDxACallbackShape855S0100000_1_I2 r0 = new com.facebook.redex.IDxACallbackShape855S0100000_1_I2
            r0.<init>(r3, r7)
            r1.A00 = r0
            android.app.Activity r0 = r3.A00
            if (r0 == 0) goto L_0x00d0
            r1.A00(r0, r2)
            return r7
        L_0x00c7:
            android.app.Activity r0 = r10.A00
            if (r0 == 0) goto L_0x00da
            goto L_0x0028
        L_0x00cd:
            java.lang.String r0 = "window"
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r0 = "activity"
            goto L_0x00d5
        L_0x00d3:
            java.lang.String r0 = "unifiedLauncherFlowConfig"
        L_0x00d5:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x00da:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141q7.A01(com.instagram.service.session.UserSession):boolean");
    }

    public C26141q7(Activity activity, C10300i6 r2, C83964sH r3) {
        super(activity, r2);
        A00(r2, this, r3);
    }

    public final void A03() {
        super.A03();
        this.A00.markerPoint(444800256, "hide_loading_state");
    }

    public final void A05(String str) {
        int length = str.length();
        C697149s r4 = this.A01;
        String str2 = this.A05;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (length == 0) {
            C04220Ms.A0B(str2, 1);
            C697149s.A00(AnonymousClass29X.CLIENT_FLOW_FAILED, r4, "Client Flow Interrupted", str2, A0y);
            this.A02.onAuthorizeFail();
            return;
        }
        C04220Ms.A0B(str2, 0);
        C697149s.A00(AnonymousClass29X.CLIENT_FLOW_SUCCEEDED, r4, "", str2, A0y);
        this.A02.onAuthorizeSuccess(str, this.A05);
    }

    public C26141q7(Fragment fragment, C10300i6 r2, C83964sH r3) {
        super(fragment, r2);
        A00(r2, this, r3);
    }
}
