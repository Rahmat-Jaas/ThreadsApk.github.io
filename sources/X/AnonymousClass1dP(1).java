package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.redex.IDxCSpanShape5S0200000_1_I2;
import com.instagram.barcelona.R;

/* renamed from: X.1dP  reason: invalid class name */
public final class AnonymousClass1dP extends C34640IcN implements C21735BzM, C81404nj {
    public static final String __redex_internal_original_name = "InviteCollaboratorsBottomSheetFragment";
    public C83054qi A00;
    public boolean A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final String getModuleName() {
        return "invite_collaborators_bottom_sheet_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0wJ.A17(AnonymousClass0wJ.A0K(view, R.id.invite_button), 321, this);
        AnonymousClass0wJ.A17(AnonymousClass0wJ.A0K(view, R.id.cancel_button), 320, this);
        String A0g = C18180wK.A0g(this, 2131829574);
        TextView A0G = C18180wK.A0G(view, R.id.description_text);
        C18180wK.A0z(A0G);
        SpannableStringBuilder A0E = C18200wM.A0E(AnonymousClass0wJ.A0o(this, A0g, 2131829231));
        AnonymousClass3Zw.A01(A0E, new IDxCSpanShape5S0200000_1_I2(7, this, A0G), A0g);
        A0G.setText(A0E);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1026960580);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A01 = bundle2.getBoolean("args_is_clips_entry_point");
            C14030oh.A09(1290343862, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(1078335714, A022);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(166818684);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.layout_invite_collaborators_bottom_sheet_fragment, false);
        C14030oh.A09(-1889893539, A022);
        return A0D;
    }
}
