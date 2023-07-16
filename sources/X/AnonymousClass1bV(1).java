package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.barcelona.R;

/* renamed from: X.1bV  reason: invalid class name */
public final class AnonymousClass1bV extends C34640IcN implements C82424pb, C82034oy {
    public static final String __redex_internal_original_name = "EffectLicensingFragment";
    public EffectAttribution A00;
    public C10300i6 A01;

    public final String getModuleName() {
        return "effect_licensing";
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        r3.setTitle(AnonymousClass0wJ.A0B(this).getString(2131829597));
        AnonymousClass4u2.A04(C18180wK.A0N(), r3, this, 28);
    }

    public final boolean onBackPressed() {
        C18190wL.A1A(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1124765370);
        super.onCreate(bundle);
        this.A01 = C18190wL.A0S(requireArguments());
        this.A00 = (EffectAttribution) requireArguments().getParcelable("ar_effect_licensing");
        C14030oh.A09(-131714806, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-157361744);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.effect_licensing_fragment_layout);
        C14030oh.A09(-1337295839, A02);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EffectAttribution effectAttribution = this.A00;
        if (effectAttribution != null) {
            Bundle requireArguments = requireArguments();
            RecyclerView recyclerView = (RecyclerView) C18180wK.A0E(view, R.id.recyclerview);
            Context context = view.getContext();
            C18200wM.A1H(recyclerView, 1);
            C34195I7r i7r = new C34195I7r(context);
            i7r.A00(context.getDrawable(R.drawable.effect_licensing_divider));
            recyclerView.A0y(i7r);
            recyclerView.setAdapter(new I7I(requireArguments, effectAttribution, this));
        }
    }
}
