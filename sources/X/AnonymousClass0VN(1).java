package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.0VN  reason: invalid class name */
public final class AnonymousClass0VN implements FilenameFilter {
    public final /* synthetic */ AnonymousClass0VO A00;
    public final /* synthetic */ String A01;

    public AnonymousClass0VN(AnonymousClass0VO r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final boolean accept(File file, String str) {
        return this.A01.equals(str);
    }
}
