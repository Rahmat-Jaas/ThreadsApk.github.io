package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;

/* renamed from: X.87E  reason: invalid class name */
public final class AnonymousClass87E implements C83234r0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ LazyListState A02;
    public final /* synthetic */ AnonymousClass0ZU A03;

    public AnonymousClass87E(LazyListState lazyListState, AnonymousClass0ZU r2, int i, int i2) {
        this.A02 = lazyListState;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, C146958n9 r5) {
        LazyListState lazyListState = this.A02;
        int A002 = lazyListState.A00();
        int i = this.A00;
        if (A002 < i || (lazyListState.A00() == i && lazyListState.A01() < this.A01)) {
            this.A03.invoke();
        }
        return Unit.A00;
    }
}
