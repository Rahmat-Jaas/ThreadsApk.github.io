package X;

import android.content.Context;
import com.facebookpay.shippingaddress.model.ShippingAddress;

/* renamed from: X.6xs  reason: invalid class name and case insensitive filesystem */
public final class C116946xs {
    public static final ShippingAddress A00(C148488rA r14, String str) {
        String str2 = str;
        C04220Ms.A0B(r14, 0);
        if (str == null) {
            str2 = "";
        }
        return new ShippingAddress((String) null, (String) null, str2, r14.BEK(), r14.BEL(), r14.APZ(), r14.APe(), r14.AaB(), r14.BMp(), (String) null, true, true, false, false, true);
    }

    public static final String A01(Context context, AnonymousClass67L r3) {
        int i;
        int ordinal = r3.ordinal();
        if (ordinal == 1) {
            i = 2131826456;
        } else if (ordinal != 2) {
            return "";
        } else {
            i = 2131826459;
        }
        return AnonymousClass0wJ.A0k(context, i);
    }
}
