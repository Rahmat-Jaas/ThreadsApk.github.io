package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.redex.IDxSBuilderShape815S0100000_2_I2;
import com.instagram.barcelona.R;

/* renamed from: X.603  reason: invalid class name */
public final class AnonymousClass603 extends AnonymousClass1lO {
    public final Class modelClass() {
        return AnonymousClass5MF.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass5MF r8 = (AnonymousClass5MF) mfV;
        AnonymousClass5BV r9 = (AnonymousClass5BV) m5o;
        boolean A1Y = AnonymousClass0wJ.A1Y(r8, r9);
        TextView textView = r9.A02;
        Context A0A = C18190wL.A0A(textView);
        KtCSuperShape0S0200000_I2 ktCSuperShape0S0200000_I2 = r8.A00;
        CharSequence A00 = C59523Ld.A00(A0A, (C57943Dd) ktCSuperShape0S0200000_I2.A01);
        if (A00.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(C16370sw.A02(new IDxSBuilderShape815S0100000_2_I2(A00, A1Y), ""));
        }
        Number number = (Number) ktCSuperShape0S0200000_I2.A00;
        ImageView imageView = r9.A00;
        if (number == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(A1Y ? 1 : 0);
            imageView.setImageResource(number.intValue());
        }
        if (textView.getVisibility() == 8 && imageView.getVisibility() == 8) {
            LinearLayout linearLayout = r9.A01;
            linearLayout.setVisibility(8);
            linearLayout.setPaddingRelative(A1Y, A1Y, A1Y, A1Y);
            return;
        }
        LinearLayout linearLayout2 = r9.A01;
        linearLayout2.setVisibility(A1Y);
        Context context = linearLayout2.getContext();
        linearLayout2.setPaddingRelative(context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), context.getResources().getDimensionPixelSize(R.dimen.abc_floating_window_z), C18220wO.A01(context, R.dimen.abc_dropdownitem_icon_width), C18220wO.A01(context, R.dimen.abc_floating_window_z));
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5BV(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.layout_ads_consent_growth_bottomsheet_body_item, C18200wM.A1Y(viewGroup)));
    }
}
