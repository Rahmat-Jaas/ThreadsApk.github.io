package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;

/* renamed from: X.3iO  reason: invalid class name and case insensitive filesystem */
public final class C63813iO {
    public static Toast A00;

    public static final Toast A00(Context context, int i) {
        return A03(context, (String) null, i, 0);
    }

    public static final Toast A01(Context context, CharSequence charSequence) {
        return A02(context, charSequence, (String) null, 0);
    }

    public static final Toast A02(Context context, CharSequence charSequence, String str, int i) {
        Context applicationContext;
        if (!(context == null || (applicationContext = context.getApplicationContext()) == null || charSequence == null)) {
            Context applicationContext2 = applicationContext.getApplicationContext();
            if (applicationContext2 == null || !(applicationContext2 instanceof Activity) || !((Activity) applicationContext2).isFinishing()) {
                if (str != null) {
                    C38040KHr.A01.CWx(new H4R(charSequence.toString(), str));
                }
                C19080z7 A002 = C19080z7.A00(applicationContext, charSequence, i);
                if (Build.VERSION.SDK_INT < 30) {
                    A002.setGravity(17, 0, 0);
                }
                A002.show();
                Toast toast = A00;
                if (toast != null) {
                    toast.cancel();
                }
                A00 = A002;
                return A002;
            }
            AnonymousClass0LU.A0B("IgdsToastUtil", "Activity is finishing");
        }
        return null;
    }

    public static void A05(Context context) {
        A03(context, (String) null, 2131835499, 0);
    }

    public static void A06(Context context) {
        A03(context, (String) null, 2131836068, 0);
    }

    public static final void A0A(Context context, int i, int i2) {
        A03(context, (String) null, i, i2);
    }

    public static void A0B(Context context, CharSequence charSequence) {
        A02(context, charSequence, (String) null, 0);
    }

    public static void A0C(Context context, CharSequence charSequence) {
        A02(context, charSequence, (String) null, 1);
    }

    public static final void A0D(Context context, CharSequence charSequence, int i) {
        A02(context, charSequence, (String) null, i);
    }

    public static final Toast A03(Context context, String str, int i, int i2) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || !(applicationContext instanceof Activity) || !((Activity) applicationContext).isFinishing()) {
            return A02(context, context.getString(i), str, i2);
        }
        AnonymousClass0LU.A0B("IgdsToastUtil", "Activity is finishing");
        return null;
    }

    public static final void A04(int i) {
        A03(C10600ic.A00, (String) null, i, 0);
    }

    public static final void A0F(CharSequence charSequence) {
        A0B(C10600ic.A00, charSequence);
    }

    public static void A07(Context context) {
        A03(context, "request_error", 2131834837, 0);
    }

    public static void A08(Context context) {
        A03(context, "something_went_wrong", 2131836068, 0);
    }

    public static void A09(Context context) {
        A02(context, context.getString(2131831662), "network_error", 0);
    }

    public static void A0E(Context context, String str) {
        A03(context, str, 2131834837, 0);
    }
}
