package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebookpay.paypal.model.PaypalConsentLaunchParams;
import com.fbpay.logging.LoggingContext;
import com.fbpay.logging.LoggingPolicy;
import java.util.Set;

/* renamed from: X.6Ib  reason: invalid class name and case insensitive filesystem */
public final class C99086Ib {
    public static M5J A00(C12560m7 r13, PaypalConsentLaunchParams paypalConsentLaunchParams) {
        Set set;
        Set set2;
        Bundle A06 = C18180wK.A06();
        A06.putInt("STYLE_RES", 2131886577);
        String str = paypalConsentLaunchParams.A09;
        long parseLong = Long.parseLong(paypalConsentLaunchParams.A07);
        LoggingPolicy loggingPolicy = paypalConsentLaunchParams.A01;
        if (loggingPolicy != null) {
            set = AnonymousClass7Hr.A01(loggingPolicy);
        } else {
            set = AnonymousClass84Y.A00;
        }
        if (loggingPolicy != null) {
            set2 = AnonymousClass7Hr.A02(loggingPolicy);
        } else {
            set2 = AnonymousClass84Y.A00;
        }
        LoggingContext loggingContext = new LoggingContext(loggingPolicy, str, set, set2, parseLong, paypalConsentLaunchParams.A0B);
        A06.putParcelable("PAYPAL_CONSENT_LAUNCH_PARAMS", paypalConsentLaunchParams);
        A06.putParcelable("logging_context", loggingContext);
        Fragment A062 = AnonymousClass7Kz.A05().A06(A06, "paypal_consent_fragment");
        C04220Ms.A0C(A062, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.ecp.ECPPayPalConsentContentFragment");
        AnonymousClass563 r3 = (AnonymousClass563) A062;
        AnonymousClass5qq r2 = new AnonymousClass5qq();
        r2.setArguments(A06);
        C04220Ms.A0B(r3, 1);
        r2.A05 = r3;
        r2.A0A(r13, "PAYPAL_CONSENT_FRAGMENT_TAG");
        return r3.A09;
    }
}
