package androidx.lifecycle;

import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass0MJ;
import X.AnonymousClass0YP;
import X.AnonymousClass8s9;
import X.C04220Ms;
import X.C14260p5;
import X.C146958n9;
import X.C148838sG;
import X.C25237DiI;
import X.C25549Dnh;
import X.C27952Ew2;
import X.C83224qz;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2;

public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements C14260p5 {
    public final /* synthetic */ AnonymousClass060 A00;
    public final /* synthetic */ AnonymousClass060 A01;
    public final /* synthetic */ AnonymousClass0YP A02;
    public final /* synthetic */ AnonymousClass0MJ A03;
    public final /* synthetic */ AnonymousClass8s9 A04;
    public final /* synthetic */ C83224qz A05;
    public final /* synthetic */ C25549Dnh A06;

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(AnonymousClass060 r1, AnonymousClass060 r2, AnonymousClass0YP r3, AnonymousClass0MJ r4, AnonymousClass8s9 r5, C83224qz r6, C25549Dnh dnh) {
        this.A01 = r1;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r2;
        this.A04 = r5;
        this.A06 = dnh;
        this.A02 = r3;
    }

    public final void CMI(AnonymousClass060 r8, AnonymousClass066 r9) {
        C04220Ms.A0B(r8, 1);
        if (r8 == this.A01) {
            this.A03.A00 = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape4S0401000_I2(this.A06, this.A02, (C146958n9) null, 6), this.A05, 3);
            return;
        }
        if (r8 == this.A00) {
            AnonymousClass0MJ r1 = this.A03;
            C148838sG r0 = (C148838sG) r1.A00;
            if (r0 != null) {
                r0.AC7((CancellationException) null);
            }
            r1.A00 = null;
        }
        if (r8 == AnonymousClass060.ON_DESTROY) {
            this.A04.resumeWith(Unit.A00);
        }
    }
}
