package X;

import android.database.Cursor;
import libraries.access.src.main.base.common.FXDeviceItem;

/* renamed from: X.4VH  reason: invalid class name */
public final class AnonymousClass4VH implements C84424t7 {
    public final AnonymousClass3VA D7Z(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex2 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex3 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex4 = cursor.getColumnIndex("COL_SESSION_ID");
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
            throw new C73914Va("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        string.getClass();
        return new AnonymousClass3VA(cursor.getString(columnIndex4), new AnonymousClass3VD(string, cursor.getString(columnIndex2), cursor.getString(columnIndex3)));
    }

    public final AnonymousClass3HZ D7a(Cursor cursor, C311624m r4, AnonymousClass24G r5) {
        throw new C73914Va("LiteProvider not used in Instagram.");
    }

    public final AnonymousClass3HZ D7b(Cursor cursor, AnonymousClass24G r12) {
        int columnIndex = cursor.getColumnIndex("COL_USERNAME");
        int columnIndex2 = cursor.getColumnIndex("COL_FULL_NAME");
        int columnIndex3 = cursor.getColumnIndex("COL_PROFILE_PHOTO_URL");
        int columnIndex4 = cursor.getColumnIndex("COL_SESSION_ID");
        if (columnIndex == -1 || columnIndex2 == -1 || columnIndex3 == -1 || columnIndex4 == -1) {
            throw new C73914Va("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        string.getClass();
        return new AnonymousClass3HZ(string, cursor.getString(columnIndex4), "INSTAGRAM", new AnonymousClass4W8(cursor, this, columnIndex2, columnIndex3), C311624m.INSTAGRAM, r12);
    }

    public final FXDeviceItem D7c(Cursor cursor, AnonymousClass23U r6, C307822y r7) {
        return new FXDeviceItem((Long) null, cursor.getString(cursor.getColumnIndex("id")), C311624m.INSTAGRAM, r6);
    }
}
