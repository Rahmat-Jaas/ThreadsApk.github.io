package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.barcelona.R;
import kotlin.jvm.internal.KtLambdaShape18S0200000_I2_2;
import kotlin.jvm.internal.KtLambdaShape28S0100000_I2_8;

/* renamed from: X.5xY  reason: invalid class name */
public abstract class AnonymousClass5xY extends AnonymousClass9NU {
    public static final String __redex_internal_original_name = "GreenscreenTabBaseFragment";
    public final C04530Oa A00;
    public final C04530Oa A01;
    public final C04530Oa A02;
    public final C04530Oa A03 = AnonymousClass3W9.A00(this);

    public void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        getRecyclerView().setNestedScrollingEnabled(false);
    }

    public final AnonymousClass7Dm getRecyclerConfigBuilder() {
        return configBuilder(C86164wN.A0s(this, 33));
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A03);
    }

    public AnonymousClass5xY() {
        C02230Ai A0l = C18210wN.A0l(C21924C8j.class);
        this.A00 = C18220wO.A0M(new KtLambdaShape28S0100000_I2_8(this, 40), new KtLambdaShape28S0100000_I2_8(this, 41), new KtLambdaShape18S0200000_I2_2(3, (Object) null, this), A0l);
        this.A02 = C86144wL.A12(this, 39);
        this.A01 = C86144wL.A12(this, 38);
    }

    public int A00() {
        return R.layout.greenscreen_gallery_camera_roll_tab_layout;
    }
}
