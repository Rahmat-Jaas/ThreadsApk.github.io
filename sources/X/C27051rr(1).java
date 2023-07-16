package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import java.util.ArrayList;
import kotlin.jvm.internal.KtLambdaShape29S0200000_I2_13;
import kotlin.jvm.internal.KtLambdaShape80S0100000_I2_60;

/* renamed from: X.1rr  reason: invalid class name and case insensitive filesystem */
public final class C27051rr extends AnonymousClass5xM {
    public static final String __redex_internal_original_name = "IncentivePlatformBloksSettingsFragment";
    public C147138nS A00 = new C65923wh();
    public final C04530Oa A01;

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
        C18190wL.A1C(getViewLifecycleOwner(), ((C19350zj) this.A01.getValue()).A00, this, 25);
    }

    public C27051rr() {
        KtLambdaShape80S0100000_I2_60 ktLambdaShape80S0100000_I2_60 = new KtLambdaShape80S0100000_I2_60(this, 22);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape80S0100000_I2_60(new KtLambdaShape80S0100000_I2_60(this, 19), 20));
        this.A01 = C18220wO.A0M(new KtLambdaShape80S0100000_I2_60(A012, 21), ktLambdaShape80S0100000_I2_60, new KtLambdaShape29S0200000_I2_13(19, A012, (Object) null), C18210wN.A0l(C19350zj.class));
    }

    public final void A0B() {
        if (isAdded() && !this.mRemoving) {
            AnonymousClass0wJ.A0F().post(new AnonymousClass4P7(this));
        }
    }

    public final void A0D(boolean z) {
        Object value;
        ArrayList A0v;
        if (isAdded() && !this.mRemoving) {
            C86074wE r2 = ((C19350zj) this.A01.getValue()).A01;
            do {
                value = r2.getValue();
                if (z) {
                    A0v = C06750aI.A14(new C133697wC());
                } else {
                    A0v = AnonymousClass0wJ.A0v();
                }
            } while (!r2.ADi(value, A0v));
        }
    }
}
