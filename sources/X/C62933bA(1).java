package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.facebook.common.dextricks.Constants;
import com.facebook.redex.IDxCListenerShape77S0200000_1_I2;

/* renamed from: X.3bA  reason: invalid class name and case insensitive filesystem */
public final class C62933bA {
    public static Intent A00(Context context, Integer num, String str) {
        Uri parse;
        Uri.Builder buildUpon;
        String str2;
        Intent flags = C18250wR.A05("android.intent.action.VIEW").setFlags(268435456);
        if (num.intValue() != 0) {
            buildUpon = C18220wO.A0E("https://maps.google.com/maps");
            str2 = "daddr";
        } else {
            if (context.getPackageManager().queryIntentActivities(flags, Constants.LOAD_RESULT_PGO_ATTEMPTED).isEmpty()) {
                parse = C15430rJ.A01("https://maps.google.com/maps");
            } else {
                parse = Uri.parse("geo:0,0");
            }
            buildUpon = parse.buildUpon();
            str2 = "q";
        }
        flags.setData(C18220wO.A0F(buildUpon, str2, str));
        return flags;
    }

    public static String A01(String str, String str2, String str3) {
        String A0L;
        String str4 = "";
        if (str2 == null) {
            A0L = str4;
        } else {
            A0L = AnonymousClass00U.A0L(", ", str2);
        }
        if (str3 != null) {
            str4 = AnonymousClass00U.A0L(", ", str3);
        }
        return AnonymousClass00U.A0V(str, A0L, str4);
    }

    public static void A02(Context context, double d, double d2) {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(d);
        A0r.append(", ");
        A0r.append(d2);
        A03(context, (DialogInterface.OnDismissListener) null, A00(context, AnonymousClass006.A00, A0r.toString()));
    }

    public static void A03(Context context, DialogInterface.OnDismissListener onDismissListener, Intent intent) {
        C25828Dsm A0W = C18190wL.A0W(context);
        IDxCListenerShape77S0200000_1_I2 iDxCListenerShape77S0200000_1_I2 = new IDxCListenerShape77S0200000_1_I2(39, (Object) context, (Object) intent);
        A0W.A0K(2131832021);
        A0W.A0P(iDxCListenerShape77S0200000_1_I2, 2131832017);
        A0W.A0O(iDxCListenerShape77S0200000_1_I2, 2131823054);
        A0W.A0q(true);
        A0W.A0e(onDismissListener);
        AnonymousClass0wJ.A1K(A0W);
    }

    public static void A04(Context context, String str, String str2, String str3) {
        C10650ih.A0B(context, A00(context, AnonymousClass006.A00, A01(str, str2, str3)));
    }
}
