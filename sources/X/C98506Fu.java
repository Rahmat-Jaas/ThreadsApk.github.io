package X;

import android.content.Context;

/* renamed from: X.6Fu  reason: invalid class name and case insensitive filesystem */
public final class C98506Fu {
    public static final C41012LuB A00(Context context, Class cls, String str) {
        if (str != null && !AnonymousClass8bQ.A0n(str)) {
            return new C41012LuB(context, cls, str);
        }
        throw C18190wL.A0a("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
