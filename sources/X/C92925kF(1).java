package X;

import android.text.TextUtils;
import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.redex.IDxObserverShape3S1600000_2_I2;
import com.fbpay.logging.FBPayLoggerData;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5kF  reason: invalid class name and case insensitive filesystem */
public final class C92925kF extends C129017kq {
    public final C1197276p A00;
    public final C104996ci A01;
    public final C120977Dl A02;
    public final AtomicReference A03 = new AtomicReference();

    public C92925kF(C1197276p r25, C104996ci r26, C120977Dl r27) {
        C143688h9 r4;
        String verifyCerts;
        this.A01 = r26;
        this.A02 = r27;
        this.A00 = r25;
        C1197276p r14 = this.A00;
        C120977Dl r0 = this.A02;
        Object obj = r0.A02;
        String str = r0.A03;
        Set<C120967Dk> set = r0.A08;
        HashSet A0u = C18200wM.A0u();
        for (C120967Dk r02 : set) {
            A0u.add(r02.A05);
        }
        C105016ck r15 = new C105016ck(this);
        Executor executor = this.A01.A00.A02;
        str.getClass();
        AnonymousClass5k3 r3 = r14.A01;
        AnonymousClass7Kx A0R = C86104wH.A0R(r3.A03());
        boolean z = AnonymousClass7Kz.A0B().A01;
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (z) {
            r4 = AnonymousClass7Kz.A07().A07;
            A0y.put(AnonymousClass7C5.A00(21, 10, 59), C122037Js.A01());
            A0y.put("flow_name", AnonymousClass6BP.A0F.toString());
            A0y.put("logger_data", new FBPayLoggerData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, C18200wM.A0u()));
            r4.Bb8("client_load_paysec_init", A0y);
        } else {
            r4 = null;
        }
        if (AnonymousClass7Kx.A0R(A0R)) {
            A0R.getClass();
            C107426gj r03 = (C107426gj) AnonymousClass7Kx.A0D(A0R);
            X509Certificate x509Certificate = r03.A00;
            if (x509Certificate == null) {
                List list = r03.A01;
                synchronized (r3) {
                    verifyCerts = !r3.A02 ? r3.A01.verifyCerts(list) : "";
                }
                if (!TextUtils.isEmpty(verifyCerts)) {
                    if (z && r4 != null) {
                        A0y.put("error_message", "FBPay Certificate Error: ".concat(verifyCerts));
                        A0y.put(TraceFieldType.ErrorCode, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                        A0y.put("error_stacktrace", Log.getStackTraceString(C18250wR.A0V("certificate error")));
                        r4.Bb8("client_load_paysec_fail", A0y);
                    }
                    r3.A00 = r3.A00;
                    C1202479j.A02(r3.A03.A00, r3);
                    M5J A0H = C86114wI.A0H(r3.A03(), r3, 29);
                    A0H.A0E(new IDxObserverShape3S1600000_2_I2(obj, executor, A0u, A0H, r14, r15, str, 1));
                }
            } else if (new Date(System.currentTimeMillis() + 3600000).after(x509Certificate.getNotAfter())) {
                r3.A00 = r3.A00;
                C1202479j.A02(r3.A03.A00, r3);
            }
        }
        if (z && r4 != null) {
            r4.Bb8("client_load_paysec_success", A0y);
        }
        M5J A0H2 = C86114wI.A0H(r3.A03(), r3, 29);
        A0H2.A0E(new IDxObserverShape3S1600000_2_I2(obj, executor, A0u, A0H2, r14, r15, str, 1));
    }

    public final void A6o(C143718hC r2) {
        super.A6o(r2);
        Object obj = this.A03.get();
        if (obj != null) {
            r2.CRe(obj);
        }
    }
}
