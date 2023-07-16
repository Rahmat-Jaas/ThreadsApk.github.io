package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: X.0oa  reason: invalid class name and case insensitive filesystem */
public final class C13960oa {
    public static Cursor A00(ContentResolver contentResolver, Uri uri, String str, String str2, String[] strArr, String[] strArr2, int i) {
        String str3;
        Integer num = AnonymousClass006.A01;
        Uri uri2 = uri;
        if (uri != null) {
            str3 = uri.getAuthority();
        } else {
            str3 = null;
        }
        AnonymousClass0UD.A00(str3, i, num);
        return contentResolver.query(uri2, strArr, str, strArr2, str2);
    }
}
