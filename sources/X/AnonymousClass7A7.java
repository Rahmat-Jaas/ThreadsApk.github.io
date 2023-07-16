package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;

/* renamed from: X.7A7  reason: invalid class name */
public abstract class AnonymousClass7A7 {
    public final int A00;

    public void A02(C34094I0o i0o) {
    }

    public void A03(C34094I0o i0o) {
    }

    public abstract void A04(C34094I0o i0o);

    public abstract void A06(C34094I0o i0o, int i, int i2);

    public static final void A00(String str) {
        if (str == null || !str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                int A002 = C04220Ms.A00(str.charAt(i2), 32);
                boolean z2 = false;
                if (A002 <= 0) {
                    z2 = true;
                }
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", AnonymousClass00U.A0L("deleting the database file: ", str));
                try {
                    SQLiteDatabase.deleteDatabase(C86144wL.A0Z(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public void A05(C34094I0o i0o, int i, int i2) {
        throw new SQLiteException(AnonymousClass00U.A01(i, i2, "Can't downgrade database from version ", AnonymousClass000.A00(36)));
    }

    public AnonymousClass7A7(int i) {
        this.A00 = i;
    }
}
