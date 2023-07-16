package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.7MB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7MB implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ AnonymousClass0YC A00;

    public /* synthetic */ AnonymousClass7MB(AnonymousClass0YC r1) {
        this.A00 = r1;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AnonymousClass0YC r1 = this.A00;
        C04220Ms.A0B(r1, 0);
        return (Cursor) r1.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
