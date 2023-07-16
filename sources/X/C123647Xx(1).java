package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7Xx  reason: invalid class name and case insensitive filesystem */
public final class C123647Xx implements C147618pd, C147598pb {
    public final C113626rp A00;
    public final C147608pc A01;
    public final HashMap A02 = AnonymousClass0wJ.A0y();

    public C123647Xx(C113626rp r2, C147608pc r3) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final float Acr() {
        return this.A01.Acr();
    }

    public final float AjK() {
        return this.A01.AjK();
    }

    public final C146098ld BaT(Map map, AnonymousClass0YY r3, int i, int i2) {
        C04220Ms.A0B(r3, 3);
        return this.A01.BaT(map, r3, i, i2);
    }

    public final int CfK(long j) {
        return this.A01.CfK(j);
    }

    public final int CfL(float f) {
        return this.A01.CfL(f);
    }

    public final float CxK(long j) {
        return this.A01.CxK(j);
    }

    public final float CxL(float f) {
        return this.A01.CxL(f);
    }

    public final AnonymousClass69J getLayoutDirection() {
        return this.A01.getLayoutDirection();
    }

    public final List Bg1(long j, int i) {
        HashMap hashMap = this.A02;
        Integer valueOf = Integer.valueOf(i);
        List list = (List) hashMap.get(valueOf);
        ArrayList arrayList = list;
        if (list == null) {
            C113626rp r1 = this.A00;
            Object Aql = ((C147308p8) r1.A01.invoke()).Aql(i);
            List CwO = this.A01.CwO(Aql, r1.A01(Aql, i));
            int size = CwO.size();
            ArrayList A0k = C18240wQ.A0k(size);
            int i2 = 0;
            while (i2 < size) {
                i2 = C147578pZ.A00(A0k, CwO, i2, j);
            }
            hashMap.put(valueOf, A0k);
            arrayList = A0k;
        }
        return arrayList;
    }

    public final float CxD(float f) {
        return this.A01.CxD(f);
    }

    public final float CxE(int i) {
        return this.A01.CxE(i);
    }

    public final long CxF(long j) {
        return this.A01.CxF(j);
    }

    public final long D7K(long j) {
        return this.A01.D7K(j);
    }
}
