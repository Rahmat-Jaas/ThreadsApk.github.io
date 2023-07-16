package X;

import android.content.Context;
import android.os.Looper;
import com.facebook.papaya.client.ICallback;
import com.facebook.papaya.client.PapayaJNI;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.log.LogSink;
import java.util.Map;

/* renamed from: X.6qH  reason: invalid class name and case insensitive filesystem */
public final class C112836qH {
    public boolean A00 = false;
    public final Context A01;
    public final ICallback A02;
    public final C110576lv A03;
    public final LogSink A04;

    public final synchronized void A00() {
        AnonymousClass7Ko.A0C(C18240wQ.A1Y(Looper.myLooper(), Looper.getMainLooper()));
        if (!this.A00) {
            C110576lv r4 = this.A03;
            PapayaJNI.initialize("ig4a", this.A01, r4.A00, r4.A04, r4.A05, r4.A01.A00());
            C1366783w it = r4.A03.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0o = C18180wK.A0o(it);
                PapayaJNI.registerEngine(C18200wM.A0p(A0o), (IEngineFactory) A0o.getValue());
            }
            PapayaJNI.addLogSink("global_log_sink", r4.A02, this.A04);
            PapayaJNI.setCallback(this.A02);
            this.A00 = true;
        }
    }

    public C112836qH(Context context, ICallback iCallback, C110576lv r4, LogSink logSink) {
        this.A01 = context;
        this.A03 = r4;
        this.A04 = logSink;
        this.A02 = iCallback;
    }
}
