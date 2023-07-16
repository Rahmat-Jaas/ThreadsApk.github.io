package X;

import android.graphics.PathMeasure;

/* renamed from: X.7X2  reason: invalid class name */
public final class AnonymousClass7X2 implements C142908fn {
    public final PathMeasure A00;

    public final boolean B9f(C147018nF r4, float f, float f2, boolean z) {
        PathMeasure pathMeasure = this.A00;
        if (r4 instanceof AnonymousClass7X1) {
            return pathMeasure.getSegment(f, f2, ((AnonymousClass7X1) r4).A01, true);
        }
        throw C86134wK.A0s("Unable to obtain android.graphics.Path");
    }

    public AnonymousClass7X2(PathMeasure pathMeasure) {
        this.A00 = pathMeasure;
    }
}
