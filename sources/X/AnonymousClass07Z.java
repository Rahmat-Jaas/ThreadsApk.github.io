package X;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.07Z  reason: invalid class name */
public final class AnonymousClass07Z extends AnonymousClass0DW {
    public HashMap A00 = new HashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HashMap hashMap = this.A00;
        HashMap hashMap2 = ((AnonymousClass07Z) obj).A00;
        if (hashMap != null) {
            return hashMap.equals(hashMap2);
        }
        return hashMap2 == null;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r2) {
        this.A00 = ((AnonymousClass07Z) r2).A00;
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r8, AnonymousClass0DW r9) {
        AnonymousClass07Z r82 = (AnonymousClass07Z) r8;
        AnonymousClass07Z r92 = (AnonymousClass07Z) r9;
        if (r92 == null) {
            r92 = new AnonymousClass07Z();
        }
        if (r82 == null) {
            r92.A00 = this.A00;
        } else {
            r92.A00.keySet().retainAll(this.A00.keySet());
            for (Map.Entry entry : this.A00.entrySet()) {
                Object key = entry.getKey();
                Object obj = ((Pair) entry.getValue()).first;
                AnonymousClass09R r3 = (AnonymousClass09R) ((Pair) entry.getValue()).second;
                if (!r92.A00.containsKey(key)) {
                    r92.A00.put(key, new Pair(obj, new AnonymousClass09R()));
                }
                AnonymousClass09R r1 = (AnonymousClass09R) ((Pair) r92.A00.get(key)).second;
                if (r82.A00.containsKey(key)) {
                    r3.A02((AnonymousClass09R) ((Pair) r82.A00.get(key)).second, r1);
                } else {
                    r1.A06(r3);
                }
            }
        }
        return r92;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r6, AnonymousClass0DW r7) {
        AnonymousClass07Z r62 = (AnonymousClass07Z) r6;
        AnonymousClass07Z r72 = (AnonymousClass07Z) r7;
        r72.A00.keySet().retainAll(this.A00.keySet());
        for (Map.Entry entry : this.A00.entrySet()) {
            if (r72.A00.containsKey(entry.getKey())) {
                ((AnonymousClass09R) ((Pair) r72.A00.get(entry.getKey())).second).A06((AnonymousClass09R) ((Pair) entry.getValue()).second);
            } else {
                r72.A00.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : r62.A00.entrySet()) {
            Object key = entry2.getKey();
            if (r72.A00.containsKey(key)) {
                AnonymousClass09R r1 = (AnonymousClass09R) ((Pair) r72.A00.get(key)).second;
                r1.A03((AnonymousClass09R) ((Pair) entry2.getValue()).second, r1);
            } else {
                r72.A00.put(entry2.getKey(), entry2.getValue());
            }
        }
        return r72;
    }

    public final int hashCode() {
        HashMap hashMap = this.A00;
        if (hashMap != null) {
            return hashMap.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AnonymousClass00U.A0V("ThreadCpuMetrics{ ", this.A00.toString(), " }");
    }
}
