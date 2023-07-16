package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1Xy  reason: invalid class name and case insensitive filesystem */
public final class C22401Xy extends C34640IcN {
    public static final String __redex_internal_original_name = "RBSImportLinkBottomSheetFragment";
    public UserSession A00;

    public final String getModuleName() {
        return "rbs_import_link_bottom_sheet";
    }

    public final C10300i6 getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        C18210wN.A0m();
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-879602135);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0wJ.A0W(this);
        C14030oh.A09(967375339, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1815170962);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_gallery_rbs_import_bottomsheet, viewGroup, false);
        C14030oh.A09(787420959, A02);
        return inflate;
    }
}
