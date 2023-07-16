package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2;

/* renamed from: X.60B  reason: invalid class name */
public final class AnonymousClass60B extends AnonymousClass1lO {
    public final String A00;

    public final Class modelClass() {
        return AnonymousClass5MG.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass5MG r8 = (AnonymousClass5MG) mfV;
        AnonymousClass5Af r9 = (AnonymousClass5Af) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r8, r9);
        String str = this.A00;
        TextView textView = r9.A00;
        Context A0A = C18190wL.A0A(textView);
        CharSequence A002 = C59523Ld.A00(A0A, (C57943Dd) r8.A00.A00);
        if (A002.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(A1Y ? 1 : 0);
        if (C04220Ms.A0I(str, "3pd_trial_inline_opt_in")) {
            AnonymousClass3Zw.A03(new IDxCSpanShape188S0100000_2_I2(r8, A0A.getColor(R.color.igds_primary_button), A1Y), textView, A0A.getString(2131821204), A002.toString());
            return;
        }
        textView.setText(A002);
    }

    public AnonymousClass60B(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5Af(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.layout_ads_consent_growth_bottomsheet_footer, C18200wM.A1Y(viewGroup)));
    }
}
