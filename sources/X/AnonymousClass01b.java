package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.01b  reason: invalid class name */
public final class AnonymousClass01b extends C007803j {
    public AnonymousClass01b(Context context) {
        super(context, new File(context.getApplicationInfo().sourceDir), "lib-assets", "^assets/lib/([^/]+)/([^/]+\\.so)$");
    }

    public final byte[] A0A() {
        return C14990qW.A04(this.A03, this.A00);
    }
}
