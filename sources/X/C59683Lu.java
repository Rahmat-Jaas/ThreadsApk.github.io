package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.barcelona.R;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Lu  reason: invalid class name and case insensitive filesystem */
public final class C59683Lu {
    public static final C27896Ev7 A01(UserMonetizationProductType userMonetizationProductType, UserSession userSession, boolean z) {
        C27896Ev7 r0;
        switch (C18230wP.A04(userMonetizationProductType, 1)) {
            case 2:
                r0 = new AnonymousClass4Ak();
                break;
            case 5:
                r0 = new C69814Ao();
                break;
            case 7:
            case 9:
                r0 = new C69824Ap(z);
                break;
            case 10:
                r0 = new C69844Ar(userSession, z);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                r0 = new C69834Aq(z);
                break;
            case 14:
                r0 = new AnonymousClass4Am();
                break;
            case 15:
                r0 = new C69804An();
                break;
            default:
                r0 = new AnonymousClass4Al();
                break;
        }
        return r0;
    }

    public static final int A00(String str) {
        if (C04220Ms.A0I(str, "users-pano")) {
            return R.drawable.instagram_users_pano_outline_24;
        }
        if (C04220Ms.A0I(str, "promote-pano")) {
            return R.drawable.instagram_promote_pano_outline_24;
        }
        if (C04220Ms.A0I(str, "money-pano")) {
            return R.drawable.instagram_money_pano_outline_24;
        }
        if (C04220Ms.A0I(str, "key-pano")) {
            return R.drawable.instagram_key_pano_outline_24;
        }
        if (C04220Ms.A0I(str, "badge-pano")) {
            return R.drawable.instagram_badge_pano_outline_24;
        }
        if (C04220Ms.A0I(str, "badges-pano")) {
            return R.drawable.instagram_badges_pano_outline_24;
        }
        if (C04220Ms.A0I(str, "crown-badge-pano")) {
            return R.drawable.instagram_crown_badge_pano_outline_24;
        }
        if (C04220Ms.A0I(str, "mail-pano")) {
            return R.drawable.instagram_mail_pano_outline_24;
        }
        if (C04220Ms.A0I(str, "business-pano")) {
            return R.drawable.instagram_business_pano_outline_24;
        }
        if (C04220Ms.A0I(str, "circle-check-pano")) {
            return R.drawable.instagram_circle_check_pano_filled_24;
        }
        if (C04220Ms.A0I(str, "circle-x-pano")) {
            return R.drawable.instagram_circle_x_pano_outline_24;
        }
        if (!C04220Ms.A0I(str, "ticket-pano")) {
            return R.drawable.instagram_money_pano_outline_24;
        }
        return R.drawable.instagram_ticket_pano_outline_24;
    }
}
