package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.0Wg  reason: invalid class name */
public interface AnonymousClass0Wg {
    public static final int[] A00 = {-1};

    C05820We getListenerFlags();

    C05830Wf getListenerMarkers();

    String getName();

    void onMarkEvent(C05800Wc r1);

    void onMarkerAnnotate(C05800Wc r1);

    void onMarkerDrop(C05800Wc r1);

    void onMarkerPoint(C05800Wc r1, String str, AnonymousClass0WQ r3, long j, long j2, boolean z, int i);

    void onMarkerRestart(C05800Wc r1);

    void onMarkerStart(C05800Wc r1);

    void onMarkerStop(C05800Wc r1);

    boolean onQuickMarkerStart(int i, int i2);

    void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger);
}
