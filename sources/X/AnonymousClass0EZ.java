package X;

import android.os.FileObserver;
import java.io.File;

/* renamed from: X.0EZ  reason: invalid class name */
public final class AnonymousClass0EZ {
    public int A00;
    public FileObserver A01;
    public AnonymousClass0KK A02;
    public File A03;
    public boolean A04;

    public static void A00(String str) {
        AnonymousClass0LU.A0O("FileBasedMultiProcessTracker", "%s: %s", AnonymousClass0KY.A00().A02(), str);
    }

    public final void A01(int i) {
        File file = new File(AnonymousClass00U.A0R(this.A03.getPath(), File.separator, i));
        if (file.exists() && !file.delete()) {
            A00(AnonymousClass00U.A0J("Failed to delete file for PID: ", i));
        }
    }
}
