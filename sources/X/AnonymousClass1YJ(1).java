package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1YJ  reason: invalid class name */
public final class AnonymousClass1YJ extends C34640IcN {
    public static final String __redex_internal_original_name = "WhatsAppBackedProfileBottomSheetFragment";
    public String A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return "instagram_profile_visit";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.whatsapp_backed_profile_bottom_sheet);
        ((TextView) AnonymousClass0wJ.A0J(A0K, R.id.title)).setText(AnonymousClass0wJ.A0o(this, this.A00, 2131838092));
        ((TextView) AnonymousClass0wJ.A0J(A0K, R.id.body)).setText(AnonymousClass0wJ.A0o(this, this.A00, 2131838090));
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C14030oh.A02(2008075270);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("user_name");
        } else {
            str = null;
        }
        this.A00 = str;
        C14030oh.A09(-1950823827, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1873649364);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.whatsapp_backed_profile_bottom_sheet, viewGroup, false);
        C14030oh.A09(396595498, A02);
        return inflate;
    }
}
