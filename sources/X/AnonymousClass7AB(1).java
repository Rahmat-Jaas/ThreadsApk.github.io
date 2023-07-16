package X;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.IDxIAdapterShape68S0100000_1_I2;
import androidx.room.IDxLStatementShape75S0100000_2_I2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7AB  reason: invalid class name */
public final class AnonymousClass7AB {
    public final CHX A00;
    public final C41259M6w A01;
    public final AnonymousClass7JN A02;

    public final List A00(long j) {
        String str;
        Integer num;
        String str2;
        Long l;
        Float f;
        String str3;
        MAm A002 = Lv1.A00("\n        SELECT * FROM signals\n        WHERE expiration_timestamp > ?\n      ", 1);
        A002.AAa(1, j);
        C41259M6w m6w = this.A01;
        m6w.assertNotSuspendingTransaction();
        Cursor query = m6w.query((C145148jv) A002, (CancellationSignal) null);
        try {
            int A012 = C116106wR.A01(query, "id");
            int A013 = C116106wR.A01(query, "signal_id");
            int A014 = C116106wR.A01(query, "timestamp");
            int A015 = C116106wR.A01(query, AnonymousClass000.A00(465));
            int A016 = C116106wR.A01(query, "context");
            int A017 = C116106wR.A01(query, "type");
            int A018 = C116106wR.A01(query, "long_value");
            int A019 = C116106wR.A01(query, "float_value");
            int A0110 = C116106wR.A01(query, "text_value");
            int A0111 = C116106wR.A01(query, C28174Ezk.A00(81));
            ArrayList A0k = C18240wQ.A0k(query.getCount());
            while (query.moveToNext()) {
                int i = query.getInt(A012);
                if (query.isNull(A013)) {
                    str = null;
                } else {
                    str = query.getString(A013);
                }
                long j2 = query.getLong(A014);
                if (query.isNull(A015)) {
                    num = null;
                } else {
                    num = Integer.valueOf(query.getInt(A015));
                }
                if (query.isNull(A016)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A016);
                }
                int i2 = query.getInt(A017);
                if (query.isNull(A018)) {
                    l = null;
                } else {
                    l = Long.valueOf(query.getLong(A018));
                }
                if (query.isNull(A019)) {
                    f = null;
                } else {
                    f = Float.valueOf(query.getFloat(A019));
                }
                if (query.isNull(A0110)) {
                    str3 = null;
                } else {
                    str3 = query.getString(A0110);
                }
                A0k.add(new C209916z(f, num, l, str, str2, str3, i, i2, j2, query.getLong(A0111)));
            }
            return A0k;
        } finally {
            query.close();
            A002.A00();
        }
    }

    public final List A01(List list, long j) {
        String str;
        Integer num;
        String str2;
        Long l;
        Float f;
        String str3;
        StringBuilder A0s = C18190wL.A0s("\n");
        A0s.append("        SELECT * FROM signals");
        A0s.append("\n");
        A0s.append("        WHERE signal_id IN (");
        int size = list.size();
        C116116wS.A00(A0s, size);
        A0s.append("        AND expiration_timestamp > ");
        A0s.append("?");
        A0s.append("\n");
        int i = 1;
        int i2 = size + 1;
        MAm A002 = Lv1.A00(C18180wK.A0i("      ", A0s), i2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C86154wM.A1L(A002, C18180wK.A0k(it), i);
            i++;
        }
        A002.AAa(i2, j);
        C41259M6w m6w = this.A01;
        m6w.assertNotSuspendingTransaction();
        Cursor query = m6w.query((C145148jv) A002, (CancellationSignal) null);
        try {
            int A012 = C116106wR.A01(query, "id");
            int A013 = C116106wR.A01(query, "signal_id");
            int A014 = C116106wR.A01(query, "timestamp");
            int A015 = C116106wR.A01(query, AnonymousClass000.A00(465));
            int A016 = C116106wR.A01(query, "context");
            int A017 = C116106wR.A01(query, "type");
            int A018 = C116106wR.A01(query, "long_value");
            int A019 = C116106wR.A01(query, "float_value");
            int A0110 = C116106wR.A01(query, "text_value");
            int A0111 = C116106wR.A01(query, C28174Ezk.A00(81));
            ArrayList A0k = C18240wQ.A0k(query.getCount());
            while (query.moveToNext()) {
                int i3 = query.getInt(A012);
                if (query.isNull(A013)) {
                    str = null;
                } else {
                    str = query.getString(A013);
                }
                long j2 = query.getLong(A014);
                if (query.isNull(A015)) {
                    num = null;
                } else {
                    num = Integer.valueOf(query.getInt(A015));
                }
                if (query.isNull(A016)) {
                    str2 = null;
                } else {
                    str2 = query.getString(A016);
                }
                int i4 = query.getInt(A017);
                if (query.isNull(A018)) {
                    l = null;
                } else {
                    l = Long.valueOf(query.getLong(A018));
                }
                if (query.isNull(A019)) {
                    f = null;
                } else {
                    f = Float.valueOf(query.getFloat(A019));
                }
                if (query.isNull(A0110)) {
                    str3 = null;
                } else {
                    str3 = query.getString(A0110);
                }
                A0k.add(new C209916z(f, num, l, str, str2, str3, i3, i4, j2, query.getLong(A0111)));
            }
            return A0k;
        } finally {
            query.close();
            A002.A00();
        }
    }

    public final void A02(long j) {
        C41259M6w m6w = this.A01;
        m6w.assertNotSuspendingTransaction();
        AnonymousClass7JN r2 = this.A02;
        C28051Exi acquire = r2.acquire();
        acquire.AAa(1, j);
        m6w.beginTransaction();
        try {
            acquire.AKx();
            m6w.setTransactionSuccessful();
        } finally {
            m6w.endTransaction();
            r2.release(acquire);
        }
    }

    public final void A03(Collection collection) {
        C41259M6w m6w = this.A01;
        m6w.assertNotSuspendingTransaction();
        m6w.beginTransaction();
        try {
            this.A00.insert((Iterable) collection);
            m6w.setTransactionSuccessful();
        } finally {
            m6w.endTransaction();
        }
    }

    public final void A04(List list) {
        C41259M6w m6w = this.A01;
        m6w.assertNotSuspendingTransaction();
        StringBuilder A0s = C18190wL.A0s("DELETE FROM signals");
        A0s.append("\n");
        A0s.append("    WHERE id IN (");
        C116116wS.A00(A0s, list.size());
        C28051Exi compileStatement = m6w.compileStatement(C18180wK.A0i("  ", A0s));
        Iterator it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            C86134wK.A1D(compileStatement, it, i);
            i++;
        }
        m6w.beginTransaction();
        try {
            compileStatement.AKx();
            m6w.setTransactionSuccessful();
        } finally {
            m6w.endTransaction();
        }
    }

    public AnonymousClass7AB(C41259M6w m6w) {
        this.A01 = m6w;
        this.A00 = new IDxIAdapterShape68S0100000_1_I2(m6w, this, 0);
        this.A02 = new IDxLStatementShape75S0100000_2_I2(m6w, this, 3);
    }

    public AnonymousClass7AB() {
    }
}
