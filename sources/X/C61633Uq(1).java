package X;

import com.facebook.redex.IDxFlowShape250S0100000_1_I2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.KtSLambdaShape3S0300000_I2;

/* renamed from: X.3Uq  reason: invalid class name and case insensitive filesystem */
public final class C61633Uq {
    public final C83654rl A00;
    public final C84714tk A01;
    public final C86074wE A02;
    public final List A03;
    public final C84714tk A04;
    public final /* synthetic */ AnonymousClass3YB A05;

    private final Set A00() {
        List<C61633Uq> list = this.A03;
        HashSet A0u = C18200wM.A0u();
        for (C61633Uq r1 : list) {
            C000300e.A0r(AnonymousClass4WL.A03(r1, r1.A00()), A0u);
        }
        return A0u;
    }

    public final void A01() {
        this.A02.CrC(new AnonymousClass17J(this.A00, (List) null, 0, 0));
        for (C61633Uq A012 : this.A03) {
            A012.A01();
        }
    }

    public C61633Uq(C83654rl r7, AnonymousClass3YB r8, List list) {
        AnonymousClass0wJ.A1Q(r7, list);
        this.A05 = r8;
        this.A00 = r7;
        this.A03 = list;
        this.A02 = C18190wL.A0z(new AnonymousClass17J(r7, (List) null, 0, 0));
        Set<C61633Uq> A002 = A00();
        ArrayList A0w = AnonymousClass0wJ.A0w(A002);
        for (C61633Uq r0 : A002) {
            A0w.add(r0.A02);
        }
        Object[] array = AnonymousClass00J.A0N(A0w).toArray(new C84714tk[0]);
        if (array != null) {
            IDxFlowShape250S0100000_1_I2 iDxFlowShape250S0100000_1_I2 = new IDxFlowShape250S0100000_1_I2(array, 19);
            this.A04 = iDxFlowShape250S0100000_1_I2;
            boolean A1a = C18190wL.A1a(this.A03);
            C84714tk r02 = this.A02;
            this.A01 = A1a ? C25807DsL.A01(new KtSLambdaShape3S0300000_I2(this, (C146958n9) null, 7, 42), r02, iDxFlowShape250S0100000_1_I2) : r02;
            return;
        }
        throw C18210wN.A0W("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
