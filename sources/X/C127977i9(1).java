package X;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.7i9  reason: invalid class name and case insensitive filesystem */
public final class C127977i9 implements L10 {
    public final C37041JjM A00;
    public final File A01;

    public final boolean BZU(String str) {
        return false;
    }

    public final long Ba3(String str) {
        return 0;
    }

    public final Collection AQE() {
        String[] list = this.A01.list();
        if (list == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(list);
    }

    public final long[] getItemInformation(String str) {
        File A0U = C86154wM.A0U(this.A01, str);
        return new long[]{0, A0U.lastModified(), C121707Ho.A00(A0U)};
    }

    public final boolean remove(String str) {
        C37041JjM jjM = this.A00;
        return jjM.A07.A01(C86154wM.A0U(this.A01, str));
    }

    public C127977i9(C37041JjM jjM, File file) {
        this.A00 = jjM;
        this.A01 = file;
    }
}
