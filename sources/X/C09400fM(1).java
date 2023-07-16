package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* renamed from: X.0fM  reason: invalid class name and case insensitive filesystem */
public final class C09400fM {
    public static final ContentProviderClient A00(Context context, Uri uri) {
        C04220Ms.A0B(context, 0);
        C04220Ms.A0B(uri, 1);
        try {
            ContentResolver contentResolver = context.getContentResolver();
            AnonymousClass0UD.A00(uri.getAuthority(), -823918576, AnonymousClass006.A00);
            return contentResolver.acquireUnstableContentProviderClient(uri);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
