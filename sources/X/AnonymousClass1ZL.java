package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.Map;

/* renamed from: X.1ZL  reason: invalid class name */
public final class AnonymousClass1ZL extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "QuickPromotionDebugSurveyFragment";
    public EditText A00;
    public TextView A01;
    public UserSession A02;
    public final Map A03 = AnonymousClass0wJ.A0y();

    public final void configureActionBar(AnonymousClass4u2 r4) {
        r4.CtT(true);
        AnonymousClass4u2.A02(this, r4, 2131825606);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A05(AnonymousClass006.A1C);
        A0K.A0C = C18210wN.A0H(this, 63);
        A0K.A01 = C18230wP.A0A(this).getColor(R.color.blue_5);
        r4.A7Q(new C25435DlZ(A0K));
    }

    public final String getModuleName() {
        return "quick_promotion_survey_internal";
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(536722849);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(-2077658973, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1429096726);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.quick_promotion_launch_survey_fragment);
        this.A00 = (EditText) A0H.findViewById(R.id.integration_point_field);
        this.A01 = C18180wK.A0G(A0H, R.id.trigger_context_content);
        AnonymousClass0wJ.A17(A0H.requireViewById(R.id.add_attribute_button), 61, this);
        AnonymousClass0wJ.A17(A0H.requireViewById(R.id.clear_attributes_button), 62, this);
        C14030oh.A09(735035053, A022);
        return A0H;
    }
}
