package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.3b9  reason: invalid class name and case insensitive filesystem */
public final class C62923b9 {
    public static final void A01(Context context, UserSession userSession, String str, String str2) {
        C04220Ms.A0B(userSession, 0);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(C60923Rc.A01, userSession), "instagram_two_fac_setup_action"), 2315);
        C18210wN.A1A(A0I, "link");
        A0I.A0T("view", "");
        C63213h0.A03(A0I);
        A0I.A0T("url", str);
        A0I.Bb4();
        SimpleWebViewActivity.A01.A02(context, userSession, C18250wR.A0P(str, str2));
    }

    public static final void A02(ClickableSpan clickableSpan, ClickableSpan clickableSpan2, TextView textView, String str, String str2) {
        C04220Ms.A0B(textView, 0);
        SpannableStringBuilder A0E = C18200wM.A0E(str);
        A0E.setSpan(clickableSpan, 0, C18220wO.A08(str), 33);
        SpannableStringBuilder A0E2 = C18200wM.A0E(str2);
        A0E2.setSpan(clickableSpan2, 0, C18220wO.A08(str2), 33);
        C18180wK.A0z(textView);
        textView.setHighlightColor(0);
        textView.setText(C18200wM.A0E(A0E).append(" • ").append(A0E2));
    }

    public static final void A04(UserSession userSession, FragmentActivity fragmentActivity) {
        C04220Ms.A0B(userSession, 0);
        AnonymousClass3WQ.A00(userSession, AnonymousClass006.A1L);
        C62653aT.A02.A03();
        AnonymousClass0wJ.A19(new AnonymousClass1ZZ(), fragmentActivity, userSession);
    }

    public static final String A00(String str) {
        int A08 = C18220wO.A08(str);
        if (A08 >= 4) {
            return C18230wP.A0s(str, A08 - 4, A08);
        }
        C10450iM.A03("two fac util", AnonymousClass00U.A0V("phone number :", str, " length less then 4"));
        return "xxxx";
    }

    public static final void A03(TextView textView, TextView textView2, String str) {
        if (str.length() != 32) {
            C10450iM.A03("two factor", "instagram key length invalid");
            textView.setText(str);
            return;
        }
        StringBuilder A0r = C18200wM.A0r();
        for (int i = 0; i < 16; i++) {
            if (i != 0 && i % 4 == 0) {
                A0r.append("  ");
            }
            A0r.append(str.charAt(i));
        }
        textView.setText(A0r);
        StringBuilder A0r2 = C18200wM.A0r();
        int i2 = 16;
        while (true) {
            A0r2.append(str.charAt(i2));
            i2++;
            if (i2 >= 32) {
                textView2.setText(A0r2);
                return;
            } else if (i2 != 16 && i2 % 4 == 0) {
                A0r2.append("  ");
            }
        }
    }
}
