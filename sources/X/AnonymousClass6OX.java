package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.LinkingAuthState;
import java.util.Map;

/* renamed from: X.6OX  reason: invalid class name */
public final class AnonymousClass6OX {
    public static final Object A00(AnonymousClass601 r12, C63893iY r13) {
        LinkingAuthState linkingAuthState;
        C145918lK r1;
        String str;
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        Object A0B = C63893iY.A0B(r13, 2);
        A0B.getClass();
        Map map = (Map) A0B;
        boolean A01 = AnonymousClass3WF.A01(r13, 3);
        String A0r = C18220wO.A0r("access_token", map);
        if (A0r == null) {
            A0r = "";
        }
        Object obj = map.get("access_token_type");
        Integer[] A00 = AnonymousClass006.A00(3);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                Integer num = A00[i];
                switch (num.intValue()) {
                    case 1:
                        str = "facebook_access_token_pro2pro";
                        break;
                    case 2:
                        str = "business_user_access_token";
                        break;
                    default:
                        str = "facebook_access_token_cal";
                        break;
                }
                if (C04220Ms.A0I(str, obj)) {
                    int intValue = num.intValue();
                    if (intValue == 0) {
                        linkingAuthState = LinkingAuthState.NEW_AUTH;
                    } else if (intValue == A1Z) {
                        linkingAuthState = LinkingAuthState.PRO2PRO_NEW_AUTH;
                    } else if (intValue == 2) {
                        linkingAuthState = LinkingAuthState.BUSINESS_TOKEN_OR_UNKNOWN;
                    } else {
                        throw AnonymousClass4VZ.A00();
                    }
                } else {
                    i++;
                }
            } else {
                linkingAuthState = null;
            }
        }
        FragmentActivity A05 = C63913ic.A05(r12);
        if (A05 instanceof C145918lK) {
            r1 = (C145918lK) A05;
        } else {
            r1 = null;
        }
        if (linkingAuthState == null) {
            if (r1 != null) {
                r1.AMK();
            }
        } else if (r1 != null) {
            r1.BNC(linkingAuthState, A0r, A01);
            return null;
        }
        return null;
    }
}
