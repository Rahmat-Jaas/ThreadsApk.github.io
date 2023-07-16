package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;
import kotlin.jvm.internal.KtLambdaShape31S0200000_I2_15;
import kotlin.jvm.internal.KtLambdaShape91S0100000_I2_71;

/* renamed from: X.1ZG  reason: invalid class name */
public final class AnonymousClass1ZG extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "CreatorMonetizationStatusSettingFragment";
    public final C04530Oa A00;
    public final C04530Oa A01 = C80644m9.A00(this);
    public final C04530Oa A02;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, ((AnonymousClass100) this.A02.getValue()).A00);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18240wQ.A12((RecyclerView) view.findViewById(R.id.product_settings_recycle_view), this.A00);
        AnonymousClass061 r4 = AnonymousClass061.STARTED;
        AnonymousClass066 viewLifecycleOwner = getViewLifecycleOwner();
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(viewLifecycleOwner, r4, this, (C146958n9) null, 40), AnonymousClass067.A00(viewLifecycleOwner), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public AnonymousClass1ZG() {
        KtLambdaShape91S0100000_I2_71 ktLambdaShape91S0100000_I2_71 = new KtLambdaShape91S0100000_I2_71(this, 20);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape91S0100000_I2_71(new KtLambdaShape91S0100000_I2_71(this, 17), 18));
        this.A02 = C18220wO.A0M(new KtLambdaShape91S0100000_I2_71(A012, 19), ktLambdaShape91S0100000_I2_71, new KtLambdaShape31S0200000_I2_15(49, (Object) null, A012), C18210wN.A0l(AnonymousClass100.class));
        this.A00 = C62373Zc.A03(new KtLambdaShape91S0100000_I2_71(this, 16));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1678034109);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_settings_layout, viewGroup, false);
        C14030oh.A09(-812354429, A022);
        return inflate;
    }
}
