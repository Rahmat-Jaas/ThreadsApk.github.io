package X;

import com.facebook.forker.Process;
import com.facebook.profilo.core.TriggerRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.07T  reason: invalid class name */
public final class AnonymousClass07T extends AnonymousClass0JP {
    public final QuickPerformanceLogger A00;

    public final void CRs(File file, int i) {
        A01(file, i, 3);
    }

    public final void CRw(File file) {
        A01(file, 0, 2);
    }

    public static void A00(TraceContext traceContext, TreeMap treeMap) {
        int i = traceContext.A01;
        for (Object put : TriggerRegistry.A00.A03(i)) {
            treeMap.put("controller", put);
        }
        if (i == C03530Jd.A01 || i == C03550Jf.A01 || i == C03540Je.A01) {
            treeMap.put("markerid", Long.toString(traceContext.A05 & 4294967295L));
        }
        AnonymousClass0UJ r0 = traceContext.A07;
        if (r0 != null) {
            treeMap.put("config_id", Long.toString(r0.getID()));
        }
    }

    public final void A01(File file, int i, short s) {
        String str;
        TreeMap treeMap = new TreeMap();
        String name = file.getName();
        treeMap.put("filename", name);
        if (i == 1) {
            str = "request_failed";
        } else if (i != 2) {
            if (i == 3) {
                str = "no_bytes_remaining";
            }
            treeMap.put("trace_id", name.substring(name.lastIndexOf(45) + 1).replaceFirst("(\\.zip)?\\.log", "").replace("_p_", "+").replace("_s_", "/"));
            this.A00.markerGenerateWithAnnotations(8126469, s, 0, TimeUnit.MILLISECONDS, treeMap);
        } else {
            str = "no_connection";
        }
        treeMap.put("reason", str);
        treeMap.put("trace_id", name.substring(name.lastIndexOf(45) + 1).replaceFirst("(\\.zip)?\\.log", "").replace("_p_", "+").replace("_s_", "/"));
        this.A00.markerGenerateWithAnnotations(8126469, s, 0, TimeUnit.MILLISECONDS, treeMap);
    }

    public final void BrS() {
        this.A00.updateListenerMarkers();
    }

    public final void CPo(TraceContext traceContext) {
        short s;
        if (traceContext.A01 == C03540Je.A01) {
            CPr(traceContext);
        }
        TreeMap treeMap = new TreeMap();
        A00(traceContext, treeMap);
        int i = traceContext.A00;
        int i2 = i & Integer.MAX_VALUE;
        if ((i & Process.WAIT_RESULT_TIMEOUT) != Integer.MIN_VALUE) {
            switch (i2) {
                case 1:
                    s = 51;
                    break;
                case 2:
                    return;
                case 3:
                    s = 112;
                    break;
                case 4:
                    s = 113;
                    break;
                case 5:
                    s = 111;
                    break;
                case 6:
                    s = 719;
                    break;
                default:
                    s = 2;
                    break;
            }
        } else {
            treeMap.put("abort_reason", C05650Up.A00(i2));
            s = 509;
        }
        treeMap.put("trace_id", traceContext.A0D);
        this.A00.markerGenerateWithAnnotations(8126466, s, 0, TimeUnit.MILLISECONDS, treeMap);
    }

    public final void CPp(int i, int i2, int i3, int i4) {
        while (i > 0) {
            this.A00.markerGenerate(8126471, 3, 0, TimeUnit.MILLISECONDS);
            i--;
        }
        while (i2 > 0) {
            this.A00.markerGenerate(8126472, 2, 0, TimeUnit.MILLISECONDS);
            i2--;
        }
        while (i3 > 0) {
            this.A00.markerGenerate(8126473, 2, 0, TimeUnit.MILLISECONDS);
            i3--;
        }
        while (i4 > 0) {
            this.A00.markerGenerate(8126474, 2, 0, TimeUnit.MILLISECONDS);
            i4--;
        }
    }

    public final void CPq(TraceContext traceContext) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("trace_id", AnonymousClass0QJ.A00(traceContext.A06));
        this.A00.markerGenerateWithAnnotations(8126465, 2, 0, TimeUnit.MILLISECONDS, treeMap);
    }

    public final void CPr(TraceContext traceContext) {
        TreeMap treeMap = new TreeMap();
        A00(traceContext, treeMap);
        treeMap.put("trace_id", traceContext.A0D);
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        int i = 8126523;
        if ((traceContext.A03 & 2) == 0) {
            i = 8126512;
        }
        quickPerformanceLogger.markerGenerateWithAnnotations(i, 2, 0, TimeUnit.MILLISECONDS, treeMap);
    }

    public final void CPt(TraceContext traceContext) {
        if (traceContext.A01 == C03540Je.A01) {
            CPr(traceContext);
        }
        TreeMap treeMap = new TreeMap();
        A00(traceContext, treeMap);
        treeMap.put("trace_id", traceContext.A0D);
        this.A00.markerGenerateWithAnnotations(8126516, 2, 0, TimeUnit.MILLISECONDS, treeMap);
    }

    public AnonymousClass07T(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }
}
