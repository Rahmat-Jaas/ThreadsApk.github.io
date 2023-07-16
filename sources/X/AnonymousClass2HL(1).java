package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.2HL  reason: invalid class name */
public final class AnonymousClass2HL {
    public static final Object A00(AnonymousClass601 r6, C63893iY r7) {
        Context context;
        Integer num;
        Intent intent;
        boolean A1Z = AnonymousClass0wJ.A1Z(r7, r6);
        AnonymousClass3HX r0 = r6.A00;
        if (!(r0 == null || (context = r0.A00) == null)) {
            if (C04220Ms.A0I(C63893iY.A0B(r7, 0), "notification")) {
                num = AnonymousClass006.A01;
            } else {
                num = AnonymousClass006.A00;
            }
            if (C18240wQ.A06(num, A1Z ? 1 : 0) != 0) {
                intent = C18250wR.A05("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            } else {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", context.getPackageName(), (String) null));
            }
            C16420t2.A00().A05().A09(context, intent);
        }
        return null;
    }
}
