package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.Arrays;

/* renamed from: X.7BE  reason: invalid class name */
public final class AnonymousClass7BE {
    public static final String A01(ShippingAddress shippingAddress) {
        String str;
        StringBuilder A0r = C18200wM.A0r();
        String str2 = shippingAddress.A01;
        if (str2 != null && AnonymousClass8bQ.A0m(str2)) {
            StringFormatUtil.appendFormatStrLocaleSafe(A0r, "%s", AnonymousClass00J.A0H(" ", (CharSequence) null, (CharSequence) null, AnonymousClass8bP.A0f(str2, new String[]{" "}, 0, 6), C139118Ms.A00, 30));
        }
        String str3 = shippingAddress.A07;
        if ((str3 != null && !AnonymousClass8bQ.A0n(str3)) || ((str = shippingAddress.A06) != null && !AnonymousClass8bQ.A0n(str))) {
            StringFormatUtil.appendFormatStrLocaleSafe(A0r, "%s", ", ");
            if (str3 != null && AnonymousClass8bQ.A0m(str3)) {
                StringFormatUtil.appendFormatStrLocaleSafe(A0r, "%s", AnonymousClass00U.A0A(str3, ' '));
            }
            String str4 = shippingAddress.A06;
            if (str4 != null && AnonymousClass8bQ.A0m(str4)) {
                StringFormatUtil.appendFormatStrLocaleSafe(A0r, "%s", str4);
            }
        }
        return C18190wL.A0n(A0r);
    }

    public static final int A00(ShippingAddress shippingAddress) {
        return Arrays.hashCode(new Object[]{shippingAddress.A05, shippingAddress.A00, shippingAddress.A08, shippingAddress.A09, shippingAddress.A01, shippingAddress.A07, shippingAddress.A02, Boolean.valueOf(shippingAddress.A0B), Boolean.valueOf(shippingAddress.A0A), shippingAddress.A06});
    }

    public static final String A02(ShippingAddress shippingAddress) {
        StringBuilder A0r = C18200wM.A0r();
        String str = shippingAddress.A08;
        if (str != null && AnonymousClass8bQ.A0m(str)) {
            StringFormatUtil.appendFormatStrLocaleSafe(A0r, "%s", str);
        }
        String str2 = shippingAddress.A09;
        if (str2 != null && AnonymousClass8bQ.A0m(str2)) {
            if (A0r.length() > 0) {
                StringFormatUtil.appendFormatStrLocaleSafe(A0r, "%s", ", ");
            }
            StringFormatUtil.appendFormatStrLocaleSafe(A0r, "%s", str2);
        }
        return C18190wL.A0n(A0r);
    }
}
