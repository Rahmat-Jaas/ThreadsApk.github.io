package X;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2;

/* renamed from: X.7Vi  reason: invalid class name and case insensitive filesystem */
public final class C123107Vi implements C146268lw {
    public final /* synthetic */ LazyGridState A00;

    public final C106866fk ADc() {
        return new C106866fk(-1, -1);
    }

    public C123107Vi(LazyGridState lazyGridState) {
        this.A00 = lazyGridState;
    }

    public final Object A8Q(C146958n9 r3, float f) {
        Object A002 = ScrollExtensionsKt.A00(C122777Tu.A00((Object) null), this.A00, r3, f);
        if (A002 != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return A002;
    }

    public final boolean AVo() {
        return C86104wH.A1X(this.A00.A0B);
    }

    public final float AbV() {
        LazyGridState lazyGridState = this.A00;
        return ((float) lazyGridState.A00()) + (((float) AnonymousClass0wJ.A04(lazyGridState.A07.A03.getValue())) / 100000.0f);
    }

    public final Object CgI(int i, C146958n9 r9) {
        LazyGridState lazyGridState = this.A00;
        Object CgB = lazyGridState.CgB(C967166k.Default, r9, new KtSLambdaShape2S0102000_I2(lazyGridState, (C146958n9) null, i, 0, 1));
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (CgB != d0e) {
            CgB = Unit.A00;
        }
        if (CgB != d0e) {
            return Unit.A00;
        }
        return CgB;
    }
}
