package X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.7cU  reason: invalid class name and case insensitive filesystem */
public class C125127cU implements C28170Ezf {
    public final SQLiteProgram A00;

    public C125127cU(SQLiteProgram sQLiteProgram) {
        C04220Ms.A0B(sQLiteProgram, 1);
        this.A00 = sQLiteProgram;
    }

    public final void AAU(int i, byte[] bArr) {
        C04220Ms.A0B(bArr, 1);
        this.A00.bindBlob(i, bArr);
    }

    public final void AAi(int i, String str) {
        C04220Ms.A0B(str, 1);
        this.A00.bindString(i, str);
    }

    public final void AAY(int i, double d) {
        this.A00.bindDouble(i, d);
    }

    public final void AAa(int i, long j) {
        this.A00.bindLong(i, j);
    }

    public final void AAb(int i) {
        this.A00.bindNull(i);
    }

    public final void close() {
        this.A00.close();
    }
}
