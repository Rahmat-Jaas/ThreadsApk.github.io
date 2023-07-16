package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1dF  reason: invalid class name */
public final class AnonymousClass1dF extends C34640IcN implements C21735BzM {
    public static final String __redex_internal_original_name = "IgBloksNativeBottomSheetContent";
    public C130667qT A00;
    public UserSession A01;

    public final String getModuleName() {
        return "ig_bloks_native_bottom_sheet_content";
    }

    public final boolean isScrolledToTop() {
        return false;
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final C10300i6 getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(416812067);
        super.onCreate(bundle);
        UserSession A0W = AnonymousClass0wJ.A0W(this);
        this.A01 = A0W;
        this.A00 = C130667qT.A01(this, this, A0W, C29781Fu1.A00());
        C14030oh.A09(1947873639, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1940249555);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.native_and_blocks_native_bottom_sheet_content);
        View findViewById = A0H.findViewById(R.id.button);
        if (findViewById != null) {
            AnonymousClass0wJ.A16(findViewById, 48, this);
        }
        C14030oh.A09(1373151368, A02);
        return A0H;
    }
}
