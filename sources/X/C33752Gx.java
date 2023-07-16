package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.redex.IDxCallbackShape195S0200000_1_I2;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

/* renamed from: X.2Gx  reason: invalid class name and case insensitive filesystem */
public final class C33752Gx {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        BaseFragmentActivity baseFragmentActivity;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        C109326jp A06 = C63893iY.A06(r10, 0);
        FragmentActivity A05 = C63913ic.A05(r9);
        if ((A05 instanceof BaseFragmentActivity) && (baseFragmentActivity = (BaseFragmentActivity) A05) != null) {
            C10300i6 A0F = C63913ic.A0F(r9);
            C18200wM.A1R(A0F);
            UserSession userSession = (UserSession) A0F;
            IDxCallbackShape195S0200000_1_I2 iDxCallbackShape195S0200000_1_I2 = new IDxCallbackShape195S0200000_1_I2(A1Z ? 1 : 0, r9, A06);
            C04220Ms.A0B(userSession, 0);
            CallerContext callerContext = C37740K2a.A00;
            if (C62963bD.A03(callerContext, userSession, "ig_android_sdk_token_cache_ig_promote_access_token_helper")) {
                String A01 = C62963bD.A01(callerContext, userSession, "ig_android_sdk_token_cache_ig_promote_access_token_helper");
                if (A01 != null) {
                    iDxCallbackShape195S0200000_1_I2.CNL(A01);
                } else {
                    throw C18190wL.A0a("Required value was null.");
                }
            } else {
                C37741K2b A012 = C37741K2b.A01(userSession);
                C04220Ms.A06(A012);
                AnonymousClass2KE.A00(callerContext, baseFragmentActivity, new C37980KEx(A012, iDxCallbackShape195S0200000_1_I2), userSession, "ig_android_sdk_token_cache_ig_promote_access_token_helper", "bloks");
                return null;
            }
        }
        return null;
    }
}
