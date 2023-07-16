package X;

import android.database.sqlite.SQLiteDatabase;
import com.facebook.profilo.provider.constants.ExternalProviders;

/* renamed from: X.0oR  reason: invalid class name and case insensitive filesystem */
public final class C13870oR {
    public static final ThreadLocal A00 = new C13880oS();

    public static void A02(SQLiteDatabase sQLiteDatabase, int i) {
        int i2 = i;
        try {
            sQLiteDatabase.endTransaction();
            if (!sQLiteDatabase.inTransaction()) {
                A00.set(Boolean.FALSE);
            }
            ExternalProviders.A07.A08().A00(6, 22, i2, 0, 0);
        } catch (Throwable th) {
            ExternalProviders.A07.A08().A00(6, 22, i2, 0, 0);
            throw th;
        }
    }

    public static void A00(int i) {
        if (A00.get() == Boolean.FALSE) {
            ExternalProviders.A07.A08().A00(6, 20, i, 0, 0);
        }
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, int i) {
        ExternalProviders.A07.A08().A00(6, 21, i, 0, 0);
        sQLiteDatabase.beginTransaction();
        A00.set(Boolean.TRUE);
    }
}
