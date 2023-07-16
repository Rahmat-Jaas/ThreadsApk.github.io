package X;

import android.os.Bundle;
import android.widget.RadioGroup;
import java.util.ArrayList;

/* renamed from: X.1wC  reason: invalid class name */
public final class AnonymousClass1wC extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "ColorFilterOptionsFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131835534);
    }

    public final String getModuleName() {
        return "color_filter_options";
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-47617979);
        super.onCreate(bundle);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        ArrayList A0v2 = AnonymousClass0wJ.A0v();
        A0v2.add(new C62563aI("on", requireContext().getString(2131824101), requireContext().getString(2131824096)));
        A0v2.add(new C62563aI("off", requireContext().getString(2131824097), requireContext().getString(2131824093)));
        A0v2.add(new C62563aI("off", requireContext().getString(2131824100), requireContext().getString(2131824095)));
        A0v2.add(new C62563aI("off", requireContext().getString(2131824099), requireContext().getString(2131824094)));
        C61353Sw.A00((RadioGroup.OnCheckedChangeListener) null, "on", A0v, A0v2);
        A0v.add(new C63293hC(2131824098));
        setItems(A0v);
        C14030oh.A09(-1336838053, A02);
    }
}
