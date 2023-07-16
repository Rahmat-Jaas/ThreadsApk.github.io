package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;

/* renamed from: X.5wi  reason: invalid class name and case insensitive filesystem */
public final class C94765wi extends C34640IcN {
    public static final String __redex_internal_original_name = "IgBloksNativeScreenDemoFragment";
    public C107906hV A00;

    public final String getModuleName() {
        return "NativeScreenDemo";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0RA.A0C.A02(requireArguments());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1371383097);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.bloks_native_screen_demo, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.submit_button);
        View findViewById2 = inflate.findViewById(R.id.edit_text);
        C04220Ms.A0C(findViewById2, AnonymousClass000.A00(HttpStatus.SC_GONE));
        if (findViewById != null) {
            C86104wH.A1D(findViewById, 54, findViewById2, this);
        }
        C14030oh.A09(1047380362, A02);
        return inflate;
    }
}
