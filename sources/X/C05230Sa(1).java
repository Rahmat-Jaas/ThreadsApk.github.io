package X;

import com.facebook.common.util.TriState;
import com.facebook.jni.NativeSoftErrorReporterProxy;
import java.util.List;

/* renamed from: X.0Sa  reason: invalid class name and case insensitive filesystem */
public final class C05230Sa implements Runnable {
    public final /* synthetic */ AnonymousClass0IB A00;
    public final /* synthetic */ List A01;

    public C05230Sa(AnonymousClass0IB r1, List list) {
        this.A01 = list;
        this.A00 = r1;
    }

    public final void run() {
        TriState triState;
        if (NativeSoftErrorReporterProxy.sErrorReportingGkReader == null) {
            triState = TriState.UNSET;
        } else {
            triState = TriState.YES;
        }
        if (triState == TriState.YES) {
            for (AnonymousClass0IH CuV : this.A01) {
                this.A00.CuV(CuV);
            }
        }
    }
}
