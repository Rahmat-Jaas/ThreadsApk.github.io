package X;

import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.File;
import java.util.Iterator;

/* renamed from: X.2CZ  reason: invalid class name */
public final class AnonymousClass2CZ {
    public static C83994sM A00(Context context, AnonymousClass3C0 r6, File file, String str, String str2) {
        File file2 = new File(file, str);
        if (Build.VERSION.SDK_INT < 29) {
            return new AnonymousClass1QP(context, file2, r6.A01);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(DialogModule.KEY_TITLE, str);
        contentValues.put("_display_name", str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put("mime_type", str2);
        }
        StringBuilder A0s = C18190wL.A0s(r6.A03);
        Iterator it = r6.A04.iterator();
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            A0s.append(File.separator);
            A0s.append(A0k);
        }
        contentValues.put(C28174Ezk.A00(709), A0s.toString());
        return new C678840x(contentValues, context, context.getContentResolver().insert(r6.A00, contentValues));
    }
}
