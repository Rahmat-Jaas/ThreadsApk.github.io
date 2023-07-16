package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0mI  reason: invalid class name and case insensitive filesystem */
public final class C12670mI implements AnonymousClass0gW {
    public AnonymousClass0k8 A00;
    public final List A01;
    public final BlockingQueue A02 = new SynchronousQueue();
    public final Executor A03;
    public final List A04 = Collections.synchronizedList(new ArrayList());

    public C12670mI(AnonymousClass0gM r21) {
        AnonymousClass0g3 r5;
        IllegalArgumentException illegalArgumentException;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.A01 = synchronizedList;
        AnonymousClass0gM r2 = r21;
        AnonymousClass0gK r7 = new AnonymousClass0gK(r2.A02);
        try {
            r5 = new AnonymousClass0g3(this.A02, r7, TimeUnit.SECONDS, r2.A01, (long) r2.A00);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Incompatible parameters: (");
            sb.append(r2.A01);
            sb.append(", ");
            sb.append(128);
            sb.append(", ");
            sb.append(r2.A00);
            sb.append(", ");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            sb.append(timeUnit);
            sb.append(", ...)");
            C10450iM.A06("IgExecutor:MonitoredThreadPool", sb.toString(), e);
            r5 = new AnonymousClass0g3(this.A02, r7, timeUnit, 5, (long) 1);
        }
        this.A03 = r5;
        int A05 = C09410fN.A02().A05();
        String str = r2.A04;
        int[][] iArr = AnonymousClass0k8.A05;
        if (str != null && !str.isEmpty()) {
            try {
                int[] iArr2 = new int[5];
                int[] iArr3 = new int[5];
                String trim = str.trim();
                try {
                    int i = -1;
                    for (String split : trim.split("/")) {
                        String[] split2 = split.split(":");
                        int parseInt = Integer.parseInt(split2[0]);
                        if (parseInt <= A05 && parseInt > i) {
                            String[] split3 = split2[1].split(";");
                            String[] split4 = split3[0].split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                            String[] split5 = split3[1].split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                            int i2 = 0;
                            do {
                                iArr2[i2] = Integer.parseInt(split4[i2]);
                                iArr3[i2] = Integer.parseInt(split5[i2]);
                                i2++;
                            } while (i2 < 5);
                            i = parseInt;
                        }
                    }
                    iArr = new int[][]{iArr2, iArr3};
                } catch (IndexOutOfBoundsException unused) {
                    illegalArgumentException = new IllegalArgumentException(AnonymousClass00U.A0L("The format of TaskAndThreadManagerSpec is malformed: ", trim));
                    throw illegalArgumentException;
                } catch (NumberFormatException unused2) {
                    illegalArgumentException = new IllegalArgumentException(AnonymousClass00U.A0L("The values of TaskAndThreadManagerSpec are malformed: ", trim));
                    throw illegalArgumentException;
                }
            } catch (IllegalArgumentException unused3) {
            }
        }
        this.A00 = new AnonymousClass0k8(r2, synchronizedList, iArr[0], iArr[1]);
    }

    public final void AKo(AnonymousClass0gJ r2) {
        AKp(r2.A00);
    }

    public final void AKp(AnonymousClass0gG r8) {
        AnonymousClass0k2 r1 = AnonymousClass0g5.A00;
        if (r1 != null && !r8.isSendToNetworkThreadPool()) {
            r1.A02(r8);
        }
        AnonymousClass0gG A002 = C09690fw.A00(r8);
        if (A002.isSendToNetworkThreadPool()) {
            this.A03.execute(AnonymousClass0S9.A00(A002, "Fury", 1));
            return;
        }
        List<AnonymousClass0gF> list = this.A01;
        if (!list.isEmpty()) {
            for (AnonymousClass0gF onAddTask : list) {
                onAddTask.onAddTask(A002, this.A00.A00());
            }
        }
        C05190Ru A022 = C07650br.A02("Fury", 1);
        A022.close();
        A002.setFuryContext(A022);
        AnonymousClass0k8 r12 = this.A00;
        List list2 = r12.A00;
        ((AbstractCollection) list2.get(A002.getPriority() - 1)).add(A002);
        r12.A01(list2, r12.A01, r12.A02, r12.A03, -1);
    }
}
