package X;

import java.util.List;

/* renamed from: X.42r  reason: invalid class name and case insensitive filesystem */
public final class C681942r implements C83414rL {
    public final /* synthetic */ C83414rL A00;
    public final /* synthetic */ C58343Fc A01;

    public final void CNk(C22001Sz r5) {
        C04220Ms.A0B(r5, 0);
        C58343Fc r2 = this.A01;
        boolean z = true;
        r2.A02 = true;
        String str = r5.A00;
        if (str == null) {
            str = "";
        }
        r2.A00 = str;
        List list = r5.A01;
        if (list == null || list.isEmpty()) {
            z = false;
        }
        r2.A03 = z;
        r2.A01 = false;
        this.A00.CNk(r5);
    }

    public C681942r(C83414rL r1, C58343Fc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void CNj() {
        C58343Fc r1 = this.A01;
        r1.A02 = true;
        r1.A01 = true;
        this.A00.CNj();
    }
}
