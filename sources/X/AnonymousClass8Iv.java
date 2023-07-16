package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Unit;

/* renamed from: X.8Iv  reason: invalid class name */
public final class AnonymousClass8Iv extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C146448mG A01;
    public final /* synthetic */ AnonymousClass7WW A02;
    public final /* synthetic */ AnonymousClass0YY A03;
    public final /* synthetic */ AnonymousClass0MJ A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Iv(C146448mG r2, AnonymousClass7WW r3, AnonymousClass0YY r4, AnonymousClass0MJ r5, float f) {
        super(1);
        this.A04 = r5;
        this.A00 = f;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A08 = C18190wL.A08(obj);
        Object obj2 = this.A04.A00;
        C04220Ms.A0A(obj2);
        float f = this.A00;
        SuspendAnimationKt.A06(this.A01, (C113076qg) obj2, this.A02, this.A03, f, A08);
        return Unit.A00;
    }
}
