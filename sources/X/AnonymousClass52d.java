package X;

import android.widget.Magnifier;

/* renamed from: X.52d  reason: invalid class name */
public final class AnonymousClass52d extends AnonymousClass7UI {
    public final void D8g(float f, long j, long j2) {
        if (!Float.isNaN(f)) {
            this.A00.setZoom(f);
        }
        if (j2 != AnonymousClass7KC.A02) {
            this.A00.show(AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j), AnonymousClass7KC.A01(j2), AnonymousClass7KC.A02(j2));
        } else {
            this.A00.show(AnonymousClass7KC.A01(j), AnonymousClass7KC.A02(j));
        }
    }

    public AnonymousClass52d(Magnifier magnifier) {
        super(magnifier);
    }
}
