package X;

import android.os.Binder;

/* renamed from: X.0FN  reason: invalid class name */
public final class AnonymousClass0FN {
    public final Binder A00;
    public final AnonymousClass0FP A01;

    public final String toString() {
        String interfaceDescriptor;
        String str;
        StringBuilder sb = new StringBuilder("[CurrentHookedData ");
        sb.append("Hooked Binder: ");
        Binder binder = this.A00;
        if (binder == null) {
            interfaceDescriptor = "<Null Binder>";
        } else {
            interfaceDescriptor = binder.getInterfaceDescriptor();
            if (interfaceDescriptor == null) {
                interfaceDescriptor = "<No Interface Desc>";
            }
        }
        sb.append(interfaceDescriptor);
        sb.append("Hooked Data: ");
        AnonymousClass0FP r1 = this.A01;
        if (r1 != null) {
            str = "Have";
        } else {
            str = "Don't have - ";
        }
        sb.append(str);
        sb.append(r1);
        sb.append(" ]");
        return sb.toString();
    }

    public AnonymousClass0FN(Binder binder, long j) {
        AnonymousClass0FP r0;
        this.A00 = binder;
        if (j != 0) {
            r0 = new AnonymousClass0FP(j);
        } else {
            r0 = null;
        }
        this.A01 = r0;
    }
}
