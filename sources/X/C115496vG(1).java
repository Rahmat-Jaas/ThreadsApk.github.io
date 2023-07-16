package X;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: X.6vG  reason: invalid class name and case insensitive filesystem */
public final class C115496vG {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final AnonymousClass6FY A06 = new AnonymousClass6FY();
    public final HashMap A07;
    public final LinkedHashSet A08;

    public final int A00() {
        int i;
        synchronized (this.A06) {
            i = this.A01;
        }
        return i;
    }

    public final Object A01(Object obj) {
        synchronized (this.A06) {
            Object obj2 = this.A07.get(obj);
            if (obj2 != null) {
                LinkedHashSet linkedHashSet = this.A08;
                linkedHashSet.remove(obj);
                linkedHashSet.add(obj);
                this.A02++;
                return obj2;
            }
            this.A04++;
            return null;
        }
    }

    public final void A02(Object obj, Object obj2) {
        HashMap hashMap;
        LinkedHashSet linkedHashSet;
        IllegalStateException illegalStateException;
        Object obj3;
        Object obj4;
        if (obj == null || obj2 == null) {
            throw null;
        }
        AnonymousClass6FY r3 = this.A06;
        synchronized (r3) {
            this.A05++;
            this.A01 = A00() + 1;
            hashMap = this.A07;
            if (hashMap.put(obj, obj2) != null) {
                this.A01 = A00() - 1;
            }
            linkedHashSet = this.A08;
            if (linkedHashSet.contains(obj)) {
                linkedHashSet.remove(obj);
            }
            linkedHashSet.add(obj);
        }
        int i = this.A03;
        while (true) {
            synchronized (r3) {
                if (A00() >= 0 && ((!hashMap.isEmpty() || A00() == 0) && hashMap.isEmpty() == linkedHashSet.isEmpty())) {
                    obj3 = null;
                    if (A00() > i && !hashMap.isEmpty()) {
                        obj3 = AnonymousClass00J.A07(linkedHashSet);
                        obj4 = hashMap.get(obj3);
                        if (obj4 == null) {
                            illegalStateException = C18180wK.A0a("inconsistent state");
                            break;
                        }
                        C03940Lk.A02(hashMap).remove(obj3);
                        C03940Lk.A00(linkedHashSet).remove(obj3);
                        int A002 = A00();
                        C04220Ms.A0A(obj3);
                        this.A01 = A002 - 1;
                        this.A00++;
                    } else {
                        obj4 = null;
                    }
                }
            }
            if (obj3 != null || obj4 != null) {
                C04220Ms.A0A(obj3);
                C04220Ms.A0A(obj4);
            } else {
                return;
            }
        }
        illegalStateException = C18180wK.A0a("map/keySet size inconsistency");
        throw illegalStateException;
    }

    public final String toString() {
        int i;
        String obj;
        synchronized (this.A06) {
            int i2 = this.A02;
            int i3 = this.A04;
            int i4 = i3 + i2;
            if (i4 != 0) {
                i = (i2 * 100) / i4;
            } else {
                i = 0;
            }
            StringBuilder A0r = C18200wM.A0r();
            A0r.append("LruCache[maxSize=");
            A0r.append(this.A03);
            A0r.append(",hits=");
            A0r.append(i2);
            A0r.append(",misses=");
            A0r.append(i3);
            A0r.append(",hitRate=");
            A0r.append(i);
            A0r.append("%]");
            obj = A0r.toString();
        }
        return obj;
    }

    public C115496vG(int i) {
        this.A03 = i;
        this.A07 = new HashMap(0, 0.75f);
        this.A08 = C86134wK.A0u();
    }
}
