package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0200000_I2;
import com.facebook.redex.IDxFlowShape251S0100000_2_I2;
import com.facebook.redex.IDxFlowShape94S0200000_2_I2;
import kotlin.Unit;

/* renamed from: X.7Ut  reason: invalid class name and case insensitive filesystem */
public final class C122967Ut implements C147258p3 {
    public final C105496dW A00;
    public final Object A01;
    public final C84714tk A02;

    public final Object AJQ(AnonymousClass8ca r4, C146958n9 r5) {
        Object emit = this.A00.A00.emit(new KtCSuperShape0S0200000_I2(r4, this.A01), r5);
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (emit != d0e) {
            emit = Unit.A00;
        }
        if (emit != d0e) {
            return Unit.A00;
        }
        return emit;
    }

    public final C84714tk ApX() {
        return this.A02;
    }

    public final boolean D7s(AnonymousClass8ca r4) {
        return this.A00.A00.D7t(new KtCSuperShape0S0200000_I2(r4, this.A01));
    }

    public C122967Ut(C105496dW r4, Object obj) {
        this.A00 = r4;
        this.A01 = obj;
        this.A02 = new IDxFlowShape251S0100000_2_I2(new IDxFlowShape94S0200000_2_I2(15, obj, (Object) r4.A00), 10);
    }
}
