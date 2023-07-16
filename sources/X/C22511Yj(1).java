package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;

/* renamed from: X.1Yj  reason: invalid class name and case insensitive filesystem */
public final class C22511Yj extends C34640IcN {
    public static final String __redex_internal_original_name = "PromoteEditCaptionGuidanceBottomSheet";
    public boolean A00;
    public final C04530Oa A01 = C80644m9.A00(this);

    public final String getModuleName() {
        return "promote_edit_caption_guidance_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.promote_edit_caption_guidance_bottom_sheet);
        C18180wK.A10((TextView) AnonymousClass0wJ.A0J(A0K, R.id.bottom_sheet_title), this, 2131833586);
        boolean z = this.A00;
        int i = 2131833585;
        int i2 = 2131833584;
        int i3 = R.drawable.instagram_users_pano_outline_24;
        if (z) {
            i = 2131833583;
            i2 = 2131833582;
            i3 = R.drawable.instagram_app_imessage_pano_outline_24;
        }
        A00(A0K, R.id.ask_to_take_action_tip, i, i2, i3);
        A00(A0K, R.id.include_key_info_tip, 2131833591, 2131833590, R.drawable.instagram_key_pano_outline_24);
        A00(A0K, R.id.keep_it_simple_tip, 2131833593, 2131833592, R.drawable.instagram_circle_check_pano_outline_24);
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public static final void A00(View view, int i, int i2, int i3, int i4) {
        View A0K = AnonymousClass0wJ.A0K(view, i);
        C18180wK.A0G(A0K, R.id.primary_text).setText(i2);
        C18180wK.A0G(A0K, R.id.secondary_text).setText(i3);
        C18220wO.A0K(A0K, R.id.row_icon).setImageResource(i4);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = C14030oh.A02(-1984459809);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        boolean z = true;
        if (bundle2 == null || !bundle2.getBoolean("ARGUMENT_IS_MESSAGING_ADS_SELECTED", false)) {
            z = false;
        }
        this.A00 = z;
        C14030oh.A09(-536325345, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(2006960844);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_edit_caption_guidance_bottom_sheet, viewGroup, false);
        C14030oh.A09(923442750, A02);
        return inflate;
    }
}
