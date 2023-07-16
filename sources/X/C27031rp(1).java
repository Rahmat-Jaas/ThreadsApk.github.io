package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import kotlin.coroutines.jvm.internal.KtSLambdaShape11S0101000_I2_8;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;
import kotlin.jvm.internal.KtLambdaShape172S0100000_I2_1;
import kotlin.jvm.internal.KtLambdaShape29S0200000_I2_13;
import kotlin.jvm.internal.KtLambdaShape80S0100000_I2_60;

/* renamed from: X.1rp  reason: invalid class name and case insensitive filesystem */
public final class C27031rp extends AnonymousClass5xM {
    public static final String __redex_internal_original_name = "IncentivePlatformSettingsFragment";
    public final C04530Oa A00 = C18220wO.A0M(new KtLambdaShape80S0100000_I2_60(this, 24), new KtLambdaShape80S0100000_I2_60(this, 23), new KtLambdaShape29S0200000_I2_13(20, this, (Object) null), C18210wN.A0l(AnonymousClass10U.class));

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131829051);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final UserMonetizationProductType A07() {
        return UserMonetizationProductType.INCENTIVE_PLATFORM;
    }

    public final C101996Tk A08() {
        return new AnonymousClass62M("com.instagram.incentive_platform.screens.onboarding.onboarding_navigation_handler");
    }

    public final void A0A() {
        AnonymousClass10U r4 = (AnonymousClass10U) this.A00.getValue();
        C18190wL.A1C(getViewLifecycleOwner(), r4.A00, this, 26);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(r4, this, (C146958n9) null, 38), C18200wM.A0M(this), 3);
    }

    public final void A0B() {
        C04530Oa r6 = this.A00;
        AnonymousClass10U r3 = (AnonymousClass10U) r6.getValue();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0101000_I2_8((Object) r3, (C146958n9) null, 21), AnonymousClass3J5.A00(r3), 3);
        C37416Jrb.A0A(C35383Ito.A02, r3.A02, new KtLambdaShape172S0100000_I2_1(r3, 3));
        C62793ak A0N = C18200wM.A0N(r6);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape11S0101000_I2_8((Object) A0N, (C146958n9) null, 20), AnonymousClass3J5.A00(A0N), 3);
    }

    public final void A0D(boolean z) {
        C86074wE.A01(((AnonymousClass10U) this.A00.getValue()).A09, z);
    }
}
