package X;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;
import com.facebook.redex.IDxComparatorShape94S0000000_1_I2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3;

/* renamed from: X.3zW  reason: invalid class name and case insensitive filesystem */
public final class C67423zW implements C147058nK {
    public final AnonymousClass7AB A00;
    public final C03700Kj A01;

    public C67423zW(C03700Kj r2, AnonymousClass7AB r3) {
        C04220Ms.A0B(r3, 1);
        this.A00 = r3;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.util.LinkedHashMap, java.util.AbstractMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5Id CZ7(java.lang.String r7, int r8) {
        /*
            r6 = this;
            r5 = 0
            X.C04220Ms.A0B(r7, r5)
            java.util.List r3 = X.C18180wK.A0n(r7)
            if (r8 > 0) goto L_0x000d
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x000d:
            X.7AB r2 = r6.A00     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.util.List r0 = r2.A01(r3, r0)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.util.LinkedHashMap r4 = X.C18220wO.A0y()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
        L_0x001f:
            boolean r0 = r3.hasNext()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            if (r0 == 0) goto L_0x0041
            java.lang.Object r2 = r3.next()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            r0 = r2
            X.16z r0 = (X.C209916z) r0     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.lang.String r1 = r0.A08     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.lang.Object r0 = r4.get(r1)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            if (r0 != 0) goto L_0x003b
            java.util.ArrayList r0 = X.AnonymousClass0wJ.A0v()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            r4.put(r1, r0)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
        L_0x003b:
            java.util.List r0 = (java.util.List) r0     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            r0.add(r2)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            goto L_0x001f
        L_0x0041:
            int r0 = r4.size()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            int r0 = X.AnonymousClass4WK.A0N(r0)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.util.LinkedHashMap r0 = X.C18190wL.A0v(r0)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.util.Set r1 = r4.entrySet()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
        L_0x0055:
            boolean r1 = r4.hasNext()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            if (r1 == 0) goto L_0x007e
            java.util.Map$Entry r1 = X.C18180wK.A0o(r4)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.lang.Object r3 = r1.getKey()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.lang.Object r2 = r1.getValue()     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            com.facebook.redex.IDxComparatorShape94S0000000_1_I2 r1 = new com.facebook.redex.IDxComparatorShape94S0000000_1_I2     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            r1.<init>(r5)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.util.List r1 = X.AnonymousClass00J.A0W(r2, r1)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            java.util.List r1 = X.AnonymousClass00J.A0Z(r1, r8)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            r0.put(r3, r1)     // Catch:{ SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException -> 0x007a }
            goto L_0x0055
        L_0x007a:
            X.4To r0 = X.AnonymousClass4To.A00()
        L_0x007e:
            java.lang.Object r0 = r0.get(r7)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            if (r0 == 0) goto L_0x00a2
            java.util.Iterator r1 = r0.iterator()
        L_0x008e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = r1.next()
            X.16z r0 = (X.C209916z) r0
            java.lang.Long r0 = r0.A06
            if (r0 == 0) goto L_0x008e
            r3.add(r0)
            goto L_0x008e
        L_0x00a2:
            r2 = 0
            r1 = 1
            X.5Id r0 = new X.5Id
            r0.<init>(r3, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67423zW.CZ7(java.lang.String, int):X.5Id");
    }

    public final void BaA(int i) {
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        try {
            AnonymousClass7AB r2 = this.A00;
            r2.A02(System.currentTimeMillis());
            List A002 = r2.A00(System.currentTimeMillis());
            LinkedHashMap A0y = C18220wO.A0y();
            for (Object next : A002) {
                String str = ((C209916z) next).A08;
                Object obj = A0y.get(str);
                if (obj == null) {
                    obj = AnonymousClass0wJ.A0v();
                    A0y.put(str, obj);
                }
                ((List) obj).add(next);
            }
            LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0N(A0y.size()));
            for (Map.Entry entry : A0y.entrySet()) {
                A0v.put(entry.getKey(), AnonymousClass00J.A0Y(AnonymousClass00J.A0W((Iterable) entry.getValue(), new IDxComparatorShape94S0000000_1_I2(1)), i));
            }
            List<C209916z> A10 = C02260Al.A10(A0v.values());
            ArrayList A0w = AnonymousClass0wJ.A0w(A10);
            for (C209916z r0 : A10) {
                C18200wM.A1U(A0w, r0.A00);
            }
            AnonymousClass00J.A0i(A0w, new KtLambdaShape148S0100000_I2_3(this, 34), 500, 500);
        } catch (SQLiteDiskIOException | SQLiteException unused) {
        }
    }

    public final void CbU() {
        this.A00.A02(Long.MAX_VALUE);
    }

    public final void DBI(String str, long j, long j2) {
        C04220Ms.A0B(str, 0);
        long currentTimeMillis = System.currentTimeMillis();
        List A0n = C18180wK.A0n(new C209916z((Float) null, (Integer) null, Long.valueOf(j), str, (String) null, (String) null, 0, 0, currentTimeMillis, currentTimeMillis + 604800000));
        try {
            if (C18190wL.A1a(A0n)) {
                this.A00.A03(A0n);
            }
        } catch (SQLiteCantOpenDatabaseException | SQLiteDiskIOException | SQLiteException | SQLiteReadOnlyDatabaseException unused) {
        }
    }
}
