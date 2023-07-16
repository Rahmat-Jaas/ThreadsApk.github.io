package X;

import android.content.Context;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.5gZ  reason: invalid class name and case insensitive filesystem */
public final class C91645gZ extends C886359v {
    public C91645gZ(LoggingContext loggingContext, boolean z) {
        super(AnonymousClass69U.A0b, loggingContext, z);
    }

    public static final String A06(AnonymousClass5B3 r2, C91645gZ r3, PriceInfo priceInfo, Integer num, Integer num2) {
        Context context;
        int i;
        if ((num == AnonymousClass006.A0C && AnonymousClass7Kz.A0J().A03() && priceInfo.A01 == C973068v.SHIPPING) || (num2 == AnonymousClass006.A01 && priceInfo.A01 == C973068v.FULFILLMENT)) {
            context = r2.A00.getContext();
            i = 2131826437;
        } else if (!r3.A01 || priceInfo.A01 != C973068v.DISCOUNT) {
            return priceInfo.A04;
        } else {
            context = r2.A00.getContext();
            i = 2131826443;
        }
        return AnonymousClass0wJ.A0k(context, i);
    }
}
