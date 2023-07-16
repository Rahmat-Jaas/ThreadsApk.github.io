package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1YM  reason: invalid class name */
public abstract class AnonymousClass1YM extends C34640IcN {
    public static final String __redex_internal_original_name = "IgFxFragment";
    public Window A00;
    public C19577Ayd A01;
    public UserSession A02;

    public abstract String getModuleName();

    public final C10300i6 getSession() {
        return this.A02;
    }

    public void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1720271639);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0V(C18250wR.A07(this));
        C14030oh.A09(-322763445, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-417293314);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.bloks_fragment);
        C14030oh.A09(624427050, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = C18190wL.A0U(view, R.id.error_view_stub);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.A00 = activity.getWindow();
        }
        C35682Ok.A00().A00(getContext(), this.A00, false, false, false);
    }
}
