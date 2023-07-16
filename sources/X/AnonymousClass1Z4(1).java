package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1Z4  reason: invalid class name */
public final class AnonymousClass1Z4 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "EncryptedBackupsCreatePinNuxFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-953612757);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.create_pin_nux_layout, false);
        C14030oh.A09(-14057211, A02);
        return A0D;
    }

    public final void configureActionBar(AnonymousClass4u2 r1) {
        AnonymousClass4u2.A05(r1);
    }
}
