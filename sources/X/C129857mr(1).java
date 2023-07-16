package X;

import android.content.Context;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7mr  reason: invalid class name and case insensitive filesystem */
public final class C129857mr implements C145428kU {
    public final GLl A00;
    public final C145428kU A01;
    public final AtomicInteger A02 = new AtomicInteger();

    public static void A00(C129857mr r4, String str, Object... objArr) {
        try {
            r4.A00.A05(String.format("%d: %s", new Object[]{C18200wM.A0c(), String.format(str, objArr)}));
        } catch (IllegalFormatException unused) {
            r4.A00.A05("caught exception when enqueueing");
        }
    }

    public C129857mr(Context context) {
        AnonymousClass8eU r1;
        Context applicationContext = context.getApplicationContext();
        synchronized (AnonymousClass6D9.class) {
            r1 = AnonymousClass6D9.A00;
            if (r1 == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                r1 = new AnonymousClass7mu(new C105126cv(applicationContext2 != null ? applicationContext2 : applicationContext));
                AnonymousClass6D9.A00 = r1;
            }
        }
        C145428kU r2 = (C145428kU) ((AnonymousClass7mu) r1).A00.DBu();
        this.A01 = r2;
        this.A00 = new GLl(30);
        try {
            r2.Ca5(new AnonymousClass7mt(this));
        } catch (RuntimeException e) {
            this.A00.A05(e.toString());
        }
    }

    public final C1202579k AHO(List list) {
        StringBuilder A0r = C18200wM.A0r();
        Iterator it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            String A0k = C18180wK.A0k(it);
            A0r.append(str);
            A0r.append(A0k);
            str = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
        }
        String obj = A0r.toString();
        A00(this, "deferredUninstall: %s", obj);
        C1202579k AHO = this.A01.AHO(list);
        AHO.A02.A00(new C129887my(new C129867mw(this, obj), C103016Xm.A00));
        C1202579k.A00(AHO);
        return AHO;
    }

    public final void Ca5(C148668re r3) {
        A00(this, "registerListener %s", r3.toString());
        this.A01.Ca5(r3);
    }
}
