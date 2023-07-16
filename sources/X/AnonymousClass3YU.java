package X;

import android.content.ContentProviderClient;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.3YU  reason: invalid class name */
public final class AnonymousClass3YU {
    public static final Map A00 = Collections.unmodifiableMap(new C74004Vk());

    public final List A02(ContentProviderClient contentProviderClient, C62273Yb r6, AnonymousClass24G r7, C84644tb r8) {
        Cursor A002 = A00(contentProviderClient, (String) null, r6, r8);
        if (A002 != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            C84424t7 r1 = (C84424t7) C549531b.A00.get(r6.A04);
            while (A002.moveToNext()) {
                try {
                    AnonymousClass3HZ D7b = r1.D7b(A002, r7);
                    if (D7b != null) {
                        A0v.add(D7b);
                    }
                } catch (C73914Va e) {
                    r8.CQY(r6, e);
                } finally {
                    A002.close();
                }
            }
            return A0v;
        }
        return AnonymousClass0wJ.A0v();
    }

    public static Cursor A00(ContentProviderClient contentProviderClient, String str, C62273Yb r8, C84644tb r9) {
        AnonymousClass3HH r0 = r8.A03;
        if (r0 != null) {
            try {
                Uri uri = r8.A00;
                String[] strArr = r0.A02;
                String str2 = r0.A01;
                if (str == null) {
                    str = null;
                }
                return contentProviderClient.query(uri, strArr, str2, new String[]{str}, (String) null);
            } catch (IllegalArgumentException | NullPointerException | UnsupportedOperationException e) {
                r9.CLj(e, r8);
            }
        }
        return null;
    }

    public final List A01(ContentProviderClient contentProviderClient, String str, C62273Yb r8, C84644tb r9) {
        Cursor A002 = A00(contentProviderClient, str, r8, r9);
        if (A002 != null) {
            ArrayList A0v = AnonymousClass0wJ.A0v();
            C84424t7 r2 = (C84424t7) C549531b.A00.get(r8.A04);
            while (A002.moveToNext()) {
                try {
                    AnonymousClass3VA D7Z = r2.D7Z(A002);
                    if (D7Z != null) {
                        A0v.add(new AnonymousClass3H2(r8, D7Z));
                    }
                } catch (C73914Va e) {
                    r9.CQY(r8, e);
                } finally {
                    A002.close();
                }
            }
            return A0v;
        }
        return AnonymousClass0wJ.A0v();
    }
}
