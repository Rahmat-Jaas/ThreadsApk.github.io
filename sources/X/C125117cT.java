package X;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.7cT  reason: invalid class name and case insensitive filesystem */
public final class C125117cT implements C34093I0n {
    public boolean A00;
    public final Context A01;
    public final AnonymousClass7A7 A02;
    public final String A03;
    public final C04530Oa A04 = C86114wI.A0w(this, 11);
    public final boolean A05;
    public final boolean A06;

    public final C34094I0o BMN() {
        return ((AnonymousClass4x9) this.A04.getValue()).A00();
    }

    public final void Crb(boolean z) {
        C04530Oa r1 = this.A04;
        if (r1.BV5()) {
            SQLiteOpenHelper sQLiteOpenHelper = (SQLiteOpenHelper) r1.getValue();
            C04220Ms.A0B(sQLiteOpenHelper, 0);
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
        this.A00 = z;
    }

    public final void close() {
        C04530Oa r1 = this.A04;
        if (r1.BV5()) {
            ((AnonymousClass4x9) r1.getValue()).close();
        }
    }

    public C125117cT(Context context, AnonymousClass7A7 r3, String str, boolean z, boolean z2) {
        this.A01 = context;
        this.A03 = str;
        this.A02 = r3;
        this.A06 = z;
        this.A05 = z2;
    }
}
