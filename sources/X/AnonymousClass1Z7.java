package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1Z7  reason: invalid class name */
public final class AnonymousClass1Z7 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "PromoteAdsManagerErrorFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        r2.Cqb(2131833619);
        C12560m7 r0 = this.mFragmentManager;
        if (r0 != null) {
            r2.CtT(C18180wK.A1X(r0.A0I()));
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final String getModuleName() {
        return "promote_simple_error";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View requireViewById = view.requireViewById(R.id.promote_empty_view_stub);
        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.view.ViewStub");
        View inflate = ((ViewStub) requireViewById).inflate();
        if (inflate != null) {
            ((TextView) AnonymousClass0wJ.A0J(inflate, R.id.promote_empty_view_title)).setText(2131833091);
            ((TextView) AnonymousClass0wJ.A0J(inflate, R.id.promote_empty_view_description)).setText(2131833090);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1188904828);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.promote_ads_manager_error_view, false);
        C14030oh.A09(103002230, A02);
        return A0D;
    }
}
