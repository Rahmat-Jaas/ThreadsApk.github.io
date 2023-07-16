package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.switchbutton.IgSwitch;

/* renamed from: X.1Y8  reason: invalid class name */
public final class AnonymousClass1Y8 extends C34640IcN {
    public static final String __redex_internal_original_name = "MentionPrivacySettingBottomSheetFragment";
    public C565237n A00;
    public IgSwitch A01;
    public final C04530Oa A02 = C80644m9.A00(this);

    public final String getModuleName() {
        return "mention_privacy_setting_bottomsheet";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(158215349);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_mentions_privacy_setting_bottomsheet, viewGroup, false);
        TextView A0L = AnonymousClass0wJ.A0L(inflate, R.id.row_simple_text_textview);
        C18200wM.A15(A0L.getContext(), A0L, 2131821294);
        TextView A0L2 = AnonymousClass0wJ.A0L(inflate, R.id.row_simple_text_detail);
        A0L2.setVisibility(0);
        C18200wM.A15(A0L2.getContext(), A0L2, 2131830377);
        this.A01 = C18250wR.A0N(inflate, R.id.row_menu_item_switch);
        IgdsBottomButtonLayout A0W = C18230wP.A0W(inflate, R.id.mention_privacy_setting_button_group);
        A0W.setPrimaryActionOnClickListener(C18190wL.A0H(this, 278));
        A0W.setSecondaryActionOnClickListener(C18190wL.A0H(this, 279));
        C14030oh.A09(-1658454602, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1515315208);
        super.onDestroyView();
        this.A01 = null;
        C14030oh.A09(276774641, A022);
    }
}
