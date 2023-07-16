package X;

import com.facebook.errorreporting.lacrima.common.mappedfile.mlocked.MLockedFile;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0Yr  reason: invalid class name and case insensitive filesystem */
public final class C06310Yr implements C04420Nn {
    public final C06160Xx AEw(File file, int i) {
        try {
            return new MLockedFile(file, i);
        } catch (IOException e) {
            AnonymousClass0LU.A0G("lacrima", "Failed to initialize mlocked file, using fallback", e);
            C04790Pd.A00();
            file.delete();
            try {
                return new C06160Xx(file, i);
            } catch (IOException e2) {
                AnonymousClass0LU.A0G("lacrima", "Failed to initialize mapped file", e2);
                C04790Pd.A00();
                return null;
            }
        }
    }
}
