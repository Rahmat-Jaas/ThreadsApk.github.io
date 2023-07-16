package X;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.KtLambdaShape115S0100000_I2_95;

/* renamed from: X.1wL  reason: invalid class name */
public final class AnonymousClass1wL extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "AccessibilityOptionsFragment";
    public AnonymousClass3FX A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape115S0100000_I2_95(this, 9));

    public final void configureActionBar(AnonymousClass4u2 r6) {
        String string = C18240wQ.A0A(this, r6, 0).getString(2131820823);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A01);
        AnonymousClass4u2.A08(r6, AnonymousClass00U.A0L(string, C63803iN.A0C(C18250wR.A0D(A0U, 0), A0U, 36879724529647810L)));
    }

    public final String getModuleName() {
        return "settings_accessibility_options";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-926963221);
        super.onCreate(bundle);
        this.A00 = new AnonymousClass3FX(this, AnonymousClass0wJ.A0X(this.A01));
        C14030oh.A09(-1306899449, A02);
    }

    public final void onResume() {
        int A02 = C14030oh.A02(1785632669);
        super.onResume();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass3FX r0 = this.A00;
        if (r0 == null) {
            C04220Ms.A0E("accessibilityOptionsController");
            throw null;
        }
        r0.A00(A0v);
        setItems(A0v);
        C14030oh.A09(420182062, A02);
    }
}
