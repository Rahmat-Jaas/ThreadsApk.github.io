package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCSpanShape14S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;

/* renamed from: X.1YP  reason: invalid class name */
public final class AnonymousClass1YP extends C34640IcN {
    public static final String __redex_internal_original_name = "ReelXpostViewerInfoFragment";
    public C57303An A00;
    public IgTextView A01;
    public UserSession A02;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final C10300i6 getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-915135451);
        super.onCreate(bundle);
        this.A02 = C18180wK.A0V(C18250wR.A07(this));
        C14030oh.A09(-1221567918, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-240449824);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.reel_xpost_viewer_info);
        C14030oh.A09(1954045405, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgTextView A0L = C18250wR.A0L(view, R.id.info_icon_content);
        this.A01 = A0L;
        AnonymousClass3Zw.A03(new IDxCSpanShape14S0100000_1_I2(this, 12), A0L, requireContext().getString(2131834185), AnonymousClass0wJ.A0l(requireContext(), requireContext().getString(2131834185), 2131834184));
    }
}
