package X;

import android.content.Context;
import com.facebook.react.modules.appstate.AppStateModule;
import java.io.File;

/* renamed from: X.0XA  reason: invalid class name */
public final class AnonymousClass0XA {
    public static final String A01;
    public static final String A02;
    public final Context A00;

    static {
        String str = File.separator;
        A01 = AnonymousClass00U.A0d(str, "locagg", str, AppStateModule.APP_STATE_ACTIVE);
        A02 = AnonymousClass00U.A0d(str, "locagg", str, "stash");
    }

    public static File A00(AnonymousClass0XA r2) {
        return new File(AnonymousClass00U.A0L(r2.A00.getDir("qpl", 0).getPath(), A01));
    }

    public static File A01(AnonymousClass0XA r2) {
        return new File(AnonymousClass00U.A0L(r2.A00.getDir("qpl", 0).getPath(), A02));
    }

    public AnonymousClass0XA(Context context) {
        this.A00 = context;
    }

    public final void A02() {
        File A012 = A01(this);
        if (A012.exists()) {
            File[] listFiles = A012.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
            A012.delete();
        }
    }
}
