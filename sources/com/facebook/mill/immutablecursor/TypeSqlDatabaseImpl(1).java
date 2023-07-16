package com.facebook.mill.immutablecursor;

import X.AnonymousClass0wJ;
import X.AnonymousClass735;
import X.AnonymousClass736;
import X.AnonymousClass8AP;
import X.C04220Ms;
import X.C134937yc;
import X.C18180wK;
import X.C18190wL;
import X.C18240wQ;
import X.C86114wI;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.mill.runtime.TypeSqlQuery;
import com.facebook.msys.mci.SqliteHolder;
import java.util.Arrays;
import java.util.List;

public final class TypeSqlDatabaseImpl {
    public final SqliteHolder sqliteHolder;

    public TypeSqlDatabaseImpl(SqliteHolder sqliteHolder2) {
        C04220Ms.A0B(sqliteHolder2, 1);
        this.sqliteHolder = sqliteHolder2;
        AnonymousClass736.A00();
        AnonymousClass735.A00();
    }

    private final native boolean execSQL(SqliteHolder sqliteHolder2, String str, List list);

    private final native TypeSqlQuery rawQuery(SqliteHolder sqliteHolder2, String str, List list);

    public SqliteHolder getSqliteHolder() {
        return this.sqliteHolder;
    }

    public void exec(String str, Object... objArr) {
        List asList;
        AnonymousClass0wJ.A1N(str, objArr);
        SqliteHolder sqliteHolder2 = this.sqliteHolder;
        if (objArr.length == 0) {
            asList = null;
        } else {
            asList = Arrays.asList(objArr);
            C04220Ms.A06(asList);
        }
        execSQL(sqliteHolder2, str, asList);
    }

    public TypeSqlQuery prepare(byte[] bArr, String str, Object... objArr) {
        AnonymousClass0wJ.A1N(bArr, str);
        C04220Ms.A0B(objArr, 2);
        TypeSqlQuery rawQuery = rawQuery(this.sqliteHolder, str, AnonymousClass8AP.A0B(objArr));
        rawQuery.setColumnTypes(bArr);
        return rawQuery;
    }

    public void exec(Object... objArr) {
        Object[] copyOf;
        C04220Ms.A0B(objArr, 0);
        int length = objArr.length;
        boolean z = !C18180wK.A1W(length);
        Integer valueOf = Integer.valueOf(length);
        if (z) {
            String str = objArr[0];
            C18240wQ.A1I(str);
            String str2 = str;
            if (length == 1) {
                copyOf = new Object[0];
            } else {
                Object[] array = C134937yc.A00(objArr, 1, length - 1, length).toArray(new Object[0]);
                copyOf = Arrays.copyOf(array, array.length);
            }
            exec(str2, copyOf);
            return;
        }
        throw C18190wL.A0a(StringFormatUtil.formatStrLocaleSafe("args must contains at least sql statement argument size = %d", (Object) valueOf));
    }

    public TypeSqlQuery prepare(Object... objArr) {
        Object[] copyOf;
        C04220Ms.A0B(objArr, 0);
        int length = objArr.length;
        boolean A1U = C86114wI.A1U(length, 2);
        Integer valueOf = Integer.valueOf(length);
        if (A1U) {
            byte[] bArr = objArr[0];
            C04220Ms.A0C(bArr, "null cannot be cast to non-null type kotlin.ByteArray");
            byte[] bArr2 = bArr;
            String str = objArr[1];
            C18240wQ.A1I(str);
            String str2 = str;
            if (length == 2) {
                copyOf = new Object[0];
            } else {
                Object[] array = C134937yc.A00(objArr, 2, length - 1, length).toArray(new Object[0]);
                copyOf = Arrays.copyOf(array, array.length);
            }
            return prepare(bArr2, str2, copyOf);
        }
        throw C18190wL.A0a(StringFormatUtil.formatStrLocaleSafe("args must contains at least sql statement and columnTypes arguments size = %d", (Object) valueOf));
    }
}
