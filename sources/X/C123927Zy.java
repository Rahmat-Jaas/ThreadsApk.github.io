package X;

import androidx.lifecycle.CoroutineLiveData;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;

/* renamed from: X.7Zy  reason: invalid class name and case insensitive filesystem */
public final class C123927Zy implements C143148gB {
    public CoroutineLiveData A00;
    public final C27952Ew2 A01;

    public C123927Zy(CoroutineLiveData coroutineLiveData, C27952Ew2 ew2) {
        C04220Ms.A0B(ew2, 2);
        this.A00 = coroutineLiveData;
        this.A01 = ew2.CWl(C1370685y.A01());
    }

    public final Object emit(Object obj, C146958n9 r6) {
        Object A002 = C25599DoZ.A00(r6, this.A01, new KtSLambdaShape14S0201000_I2(obj, (Object) this, (C146958n9) null, 34));
        if (A002 != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return A002;
    }
}
