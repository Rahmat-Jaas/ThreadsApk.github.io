package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.facebook.redex.IDxDListenerShape644S0100000_1_I2;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import com.instagram.service.session.UserSession;
import java.util.HashMap;

/* renamed from: X.431  reason: invalid class name */
public final class AnonymousClass431 implements C83424rM, CallerContextable {
    public static final CallerContext A05 = CallerContext.A00(AnonymousClass431.class);
    public static final String __redex_internal_original_name = "IGUXFlowLifecyclePageLinkingProcessor";
    public final Activity A00;
    public final Fragment A01;
    public final KtCSuperShape0S3100000_I2 A02;
    public final UserSession A03;
    public final String A04;

    public AnonymousClass431(Activity activity, Fragment fragment, KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2, UserSession userSession, String str) {
        C04220Ms.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = fragment;
        this.A00 = activity;
        this.A04 = str;
        this.A02 = ktCSuperShape0S3100000_I2;
    }

    public static final void A01(AnonymousClass431 r8, String str) {
        String str2;
        String str3;
        KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2 = r8.A02;
        Object obj = ktCSuperShape0S3100000_I2.A00;
        AnonymousClass22J r2 = AnonymousClass22J.PAGE_CREATION;
        if (obj == r2) {
            UserSession userSession = r8.A03;
            if (!C34562Ka.A00(userSession)) {
                Fragment fragment = r8.A01;
                Context requireContext = fragment.requireContext();
                AnonymousClass06E A002 = AnonymousClass06E.A00(fragment.requireActivity());
                FragmentActivity requireActivity = fragment.requireActivity();
                AnonymousClass4A9 A003 = C63263h8.A00(userSession, "com.bloks.www.ig.unified_linking.auto_create_page.async", AnonymousClass2KY.A00(r8.A04, str, (String) null));
                AnonymousClass4A9.A02(A003, requireActivity, fragment, userSession, 3);
                C31155GhB.A01(requireContext, A002, A003);
                return;
            }
        }
        if (obj == AnonymousClass22J.CLAIM_LOCATION) {
            UserSession userSession2 = r8.A03;
            HashMap A004 = AnonymousClass2KY.A00(r8.A04, str, ktCSuperShape0S3100000_I2.A03);
            IgBloksScreenConfig A0N = C18190wL.A0N(userSession2);
            A0N.A0Q = "IG_UNIFIED_LINKING_CLAIM_LOCATION";
            Bundle A005 = C62853b1.A00(A0N, C63743iE.A02("com.bloks.www.ig.unified_linking.claim_location", A004));
            Activity activity = r8.A00;
            C63863iT.A02(activity, A005, userSession2, ModalActivity.class, "bloks").A0H(activity, 1122563);
            return;
        }
        UserSession userSession3 = r8.A03;
        Class<ModalActivity> cls = ModalActivity.class;
        HashMap A006 = AnonymousClass2KY.A00(r8.A04, str, (String) null);
        if (ktCSuperShape0S3100000_I2.A00 != r2 || !C34562Ka.A00(userSession3)) {
            str2 = "IG_UNIFIED_LINKING_PAGE_SELECTOR";
            str3 = "com.bloks.www.ig.unified_linking.page_selector";
        } else {
            str2 = "IG_UNIFIED_LINKING_PAGE_CREATION";
            str3 = "com.bloks.www.ig.unified_linking.page_creation";
        }
        IgBloksScreenConfig A0N2 = C18190wL.A0N(userSession3);
        A0N2.A0Q = str2;
        Bundle A007 = C62853b1.A00(A0N2, C63743iE.A02(str3, A006));
        Fragment fragment2 = r8.A01;
        C63863iT.A02(fragment2.requireActivity(), A007, userSession3, cls, "bloks").A0J(fragment2, 1122563);
    }

    public final void Bht() {
        UserSession userSession = this.A03;
        String A012 = C62963bD.A01(A05, userSession, "ig_professional_fb_page_linking");
        if (A012 == null || A012.length() == 0) {
            C67363zQ.A08(this.A01, userSession, AnonymousClass264.BUSINESS_CONNECT_FB_PAGE, C29771zH.A04);
            return;
        }
        A01(this, A012);
    }

    public static final void A00(AnonymousClass431 r4) {
        Bundle A06 = C18180wK.A06();
        A06.putBoolean("ux_flow_completion_status", true);
        A06.putInt("ux_flow_status_code", -1);
        Fragment fragment = r4.A01;
        fragment.getParentFragmentManager().A12("page_linking_request", A06);
        C18190wL.A19(fragment);
    }

    public final void CH8(int i, int i2, Intent intent) {
        Bundle extras;
        if (i == 64206) {
            if (i2 == -1) {
                IDxDListenerShape644S0100000_1_I2 iDxDListenerShape644S0100000_1_I2 = new IDxDListenerShape644S0100000_1_I2(this, 2);
                UserSession userSession = this.A03;
                C67363zQ.A06(intent, userSession, AnonymousClass3WZ.A00(this.A01.requireActivity(), userSession, iDxDListenerShape644S0100000_1_I2), i2);
                return;
            }
        } else if (i == 1122563 && i2 == -1 && intent != null && (extras = intent.getExtras()) != null) {
            Fragment fragment = this.A01;
            fragment.getParentFragmentManager().A12("page_linking_request", extras);
            C18190wL.A19(fragment);
            return;
        }
        A00(this);
    }
}
