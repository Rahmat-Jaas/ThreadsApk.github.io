package X;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* renamed from: X.0EB  reason: invalid class name */
public final class AnonymousClass0EB extends C07820cF {
    public final File A00;
    public final /* synthetic */ C002701g A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0EB(C002701g r3, C007803j r4) {
        super(r3, r4);
        this.A01 = r3;
        this.A00 = new File(r3.A03.getApplicationInfo().nativeLibraryDir);
    }

    public final boolean A02(String str, ZipEntry zipEntry) {
        Object[] objArr;
        String str2;
        String name = zipEntry.getName();
        C002701g r1 = this.A01;
        boolean z = false;
        if (str.equals(r1.A00)) {
            r1.A00 = null;
            objArr = new Object[]{str};
            str2 = "allowing consideration of corrupted lib %s";
        } else {
            File file = this.A00;
            File file2 = new File(file, str);
            try {
                if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    String.format("not allowing consideration of %s: %s not in lib dir", new Object[]{name, str});
                } else if (!file2.isFile()) {
                    objArr = new Object[]{name, str};
                    str2 = "allowing consideration of %s: %s not in system lib dir";
                } else {
                    long length = file2.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        objArr = new Object[]{file2, Long.valueOf(length), Long.valueOf(size)};
                        str2 = "allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK";
                    }
                }
            } catch (IOException e) {
                String.format("not allowing consideration of %s: %s, IOException when constructing path: %s", new Object[]{name, str, e.toString()});
            }
            Log.isLoggable("ApkSoSource", 3);
            return z;
        }
        String.format(str2, objArr);
        z = true;
        Log.isLoggable("ApkSoSource", 3);
        return z;
    }
}
