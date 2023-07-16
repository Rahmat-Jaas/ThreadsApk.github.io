package X;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0102000_I2;

/* renamed from: X.7Vj  reason: invalid class name and case insensitive filesystem */
public final class C123117Vj implements C146268lw {
    public final /* synthetic */ LazyListState A00;
    public final /* synthetic */ boolean A01;

    public C123117Vj(LazyListState lazyListState, boolean z) {
        this.A00 = lazyListState;
        this.A01 = z;
    }

    public final Object A8Q(C146958n9 r3, float f) {
        Object A002 = ScrollExtensionsKt.A00(C122777Tu.A00((Object) null), this.A00, r3, f);
        if (A002 != D0E.COROUTINE_SUSPENDED) {
            return Unit.A00;
        }
        return A002;
    }

    public final C106866fk ADc() {
        C106866fk r0;
        if (this.A01) {
            return r0;
        }
        r0 = new C106866fk(1, -1);
        return r0;
    }

    public final boolean AVo() {
        return C86104wH.A1X(this.A00.A0D);
    }

    public final float AbV() {
        LazyListState lazyListState = this.A00;
        return ((float) lazyListState.A00()) + (((float) lazyListState.A01()) / 100000.0f);
    }

    public final Object CgI(int i, C146958n9 r9) {
        LazyListState lazyListState = this.A00;
        Object CgB = lazyListState.CgB(C967166k.Default, r9, new KtSLambdaShape2S0102000_I2(lazyListState, (C146958n9) null, i, 0, 0));
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
