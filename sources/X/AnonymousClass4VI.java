package X;

import android.database.Cursor;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import libraries.access.src.main.base.common.FXDeviceItem;

/* renamed from: X.4VI  reason: invalid class name */
public final class AnonymousClass4VI implements C84424t7 {
    public C311624m A00;

    public final FXDeviceItem D7c(Cursor cursor, AnonymousClass23U r3, C307822y r4) {
        return null;
    }

    public final AnonymousClass3VA D7Z(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(FXPFAccessLibraryDebugFragment.UID);
        int columnIndex2 = cursor.getColumnIndex("access_token");
        if (columnIndex == -1 || columnIndex2 == -1) {
            throw new C73914Va("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        if (string == null || string2 == null) {
            return null;
        }
        return new AnonymousClass3VA(string2, new AnonymousClass3VD(string, (String) null, (String) null));
    }

    public final AnonymousClass3HZ D7a(Cursor cursor, C311624m r4, AnonymousClass24G r5) {
        throw new C73914Va("LiteProvider not used in Frl.");
    }

    public final AnonymousClass3HZ D7b(Cursor cursor, AnonymousClass24G r10) {
        int columnIndex = cursor.getColumnIndex(FXPFAccessLibraryDebugFragment.UID);
        int columnIndex2 = cursor.getColumnIndex("access_token");
        if (columnIndex == -1 || columnIndex2 == -1) {
            throw new C73914Va("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        if (string == null || string2 == null) {
            return null;
        }
        return new AnonymousClass3HZ(string, string2, "FRL", new AnonymousClass4W2(this), this.A00, r10);
    }

    public AnonymousClass4VI(C311624m r1) {
        this.A00 = r1;
    }
}
