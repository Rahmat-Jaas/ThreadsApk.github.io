package X;

import android.content.ComponentName;

/* renamed from: X.01F  reason: invalid class name */
public abstract class AnonymousClass01F {
    public int A00;
    public boolean A01;
    public final ComponentName A02;

    public final void A00(int i) {
        if (!this.A01) {
            this.A01 = true;
            this.A00 = i;
            return;
        }
        int i2 = this.A00;
        if (i2 != i) {
            throw new IllegalArgumentException(AnonymousClass00U.A01(i, i2, "Given job ID ", " is different than previous "));
        }
    }

    public AnonymousClass01F(ComponentName componentName) {
        this.A02 = componentName;
    }
}
