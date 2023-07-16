package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.2MN  reason: invalid class name */
public final class AnonymousClass2MN {
    public static final void A00(Context context, Intent intent, Uri uri, String str, String str2) {
        C04220Ms.A0B(uri, 5);
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("user_id", str).appendQueryParameter("calling_package", context.getPackageName()).appendQueryParameter("entry_point", str2);
        Uri build = buildUpon.build();
        C04220Ms.A06(build);
        intent.setData(build);
    }
}
