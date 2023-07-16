package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: X.0mM  reason: invalid class name and case insensitive filesystem */
public final class C12710mM implements C13160n8 {
    public final Context A00;
    public final AnonymousClass0P7 A01 = AnonymousClass0P7.A00;

    public C12710mM(Context context) {
        this.A00 = context;
    }

    public static final String A00(Intent intent) {
        String str;
        Bundle bundleExtra = intent.getBundleExtra("auth_bundle");
        if (bundleExtra == null) {
            str = "Invalid auth bundle";
        } else {
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("auth_pending_intent");
            if (pendingIntent != null) {
                return pendingIntent.getCreatorPackage();
            }
            str = "Invalid auth intent";
        }
        AnonymousClass0LU.A0B("FbnsSecurityContextHelper", str);
        return null;
    }

    public final void A02(Intent intent) {
        PendingIntent pendingIntent;
        try {
            C16230sh r3 = new C16230sh();
            r3.A0D = true;
            pendingIntent = r3.A01(this.A00, 0, 134217728);
        } catch (RuntimeException | SecurityException unused) {
            pendingIntent = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("auth_pending_intent", pendingIntent);
        intent.putExtra("auth_bundle", bundle);
    }

    public C12710mM(C17050uD r2) {
        this.A00 = r2.A00;
    }

    public final Integer A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return AnonymousClass006.A15;
        }
        Context context = this.A00;
        if (!str.equals(context.getPackageName())) {
            C12530m4 r1 = (C12530m4) C17250ua.A00;
            if (!r1.A08.contains(str) && !r1.A05.equals(str) && !r1.A04.equals(str)) {
                return AnonymousClass006.A1L;
            }
            switch (AnonymousClass0PS.A00(context, str, 64).A02.intValue()) {
                case 1:
                    return AnonymousClass006.A02;
                case 2:
                    return AnonymousClass006.A03;
                case 3:
                    return AnonymousClass006.A1C;
                case 5:
                    return AnonymousClass006.A04;
                case 6:
                    break;
                default:
                    return AnonymousClass006.A0u;
            }
        }
        return AnonymousClass006.A05;
    }
}
