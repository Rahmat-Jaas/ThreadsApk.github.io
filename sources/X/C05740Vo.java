package X;

import java.util.zip.ZipEntry;

/* renamed from: X.0Vo  reason: invalid class name and case insensitive filesystem */
public final class C05740Vo extends C14960qT implements Comparable {
    public final int A00;
    public final ZipEntry A01;

    public final int compareTo(Object obj) {
        return this.A01.compareTo(((C14960qT) obj).A01);
    }

    public C05740Vo(String str, ZipEntry zipEntry, int i) {
        super(str, String.format("pseudo-zip-hash-1-%s-%s-%s-%s", new Object[]{zipEntry.getName(), Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCompressedSize()), Long.valueOf(zipEntry.getCrc())}));
        this.A01 = zipEntry;
        this.A00 = i;
    }
}
