package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.3El  reason: invalid class name and case insensitive filesystem */
public final class C58193El {
    public final Context A00;
    public final File A01;

    public final File A00(String str) {
        File file = this.A01;
        if (file == null) {
            throw C18180wK.A0a(AnonymousClass00U.A0L("Uninitialised Factory when using ", str));
        } else if (!str.isEmpty()) {
            return new File(file, str);
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0L("Invalid Relative Path = ", str));
        }
    }

    public C58193El(Context context) {
        this.A00 = context.getApplicationContext();
        this.A01 = C1201278t.A00(context);
    }
}
