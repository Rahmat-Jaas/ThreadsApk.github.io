package X;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.base.activity.IgFragmentActivity;

/* renamed from: X.7eZ  reason: invalid class name and case insensitive filesystem */
public final class C126097eZ implements C145808l7 {
    public QuickPerformanceLogger A00;
    public String A01;
    public double[] A02;

    public final void Btu() {
        this.A00.markerEnd(15990796, 2);
    }

    public final void BwA() {
        this.A00.markerStart(15990796, IgFragmentActivity.MODULE_KEY, this.A01);
    }

    public final void CG7(C112676q0 r5) {
        MarkerEditor withMarker = this.A00.withMarker(15990796);
        withMarker.annotate(AnonymousClass000.A00(539), r5.A01);
        withMarker.annotate(AnonymousClass000.A00(542), r5.A00);
        withMarker.annotate(I17.A00(132), r5.A02);
        withMarker.annotate(AnonymousClass000.A00(1160), r5.A03);
        double[] dArr = this.A02;
        if (dArr != null) {
            withMarker.annotate("supported_refresh_rates", dArr);
        }
        if (r5 instanceof AnonymousClass5FG) {
            AnonymousClass5FG r52 = (AnonymousClass5FG) r5;
            withMarker.annotate(AnonymousClass000.A00(1159), r52.A01);
            withMarker.annotate("drop_count", r52.A00);
        }
        withMarker.annotate("surface_session_id", (String) null);
        withMarker.markerEditingCompleted();
    }

    public C126097eZ(Context context, QuickPerformanceLogger quickPerformanceLogger, String str) {
        Display defaultDisplay;
        this.A00 = quickPerformanceLogger;
        this.A01 = str;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null && defaultDisplay.getSupportedRefreshRates() != null) {
            float[] supportedRefreshRates = defaultDisplay.getSupportedRefreshRates();
            int length = supportedRefreshRates.length;
            double[] dArr = new double[length];
            for (int i = 0; i < length; i++) {
                dArr[i] = (double) supportedRefreshRates[i];
            }
            this.A02 = dArr;
        }
    }
}
