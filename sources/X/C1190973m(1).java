package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* renamed from: X.73m  reason: invalid class name and case insensitive filesystem */
public final class C1190973m {
    public static final String[] A00 = {"_data", DevServerEntity.COLUMN_DESCRIPTION};

    public static final String A00(Context context, Uri uri) {
        AnonymousClass0wJ.A1N(context, uri);
        Cursor A002 = C13960oa.A00(context.getContentResolver(), uri, (String) null, (String) null, new String[]{DevServerEntity.COLUMN_DESCRIPTION}, (String[]) null, 1483597648);
        if (A002 != null) {
            if (A002.getCount() > 0) {
                A002.moveToFirst();
                int columnIndex = A002.getColumnIndex(DevServerEntity.COLUMN_DESCRIPTION);
                if (columnIndex >= 0) {
                    return A002.getString(columnIndex);
                }
                return null;
            }
            A002.close();
        }
        return null;
    }
}
