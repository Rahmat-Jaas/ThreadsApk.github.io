package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.service.session.UserSession;

/* renamed from: X.1jy  reason: invalid class name and case insensitive filesystem */
public final class C24741jy extends C19819BBt implements CallerContextable {
    public static final CallerContext A06 = CallerContext.A00(C24741jy.class);
    public static final String __redex_internal_original_name = "FacebookConnectHelper";
    public C83814s2 A00;
    public C24581jd A01;
    public AnonymousClass264 A02;
    public final Fragment A03;
    public final UserSession A04;
    public final C71864Ko A05 = new C71864Ko(this);

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 64206) {
            C67363zQ.A06(intent, this.A04, this.A05, i2);
        }
    }

    public final void A00(AnonymousClass264 r6) {
        boolean A032;
        C29771zH r4 = C29771zH.A03;
        this.A02 = r6;
        UserSession userSession = this.A04;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36319957147063836L)) {
            A032 = C35692Ol.A00(userSession).A05(A06, "ig_android_linking_cache_ig_to_fb_authorization");
        } else {
            A032 = C62963bD.A03(A06, userSession, "ig_to_fb_connect");
        }
        if (A032) {
            this.A00.Blp(r6);
        } else {
            C67363zQ.A08(this.A03, userSession, r6, r4);
        }
    }

    public C24741jy(Fragment fragment, C83474rR r3, UserSession userSession, C83814s2 r5) {
        this.A04 = userSession;
        this.A03 = fragment;
        this.A00 = r5;
        r3.registerLifecycleListener(this);
        this.A01 = new C24581jd(this);
    }
}
