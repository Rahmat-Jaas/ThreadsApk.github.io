package X;

import com.facebook.profilo.core.TriggerRegistry;
import java.util.Arrays;
import java.util.Random;

/* renamed from: X.0Jd  reason: invalid class name and case insensitive filesystem */
public final class C03530Jd extends C07890cN implements C05610Ul {
    public static final int A01;
    public Random A00 = new Random();

    public final boolean A03() {
        return true;
    }

    public final boolean A04(Object obj, Object obj2, long j, long j2) {
        return j == j2;
    }

    static {
        C05630Un r1 = TriggerRegistry.A00;
        A01 = r1.A02("qpl");
        r1.A02("sequence_qpl");
    }

    public final /* bridge */ /* synthetic */ Object A05(AnonymousClass0UJ r11) {
        int[] traceConfigIdxs = r11.getTraceConfigIdxs("qpl", "start");
        C05510Ua r7 = new C05510Ua();
        int i = 0;
        int length = traceConfigIdxs.length;
        AnonymousClass0UZ[] r2 = new AnonymousClass0UZ[length];
        r7.A01 = r2;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = traceConfigIdxs[i2];
            AnonymousClass0UZ r1 = new AnonymousClass0UZ();
            r1.A02 = i3;
            r1.A01 = r11.getTraceConfigTriggerParamInt(i3, "qpl", "start", "trigger.qpl.marker");
            r1.A00 = r11.getTraceConfigParamInt(i3, "trace_config.coinflip_sample_rate");
            r2 = r7.A01;
            r2[i2] = r1;
        }
        Arrays.sort(r2, AnonymousClass0UZ.A03);
        AnonymousClass0UZ[] r5 = r7.A01;
        int length2 = r5.length;
        int[] iArr = new int[length2];
        r7.A00 = iArr;
        int i4 = 0;
        while (i < length2) {
            iArr[i4] = r5[i].A01;
            i++;
            i4++;
        }
        return r7;
    }

    public final int A00(AnonymousClass0UJ r4, Object obj, long j) {
        C05510Ua r2 = (C05510Ua) A06(r4);
        int binarySearch = Arrays.binarySearch(r2.A00, (int) j);
        if (binarySearch < 0) {
            return -100;
        }
        AnonymousClass0UZ r22 = r2.A01[binarySearch];
        int i = r22.A00;
        if (i == 1 || this.A00.nextInt(i) == 0) {
            return r22.A02;
        }
        return -101;
    }
}
