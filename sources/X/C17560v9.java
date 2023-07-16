package X;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0v9  reason: invalid class name and case insensitive filesystem */
public final class C17560v9 implements C14870qJ {
    public final boolean CZY(UnsatisfiedLinkError unsatisfiedLinkError, C15010qZ[] r8) {
        for (AnonymousClass0MV r1 : r8) {
            if (r1 instanceof AnonymousClass0EA) {
                File file = r1.A00;
                try {
                    try {
                        C14990qW.A00(file, new File(file, "dso_lock")).close();
                    } catch (IOException e) {
                        Log.w("fb-UnpackingSoSource", "Encountered exception during wait for unpacking trying to close lock", e);
                    }
                } catch (IOException e2) {
                    Log.w("fb-UnpackingSoSource", "Encountered exception during wait for unpacking", e2);
                }
            }
        }
        return true;
    }
}
