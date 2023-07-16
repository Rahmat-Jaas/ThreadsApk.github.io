package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass7GF;
import X.AnonymousClass7HD;
import X.AnonymousClass7KC;
import X.AnonymousClass7X9;
import X.C02220Ah;
import X.C04220Ms;
import X.C104136bI;
import X.C121167El;
import X.C146708mj;
import X.C146868n0;
import X.C147558pX;
import X.C18240wQ;
import X.C86134wK;
import X.C877353x;
import X.C967466n;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape1S0320000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0320000_I2(int i, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        super(1);
        this.A05 = i;
        this.A04 = z;
        this.A01 = obj;
        this.A03 = z2;
        this.A02 = obj2;
        this.A00 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        Object obj2 = obj;
        if (this.A05 != 0) {
            AnonymousClass7HD r8 = (AnonymousClass7HD) obj2;
            C04220Ms.A0B(r8, 0);
            List A022 = AnonymousClass7GF.A00.A02(r8.A01.A00, 0);
            if (A022.size() < 2) {
                C86134wK.A1L(this.A02, r8);
            } else if (this.A03) {
                AnonymousClass7GF.A02(A022, (AnonymousClass0YY) this.A02, (AnonymousClass0YY) this.A00, false);
            } else if (this.A04) {
                C18240wQ.A1G(this.A01);
            }
        } else {
            C147558pX r82 = (C147558pX) obj2;
            C04220Ms.A0B(r82, 0);
            r82.AIq();
            boolean z2 = this.A04;
            Object obj3 = this.A01;
            boolean z3 = this.A03;
            C04220Ms.A0B(obj3, 0);
            if ((obj3 != C967466n.Ltr || z3) && (obj3 != C967466n.Rtl || !z3)) {
                z = false;
            } else {
                z = true;
            }
            if (!z2 ? z : !z) {
                r82.AIw((C104136bI) this.A00, (C146868n0) this.A02, C877353x.A00, 1.0f, 3, AnonymousClass7KC.A03);
            } else {
                C104136bI r9 = (C104136bI) this.A00;
                long AX0 = r82.AX0();
                C146708mj Ae6 = r82.Ae6();
                AnonymousClass7X9 r4 = (AnonymousClass7X9) Ae6;
                C121167El r5 = r4.A01.A02;
                long A002 = C121167El.A00(r5);
                r4.A00.Cg3(-1.0f, 1.0f, AX0);
                r82.AIw(r9, (C146868n0) this.A02, C877353x.A00, 1.0f, 3, AnonymousClass7KC.A03);
                C146708mj.A00(r5, Ae6, A002);
            }
        }
        return Unit.A00;
    }
}
