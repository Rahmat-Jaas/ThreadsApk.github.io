package X;

import com.facebook.common.locale.Country;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.shippingaddress.model.ShippingAddress;

/* renamed from: X.7CM  reason: invalid class name */
public final class AnonymousClass7CM {
    public static final AnonymousClass7CM A00 = new AnonymousClass7CM();

    public static /* synthetic */ String A00(KnownData knownData, String str, int i, boolean z) {
        boolean z2 = false;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        StringBuilder A0r = C18200wM.A0r();
        if (str != null) {
            A0r.append(str);
        }
        ShippingAddress shippingAddress = knownData.A00;
        boolean z3 = true;
        if (shippingAddress != null) {
            String str2 = shippingAddress.A08;
            if (str2 != null) {
                if (!z2) {
                    str2 = null;
                }
                if (str2 != null) {
                    if (C18180wK.A1X(A0r.length())) {
                        A0r.append("\n");
                    }
                    A0r.append(str2);
                    if (!z && !(shippingAddress.A01 == null && shippingAddress.A07 == null && shippingAddress.A02 == null)) {
                        A0r.append(",\n");
                    }
                }
            }
            if (!z) {
                String str3 = shippingAddress.A01;
                if (str3 != null) {
                    A0r.append(str3);
                }
                String str4 = shippingAddress.A07;
                if (str4 != null) {
                    if (str3 != null) {
                        A0r.append(", ");
                    }
                    A0r.append(str4);
                }
                String str5 = shippingAddress.A02;
                if (str5 != null) {
                    if (!(str3 == null && str4 == null)) {
                        A0r.append(", ");
                    }
                    try {
                        str5 = Country.A00((Country) null, str5).A00.getDisplayCountry();
                    } catch (IllegalArgumentException unused) {
                    }
                    A0r.append(str5);
                }
            }
        }
        if (A0r.length() <= 0) {
            z3 = false;
        }
        if (!z3) {
            knownData = null;
        }
        if (knownData != null) {
            return A0r.toString();
        }
        return null;
    }
}
