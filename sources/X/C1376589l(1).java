package X;

import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.89l  reason: invalid class name and case insensitive filesystem */
public final class C1376589l extends HashMap<String, String> {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C36982JiF A01;

    public C1376589l(Uri uri, C36982JiF jiF, String str) {
        this.A01 = jiF;
        this.A00 = uri;
        put("action", str);
        put("map_uri", uri.toString());
    }
}
