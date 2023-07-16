package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;

/* renamed from: X.0lC  reason: invalid class name and case insensitive filesystem */
public final class C12030lC implements C05900Ww {
    public final AnonymousClass08V A00 = new C12420ls();
    public volatile QuickPerformanceLogger A01;

    public static long A00(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    public final synchronized void CbB() {
        AnonymousClass08V r1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            r1 = this.A00;
            if (i >= r1.size()) {
                break;
            }
            if (((Boolean) r1.valueAt(i)).booleanValue()) {
                arrayList.add(Integer.valueOf(i));
            }
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            r1.removeAt(((Integer) arrayList.get(i2)).intValue());
        }
    }

    public final synchronized void CbC(int i, int i2, boolean z) {
        long A002 = A00(i, i2);
        AnonymousClass08V r2 = this.A00;
        int indexOfKey = r2.indexOfKey(A002);
        if (indexOfKey >= 0) {
            r2.setValueAt(indexOfKey, Boolean.valueOf(z));
        }
    }

    private void A01(int i, int i2, String str) {
        boolean z;
        if (i != 0) {
            long A002 = A00(i, i2);
            synchronized (this) {
                z = false;
                if (this.A00.indexOfKey(A002) < 0) {
                    z = true;
                }
            }
            if (z) {
                if (str == null) {
                    str = "null";
                }
                QuickPerformanceLogger quickPerformanceLogger = this.A01;
                if (quickPerformanceLogger != null) {
                    EventBuilder actionId = quickPerformanceLogger.markEventBuilder(i, "qpl_error_detector").setActionId(10087);
                    actionId.annotate("annotation_name", str);
                    actionId.report();
                }
            }
        }
    }

    public final void Cb8(int i, int i2) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (i != 0) {
            long A002 = A00(i, i2);
            boolean z = false;
            synchronized (this) {
                AnonymousClass08V r1 = this.A00;
                int indexOfKey = r1.indexOfKey(A002);
                if (indexOfKey >= 0) {
                    r1.removeAt(indexOfKey);
                } else {
                    z = true;
                }
            }
            if (z && (quickPerformanceLogger = this.A01) != null) {
                quickPerformanceLogger.markEventBuilder(i, "qpl_error_detector").setActionId(10294).report();
            }
        }
    }

    public final void Cb9(int i, int i2, String str) {
        boolean z;
        QuickPerformanceLogger quickPerformanceLogger;
        if (i != 0) {
            long A002 = A00(i, i2);
            synchronized (this) {
                z = false;
                if (this.A00.indexOfKey(A002) < 0) {
                    z = true;
                }
            }
            if (z && (quickPerformanceLogger = this.A01) != null) {
                EventBuilder actionId = quickPerformanceLogger.markEventBuilder(i, "qpl_error_detector").setActionId(10088);
                actionId.annotate("point_name", str);
                actionId.report();
            }
        }
    }

    public final void CbA(int i, int i2, boolean z) {
        QuickPerformanceLogger quickPerformanceLogger;
        if (i != 0) {
            long A002 = A00(i, i2);
            boolean z2 = false;
            synchronized (this) {
                AnonymousClass08V r3 = this.A00;
                if (r3.indexOfKey(A002) < 0) {
                    r3.append(A002, Boolean.valueOf(z));
                } else {
                    z2 = true;
                }
            }
            if (z2 && (quickPerformanceLogger = this.A01) != null) {
                quickPerformanceLogger.markEventBuilder(i, "qpl_error_detector").setActionId(10086).report();
            }
        }
    }

    public final void Cb7(int i, int i2) {
        long A002 = A00(i, i2);
        synchronized (this) {
            this.A00.remove(A002);
        }
    }

    public final void setQuickPerformanceLogger(QuickPerformanceLogger quickPerformanceLogger) {
        this.A01 = quickPerformanceLogger;
    }

    public final void Cb5(int i, int i2, String str, int i3) {
        A01(i, i2, str);
    }

    public final void Cb6(int i, int i2, String str, String str2) {
        A01(i, i2, str);
    }
}
