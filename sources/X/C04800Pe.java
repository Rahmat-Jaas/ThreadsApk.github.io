package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0Pe  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C04800Pe implements FileFilter {
    public final /* synthetic */ AnonymousClass0ND A00;
    public final /* synthetic */ AnonymousClass0PD A01;

    public /* synthetic */ C04800Pe(AnonymousClass0ND r1, AnonymousClass0PD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean accept(File file) {
        AnonymousClass0ND r0 = this.A00;
        AnonymousClass0PD r3 = this.A01;
        if (file == null || !file.getName().startsWith(r0.A00) || !file.getName().endsWith(AnonymousClass00U.A0L(r3.A00, "_prop.txt"))) {
            return false;
        }
        return true;
    }
}
