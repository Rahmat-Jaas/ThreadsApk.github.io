package X;

import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

/* renamed from: X.1cs  reason: invalid class name and case insensitive filesystem */
public final class C23271cs extends C34640IcN implements C81404nj {
    public static final String __redex_internal_original_name = "AltTextInfoBottomSheetFragment";
    public final C04530Oa A00 = C80644m9.A00(this);

    public final String getModuleName() {
        return "alt_text_info_bottom_sheet";
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(-493532842);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.alt_text_info_bottomsheet, viewGroup, false);
        C04220Ms.A0C(inflate, C28174Ezk.A00(3));
        TextView A0G = C18180wK.A0G(inflate, R.id.alt_text_bottom_sheet_text_view);
        TextView A0G2 = C18180wK.A0G(inflate, R.id.alt_text_bottom_sheet_learn_more_text);
        StringBuilder A0s = C18190wL.A0s(AnonymousClass0wJ.A0B(this).getString(2131821310));
        A0s.append("\n\n");
        C18210wN.A0u(requireContext(), A0s, 2131821314);
        A0s.append("\n\n");
        C18210wN.A0u(requireContext(), A0s, 2131821311);
        A0s.append("\n");
        C18210wN.A0u(requireContext(), A0s, 2131821312);
        A0s.append("\n");
        C18210wN.A0u(requireContext(), A0s, 2131821313);
        A0s.append("\n\n");
        C18210wN.A0u(requireContext(), A0s, 2131821309);
        C04530Oa r9 = this.A00;
        UserSession A0X = AnonymousClass0wJ.A0X(r9);
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (C63803iN.A05(r3, A0X, 36321138263333434L).booleanValue() || C63803iN.A0E(r3, AnonymousClass0wJ.A0U(r9), 36321138263071286L)) {
            A0s.append(" ");
            A0s.append(Html.fromHtml(AnonymousClass0wJ.A0B(this).getString(2131821320)));
        }
        String A0g = C18180wK.A0g(this, 2131821322);
        SpannableStringBuilder A0E = C18200wM.A0E(A0g);
        C18730xl.A01(A0E, this, A0g, C18180wK.A00(this), 15);
        A0G2.setMovementMethod(C28241F2t.A00);
        A0G2.setText(A0E);
        AnonymousClass0wJ.A16(A0G2, HttpStatus.SC_SEE_OTHER, this);
        A0G.setText(A0s);
        C14030oh.A09(732354658, A02);
        return inflate;
    }
}
