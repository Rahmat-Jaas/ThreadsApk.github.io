package X;

import android.os.Process;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.TraceDirect;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0Ej  reason: invalid class name and case insensitive filesystem */
public final class C03110Ej extends AnonymousClass0e0 {
    public final String getName() {
        return "systrace";
    }

    public final C05830Wf getListenerMarkers() {
        if (Systrace.A0F(4)) {
            return C05830Wf.A02;
        }
        return C05830Wf.A05;
    }

    public final void onMarkerAnnotate(C05800Wc r14) {
        if (Systrace.A0F(4)) {
            long ArC = r14.ArC();
            int markerId = r14.getMarkerId();
            int BJK = r14.BJK();
            String Ar4 = r14.Ar4();
            String Ar5 = r14.Ar5();
            long nanos = TimeUnit.MILLISECONDS.toNanos(ArC);
            Systrace.A0C(String.valueOf(markerId), AnonymousClass00U.A0d("<ANNOTATION>=", Ar4, "->", Ar5), markerId ^ (BJK * 179426549), 274877906944L, nanos);
        }
    }

    public final void onMarkerDrop(C05800Wc r7) {
        if (Systrace.A0F(4)) {
            int markerId = r7.getMarkerId();
            int BJK = r7.BJK();
            String valueOf = String.valueOf(markerId);
            int i = markerId ^ (BJK * 179426549);
            if (!Systrace.A0F(4)) {
                return;
            }
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceCancel(valueOf, i);
                return;
            }
            C14160ou r1 = new C14160ou('F');
            r1.A00(Process.myPid());
            r1.A02(valueOf);
            r1.A01("<X>");
            r1.A00(i);
            C14150ot.A00(r1.toString());
        }
    }

    public final void onMarkerPoint(C05800Wc r10, String str, AnonymousClass0WQ r12, long j, long j2, boolean z, int i) {
        if (Systrace.A0F(4)) {
            int markerId = r10.getMarkerId();
            int BJK = r10.BJK();
            String valueOf = String.valueOf(markerId);
            int i2 = markerId ^ (BJK * 179426549);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Systrace.A0C(valueOf, str, i2, 4, timeUnit.toNanos(j));
            if (r12 != null) {
                Systrace.A0C(valueOf, AnonymousClass00U.A0L("<PDATA>=", r12.toString()), i2, 274877906944L, timeUnit.toNanos(j));
            }
        }
    }

    public final void onMarkerStart(C05800Wc r15) {
        if (Systrace.A0F(4)) {
            int markerId = r15.getMarkerId();
            int BJK = r15.BJK();
            long AwQ = r15.AwQ();
            String valueOf = String.valueOf(markerId);
            int i = markerId ^ (BJK * 179426549);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Systrace.A0A(valueOf, i, 4, timeUnit.toNanos(AwQ));
            List BFU = r15.BFU();
            if (BFU != null && !BFU.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator it = BFU.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append(", ");
                    }
                }
                String obj = sb.toString();
                if (obj != null) {
                    Systrace.A0C(valueOf, AnonymousClass00U.A0L("<TAG>=", obj), i, 274877906944L, timeUnit.toNanos(AwQ));
                }
            }
        }
    }

    public final void onMarkerStop(C05800Wc r13) {
        if (Systrace.A0F(4)) {
            short Ar1 = r13.Ar1();
            long ArC = r13.ArC();
            int markerId = r13.getMarkerId();
            int BJK = r13.BJK();
            String valueOf = String.valueOf(markerId);
            int i = markerId ^ (BJK * 179426549);
            Systrace.A0B(valueOf, i, 4, TimeUnit.MILLISECONDS.toNanos(ArC));
            Systrace.A00(i, valueOf, AnonymousClass00U.A0K("-", markerId, Ar1));
        }
    }

    public final void onMarkerRestart(C05800Wc r1) {
        onMarkerStart(r1);
    }
}
