package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1ZP  reason: invalid class name */
public final class AnonymousClass1ZP extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PromoteNonDiscriminationHECFragment";
    public UserSession A00;

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131833554);
    }

    public final String getModuleName() {
        return "promote_non_discrimination_hec";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.special_considerations_title_row), AnonymousClass0wJ.A0B(this).getString(2131833552), (String) null, true);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.special_considerations_content_1_row), (String) null, AnonymousClass0wJ.A0B(this).getString(2131833550), false);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.special_considerations_content_2_row), (String) null, AnonymousClass0wJ.A0B(this).getString(2131833551), false);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.acceptable_ad_targeting_row), AnonymousClass0wJ.A0B(this).getString(2131833535), (String) null, true);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.housing_targeting_row), AnonymousClass0wJ.A0B(this).getString(2131833549), AnonymousClass0wJ.A0B(this).getString(2131833548), false);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.employment_targeting_row), AnonymousClass0wJ.A0B(this).getString(2131833544), AnonymousClass0wJ.A0B(this).getString(2131833543), false);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.credit_targeting_row), AnonymousClass0wJ.A0B(this).getString(2131833540), AnonymousClass0wJ.A0B(this).getString(2131833539), false);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.ad_discrimination_row), AnonymousClass0wJ.A0B(this).getString(2131833536), (String) null, true);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.housing_discrimination_row), AnonymousClass0wJ.A0B(this).getString(2131833547), AnonymousClass0wJ.A0B(this).getString(2131833546), false);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.employment_discrimination_row), AnonymousClass0wJ.A0B(this).getString(2131833542), AnonymousClass0wJ.A0B(this).getString(2131833541), false);
        AnonymousClass2KM.A00(AnonymousClass0wJ.A0K(view, R.id.credit_discrimination_row), AnonymousClass0wJ.A0B(this).getString(2131833538), AnonymousClass0wJ.A0B(this).getString(2131833537), false);
        super.onViewCreated(view, bundle);
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1016938055);
        this.A00 = C18190wL.A0P(this).A0v;
        super.onCreate(bundle);
        C14030oh.A09(-724826683, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(817279390);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_non_discrimination_hec_view, viewGroup, false);
        C14030oh.A09(-1129691391, A02);
        return inflate;
    }
}
