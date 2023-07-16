package X;

import java.io.File;
import java.io.InputStream;

/* renamed from: X.7qJ  reason: invalid class name and case insensitive filesystem */
public final class C130577qJ implements C147008nE {
    public final File A00;

    public final void onFinish() {
    }

    public final InputStream DBG(AnonymousClass3Ud r3, InputStream inputStream) {
        File file = this.A00;
        if (file == null) {
            return inputStream;
        }
        return new AnonymousClass66A(file, inputStream);
    }

    public C130577qJ(File file) {
        this.A00 = file;
    }
}
