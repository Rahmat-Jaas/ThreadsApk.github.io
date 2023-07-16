package X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: X.0x5  reason: invalid class name and case insensitive filesystem */
public abstract class C18380x5 extends ContentProvider {
    public final boolean onCreate() {
        return true;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        throw C18240wQ.A0j();
    }

    public final String getType(Uri uri) {
        throw C18240wQ.A0j();
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw C18240wQ.A0j();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            Context context = getContext();
            C15780rs r2 = AnonymousClass3XE.A01;
            if (!r2.A05(context)) {
                C15780rs r1 = AnonymousClass3XE.A00;
                if (!r1.A05(context)) {
                    r2.A04(context);
                    r1.A04(context);
                }
            }
            ArrayList A0v = AnonymousClass0wJ.A0v();
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            getContext();
            AnonymousClass3FH A02 = C11190jg.A00(C10600ic.A00).A02((C10300i6) null);
            if (A02 != null) {
                getContext();
                A0v.add(AnonymousClass000.A00(600));
                A0v.add(AnonymousClass000.A00(601));
                A0v.add(AnonymousClass000.A00(599));
                A0v2.add(A02.A01);
                A0v2.add(Long.toString(A02.A00));
                A0v2.add(A02.A02);
            }
            getContext();
            if (A0v.isEmpty()) {
                return null;
            }
            MatrixCursor matrixCursor = new MatrixCursor((String[]) A0v.toArray(new String[A0v.size()]));
            matrixCursor.addRow(A0v2.toArray(new String[A0v2.size()]));
            return matrixCursor;
        } catch (Exception e) {
            Log.e("AbstractPhoneIdProvider", "Failed to call queryForIds", e);
            C10450iM.A06("AbstractPhoneIdProvider", e.getMessage(), e);
            return null;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C18240wQ.A0j();
    }
}
