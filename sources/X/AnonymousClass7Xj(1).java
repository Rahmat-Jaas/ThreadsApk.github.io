package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;

/* renamed from: X.7Xj  reason: invalid class name */
public final class AnonymousClass7Xj implements C146288ly {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C113196qu A01;
    public final /* synthetic */ C146978nB A02;
    public final /* synthetic */ AnonymousClass7HD A03;
    public final /* synthetic */ C147168nV A04;
    public final /* synthetic */ AnonymousClass0YY A05;

    public final /* synthetic */ int Bf9(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A00(r2, this, list, i);
    }

    public final int BfC(C147838q0 r4, List list, int i) {
        C04220Ms.A0B(r4, 0);
        C113196qu r2 = this.A01;
        r2.A00.A01(r4.getLayoutDirection());
        C123717Yf r0 = r2.A00.A00;
        if (r0 != null) {
            return AnonymousClass8bA.A01(r0.Atb());
        }
        throw C18180wK.A0a("layoutIntrinsics must be called first");
    }

    public final C146098ld Bg2(C147618pd r10, List list, long j) {
        Snapshot A052;
        AnonymousClass7AW r8;
        int i;
        C04220Ms.A0B(r10, 0);
        C113196qu r6 = this.A01;
        Snapshot A022 = C121637Hc.A02();
        try {
            A052 = A022.A05();
            C147368pE r2 = r6.A0A;
            C121457Gf r0 = (C121457Gf) r2.getValue();
            if (r0 != null) {
                r8 = r0.A02;
            } else {
                r8 = null;
            }
            C86144wL.A1N(A052);
            A022.A0A();
            C114016sY r1 = r6.A00;
            AnonymousClass69J layoutDirection = r10.getLayoutDirection();
            AnonymousClass0wJ.A1M(r1, 0, layoutDirection);
            AnonymousClass7AW A002 = r1.A00(r8, layoutDirection, j);
            long j2 = A002.A02;
            int A07 = C86104wH.A07(j2);
            int A08 = C86104wH.A08(j2);
            if (!C04220Ms.A0I(r8, A002)) {
                r2.CrC(new C121457Gf(A002));
                r6.A05 = false;
                this.A05.invoke(A002);
                AnonymousClass7JQ.A03(r6, this.A02, this.A03);
            }
            C147168nV r22 = this.A04;
            if (this.A00 == 1) {
                i = AnonymousClass8bA.A01(A002.A01(0));
            } else {
                i = 0;
            }
            r6.A0B.CrC(C134847yT.A00(r22.CxE(i)));
            return r10.BaT(AnonymousClass4WJ.A0G(C18180wK.A0p(AnonymousClass6ZP.A00, Integer.valueOf(AnonymousClass8bA.A02(A002.A00))), C18180wK.A0p(AnonymousClass6ZP.A01, Integer.valueOf(AnonymousClass8bA.A02(A002.A01)))), C77824hR.A00, A07, A08);
        } catch (Throwable th) {
            A022.A0A();
            throw th;
        }
    }

    public final /* synthetic */ int BgK(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A02(r2, this, list, i);
    }

    public final /* synthetic */ int BgN(C147838q0 r2, List list, int i) {
        return AnonymousClass7FP.A03(r2, this, list, i);
    }

    public AnonymousClass7Xj(C113196qu r1, C146978nB r2, AnonymousClass7HD r3, C147168nV r4, AnonymousClass0YY r5, int i) {
        this.A01 = r1;
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        this.A00 = i;
    }
}
