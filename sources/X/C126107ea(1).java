package X;

import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.7ea  reason: invalid class name and case insensitive filesystem */
public final class C126107ea implements C145808l7 {
    public int A00;
    public int A01;
    public final int A02;
    public final QuickPerformanceLogger A03;
    public final String A04;

    public final void Btu() {
        this.A03.markerEnd(36713009, this.A02, 2);
    }

    public final void BwA() {
        this.A03.markerStart(36713009, this.A02);
    }

    public final void CG7(C112676q0 r5) {
        MarkerEditor withMarker = this.A03.withMarker(36713009, this.A02);
        withMarker.annotate("sfd", r5.A01);
        withMarker.annotate("lfd", r5.A00);
        withMarker.annotate("ts", r5.A02);
        withMarker.annotate("max_cac", this.A01);
        withMarker.annotate("animation_key", this.A04);
        withMarker.markerEditingCompleted();
    }

    public C126107ea(QuickPerformanceLogger quickPerformanceLogger, String str, int i, int i2) {
        this.A03 = quickPerformanceLogger;
        this.A02 = i;
        this.A04 = str;
        this.A00 = i2;
        this.A01 = i2;
    }
}
