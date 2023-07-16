package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.3MI  reason: invalid class name */
public final class AnonymousClass3MI {
    public static final String A00() {
        String str = null;
        try {
            str = ITF.A00().AOC((C109746kY) null, 195432639).getCanonicalPath();
        } catch (IOException unused) {
            C10450iM.A03("msys_mailbox_config", "Unable to retrieve canonical path from Cask");
        }
        if (str == null || str.endsWith("/")) {
            return str;
        }
        return AnonymousClass00U.A0A(str, '/');
    }

    public static final void A01(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            C04220Ms.A06(listFiles);
            for (File file2 : listFiles) {
                C04220Ms.A03(file2);
                A01(file2);
            }
        }
        file.delete();
    }
}
