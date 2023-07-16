package X;

import android.os.Handler;
import android.view.Window;

/* renamed from: X.7eb  reason: invalid class name and case insensitive filesystem */
public final class C126117eb implements C03880Le {
    public boolean A00 = false;
    public final Handler A01;
    public final Window.OnFrameMetricsAvailableListener A02;
    public final Window A03;

    public final void AHx() {
        if (this.A00) {
            this.A00 = false;
            this.A03.removeOnFrameMetricsAvailableListener(this.A02);
        }
    }

    public final void AJS() {
        if (!this.A00) {
            this.A00 = true;
            this.A03.addOnFrameMetricsAvailableListener(this.A02, this.A01);
        }
    }

    public C126117eb(Handler handler, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, Window window) {
        this.A01 = handler;
        this.A03 = window;
        this.A02 = onFrameMetricsAvailableListener;
    }
}
