package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* renamed from: X.7MA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7MA implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ C145148jv A00;

    public /* synthetic */ AnonymousClass7MA(C145148jv r1) {
        this.A00 = r1;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        C145148jv r1 = this.A00;
        C04220Ms.A0A(sQLiteQuery);
        r1.AAk(new C125127cU(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
