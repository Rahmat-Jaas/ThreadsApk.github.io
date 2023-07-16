package X;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.CancellationSignal;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.0x7  reason: invalid class name and case insensitive filesystem */
public final class C18390x7 extends ContentProvider {
    public static final String[] A00 = {"COL_FULL_NAME", "COL_PROFILE_PHOTO_URL"};

    public final boolean onCreate() {
        return true;
    }

    public static final Cursor A00(C18390x7 r2) {
        AnonymousClass3YX.A01.A02();
        C10300i6 A0W = C18200wM.A0W(r2);
        if (!(A0W instanceof UserSession)) {
            return null;
        }
        User A01 = C06810aP.A01.A01((UserSession) A0W);
        String[] strArr = {A01.Ak1(), A01.B4M().getUrl()};
        MatrixCursor matrixCursor = new MatrixCursor(A00);
        matrixCursor.addRow(strArr);
        return matrixCursor;
    }

    public final void A01() {
        int callingUid = Binder.getCallingUid();
        Context context = getContext();
        if (context != null) {
            int i = context.getApplicationInfo().uid;
            if (callingUid != i && context.getPackageManager().checkSignatures(i, callingUid) != 0) {
                throw new SecurityException("Access to user information denied");
            }
            return;
        }
        throw AnonymousClass0wJ.A0b();
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

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
        A01();
        return A00(this);
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C18240wQ.A0j();
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        A01();
        return A00(this);
    }
}
