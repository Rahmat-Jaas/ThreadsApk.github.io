package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;

/* renamed from: X.87A  reason: invalid class name */
public final class AnonymousClass87A implements C83234r0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LazyListState A01;
    public final /* synthetic */ C147368pE A02;

    public AnonymousClass87A(LazyListState lazyListState, C147368pE r2, int i) {
        this.A01 = lazyListState;
        this.A02 = r2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, C146958n9 r6) {
        int i;
        Integer num;
        AnonymousClass8cc r3 = (AnonymousClass8cc) AnonymousClass00J.A0F(C147158nU.A00(this.A01));
        C147368pE r2 = this.A02;
        if (r3 == null) {
            num = null;
        } else {
            AnonymousClass7VH r32 = (AnonymousClass7VH) r3;
            if (!C04220Ms.A0I(r32.A03, "over_scroll_item")) {
                i = 0;
            } else {
                i = this.A00 - r32.A01;
            }
            num = new Integer(i);
        }
        r2.CrC(num);
        return Unit.A00;
    }
}
