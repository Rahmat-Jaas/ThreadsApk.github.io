package X;

import android.os.Bundle;

/* renamed from: X.3E9  reason: invalid class name */
public final class AnonymousClass3E9 {
    public final Bundle A00;

    public final byte[] A00() {
        Bundle bundle = this.A00;
        if (bundle.containsKey("startMessage")) {
            return bundle.getByteArray("startMessage");
        }
        throw new IllegalStateException();
    }

    public AnonymousClass3E9(Bundle bundle) {
        if (bundle != null) {
            AnonymousClass3W4.A01(bundle, "startMessage");
            this.A00 = bundle;
            return;
        }
        throw C18190wL.A0a("Bundle is null");
    }
}
