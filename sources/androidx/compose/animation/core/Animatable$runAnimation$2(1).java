package androidx.compose.animation.core;

import X.AnonymousClass006;
import X.AnonymousClass0OU;
import X.AnonymousClass0YY;
import X.AnonymousClass6DX;
import X.AnonymousClass7JH;
import X.AnonymousClass7U0;
import X.AnonymousClass7WW;
import X.C04180Mo;
import X.C04220Ms;
import X.C111996on;
import X.C1203479u;
import X.C146448mG;
import X.C146958n9;
import X.C147368pE;
import X.C39142Kno;
import X.C86164wN;
import X.D0E;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.KtLambdaShape6S0400000_I2;

@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {305}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
public final class Animatable$runAnimation$2 extends C39142Kno implements AnonymousClass0YY {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass7JH A04;
    public final /* synthetic */ C146448mG A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ AnonymousClass0YY A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(AnonymousClass7JH r2, C146448mG r3, Object obj, C146958n9 r5, AnonymousClass0YY r6, long j) {
        super(1, r5);
        this.A04 = r2;
        this.A06 = obj;
        this.A05 = r3;
        this.A03 = j;
        this.A07 = r6;
    }

    public final C146958n9 create(C146958n9 r9) {
        AnonymousClass7JH r1 = this.A04;
        Object obj = this.A06;
        return new Animatable$runAnimation$2(r1, this.A05, obj, r9, this.A07, this.A03);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass7WW r10;
        C04180Mo r9;
        Integer num;
        D0E d0e = D0E.COROUTINE_SUSPENDED;
        if (this.A00 != 0) {
            r9 = (C04180Mo) this.A02;
            r10 = (AnonymousClass7WW) this.A01;
            AnonymousClass0OU.A00(obj);
        } else {
            AnonymousClass0OU.A00(obj);
            try {
                AnonymousClass7JH r3 = this.A04;
                AnonymousClass7WW r1 = r3.A04;
                C1203479u r0 = (C1203479u) ((AnonymousClass7U0) r3.A08).A01.invoke(this.A06);
                C04220Ms.A0B(r0, 0);
                r1.A02 = r0;
                C146448mG r7 = this.A05;
                r3.A0A.CrC(r7.BFi());
                C147368pE.A04(r3.A09, true);
                Object value = r1.A05.getValue();
                r10 = new AnonymousClass7WW(AnonymousClass6DX.A00(r1.A02), r1.A04, value, r1.A01, Long.MIN_VALUE, r1.A03);
                r9 = new C04180Mo();
                long j = this.A03;
                KtLambdaShape6S0400000_I2 ktLambdaShape6S0400000_I2 = new KtLambdaShape6S0400000_I2(0, this.A07, r3, r10, r9);
                this.A01 = r10;
                this.A02 = r9;
                this.A00 = 1;
                if (SuspendAnimationKt.A01(r7, r10, this, ktLambdaShape6S0400000_I2, j) == d0e) {
                    return d0e;
                }
            } catch (CancellationException e) {
                AnonymousClass7JH.A04(this.A04);
                throw e;
            }
        }
        if (r9.A00) {
            num = AnonymousClass006.A00;
        } else {
            num = AnonymousClass006.A01;
        }
        AnonymousClass7JH.A04(this.A04);
        return new C111996on(r10, num);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) C86164wN.A0m(obj, this)).invokeSuspend(Unit.A00);
    }
}
