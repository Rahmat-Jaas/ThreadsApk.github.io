package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0vm  reason: invalid class name and case insensitive filesystem */
public final class C17930vm extends FileOutputStream {
    public final /* synthetic */ C12070lG A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ File A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17930vm(C12070lG r1, File file, File file2, File file3, String str) {
        super(file);
        this.A00 = r1;
        this.A02 = str;
        this.A01 = file2;
        this.A03 = file3;
    }

    public final void close() {
        int length;
        super.close();
        String format = String.format(Locale.US, "qpl_sampling_config_v2.%s", new Object[]{this.A02});
        File file = this.A01;
        File file2 = this.A03;
        if (file.renameTo(new File(file2, format))) {
            File[] listFiles = file2.listFiles();
            if (listFiles != null && (length = listFiles.length) > 5) {
                Arrays.sort(listFiles, C12070lG.A01);
                for (int i = 0; i < length - 5; i++) {
                    listFiles[i].delete();
                }
                return;
            }
            return;
        }
        throw new IOException("Failed to rename file");
    }
}
