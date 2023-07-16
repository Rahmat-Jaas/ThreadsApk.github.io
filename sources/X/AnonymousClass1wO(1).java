package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import kotlin.jvm.internal.KtLambdaShape116S0100000_I2_96;

/* renamed from: X.1wO  reason: invalid class name */
public final class AnonymousClass1wO extends C23411dm implements C82034oy {
    public static final String __redex_internal_original_name = "LanguagesSettingsFragment";
    public AnonymousClass1fC A00;
    public final C04530Oa A01 = C62373Zc.A03(new KtLambdaShape116S0100000_I2_96(this, 8));

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131829345);
    }

    public final String getModuleName() {
        return "languages_settings";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0H = C18200wM.A0H(this);
        C04220Ms.A06(A0H);
        C18230wP.A0z(requireContext(), A0H, R.color.direct_widget_primary_background);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AnonymousClass4MA.A03(C18210wN.A0H(this, 276), A0v, 2131821351);
        AnonymousClass4MA.A03(C18210wN.A0H(this, 277), A0v, 2131824348);
        AnonymousClass1fC r0 = this.A00;
        if (r0 != null) {
            r0.setItems(A0v);
            C24 scrollingViewProxy = getScrollingViewProxy();
            AnonymousClass1fC r02 = this.A00;
            if (r02 != null) {
                scrollingViewProxy.ChZ(r02);
                return;
            }
        }
        C04220Ms.A0E("adapter");
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(1259096493);
        super.onCreate(bundle);
        this.A00 = new AnonymousClass1fC(requireContext(), AnonymousClass0wJ.A0U(this.A01), this);
        C14030oh.A09(1966581046, A02);
    }
}
