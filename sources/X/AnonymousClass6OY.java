package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.LinkingAuthState;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;

/* renamed from: X.6OY  reason: invalid class name */
public final class AnonymousClass6OY {
    public static final Object A00(AnonymousClass601 r10, C63893iY r11) {
        Integer num;
        C145918lK r1;
        C145918lK r12;
        Object obj;
        String str;
        LinkingAuthState linkingAuthState;
        C145918lK r13;
        String A00;
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        Object A0B = C63893iY.A0B(r11, A1Z ? 1 : 0);
        A0B.getClass();
        C18240wQ.A1I(A0B);
        Object A0B2 = C63893iY.A0B(r11, 2);
        A0B2.getClass();
        Map map = (Map) A0B2;
        Integer[] A002 = AnonymousClass006.A00(15);
        int length = A002.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A002[i];
                switch (num.intValue()) {
                    case 1:
                        A00 = "pro2pro_fulcrum_disclosure_cancel";
                        break;
                    case 2:
                        A00 = "pro2pro_missing_viewer_context";
                        break;
                    case 3:
                        A00 = "pro2pro_igba_success";
                        break;
                    case 4:
                        A00 = "pro2pro_flow_can_promote_with_business_user";
                        break;
                    case 5:
                        A00 = "pro2pro_not_eligible_for_fulcrum_disclosure";
                        break;
                    case 6:
                        A00 = "pro2pro_pro_disclosure_cancel";
                        break;
                    case 7:
                        A00 = "pro2pro_not_eligible_for_pro_disclosure";
                        break;
                    case 8:
                        A00 = "pro2pro_pro_disclosure_promotion_payments";
                        break;
                    case 9:
                        A00 = "pro2pro_pro_disclosure_hardlink_success";
                        break;
                    case 10:
                        A00 = "pro2pro_pro_disclosure_hardlink_fail";
                        break;
                    case 11:
                        A00 = "promote_prevalidation_missing_bridge_to_promote_callsite";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        A00 = "promote_prevalidation_resolution_cancel";
                        break;
                    case 13:
                        A00 = "promote_prevalidation_resolution_promotion_payments";
                        break;
                    case 14:
                        A00 = I17.A00(817);
                        break;
                    default:
                        A00 = "unknown";
                        break;
                }
                if (!C04220Ms.A0I(A00, A0B)) {
                    i++;
                }
            } else {
                num = AnonymousClass006.A00;
            }
        }
        switch (num.intValue()) {
            case 0:
            case 1:
            case 6:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                break;
            case 2:
            case 5:
                FragmentActivity A05 = C63913ic.A05(r10);
                if (!(A05 instanceof C145918lK) || (r1 = (C145918lK) A05) == null) {
                    return null;
                }
                r1.AM2();
                return null;
            case 3:
            case 4:
            case 9:
            case 14:
                FragmentActivity A052 = C63913ic.A05(r10);
                if (!(A052 instanceof C145918lK) || (r12 = (C145918lK) A052) == null) {
                    return null;
                }
                r12.AMK();
                return null;
            case 7:
            case 10:
                String A0r = C18220wO.A0r("access_token", map);
                if (!(A0r == null || A0r.length() == 0 || (obj = map.get("access_token_type")) == null)) {
                    for (Integer num2 : C18240wQ.A1Z()) {
                        switch (num2.intValue()) {
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
                            int intValue = num2.intValue();
                            if (intValue == 0) {
                                linkingAuthState = LinkingAuthState.NEW_AUTH;
                            } else if (intValue == A1Z) {
                                linkingAuthState = LinkingAuthState.PRO2PRO_NEW_AUTH;
                            } else if (intValue == 2) {
                                linkingAuthState = LinkingAuthState.BUSINESS_TOKEN_OR_UNKNOWN;
                            } else {
                                throw AnonymousClass4VZ.A00();
                            }
                            FragmentActivity A053 = C63913ic.A05(r10);
                            if (!(A053 instanceof C145918lK) || (r13 = (C145918lK) A053) == null) {
                                return null;
                            }
                            r13.BNC(linkingAuthState, A0r, false);
                            return null;
                        }
                    }
                    break;
                }
                break;
            case 8:
            case 13:
                C10300i6 A0F = C63913ic.A0F(r10);
                C18190wL.A10();
                AnonymousClass0wJ.A19(new C35199Ipr(), C63913ic.A05(r10), A0F);
                return null;
            default:
                return null;
        }
        C63913ic.A05(r10).finish();
        return null;
    }
}
