package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape3S0600000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1YH  reason: invalid class name */
public final class AnonymousClass1YH extends C34640IcN {
    public static final String __redex_internal_original_name = "IgBloksNativeEmbeddedScreenFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "ig_bloks_native_embedded_screen_example";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1243011902);
        super.onCreate(bundle);
        this.A00 = C18180wK.A0V(this.mArguments);
        C14030oh.A09(-1729593136, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-910499130);
        View inflate = layoutInflater.inflate(R.layout.native_bloks_embedded_and_screen_example, viewGroup, false);
        View requireViewById = inflate.requireViewById(R.id.complex_type_example_input);
        View requireViewById2 = inflate.requireViewById(R.id.server_param_input);
        View requireViewById3 = inflate.requireViewById(R.id.client_input_param_input);
        inflate.requireViewById(R.id.new_bloks_screen_button).setOnClickListener(new IDxCListenerShape3S0600000_1_I2(this, inflate.requireViewById(R.id.string_native_prop_input), requireViewById2, requireViewById, inflate.requireViewById(R.id.long_native_prop_input), requireViewById3, 0));
        C14030oh.A09(-661091521, A02);
        return inflate;
    }

    public final void onDestroyView() {
        int A02 = C14030oh.A02(-1805103380);
        super.onDestroyView();
        C14030oh.A09(896039378, A02);
    }
}
