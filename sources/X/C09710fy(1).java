package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.0fy  reason: invalid class name and case insensitive filesystem */
public final class C09710fy extends Thread {
    public int A00 = 500;
    public boolean A01 = false;
    public final List A02 = Collections.synchronizedList(new ArrayList());
    public final Map A03 = new HashMap();

    /* JADX INFO: finally extract failed */
    public final void run() {
        String str;
        if (!this.A01) {
            while (true) {
                List list = this.A02;
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        try {
                            AnonymousClass0g0 r2 = (AnonymousClass0g0) list.get(size);
                            Map map = this.A03;
                            Object obj = map.get(r2);
                            AnonymousClass0gG r5 = r2.A06;
                            if (obj != r5 || obj == null) {
                                map.put(r2, r5);
                            } else {
                                try {
                                    boolean z = !r2.A01;
                                    r2.A01 = true;
                                    if (z) {
                                        int i = this.A00;
                                        AnonymousClass0IB A002 = C10450iM.A00();
                                        A002.CYW("stuck_runnable_id", String.valueOf(r5.getRunnableId()));
                                        A002.CYW("stuck_thread_timeout", String.valueOf(i));
                                        A002.CuX("IG_EXECUTOR_STUCK_SIMPLE_WORKER", String.format(Locale.ENGLISH, "Background task stuck: runnableId=%d timeoutMs=%d", new Object[]{Integer.valueOf(r5.getRunnableId()), Integer.valueOf(i)}), 100000);
                                        for (AnonymousClass0gF onStuckTask : ((C12670mI) AnonymousClass0gN.A00()).A01) {
                                            onStuckTask.onStuckTask(r5, r2);
                                        }
                                        AnonymousClass0g0 r7 = new AnonymousClass0g0(r2.A04, r2.A00, r2.A03, r2.A02, r2.A05);
                                        r7.start();
                                        list.add(r7);
                                        AnonymousClass0k2 r72 = AnonymousClass0g5.A00;
                                        if (r72 != null) {
                                            AnonymousClass0gN.A00().AKp(new AnonymousClass0k6(r72, new Long((long) r5.getRunnableId())));
                                        }
                                    }
                                    list.remove(r2);
                                    map.remove(r2);
                                } catch (OutOfMemoryError e) {
                                    e = e;
                                    r2.A01 = false;
                                    str = "OOM when creating a new SimpleWorker";
                                    C10450iM.A07(str, e);
                                } catch (Throwable th) {
                                    r2.A01 = true;
                                    throw th;
                                }
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                            str = "IgExecutorV2";
                            C10450iM.A07(str, e);
                        }
                    } else {
                        try {
                            break;
                        } catch (InterruptedException e3) {
                            C10450iM.A07("IG_EXECUTOR_STUCK_SIMPLE_WORKER", e3);
                            return;
                        }
                    }
                }
                Thread.sleep((long) this.A00);
            }
        }
    }

    public C09710fy(AnonymousClass0gM r2) {
        setName("IgExecutorSimpleMonitor");
        if (r2.A05) {
            this.A00 = r2.A03;
            this.A01 = r2.A07;
        }
    }
}
