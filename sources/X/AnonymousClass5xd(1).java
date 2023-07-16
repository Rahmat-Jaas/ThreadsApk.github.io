package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxLDelegateShape339S0100000_2_I2;
import com.instagram.barcelona.R;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape1S1101000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;
import kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8;

/* renamed from: X.5xd  reason: invalid class name */
public final class AnonymousClass5xd extends AnonymousClass9NU implements C21735BzM {
    public static final String __redex_internal_original_name = "AppreciationGiftFeedFragment";
    public final String A00 = C122037Js.A00();
    public final C04530Oa A01;
    public final C04530Oa A02;
    public final C04530Oa A03;
    public final C04530Oa A04;
    public final C04530Oa A05;
    public final C04530Oa A06;
    public final C04530Oa A07 = AnonymousClass3W9.A00(this);
    public final C04530Oa A08;

    public final String getModuleName() {
        return "appreciation_gift_feed";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getRecyclerView().A11(new C150728wn(getRecyclerView().A0H, new IDxLDelegateShape339S0100000_2_I2(this, 1), C19064Aq3.A0C));
        AnonymousClass061 r3 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0301000_I2_1(r3, viewLifecycleOwner, this, (C146958n9) null, 2), AnonymousClass067.A00(viewLifecycleOwner), 3);
        C62793ak A0N = C18200wM.A0N(this.A08);
        String string = requireArguments().getString("arg_media_id");
        if (string != null) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape1S1101000_I2(A0N, string, (C146958n9) null, 2), AnonymousClass3J5.A00(A0N), 3);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final List A00(AnonymousClass5xd r3, boolean z, boolean z2) {
        C113106qj r2;
        boolean z3;
        AnonymousClass8AN r1 = new AnonymousClass8AN();
        if (z) {
            r2 = new C113106qj();
            r2.A06 = "onboard_banner_start_button_tag";
            r2.A05 = Integer.valueOf(R.drawable.instagram_money_pano_outline_24);
            r2.A03 = 2131821406;
            r2.A02 = 2131821407;
            z3 = false;
        } else {
            if (z2) {
                r2 = new C113106qj();
                r2.A06 = "non_recorded_gifters_disclaimer_dismiss_tag";
                r2.A05 = Integer.valueOf(R.drawable.instagram_gift_box_pano_outline_24);
                r2.A03 = 2131821405;
                z3 = true;
            }
            r1.add(r3.A01.getValue());
            AnonymousClass0OP.A11(r1);
            return r1;
        }
        r2.A08 = z3;
        r2.A00 = 1;
        r2.A04 = Integer.valueOf(R.color.igds_elevated_separator);
        r1.add(r2.A00());
        r1.add(r3.A01.getValue());
        AnonymousClass0OP.A11(r1);
        return r1;
    }

    public final Collection getDefinitions() {
        return C06750aI.A17(new C34888IhH(), new AnonymousClass60P(this, C86164wN.A0s(this, 29)), new C34919Ihm(this, AnonymousClass0wJ.A0X(this.A07), C86164wN.A0u(this, 45), C86164wN.A0u(this, 46), C86164wN.A0w(this, 24), C86164wN.A0x(this, 7)), new AnonymousClass604(), new C22457CaC((C133537vr) this.A03.getValue()), new AnonymousClass60F(new KtLambdaShape28S0100000_I2_8(this, 9)));
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C86164wN.A0s(this, 30));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public final boolean isScrolledToTop() {
        if (this.mView == null || getRecyclerView().computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass5xd() {
        KtLambdaShape28S0100000_I2_8 ktLambdaShape28S0100000_I2_8 = new KtLambdaShape28S0100000_I2_8(this, 18);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape28S0100000_I2_8(new KtLambdaShape28S0100000_I2_8(this, 15), 16));
        this.A08 = C18220wO.A0M(new KtLambdaShape28S0100000_I2_8(A012, 17), ktLambdaShape28S0100000_I2_8, C86154wM.A11((Object) null, A012, 48), C18210wN.A0l(AnonymousClass58E.class));
        this.A01 = C86144wL.A12(this, 8);
        this.A02 = C86144wL.A12(this, 10);
        this.A06 = C86144wL.A12(this, 14);
        this.A04 = C86144wL.A12(this, 12);
        this.A05 = C86144wL.A12(this, 13);
        this.A03 = C86144wL.A12(this, 11);
    }
}
