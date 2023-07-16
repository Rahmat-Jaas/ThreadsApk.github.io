package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.service.session.UserSession;

/* renamed from: X.3Kk  reason: invalid class name and case insensitive filesystem */
public final class C59333Kk {
    public static void A01(Context context, Bitmap bitmap, UserSession userSession, boolean z) {
        Bitmap bitmap2 = bitmap;
        if (bitmap != null) {
            A00(context, bitmap2, C63873iU.A06(context, 2), C31155GhB.A00(), userSession, z);
        }
    }

    public static void A00(Context context, Bitmap bitmap, C63873iU r7, C145538kf r8, UserSession userSession, boolean z) {
        if (bitmap != null) {
            String A08 = AnonymousClass00U.A08(System.currentTimeMillis(), "");
            AnonymousClass0wJ.A1N(context, userSession);
            C04220Ms.A0B(A08, 2);
            H8a h8a = new H8a(new AnonymousClass4Tx(context, bitmap, userSession, A08), 449);
            GXN gxn = new GXN();
            gxn.A05("share_to_feed", Boolean.toString(z));
            h8a.A00 = new AnonymousClass1lU(r7, gxn, userSession, A08);
            r8.schedule(h8a);
        }
    }
}
