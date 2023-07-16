package X;

import java.util.List;

/* renamed from: X.7sm  reason: invalid class name and case insensitive filesystem */
public final class C131767sm implements C41882MfV {
    public final List A00;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return Integer.valueOf(this.A00.hashCode());
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C131767sm r3 = (C131767sm) obj;
        C04220Ms.A0B(r3, 0);
        return C04220Ms.A0I(this.A00, r3.A00);
    }

    public C131767sm(List list) {
        this.A00 = list;
    }
}
