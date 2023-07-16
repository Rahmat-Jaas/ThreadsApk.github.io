package X;

import java.util.List;

/* renamed from: X.7cw  reason: invalid class name and case insensitive filesystem */
public final class C125317cw implements C143228gK {
    public final /* synthetic */ C121507Gm A00;

    public C125317cw(C121507Gm r1) {
        this.A00 = r1;
    }

    public final void C9y(C91225fq r4, String str) {
        List<C143228gK> list = this.A00.A0B;
        synchronized (list) {
            for (C143228gK C9y : list) {
                C9y.C9y(r4, str);
            }
        }
    }
}
