package X;

import com.facebook.errorreporting.lacrima.common.mappedfile.mlocked.MLockedFile;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0YF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass0YF implements C04420Nn {
    public final /* synthetic */ AnonymousClass0M7 A00;

    public /* synthetic */ AnonymousClass0YF(AnonymousClass0M7 r1) {
        this.A00 = r1;
    }

    public final C06160Xx AEw(File file, int i) {
        try {
            return new MLockedFile(file, i);
        } catch (IOException e) {
            C04790Pd.A00();
            AnonymousClass0LU.A0G("lacrima", "Failed to initialize mlocked file, using fallback", e);
            try {
                return new C06160Xx(file, i);
            } catch (IOException e2) {
                C04790Pd.A00();
                AnonymousClass0LU.A0G("lacrima", "Failed to initialize mapped file", e2);
                return null;
            }
        }
    }
}
