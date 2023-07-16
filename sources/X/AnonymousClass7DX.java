package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/* renamed from: X.7DX  reason: invalid class name */
public class AnonymousClass7DX {
    public final HashMap A00;
    public final Set A01;
    public final Collection A02;
    public final Set A03;

    public static C147108nP A00(AnonymousClass7DX r1, Object obj) {
        C04220Ms.A0B(obj, 0);
        return (C147108nP) r1.A00.get(obj);
    }

    public AnonymousClass7DX(HashMap hashMap) {
        this.A00 = hashMap;
        Set keySet = hashMap.keySet();
        C04220Ms.A06(keySet);
        this.A01 = keySet;
        Set entrySet = hashMap.entrySet();
        C04220Ms.A06(entrySet);
        this.A03 = entrySet;
        Collection values = hashMap.values();
        C04220Ms.A06(values);
        this.A02 = values;
    }

    public AnonymousClass7DX() {
        this(AnonymousClass0wJ.A0y());
    }
}
