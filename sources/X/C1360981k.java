package X;

import com.facebook.dcp.model.DcpData;
import java.util.List;

/* renamed from: X.81k  reason: invalid class name and case insensitive filesystem */
public final class C1360981k implements Runnable {
    public final /* synthetic */ C1203279s A00;
    public final /* synthetic */ List A01;

    public C1360981k(C1203279s r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public final void run() {
        C1203279s r3 = this.A00;
        C144858jP r2 = r3.A01;
        if (r2 != null) {
            r2.onPredictionResult(Boolean.valueOf(((DcpData) C18240wQ.A0b(this.A01)).A0E), r3.A07);
        }
    }
}
