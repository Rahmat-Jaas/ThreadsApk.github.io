package X;

import com.facebook.forker.Process;
import com.facebook.redex.IDxFlowShape251S0100000_2_I2;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.77a  reason: invalid class name */
public final class AnonymousClass77a {
    public final C84714tk A00;
    public final C86074wE A01;

    public AnonymousClass77a() {
        this((Object) null, (DefaultConstructorMarker) null, 1);
    }

    public /* synthetic */ AnonymousClass77a(Object obj, DefaultConstructorMarker defaultConstructorMarker, int i) {
        C27457Enn A0z = C18190wL.A0z(C18180wK.A0p(Integer.valueOf(Process.WAIT_RESULT_TIMEOUT), (Object) null));
        this.A01 = A0z;
        this.A00 = new IDxFlowShape251S0100000_2_I2(A0z, 2);
    }

    public final void A00(Object obj) {
        C04220Ms.A0B(obj, 0);
        C86074wE r1 = this.A01;
        r1.CrC(C18180wK.A0p(Integer.valueOf(AnonymousClass0wJ.A04(((Pair) r1.getValue()).A00) + 1), obj));
    }
}
