package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass6FK;
import X.AnonymousClass7DE;
import X.AnonymousClass7I9;
import X.AnonymousClass7JT;
import X.AnonymousClass7V4;
import X.AnonymousClass8cN;
import X.C02220Ah;
import X.C04220Ms;
import X.C114236su;
import X.C121117Ee;
import X.C121807If;
import X.C123707Ye;
import X.C134817yQ;
import X.C143058g2;
import X.C143078g4;
import X.C146378m9;
import X.C147168nV;
import X.C147188nY;
import X.C147278p5;
import X.C147368pE;
import X.C78174i0;
import X.C86154wM;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape6S1200000_I2 extends C02220Ah implements AnonymousClass0YM {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape6S1200000_I2(Object obj, Object obj2, String str, int i) {
        super(3);
        this.A03 = i;
        this.A02 = str;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Object obj4 = obj2;
        Object obj5 = obj;
        if (this.A03 != 0) {
            C147278p5 r7 = (C147278p5) obj5;
            C147188nY r8 = (C147188nY) obj4;
            int A04 = AnonymousClass0wJ.A04(obj3);
            C04220Ms.A0B(r7, 0);
            if ((A04 & 14) == 0) {
                i = C147188nY.A0F(r8, r7) | A04;
            } else {
                i = A04;
            }
            if ((i & 91) != 18 || !r8.BCM()) {
                long A022 = AnonymousClass7JT.A02(0, Constraints.A02(((AnonymousClass7V4) r7).A00), 0, Integer.MAX_VALUE);
                String str = this.A02;
                C121807If r10 = (C121807If) this.A00;
                C143058g2 A002 = AnonymousClass6FK.A00(r10, (C143078g4) r8.AEA(AnonymousClass7DE.A04), (C147168nV) r8.AEA(AnonymousClass7DE.A02), str, (List) null, 2, 352, A022);
                C147368pE r2 = (C147368pE) this.A01;
                int i2 = ((C123707Ye) A002).A01.A04;
                boolean z = true;
                if (i2 <= 1) {
                    z = false;
                }
                C147368pE.A04(r2, z);
                AnonymousClass7I9.A02(r8, (Modifier) null, r10, (C114236su) null, (C134817yQ) null, (C121117Ee) null, str, 0, 2, 2, 805306368, 6, 510, 0, 0, false);
            } else {
                r8.CuJ();
            }
            return Unit.A00;
        }
        int A1Y = AnonymousClass0wJ.A1Y(obj5, obj4);
        String str2 = this.A02;
        Collection<AnonymousClass0YY> collection = (Collection) this.A00;
        AnonymousClass0YY[] r1 = (AnonymousClass0YY[]) collection.toArray(new AnonymousClass0YY[A1Y]);
        Object[] copyOf = Arrays.copyOf(r1, r1.length);
        C04220Ms.A0B(copyOf, A1Y);
        AnonymousClass8cN r6 = new AnonymousClass8cN(str2, (C146378m9) ((AnonymousClass0YM) this.A01).invoke(obj5, obj4, new KtLambdaShape166S0100000_I2_21(copyOf, 46)));
        AnonymousClass0YY r3 = r6.A00;
        r6.CkG(C78174i0.A00);
        ArrayList A0w = AnonymousClass0wJ.A0w(collection);
        for (AnonymousClass0YY invoke : collection) {
            A0w.add(invoke.invoke(r6));
        }
        r6.CkG(C86154wM.A0y(A0w, r6, r3, 32));
        return r6;
    }
}
