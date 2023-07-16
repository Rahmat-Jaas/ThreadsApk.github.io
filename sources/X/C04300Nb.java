package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0Nb  reason: invalid class name and case insensitive filesystem */
public final class C04300Nb implements FileFilter {
    public final /* synthetic */ C04320Nd A00;
    public final /* synthetic */ String A01;

    public C04300Nb(C04320Nd r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final boolean accept(File file) {
        return file.getName().startsWith(this.A01);
    }
}
