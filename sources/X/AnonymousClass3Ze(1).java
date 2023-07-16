package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Ze  reason: invalid class name */
public final class AnonymousClass3Ze {
    public static final C319329n A00(ValuePropsFlow valuePropsFlow) {
        switch (C18230wP.A04(valuePropsFlow, 0)) {
            case 0:
            case 1:
            case 3:
                return C319329n.ACCOUNTS;
            case 2:
                return C319329n.VALUE_PROP_INSIGHTS;
            case 4:
                return C319329n.VALUE_PROP_INSPIRATION;
            case 5:
                return C319329n.VALUE_PROP_BONUSES;
            case 6:
                return C319329n.VALUE_PROP_SUBSCRIPTIONS;
            case 7:
                return C319329n.VALUE_PROP_BADGES;
            case 8:
                return C319329n.VALUE_PROP_CREATOR_MARKETPLACE;
            default:
                throw AnonymousClass4VZ.A00();
        }
    }

    public static final void A03(UserSession userSession, String str) {
        C04220Ms.A0B(str, 1);
        C10680ik r1 = new C10680ik(userSession);
        r1.A02 = "open_creator_tools";
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1.A00(), "ig_open_creator_tool"), 1395);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18220wO.A1D(AnonymousClass299.RELIABILITY, A0I);
            A0I.A1J(str);
            A0I.A0O(C314127n.FAIL, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
            A0I.Bb4();
        }
    }

    public static final void A01(C319329n r2, C319529p r3, UserSession userSession) {
        AnonymousClass0wJ.A1N(userSession, r2);
        C04220Ms.A0B(r3, 2);
        C10680ik r1 = new C10680ik(userSession);
        r1.A02 = "open_creator_tools";
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1.A00(), "ig_open_creator_tool"), 1395);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18220wO.A1D(AnonymousClass299.CLICK, A0I);
            A0I.A0O(r2, "screen");
            A0I.A0O(r3, "target");
            A0I.Bb4();
        }
    }

    public static final void A02(C319329n r2, UserSession userSession) {
        AnonymousClass0wJ.A1N(userSession, r2);
        C10680ik r1 = new C10680ik(userSession);
        r1.A02 = "open_creator_tools";
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1.A00(), "ig_open_creator_tool"), 1395);
        if (AnonymousClass0wJ.A1U(A0I)) {
            C18220wO.A1D(AnonymousClass299.IMPRESSION, A0I);
            A0I.A0O(r2, "screen");
            A0I.Bb4();
        }
    }
}
