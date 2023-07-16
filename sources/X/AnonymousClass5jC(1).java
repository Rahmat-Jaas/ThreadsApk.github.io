package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebookpay.connect.models.ConnectLearnMoreConfig;
import com.fbpay.w3c.CardDetails;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape188S0100000_2_I2;
import com.instagram.ui.text.IDxCSpanShape64S0200000_2_I2;
import java.util.List;

/* renamed from: X.5jC  reason: invalid class name */
public final class AnonymousClass5jC extends AnonymousClass5jD {
    public static final C11630kW A02 = C130527qE.A00;
    public View A00;
    public UserSession A01;

    public static final void A04(CardDetails cardDetails, IgTextView igTextView, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = cardDetails.A04;
        if (str != null) {
            List A07 = C81074n3.A07(str, "•", 0);
            if (C18190wL.A1a(A07) && A07.size() >= 2) {
                if (z) {
                    spannableStringBuilder.append((CharSequence) A07.get(0));
                }
                spannableStringBuilder.append("•");
                spannableStringBuilder.append((CharSequence) A07.get(C86144wL.A0C(A07, 1)));
            }
            igTextView.setText(spannableStringBuilder);
        }
    }

    public final View A05() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        C04220Ms.A0E("rootView");
        throw null;
    }

    public static final SpannableStringBuilder A03(ConnectLearnMoreConfig connectLearnMoreConfig, AnonymousClass5jC r6, String str) {
        CharacterStyle iDxCSpanShape188S0100000_2_I2;
        SpannableStringBuilder A0E = C18200wM.A0E(str);
        String A0k = AnonymousClass0wJ.A0k(r6.requireActivity(), 2131824300);
        A0E.append(" ").append(A0k);
        String str2 = connectLearnMoreConfig.A00;
        if (C04220Ms.A0I(str2, "OPEN_URL")) {
            iDxCSpanShape188S0100000_2_I2 = new IDxCSpanShape64S0200000_2_I2(C18180wK.A00(r6), 0, r6, connectLearnMoreConfig);
        } else if (C04220Ms.A0I(str2, "CREATE_FRAGMENT")) {
            iDxCSpanShape188S0100000_2_I2 = new IDxCSpanShape188S0100000_2_I2(connectLearnMoreConfig, C18180wK.A00(r6), 7);
        } else {
            C04220Ms.A0E("colorClickableSpan");
            throw null;
        }
        AnonymousClass3Zw.A00(A0E, iDxCSpanShape188S0100000_2_I2, A0k);
        return A0E;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1416057861);
        C04220Ms.A0B(layoutInflater, 0);
        this.A01 = C18180wK.A0W(this, AnonymousClass0RA.A0C);
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C14030oh.A09(360310838, A022);
        return onCreateView;
    }
}
