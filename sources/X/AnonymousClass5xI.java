package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.5xI  reason: invalid class name */
public abstract class AnonymousClass5xI extends C34640IcN implements C82424pb, C143648h5, C144598il {
    public static final String __redex_internal_original_name = "FBPayIg4aContainerFragment";
    public UserSession A00;

    public final String getModuleName() {
        return C18170wI.A00(637);
    }

    public final boolean Bzy(Bundle bundle, int i, boolean z) {
        if (!(this instanceof C956661r)) {
            return C99156Ii.A00(bundle, this, z);
        }
        if (C99156Ii.A00(bundle, this, z) || ((getChildFragmentManager().A0L(R.id.container_fragment) instanceof C143648h5) && ((C143648h5) getChildFragmentManager().A0L(R.id.container_fragment)).Bzy(bundle, i, z))) {
            return true;
        }
        return false;
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final boolean BNN(int i, KeyEvent keyEvent) {
        getChildFragmentManager().A0L(R.id.container_fragment);
        return false;
    }

    public final boolean onBackPressed() {
        Fragment A0L = getChildFragmentManager().A0L(R.id.container_fragment);
        if (A0L instanceof C143618h2) {
            return ((C143618h2) A0L).onBackPressed();
        }
        return false;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(334316684);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(1138514474, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1809668870);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.fbpay_container_fragment);
        C14030oh.A09(1920660584, A02);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Fragment A002;
        super.onViewCreated(view, bundle);
        C12560m7 childFragmentManager = getChildFragmentManager();
        if (childFragmentManager.A0L(R.id.container_fragment) == null) {
            Bundle bundle2 = this.mArguments;
            bundle2.getClass();
            String string = bundle2.getString("CHILD_FRAGMENT_IDENTIFIER");
            Bundle bundle3 = this.mArguments;
            bundle3.getClass();
            Bundle bundle4 = bundle3.getBundle("CHILD_FRAGMENT_BUNDLE");
            if (this instanceof C956661r) {
                A002 = AnonymousClass7Kz.A0K().A05(bundle4, string);
            } else if (this instanceof C956561q) {
                A002 = AnonymousClass7Kz.A07().A06.A01(bundle4, string);
            } else {
                C04220Ms.A0B(string, 0);
                A002 = AnonymousClass7Kz.A06().A00(bundle4, string);
            }
            if (A002 != null) {
                A002.setTargetFragment((Fragment) null, getTargetRequestCode());
                AnonymousClass01J r0 = new AnonymousClass01J(childFragmentManager);
                r0.A0D(A002, R.id.container_fragment);
                r0.A00();
            }
        }
    }
}
