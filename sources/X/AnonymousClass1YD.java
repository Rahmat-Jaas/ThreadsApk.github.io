package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.redex.IDxListenerShape412S0100000_1_I2;
import com.facebook.redex.IDxObjectShape170S0200000_1_I2;
import com.instagram.barcelona.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1YD  reason: invalid class name */
public final class AnonymousClass1YD extends C34640IcN {
    public static final String __redex_internal_original_name = "HiddenWordsBottomSheetFragment";
    public C82554pt A00;
    public boolean A01;
    public boolean A02;
    public final Set A03 = new LinkedHashSet();
    public final C04530Oa A04 = C80644m9.A00(this);

    public final String getModuleName() {
        return "hidden_words_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C25745DrH A0b;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.hidden_words_text_input);
        textView.requestFocus();
        C09860go.A0K(textView);
        View A0K = AnonymousClass0wJ.A0K(view, R.id.hidden_words_hide_button);
        AnonymousClass0wJ.A18(A0K, 114, this, textView);
        textView.addTextChangedListener(new IDxObjectShape170S0200000_1_I2(4, A0K, this));
        FragmentActivity activity = getActivity();
        if (!(activity == null || (A0b = C18220wO.A0b(activity)) == null)) {
            ((C35189Ipf) A0b).A0B = new IDxListenerShape412S0100000_1_I2(this, 3);
        }
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A04);
        C04220Ms.A0B(A0U, 0);
        H1T A0P = AnonymousClass0wJ.A0P(A0U);
        A0P.A0J("accounts/get_post_filter_keywords/");
        C63873iU.A0C(this, AnonymousClass0wJ.A0T(A0P, AnonymousClass1SE.class, AnonymousClass3MO.class), 52);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(91860963);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.hidden_words_bottom_sheet, viewGroup, false);
        C14030oh.A09(-688173611, A022);
        return inflate;
    }
}
