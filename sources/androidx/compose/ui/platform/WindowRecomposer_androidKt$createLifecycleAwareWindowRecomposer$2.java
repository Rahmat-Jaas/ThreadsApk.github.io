package androidx.compose.ui.platform;

import X.AnonymousClass006;
import X.AnonymousClass060;
import X.AnonymousClass066;
import X.AnonymousClass0MJ;
import X.AnonymousClass0wJ;
import X.C109636kK;
import X.C14260p5;
import X.C146958n9;
import X.C25237DiI;
import X.C27952Ew2;
import X.C83224qz;
import android.view.View;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape2S0601000_I2;

public final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 implements C14260p5 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ PausableMonotonicFrameClock A01;
    public final /* synthetic */ Recomposer A02;
    public final /* synthetic */ AnonymousClass0MJ A03;
    public final /* synthetic */ C83224qz A04;

    public final void CMI(AnonymousClass060 r12, AnonymousClass066 r13) {
        AnonymousClass066 r5 = r13;
        boolean A1Z = AnonymousClass0wJ.A1Z(r13, r12);
        int ordinal = r12.ordinal();
        if (ordinal == 0) {
            C83224qz r1 = this.A04;
            Integer num = AnonymousClass006.A0N;
            AnonymousClass0MJ r8 = this.A03;
            C25237DiI.A00(num, (C27952Ew2) null, new KtSLambdaShape2S0601000_I2(this.A00, r5, this, this.A02, r8, (C146958n9) null, 2), r1, A1Z ? 1 : 0);
        } else if (ordinal == A1Z) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock = this.A01;
            if (pausableMonotonicFrameClock != null) {
                C109636kK r14 = pausableMonotonicFrameClock.A00;
                synchronized (r14.A03) {
                    if (!r14.A02) {
                        List list = r14.A00;
                        r14.A00 = r14.A01;
                        r14.A01 = list;
                        r14.A02 = A1Z;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ((C146958n9) list.get(i)).resumeWith(Unit.A00);
                        }
                        list.clear();
                    }
                }
            }
        } else if (ordinal == 4) {
            PausableMonotonicFrameClock pausableMonotonicFrameClock2 = this.A01;
            if (pausableMonotonicFrameClock2 != null) {
                C109636kK r0 = pausableMonotonicFrameClock2.A00;
                synchronized (r0.A03) {
                    r0.A02 = false;
                }
            }
        } else if (ordinal == 5) {
            this.A02.A0B();
        }
    }

    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2(View view, PausableMonotonicFrameClock pausableMonotonicFrameClock, Recomposer recomposer, AnonymousClass0MJ r4, C83224qz r5) {
        this.A04 = r5;
        this.A01 = pausableMonotonicFrameClock;
        this.A02 = recomposer;
        this.A03 = r4;
        this.A00 = view;
    }
}
