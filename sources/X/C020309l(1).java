package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* renamed from: X.09l  reason: invalid class name and case insensitive filesystem */
public final class C020309l implements Runnable {
    public final /* synthetic */ C13080my A00;
    public final /* synthetic */ C17260ub A01;

    public C020309l(C13080my r1, C17260ub r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        int i;
        C17630vH r2;
        String str;
        C13120n3 r9;
        long j;
        long j2;
        C13080my r0 = this.A00;
        C000200d r6 = r0.A01;
        if (r6.A0s == r0.A00) {
            C09740gb r13 = C12730mO.A00;
            C17260ub r11 = this.A01;
            C17320uh r1 = r11.A00;
            switch (r1.A03.ordinal()) {
                case 2:
                    if (r1.A02 == 1) {
                        r6.A09();
                        break;
                    }
                    break;
                case 3:
                case 8:
                case 10:
                    i = ((C17310ug) r11.A02).A00;
                    break;
                case 11:
                    r6.A09();
                    if (r6.A07.A00 && (r2 = r6.A0s) != null && r2.A0Y == AnonymousClass006.A0C) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - r2.A0V;
                        AnonymousClass0Lp r22 = r6.A0D;
                        try {
                            str = C03960Lr.A00((C03920Li) null, (C03100Ei) null, (C03090Eh) null, AnonymousClass0Lp.A00(r22), (C03070Ef) r22.A05(C03070Ef.class), AnonymousClass0Lp.A01(r22, elapsedRealtime), (C03020Ea) null, (AnonymousClass0EX) null, false, true).toString();
                        } catch (JSONException unused) {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                r6.A04((C17550v8) null, AnonymousClass006.A00, "/mqtt_health_stats", str.getBytes("UTF-8"));
                                break;
                            } catch (UnsupportedEncodingException unused2) {
                                throw new RuntimeException("UTF-8 not supported");
                            } catch (C17450uv unused3) {
                                break;
                            }
                        }
                    }
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    i = -1;
                    break;
            }
            Integer valueOf = Integer.valueOf(i);
            valueOf.getClass();
            r13 = new C12760mR(valueOf);
            if (r13.A01()) {
                r13.A00();
                C07050ao r10 = r6.A0O;
                Number number = (Number) r13.A00();
                int intValue = number.intValue();
                Map map = r10.A03;
                synchronized (map) {
                    r9 = (C13120n3) map.remove(number);
                }
                if (r9 != null) {
                    if (r9.A07 != null) {
                        r9.A07.onSuccess(r9.A01);
                    }
                    if (r9.A06 != null) {
                        r9.A06.cancel(false);
                    }
                    SystemClock.elapsedRealtime();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - r9.A02;
                    if (r9.A04.equals(C17290ue.PUBACK)) {
                        AtomicLong atomicLong = (AtomicLong) ((C12880me) r10.A01.A05(C03070Ef.class)).A00(C12930mj.PublishAcknowledgementMs);
                        if (elapsedRealtime2 > 0) {
                            do {
                                j = atomicLong.get();
                                if (j == 0) {
                                    j2 = elapsedRealtime2;
                                } else {
                                    j2 = (long) ((((double) j) * 0.8d) + (((double) elapsedRealtime2) * 0.2d));
                                }
                            } while (!atomicLong.compareAndSet(j, j2));
                        }
                    }
                    int i2 = r9.A01;
                    long j3 = r9.A03.A0V;
                    r10.A00.A04(r9.A05, 1, intValue, i2, elapsedRealtime2, j3);
                }
                r13.A00();
            }
            r6.A0M.C7N(r11);
        }
    }
}
