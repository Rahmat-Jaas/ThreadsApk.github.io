package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape9S0301000_I2_1;
import kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8;

/* renamed from: X.5xb  reason: invalid class name */
public final class AnonymousClass5xb extends AnonymousClass9NU implements C82424pb {
    public static final String __redex_internal_original_name = "AppreciationFundingBottomSheetFragment";
    public AnonymousClass60Y A00;
    public SpinnerImageView A01;
    public List A02;
    public boolean A03;
    public final List A04;
    public final C04530Oa A05;
    public final C04530Oa A06;
    public final C04530Oa A07 = AnonymousClass3W9.A00(this);
    public final C04530Oa A08;
    public final C105346dH A09;

    public final String getModuleName() {
        return "appreciation_fan_spending_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (SpinnerImageView) AnonymousClass0wJ.A0J(view, R.id.loading);
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape9S0301000_I2_1(r4, viewLifecycleOwner, this, (C146958n9) null, 0), AnonymousClass067.A00(viewLifecycleOwner), 3);
        C62793ak A0N = C18200wM.A0N(this.A08);
        int i = requireArguments().getInt("ext_balance");
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape2S0102000_I2(A0N, (C146958n9) null, i, 7), AnonymousClass3J5.A00(A0N), 3);
    }

    public final Collection getDefinitions() {
        return C06750aI.A17(new AnonymousClass604(), new AnonymousClass607(), new C34888IhH(), new AnonymousClass60E(this.A09));
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C86164wN.A0s(this, 28));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A07);
    }

    public final boolean onBackPressed() {
        C881757a r2 = (C881757a) this.A08.getValue();
        int i = requireArguments().getInt("ext_balance");
        if (this.A03) {
            return false;
        }
        AnonymousClass76R r22 = r2.A01;
        C89195Ch A002 = AnonymousClass76R.A00(r22, AnonymousClass006.A00, AnonymousClass006.A0Y);
        C86134wK.A1F(A002, i);
        A002.A0B("star_package_options", r22.A00);
        C13330nS r1 = r22.A02;
        C04220Ms.A05(r1);
        C86104wH.A1I(AnonymousClass0wJ.A0M(r1, "user_click_appreciationgiver_exit"), A002, r22.A01.A03, AnonymousClass4WJ.A0A(), 2820);
        return false;
    }

    public AnonymousClass5xb() {
        KtLambdaShape28S0100000_I2_8 ktLambdaShape28S0100000_I2_8 = new KtLambdaShape28S0100000_I2_8(this, 5);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape28S0100000_I2_8(new KtLambdaShape28S0100000_I2_8(this, 1), 2));
        this.A08 = C18220wO.A0M(new KtLambdaShape28S0100000_I2_8(A012, 3), ktLambdaShape28S0100000_I2_8, C86154wM.A11((Object) null, A012, 46), C18210wN.A0l(C881757a.class));
        this.A04 = C18180wK.A0n(new C953760a((Integer) null, false));
        this.A09 = new C105346dH(this);
        this.A05 = AnonymousClass0OY.A02(new KtLambdaShape28S0100000_I2_8(this, 0));
        this.A06 = AnonymousClass0OY.A02(new KtLambdaShape28S0100000_I2_8(this, 4));
        this.A02 = AnonymousClass0ZV.A00;
    }
}
