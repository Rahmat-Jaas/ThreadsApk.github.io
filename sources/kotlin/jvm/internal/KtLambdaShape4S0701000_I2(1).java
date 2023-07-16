package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass7WY;
import X.C02220Ah;
import X.C06750aI;
import X.C103306Yr;
import X.C115716vn;
import X.C145078jn;
import X.C79064jR;
import X.C80214lN;
import X.C86124wJ;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape4S0701000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S0701000_I2(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        super(1);
        this.A08 = i2;
        this.A07 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = obj6;
        this.A06 = obj7;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A08 != 0) {
            C145078jn A0M = C86124wJ.A0M(obj);
            Object obj2 = this.A02;
            Object obj3 = this.A01;
            Object obj4 = this.A03;
            Object obj5 = this.A04;
            Object obj6 = this.A05;
            Object obj7 = this.A06;
            int i = this.A00;
            int i2 = 0;
            for (Object next : (Iterable) ((KtCSuperShape0S0300000_I2) this.A07).A01) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C06750aI.A1A();
                    throw null;
                }
                KtCSuperShape1S0200000_I2_1 ktCSuperShape1S0200000_I2_1 = (KtCSuperShape1S0200000_I2_1) next;
                if (i2 > 0) {
                    A0M.Ba2((Object) null, (Object) null, C103306Yr.A00);
                }
                Object obj8 = ktCSuperShape1S0200000_I2_1.A01;
                if (obj8 != null) {
                    C115716vn.A00(A0M, new KtLambdaShape172S0100000_I2_1(obj8, 6), -343502909);
                }
                List list = (List) ktCSuperShape1S0200000_I2_1.A00;
                C80214lN r1 = C80214lN.A00;
                int i4 = i;
                A0M.Ba5((AnonymousClass0YY) null, new KtLambdaShape46S0200000_I2_7(16, list, r1), AnonymousClass7WY.A01(new KtLambdaShape3S0701000_I2(i4, 2, obj3, obj6, obj7, obj4, list, obj2, obj5), -632812321, true), list.size());
                i2 = i3;
            }
        } else {
            C145078jn A0M2 = C86124wJ.A0M(obj);
            List list2 = (List) this.A05;
            Object obj9 = this.A06;
            Object obj10 = this.A07;
            int i5 = this.A00;
            Object obj11 = this.A03;
            Object obj12 = this.A01;
            Object obj13 = this.A02;
            Object obj14 = this.A04;
            C79064jR r12 = C79064jR.A00;
            A0M2.Ba5((AnonymousClass0YY) null, new KtLambdaShape43S0200000_I2_4(46, r12, list2), AnonymousClass7WY.A01(new KtLambdaShape3S0701000_I2(i5, 1, list2, obj9, obj10, obj11, obj12, obj13, obj14), -632812321, true), list2.size());
        }
        return Unit.A00;
    }
}
