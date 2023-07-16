package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;
import com.instagram.service.session.UserSession;
import java.util.Collections;
import java.util.EnumSet;

/* renamed from: X.3zE  reason: invalid class name and case insensitive filesystem */
public final class C67253zE implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C67253zE.class);
    public static final String __redex_internal_original_name = "FxCalFlowGating";

    public static final boolean A02(C10300i6 r5) {
        String A04;
        C04220Ms.A0B(r5, 0);
        if (!(r5 instanceof UserSession) || C35692Ol.A00(C05030Qo.A02(r5)).A05(A00, FXPFLinkageCacheDebugFragment.callerName) || (A04 = C05030Qo.A04(r5)) == null) {
            return false;
        }
        C62813an A01 = C62813an.A01(r5);
        if (!A01.A07(A04)) {
            return false;
        }
        AccountFamily accountFamily = (AccountFamily) A01.A02.get(A04);
        accountFamily.getClass();
        if (C50492t5.A00(accountFamily.A04).size() > 1) {
            return true;
        }
        return false;
    }

    public static final boolean A03(C10300i6 r9, AnonymousClass22w r10) {
        C04220Ms.A0B(r9, 0);
        if (!(r9 instanceof UserSession) || Collections.unmodifiableSet(EnumSet.of(AnonymousClass22w.LOG_IN, new AnonymousClass22w[]{AnonymousClass22w.SIGN_UP, AnonymousClass22w.NUX_ADD_PROFILE_PICTURE_SCREEN, AnonymousClass22w.NUX_DISCOVER_PEOPLE_SCREEN, AnonymousClass22w.NUX_FIND_FRIENDS, AnonymousClass22w.NUX_FIND_FRIENDS_DIALOG, AnonymousClass22w.PROMOTE_PRO2PRO, AnonymousClass22w.ACCOUNT_RECOVERY})).contains(r10)) {
            return false;
        }
        return true;
    }

    public static final C318729h A00(C307322r r0) {
        switch (r0.ordinal()) {
            case 1:
                return C318729h.CAL_FLOW;
            case 2:
                return C318729h.CAL_FLOW_CHECK_QE;
            case 3:
                return C318729h.CP_FLOW;
            case 5:
                return C318729h.CP_FLOW_CHECK_QE;
            case 6:
                return C318729h.CP_FLOW_NAME;
            case 7:
                return C318729h.CP_FLOW_NAME_CHECK_QE;
            default:
                return C318729h.NONE;
        }
    }

    public static final boolean A01(Context context, C10300i6 r5) {
        String str;
        UserSession A02 = C05030Qo.A02(r5);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, A02, 36321546286144414L)) {
            return C35662Oi.A00(A02).A00;
        }
        AnonymousClass49S r1 = (AnonymousClass49S) C18180wK.A0c(A02, AnonymousClass49S.class, 20);
        AnonymousClass3AB r0 = AnonymousClass44X.A00().A01;
        if (r0 != null) {
            str = r0.A02;
        } else {
            str = null;
        }
        return AnonymousClass0wJ.A1W(AnonymousClass49S.A00(context, r1, str));
    }
}
