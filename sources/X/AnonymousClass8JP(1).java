package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Unit;

/* renamed from: X.8JP  reason: invalid class name */
public final class AnonymousClass8JP extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C146448mG A01;
    public final /* synthetic */ AnonymousClass7WW A02;
    public final /* synthetic */ C1203479u A03;
    public final /* synthetic */ Object A04;
    public final /* synthetic */ AnonymousClass0YY A05;
    public final /* synthetic */ AnonymousClass0MJ A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8JP(C146448mG r2, AnonymousClass7WW r3, C1203479u r4, Object obj, AnonymousClass0YY r6, AnonymousClass0MJ r7, float f) {
        super(1);
        this.A06 = r7;
        this.A04 = obj;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = f;
        this.A05 = r6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A08 = C18190wL.A08(obj);
        AnonymousClass0MJ r3 = this.A06;
        Object obj2 = this.A04;
        C146448mG r15 = this.A01;
        AnonymousClass8cW BJ4 = r15.BJ4();
        C1203479u r6 = this.A03;
        Object BFi = r15.BFi();
        AnonymousClass7WW r2 = this.A02;
        C113076qg r5 = new C113076qg(r6, BJ4, obj2, BFi, C86154wM.A12(r2, 2), A08, A08);
        AnonymousClass0YY r18 = this.A05;
        AnonymousClass7WW r17 = r2;
        SuspendAnimationKt.A06(r15, r5, r17, r18, this.A00, A08);
        r3.A00 = r5;
        return Unit.A00;
    }
}
