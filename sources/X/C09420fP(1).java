package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

/* renamed from: X.0fP  reason: invalid class name and case insensitive filesystem */
public final class C09420fP extends AnonymousClass0W5 {
    public boolean A00;
    public final C03720Kl A01;

    public static void A00(AnonymousClass0WA r22, C05800Wc r23, C09420fP r24, int i) {
        long A02;
        AnonymousClass0Wg[] r8;
        long j;
        C05800Wc r6 = r23;
        AnonymousClass0WO B1h = r6.B1h();
        C09420fP r5 = r24;
        if (B1h == null) {
            A02 = r5.A02(r6.getMarkerId(), r6.Ait());
        } else {
            A02 = r5.A02(B1h.A00, r6.Ait()) | r5.A02(B1h.A01, r6.Ait());
        }
        if (A02 != 0 && (r8 = r5.A02) != null) {
            long j2 = 1;
            int i2 = 0;
            boolean z = false;
            if (r5.A00) {
                z = true;
            }
            AnonymousClass0WA r9 = r22;
            if (r22 == null) {
                j = 0;
            } else {
                j = r5.A01.nowNanos();
            }
            while (i2 < r8.length) {
                if ((A02 & j2) != 0) {
                    int i3 = i;
                    if (z) {
                        String str = "QuickEventListenersList::notify [%s %d %d]";
                        try {
                            String name = r8[i2].getName();
                            Integer valueOf = Integer.valueOf(r6.getMarkerId());
                            Integer valueOf2 = Integer.valueOf(i3);
                            if (TraceEvents.isEnabled(ExternalProviders.A07.A01)) {
                                C13780oI.A02(StringFormatUtil.formatStrLocaleSafe(str, name, valueOf, valueOf2), -2133951513);
                            } else if (Systrace.A0F(32)) {
                                str = StringFormatUtil.formatStrLocaleSafe(str, name, valueOf, valueOf2);
                                Systrace.A03(32, str);
                            }
                        } catch (IllegalFormatException e) {
                            AnonymousClass0LU.A0I("Tracer", "Bad format string", e);
                        } catch (Throwable th) {
                            if (z) {
                                C13780oI.A00(-1037984516);
                            }
                            throw th;
                        }
                    }
                    r6.Cok(i2);
                    if (i3 == 1) {
                        r8[i2].onMarkerStart(r6);
                    } else if (i3 == 2) {
                        r8[i2].onMarkerStop(r6);
                    } else if (i3 != 3) {
                        r8[i2].onMarkerDrop(r6);
                    } else {
                        r8[i2].onMarkerRestart(r6);
                    }
                    if (r22 != null) {
                        long nowNanos = r5.A01.nowNanos();
                        r9.A00(r8[i2].getName(), nowNanos - j);
                        j = nowNanos;
                    }
                    if (z) {
                        C13780oI.A00(-1670938798);
                    }
                }
                i2++;
                j2 <<= 1;
            }
        }
    }

    public C09420fP(C03720Kl r2, AnonymousClass0e1 r3, C12020lB r4, C12440lu r5, AnonymousClass0Wg[] r6) {
        super(r4, r5, r6);
        this.A01 = r2;
        this.A00 = r3 != null ? false : true;
    }

    public final int A03(AnonymousClass0Wg r2) {
        C05820We listenerFlags = r2.getListenerFlags();
        if (listenerFlags == null) {
            return 0;
        }
        return listenerFlags.A00;
    }

    public final int[] A04(AnonymousClass0Wg r2) {
        C05830Wf listenerMarkers = r2.getListenerMarkers();
        if (listenerMarkers == null) {
            return null;
        }
        return listenerMarkers.A00;
    }
}
