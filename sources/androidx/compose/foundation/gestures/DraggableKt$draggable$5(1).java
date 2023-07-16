package androidx.compose.foundation.gestures;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass7HA;
import X.C146958n9;
import X.C39142Kno;
import X.C86104wH;
import X.C86154wM;
import X.C967266l;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$5", f = "Draggable.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class DraggableKt$draggable$5 extends C39142Kno implements AnonymousClass0YM {
    public int A00;
    public /* synthetic */ long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C967266l A03;
    public final /* synthetic */ AnonymousClass0YM A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$5(C967266l r2, C146958n9 r3, AnonymousClass0YM r4) {
        super(3, r3);
        this.A04 = r4;
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((AnonymousClass7HA) obj2).A00;
        AnonymousClass0YM r4 = this.A04;
        DraggableKt$draggable$5 draggableKt$draggable$5 = new DraggableKt$draggable$5(this.A03, (C146958n9) obj3, r4);
        draggableKt$draggable$5.A02 = obj;
        draggableKt$draggable$5.A01 = j;
        return draggableKt$draggable$5.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        float A002;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            Object obj2 = this.A02;
            long j = this.A01;
            AnonymousClass0YM r2 = this.A04;
            if (this.A03 == C967266l.Vertical) {
                A002 = Float.intBitsToFloat(C86104wH.A08(j));
            } else {
                A002 = C86104wH.A00(j);
            }
            Float A0W = C86154wM.A0W(A002);
            this.A00 = 1;
            if (r2.invoke(obj2, A0W, this) == d0e) {
                return d0e;
            }
        }
        return Unit.A00;
    }
}
