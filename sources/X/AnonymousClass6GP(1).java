package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.browser.lite.extensions.commercecheckout.models.DisclaimerText;
import com.instagram.barcelona.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;

/* renamed from: X.6GP  reason: invalid class name */
public final class AnonymousClass6GP {
    public static final void A00(DisclaimerText disclaimerText, L3B l3b, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) l3b;
        ViewStub viewStub = (ViewStub) browserLiteFragment.A0D.findViewById(R.id.shops_lite_disclaimer_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.shops_lite_disclaimer_view);
            View inflate = viewStub.inflate();
            C04220Ms.A06(inflate);
            Context context = browserLiteFragment.getContext();
            View A0I = AnonymousClass0wJ.A0I(inflate, R.id.shops_lite_disclaimer_divider);
            UserSession userSession2 = userSession;
            String str6 = str;
            String str7 = str2;
            if (context != null) {
                inflate.getViewTreeObserver().addOnGlobalLayoutListener(new C37535JwU(context, inflate, userSession2, str6, str7, str5, str4));
                C18230wP.A0z(context, inflate, R.color.direct_widget_primary_background);
                C18230wP.A0z(context, A0I, R.color.igds_elevated_separator);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            I3A i3a = new I3A(context, userSession2, str6, str7);
            DisclaimerText disclaimerText2 = disclaimerText;
            spannableStringBuilder.append(disclaimerText2.A02);
            int i = disclaimerText2.A00;
            int i2 = disclaimerText2.A01;
            spannableStringBuilder.setSpan(i3a, i, i2, 33);
            View A0I2 = AnonymousClass0wJ.A0I(inflate, R.id.shops_lite_disclaimer_textview);
            if (!C63803iN.A0E(AnonymousClass0TJ.A05, userSession2, 36320330809284522L)) {
                View findViewById = inflate.findViewById(R.id.shops_lite_merchant_disclaimer_text_only);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
            } else if (str3 != null) {
                IgImageView igImageView = (IgImageView) inflate.findViewById(R.id.shops_lite_merchant_disclaimer_merchant_icon);
                if (igImageView != null) {
                    igImageView.setVisibility(0);
                    igImageView.setUrl(C18250wR.A0K(str3), new C130327pl());
                }
                View findViewById2 = inflate.findViewById(R.id.shops_lite_merchant_disclaimer_merchant_icon_and_text);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(0);
                }
                A0I2 = AnonymousClass0wJ.A0I(inflate, R.id.shops_lite_disclaimer_textview_with_merchant_branding);
            }
            TextView textView = (TextView) A0I2;
            textView.setText(spannableStringBuilder);
            C18180wK.A0z(textView);
            if (context != null) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.igds_primary_text)), 0, i, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C18210wN.A01(context)), i, i2, 33);
                textView.setContentDescription(context.getString(R.string.f0nameremoved));
            }
        }
    }
}
