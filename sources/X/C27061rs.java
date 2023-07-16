package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxMListenerShape500S0100000_1_I2;
import com.facebook.redex.IDxPCleanerShape530S0100000_1_I2;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;
import kotlin.jvm.internal.KtLambdaShape27S0200000_I2_11;

/* renamed from: X.1rs  reason: invalid class name and case insensitive filesystem */
public final class C27061rs extends AnonymousClass5xM {
    public static final String __redex_internal_original_name = "FanClubSettingsFragment";
    public C28321u4 A00;
    public AnonymousClass3HY A01;
    public final C04530Oa A02 = C18220wO.A0M(C18250wR.A0g(this, 24), C18250wR.A0g(this, 25), new KtLambdaShape27S0200000_I2_11(2, (Object) null, this), C18210wN.A0l(C19240zX.class));

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131837641);
    }

    public final String getModuleName() {
        return "UserPayFanclubSettingsFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        AnonymousClass495 A002 = AnonymousClass2O7.A00(A09());
        long A0B = C18200wM.A0B(A09());
        C04530Oa r2 = this.A05;
        String A0q = C18200wM.A0q(r2);
        C04220Ms.A0B(A0q, 2);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A002.A00, "ig_creator_subscription_management_screen_impression"), 1156);
        C18190wL.A1J(A0I, "creator_management_settings", A0B);
        C18250wR.A0z(A0I, A0q);
        C62793ak A0N = C18200wM.A0N(this.A02);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(A0N, (C146958n9) null, 40), AnonymousClass3J5.A00(A0N), 3);
        C61833Vz A003 = C36622Sa.A00();
        UserSession A09 = A09();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0s;
        C36622Sa.A00();
        C28321u4 A04 = A003.A04(this, this, C61403Th.A00((C17701AKf) null, (AnonymousClass38Q) null, (AnonymousClass35B) null, (AnonymousClass35C) null, (C559435e) null, (C82894qR) null, new IDxMListenerShape500S0100000_1_I2(this, 1), (C83704rq) null, new IDxPCleanerShape530S0100000_1_I2(this, 1), (AnonymousClass47H) null, (C561335x) null, (Boolean) null), quickPromotionSlot, A09);
        this.A00 = A04;
        registerLifecycleListener(A04);
        C28321u4 r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("quickPromotionDelegate");
            throw null;
        }
        r0.A01();
        this.A01 = new AnonymousClass3HY(this, requireActivity(), A09(), C18200wM.A0q(r2), 48);
        AnonymousClass3HA r5 = new AnonymousClass3HA(requireActivity(), A09());
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(r5, this, (C146958n9) null, 20), C18200wM.A0M(this), 3);
    }

    public final UserMonetizationProductType A07() {
        return UserMonetizationProductType.FAN_CLUB_CREATOR;
    }

    public final C101996Tk A08() {
        return new AnonymousClass62M("com.instagram.user_pay.fan_club.utils.creator_onboarding_navigation_handler");
    }

    public final void A0A() {
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(viewLifecycleOwner, AnonymousClass061.STARTED, this, (C146958n9) null, 2), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final void A0B() {
        C62793ak A0N = C18200wM.A0N(this.A02);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, C18240wQ.A0n(A0N, (C146958n9) null, 41), AnonymousClass3J5.A00(A0N), 3);
    }

    public final void A0D(boolean z) {
        C86074wE.A01(((C19240zX) this.A02.getValue()).A09, z);
    }

    public static final void A00(C27061rs r5) {
        C18180wK.A17(AnonymousClass3WJ.A00().A00(r5.requireContext(), r5.A09(), (String) null), C18180wK.A0Q(r5.getActivity(), r5.A09()));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass3HY r2 = this.A01;
        if (r2 == null) {
            C04220Ms.A0E("fanClubSettingsRecommendationsNavigator");
            throw null;
        } else {
            r2.A00(requireContext(), (AnonymousClass23Z) null, i, i2);
        }
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(-1352927748);
        super.onDestroyView();
        C28321u4 r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("quickPromotionDelegate");
            throw null;
        }
        unregisterLifecycleListener(r0);
        C14030oh.A09(-1952414238, A022);
    }
}
