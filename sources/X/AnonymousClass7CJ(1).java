package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape21S0300000_2_I2;
import java.io.File;
import java.io.IOException;

/* renamed from: X.7CJ  reason: invalid class name */
public final class AnonymousClass7CJ {
    public static boolean A00;

    public static void A02(Context context, AnonymousClass601 r6, C63893iY r7) {
        A00 = false;
        Intent putExtra = C18250wR.A05(C18170wI.A00(75)).addCategory(C18170wI.A00(132)).setType(C18170wI.A00(HttpStatus.SC_UNAUTHORIZED)).putExtra(C18170wI.A00(300), false);
        IDxLListenerShape21S0300000_2_I2 iDxLListenerShape21S0300000_2_I2 = new IDxLListenerShape21S0300000_2_I2(0, (Object) context, (Object) r6, (Object) r7);
        try {
            C63913ic.A0Q(r6, iDxLListenerShape21S0300000_2_I2);
            C04220Ms.A0B(r6, 0);
            C10650ih.A07(C63913ic.A01(r6), putExtra, 2);
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
            C63913ic.A0R(r6, iDxLListenerShape21S0300000_2_I2);
        }
    }

    public static String A00(Context context) {
        if (Build.VERSION.SDK_INT < 33 || context.getApplicationInfo().targetSdkVersion < 33) {
            return "android.permission.READ_EXTERNAL_STORAGE";
        }
        return I17.A00(46);
    }

    public static void A01(Context context, AnonymousClass601 r6, C63893iY r7) {
        File A05 = AnonymousClass0hL.A05(context);
        try {
            Uri A002 = FLN.A00(context, A05);
            Intent A052 = C18250wR.A05(I17.A00(90));
            A052.putExtra("output", A002);
            C131487s7 r2 = new C131487s7(r6, r7, A05);
            try {
                C63913ic.A0Q(r6, r2);
                C04220Ms.A0B(r6, 0);
                C10650ih.A07(C63913ic.A01(r6), A052, 1);
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                C63913ic.A0R(r6, r2);
                A05.delete();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            A05.delete();
        }
    }
}
