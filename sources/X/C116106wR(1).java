package X;

import android.database.Cursor;

/* renamed from: X.6wR  reason: invalid class name and case insensitive filesystem */
public final class C116106wR {
    public static final int A00(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex(AnonymousClass00U.A0M("`", str, '`'));
        if (columnIndex2 < 0) {
            return -1;
        }
        return columnIndex2;
    }

    public static final int A01(Cursor cursor, String str) {
        String str2;
        int A00 = A00(cursor, str);
        if (A00 >= 0) {
            return A00;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C04220Ms.A06(columnNames);
            str2 = AnonymousClass8AP.A06((CharSequence) null, (CharSequence) null, (CharSequence) null, (AnonymousClass0YY) null, columnNames, 63);
        } catch (Exception unused) {
            str2 = "unknown";
        }
        throw C18190wL.A0a(AnonymousClass00U.A0d("column '", str, "' does not exist. Available columns: ", str2));
    }
}
