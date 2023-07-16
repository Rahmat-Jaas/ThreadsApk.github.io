package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0Pf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C04810Pf implements FileFilter {
    public final /* synthetic */ AnonymousClass0ND A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C04810Pf(AnonymousClass0ND r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final boolean accept(File file) {
        AnonymousClass0ND r3 = this.A00;
        boolean z = this.A01;
        if (file == null || ((!file.getName().startsWith(r3.A00) && r3 != AnonymousClass0ND.LARGE_REPORT) || ((z && !file.getName().contains("suppl_")) || !file.getName().endsWith("_attach.txt")))) {
            return false;
        }
        return true;
    }
}
