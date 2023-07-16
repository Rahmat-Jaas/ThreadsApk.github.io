package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;

/* renamed from: X.1Xe  reason: invalid class name */
public final class AnonymousClass1Xe extends C34640IcN {
    public static final String __redex_internal_original_name = "InboxBlockBottomSheetFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-639131547);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.inbox_block_fragment_layout, viewGroup, false);
        C14030oh.A09(92269333, A02);
        return inflate;
    }
}
