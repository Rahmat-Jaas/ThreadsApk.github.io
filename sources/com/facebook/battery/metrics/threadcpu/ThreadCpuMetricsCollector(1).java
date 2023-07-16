package com.facebook.battery.metrics.threadcpu;

import X.AnonymousClass00U;
import X.AnonymousClass07Z;
import X.AnonymousClass09R;
import X.AnonymousClass0DW;
import X.AnonymousClass0DX;
import X.C113536ra;
import X.C116156wW;
import android.util.Log;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

public final class ThreadCpuMetricsCollector extends AnonymousClass0DX {
    public static AnonymousClass09R A00(C113536ra r3) {
        AnonymousClass09R r2 = new AnonymousClass09R();
        r2.A03 = r3.A01();
        r2.A02 = r3.A00();
        return r2;
    }

    public static final boolean A01(AnonymousClass07Z r7) {
        if (r7 != null) {
            Map A00 = C116156wW.A00();
            if (A00 == null) {
                return false;
            }
            r7.A00.keySet().retainAll(A00.keySet());
            for (Map.Entry entry : A00.entrySet()) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getKey());
                    Object obj = ((Pair) entry.getValue()).first;
                    AnonymousClass09R A002 = A00((C113536ra) ((Pair) entry.getValue()).second);
                    HashMap hashMap = r7.A00;
                    Integer valueOf = Integer.valueOf(parseInt);
                    if (hashMap.containsKey(valueOf)) {
                        ((AnonymousClass09R) ((Pair) r7.A00.get(valueOf)).second).A06(A002);
                    } else {
                        r7.A00.put(valueOf, new Pair(obj, A002));
                    }
                } catch (NumberFormatException e) {
                    Log.e("com.facebook.battery.metrics.threadcpu.ThreadCpuMetricsCollector", AnonymousClass00U.A0L("Thread Id is not an integer: ", (String) entry.getKey()), e);
                }
            }
            return true;
        }
        throw new IllegalArgumentException("Null value passed to getSnapshot!");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03() {
        return new AnonymousClass07Z();
    }

    public final /* bridge */ /* synthetic */ boolean A04(AnonymousClass0DW r2) {
        return A01((AnonymousClass07Z) r2);
    }
}
