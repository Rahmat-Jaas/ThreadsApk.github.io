package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape332S0100000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.service.session.UserSession;

/* renamed from: X.1dG  reason: invalid class name */
public final class AnonymousClass1dG extends C34640IcN implements C21735BzM {
    public static final String __redex_internal_original_name = "RestrictInfoBottomSheetFragmentImpl";
    public View A00;
    public C13330nS A01;
    public IgdsBottomButtonLayout A02;
    public UserSession A03;
    public C307722x A04;
    public C83204qx A05;
    public String A06;
    public String A07;
    public boolean A08;
    public ImageUrl A09;
    public String A0A;
    public boolean A0B;

    public final String getModuleName() {
        return "restrict_half_sheet";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final C10300i6 getSession() {
        return this.A03;
    }

    public final boolean isScrolledToTop() {
        View view = this.A00;
        if (view == null || view.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-993508712);
        super.onCreate(bundle);
        Bundle A072 = C18250wR.A07(this);
        UserSession A0V = C18180wK.A0V(A072);
        this.A03 = A0V;
        this.A01 = C13330nS.A01(this, A0V);
        Object obj = A072.get("entry_point");
        obj.getClass();
        this.A04 = (C307722x) obj;
        this.A06 = A072.getString("analytics_extra");
        this.A07 = C18190wL.A0j(A072, "target_user_id");
        this.A0A = C18190wL.A0j(A072, "target_username");
        this.A09 = (ImageUrl) C18240wQ.A0D(A072, "target_profile_url");
        this.A0B = A072.getBoolean("hide_action_button");
        this.A08 = A072.getBoolean("dont_dismiss_on_restrict_success");
        C14030oh.A09(1421280467, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-451799264);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.fragment_restrict_user_bottom_sheet);
        C14030oh.A09(1046787591, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IgdsHeadline A0S = C18240wQ.A0S(view, R.id.restrict_headline_component);
        A0S.setHeadline((CharSequence) AnonymousClass0wJ.A0o(this, this.A0A, 2131834912));
        A0S.setCircularImageUrl(this.A09, this.A0A);
        A0S.setType(AnonymousClass23M.DEFAULT);
        Context requireContext = requireContext();
        int i = 2131834921;
        if (C35432Nk.A00(this.A03)) {
            i = 2131834920;
        }
        C62263Ya A002 = C62263Ya.A00(requireContext());
        A002.A03(requireContext.getString(2131834940), (CharSequence) null, R.drawable.instagram_shield_pano_outline_24);
        A002.A03(requireContext.getString(2131834916), (CharSequence) null, R.drawable.instagram_comment_pano_outline_24);
        A0S.setBulletList(C62263Ya.A01(A002, requireContext.getString(i), (CharSequence) null, R.drawable.instagram_direct_pano_outline_24));
        this.A00 = view.requireViewById(R.id.restrict_bottom_sheet_scrollview);
        IgdsBottomButtonLayout A0W = C18230wP.A0W(view, R.id.restrict_info_row_action_button);
        this.A02 = A0W;
        if (this.A0B) {
            A0W.setVisibility(8);
            return;
        }
        A0W.setVisibility(0);
        this.A02.addOnLayoutChangeListener(new IDxCListenerShape332S0100000_1_I2(this, 4));
        this.A02.setPrimaryAction(getString(2131834911), C18210wN.A0H(this, 360));
        AnonymousClass0wJ.A14(C28161tl.A04(this.A03), "restrict_info_bottomsheet_shown_count", 0);
    }
}
