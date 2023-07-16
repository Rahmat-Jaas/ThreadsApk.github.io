package androidx.compose.foundation;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.C04220Ms;
import X.C122777Tu;
import X.C122847Ub;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.D0E;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", i = {}, l = {285, 287}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollKt$scroll$2$semantics$1$1$1 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ C122847Ub A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1$1$1(C122847Ub r2, C146958n9 r3, float f, float f2, boolean z) {
        super(2, r3);
        this.A04 = z;
        this.A03 = r2;
        this.A02 = f;
        this.A01 = f2;
    }

    public final C146958n9 create(Object obj, C146958n9 r8) {
        return new ScrollKt$scroll$2$semantics$1$1$1(this.A03, r8, this.A02, this.A01, this.A04);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        Object obj2;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            boolean z = this.A04;
            C122847Ub r2 = this.A03;
            if (z) {
                C04220Ms.A0C(r2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                f = this.A02;
                obj2 = null;
                this.A00 = 1;
            } else {
                C04220Ms.A0C(r2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                f = this.A01;
                obj2 = null;
                this.A00 = 2;
            }
            if (ScrollExtensionsKt.A00(C122777Tu.A00(obj2), r2, this, f) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScrollKt$scroll$2$semantics$1$1$1) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
