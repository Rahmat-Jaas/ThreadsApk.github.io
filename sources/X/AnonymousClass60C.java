package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import com.facebook.redex.IDxSBuilderShape815S0100000_2_I2;
import com.instagram.barcelona.R;
import com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2;

/* renamed from: X.60C  reason: invalid class name */
public final class AnonymousClass60C extends AnonymousClass1lO {
    public final String A00;

    public final Class modelClass() {
        return AnonymousClass5MH.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass5MH r8 = (AnonymousClass5MH) mfV;
        AnonymousClass5BW r9 = (AnonymousClass5BW) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(r8, r9);
        String str = this.A00;
        KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2 = r8.A00;
        Number number = (Number) ktCSuperShape0S0300000_I2.A00;
        ImageView imageView = r9.A00;
        if (number == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(number.intValue());
        }
        TextView textView = r9.A02;
        CharSequence A002 = C59523Ld.A00(C18190wL.A0A(textView), (C57943Dd) ktCSuperShape0S0300000_I2.A02);
        if (A002.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(A002);
        }
        TextView textView2 = r9.A01;
        Context A0A = C18190wL.A0A(textView2);
        CharSequence A003 = C59523Ld.A00(A0A, (C57943Dd) ktCSuperShape0S0300000_I2.A01);
        if (A003.length() == 0) {
            textView2.setVisibility(8);
            return;
        }
        textView2.setVisibility(0);
        if (C04220Ms.A0I(str, "activity_feed_notification_3PD_content")) {
            AnonymousClass3Zw.A03(new IDxCSpanShape188S0100000_2_I2(r8, A0A.getColor(R.color.igds_primary_button), A1Z ? 1 : 0), textView2, A0A.getString(2131820970), A003.toString());
            return;
        }
        textView2.setText(C16370sw.A02(new IDxSBuilderShape815S0100000_2_I2(A003, A1Z), ""));
    }

    public AnonymousClass60C(String str) {
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new AnonymousClass5BW(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.layout_ads_consent_growth_bottomsheet_header, C18200wM.A1Y(viewGroup)));
    }
}
