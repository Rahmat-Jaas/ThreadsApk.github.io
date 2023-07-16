package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1qG  reason: invalid class name and case insensitive filesystem */
public final class C26231qG extends AnonymousClass1dC implements C82594px {
    public static final String __redex_internal_original_name = "SeeOtherOptionSheetFragment";
    public C10300i6 A00;
    public final View.OnClickListener A01 = C18190wL.A0H(this, 456);
    public final View.OnClickListener A02 = C18190wL.A0H(this, 455);

    public final String getModuleName() {
        return "instagram_terms_flow";
    }

    public final Integer AkY() {
        return AnonymousClass006.A09;
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-268074887);
        super.onCreate(bundle);
        this.A00 = C18190wL.A0S(this.mArguments);
        C14030oh.A09(-675653054, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1629088621);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.see_other_options_layout);
        View requireViewById = A0H.requireViewById(R.id.help_center_button);
        View requireViewById2 = A0H.requireViewById(R.id.cancel_button);
        requireViewById.setOnClickListener(this.A02);
        requireViewById2.setOnClickListener(this.A01);
        C14030oh.A09(-215215352, A022);
        return A0H;
    }
}
