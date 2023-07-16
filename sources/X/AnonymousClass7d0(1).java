package X;

import java.util.List;

/* renamed from: X.7d0  reason: invalid class name */
public final class AnonymousClass7d0 implements C143248gM {
    public final /* synthetic */ C121507Gm A00;

    public AnonymousClass7d0(C121507Gm r1) {
        this.A00 = r1;
    }

    public final void CS2(String str) {
        List<C143248gM> list = this.A00.A0C;
        synchronized (list) {
            for (C143248gM CS2 : list) {
                CS2.CS2(str);
            }
        }
    }
}
