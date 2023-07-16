package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.6MZ  reason: invalid class name */
public final class AnonymousClass6MZ {
    public static final void A00(String str) {
        C04220Ms.A0B(str, 0);
        try {
            File A0Z = C86144wL.A0Z(str);
            if (A0Z.exists() && A0Z.isFile()) {
                A0Z.delete();
            }
        } catch (IOException e) {
            C10450iM.A02("EditorVideoFileUtil:removeFile", AnonymousClass006.A01, C18230wP.A0t("Failed to delete file ", e));
        }
    }
}
