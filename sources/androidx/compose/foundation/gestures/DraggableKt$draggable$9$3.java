package androidx.compose.foundation.gestures;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass7Ja;
import X.C146958n9;
import X.C18220wO;
import X.C39142Kno;
import X.C81784oM;
import X.C86064wD;
import X.C967266l;
import X.D0E;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S0611000_I2;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$3", f = "Draggable.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
public final class DraggableKt$draggable$9$3 extends C39142Kno implements AnonymousClass0YP {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C967266l A02;
    public final /* synthetic */ C81784oM A03;
    public final /* synthetic */ C81784oM A04;
    public final /* synthetic */ C86064wD A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraggableKt$draggable$9$3(C967266l r2, C81784oM r3, C81784oM r4, C146958n9 r5, C86064wD r6, boolean z, boolean z2) {
        super(2, r5);
        this.A06 = z;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
        this.A05 = r6;
        this.A07 = z2;
    }

    public final C146958n9 create(Object obj, C146958n9 r10) {
        boolean z = this.A06;
        DraggableKt$draggable$9$3 draggableKt$draggable$9$3 = new DraggableKt$draggable$9$3(this.A02, this.A03, this.A04, r10, this.A05, z, this.A07);
        draggableKt$draggable$9$3.A01 = obj;
        return draggableKt$draggable$9$3;
    }

    public final Object invokeSuspend(Object obj) {
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            Object obj2 = this.A01;
            if (this.A06) {
                C81784oM r6 = this.A03;
                KtSLambdaShape0S0611000_I2 ktSLambdaShape0S0611000_I2 = new KtSLambdaShape0S0611000_I2(obj2, this.A05, this.A04, r6, this.A02, (C146958n9) null, 1, this.A07);
                this.A00 = 1;
                if (AnonymousClass7Ja.A01(this, ktSLambdaShape0S0611000_I2) == d0e) {
                    return d0e;
                }
            }
        }
        return Unit.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DraggableKt$draggable$9$3) C18220wO.A10(obj2, obj, this)).invokeSuspend(Unit.A00);
    }
}
