package X;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: X.84S  reason: invalid class name */
public final class AnonymousClass84S implements Map.Entry, AnonymousClass0WV {
    public Object A00;
    public final Object A01;
    public final /* synthetic */ AnonymousClass53O A02;

    public AnonymousClass84S(AnonymousClass53O r2) {
        this.A02 = r2;
        Map.Entry entry = r2.A01;
        C04220Ms.A0A(entry);
        this.A01 = entry.getKey();
        Map.Entry entry2 = r2.A01;
        C04220Ms.A0A(entry2);
        this.A00 = entry2.getValue();
    }

    public final Object getKey() {
        return this.A01;
    }

    public final Object getValue() {
        return this.A00;
    }

    public final Object setValue(Object obj) {
        AnonymousClass53O r3 = this.A02;
        AnonymousClass84T r2 = r3.A03;
        if (r2.A00().A00 == r3.A00) {
            Object value = getValue();
            r2.put(getKey(), obj);
            this.A00 = obj;
            return value;
        }
        throw new ConcurrentModificationException();
    }
}
