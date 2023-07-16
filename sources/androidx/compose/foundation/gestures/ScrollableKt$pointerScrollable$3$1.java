package androidx.compose.foundation.gestures;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass7HA;
import X.C146958n9;
import X.C147368pE;
import X.C18180wK;
import X.C25237DiI;
import X.C27952Ew2;
import X.C39142Kno;
import X.C81784oM;
import X.C83224qz;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0101100_I2;

@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollableKt$pointerScrollable$3$1 extends C39142Kno implements AnonymousClass0YM {
    public /* synthetic */ long A00;
    public final /* synthetic */ C147368pE A01;
    public final /* synthetic */ C81784oM A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$3$1(C147368pE r2, C81784oM r3, C146958n9 r4) {
        super(3, r4);
        this.A01 = r2;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((AnonymousClass7HA) obj2).A00;
        ScrollableKt$pointerScrollable$3$1 scrollableKt$pointerScrollable$3$1 = new ScrollableKt$pointerScrollable$3$1(this.A01, this.A02, (C146958n9) obj3);
        scrollableKt$pointerScrollable$3$1.A00 = j;
        return scrollableKt$pointerScrollable$3$1.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0OU.A00(obj);
        long j = this.A00;
        C83224qz r1 = (C83224qz) ((NestedScrollDispatcher) this.A01.getValue()).A01.invoke();
        if (r1 != null) {
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S0101100_I2(this.A02, (C146958n9) null, 0, j), r1, 3);
            return Unit.A00;
        }
        throw C18180wK.A0a("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
