package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.6RA  reason: invalid class name */
public final class AnonymousClass6RA {
    public static final void A00(File file) {
        if (!file.exists() && !file.mkdirs()) {
            IOException e = null;
            StringBuilder A0s = C18190wL.A0s("could not make directory: ");
            try {
                A0s.append(file.getCanonicalPath());
                A0s.append("-canonical");
            } catch (IOException e2) {
                e = e2;
                A0s.append(file.getAbsolutePath());
                A0s.append("-absolute");
            }
            IOException A0V = C86154wM.A0V(A0s.toString());
            if (e != null) {
                A0V.initCause(e);
            }
            throw A0V;
        }
    }
}
