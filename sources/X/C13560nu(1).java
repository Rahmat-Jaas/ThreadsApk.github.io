package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0nu  reason: invalid class name and case insensitive filesystem */
public final class C13560nu {
    public final C13610nz A00;
    public final File A01;

    public C13560nu(Context context) {
        File A002 = C14630pr.A00(context, 211429074);
        this.A01 = A002;
        try {
            this.A00 = new C13610nz(A002);
        } catch (IOException unused) {
            throw new SecurityException("Cannot resolve the canonical path of the module's root dir.");
        }
    }
}
