package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1Xu  reason: invalid class name and case insensitive filesystem */
public final class C22361Xu extends C34640IcN {
    public static final String __redex_internal_original_name = "IgBloksNativeHybridNativeAndBloksBottomSheetInteropExampleFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "ig_bloks_native_hybrid_native_and_bloks_bottom_sheet_interop_example";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(266229650);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(-1593605768, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-1178462080);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.native_and_blocks_bottom_sheet_example);
        View findViewById = A0H.findViewById(R.id.button);
        if (findViewById != null) {
            AnonymousClass0wJ.A16(findViewById, 60, this);
        }
        C14030oh.A09(1483845943, A02);
        return A0H;
    }
}
