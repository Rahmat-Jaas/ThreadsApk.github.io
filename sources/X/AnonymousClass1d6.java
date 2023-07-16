package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1d6  reason: invalid class name */
public final class AnonymousClass1d6 extends C34640IcN implements C34 {
    public static final String __redex_internal_original_name = "FacebookCrosspostingToInstagramFragment";
    public String A00;
    public String A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.facebook_crossposting_to_instagram_subtitle);
        String str = this.A01;
        if (str == null) {
            C04220Ms.A0E("userName");
            throw null;
        } else if (str.length() > 0) {
            textView.setText(AnonymousClass0wJ.A0o(this, str, 2131826996));
        }
    }

    public final Integer B6F() {
        return AnonymousClass006.A0u;
    }

    public final String getModuleName() {
        String str = this.A00;
        if (str != null) {
            return ACE.A00(this, str);
        }
        C04220Ms.A0E("previousModuleName");
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1419626610);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C18210wN.A0b(requireArguments, "args_previous_module_name", "");
        this.A01 = C18210wN.A0b(requireArguments, "args_user_name", "");
        C14030oh.A09(1400456711, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-96595330);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.facebook_crossposting_to_instagram_sheet_fragment, viewGroup, false);
        C14030oh.A09(-1007755617, A022);
        return inflate;
    }
}
