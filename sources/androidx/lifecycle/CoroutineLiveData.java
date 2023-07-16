package androidx.lifecycle;

import X.AnonymousClass0OU;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass7Ja;
import X.AnonymousClass8bb;
import X.C110836mM;
import X.C1370685y;
import X.C146958n9;
import X.C148838sG;
import X.C18180wK;
import X.C25235DiG;
import X.C25237DiI;
import X.C27952Ew2;
import X.C86154wM;
import X.C86164wN;
import X.C880756q;
import com.facebook.forker.Process;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtCImplShape1S0301000_I2;
import kotlin.coroutines.jvm.internal.KtSLambdaShape14S0201000_I2;

public final class CoroutineLiveData extends C880756q {
    public C110836mM A00;

    public CoroutineLiveData(C27952Ew2 ew2, AnonymousClass0YP r10, long j) {
        this.A00 = new C110836mM(this, C86154wM.A13(this, 46), r10, AnonymousClass7Ja.A03(C25235DiG.A01(C1370685y.A01(), ew2).CWl(new AnonymousClass8bb(C148838sG.A00(ew2)))), j);
    }

    public final Object A0L(C146958n9 r6) {
        KtCImplShape1S0301000_I2 A0n;
        int i;
        if (KtCImplShape1S0301000_I2.A00(15, r6)) {
            A0n = (KtCImplShape1S0301000_I2) r6;
            int i2 = A0n.A00;
            if ((i2 & Process.WAIT_RESULT_TIMEOUT) != 0) {
                A0n.A00 = i2 - Process.WAIT_RESULT_TIMEOUT;
                Object obj = A0n.A02;
                i = A0n.A00;
                if (i != 0 || i == 1) {
                    AnonymousClass0OU.A00(obj);
                    return Unit.A00;
                }
                throw AnonymousClass0wJ.A0a();
            }
        }
        A0n = C86164wN.A0n(this, r6, 15);
        Object obj2 = A0n.A02;
        i = A0n.A00;
        if (i != 0) {
        }
        AnonymousClass0OU.A00(obj2);
        return Unit.A00;
    }

    public final void A09() {
        super.A09();
        C110836mM r4 = this.A00;
        if (r4 != null) {
            C148838sG r0 = r4.A00;
            if (r0 != null) {
                r0.AC7((CancellationException) null);
            }
            r4.A00 = null;
            if (r4.A01 == null) {
                r4.A01 = C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape14S0201000_I2(r4, (C146958n9) null, 30), r4.A06, 3);
            }
        }
    }

    public final void A0A() {
        super.A0A();
        C110836mM r5 = this.A00;
        if (r5 == null) {
            return;
        }
        if (r5.A00 == null) {
            r5.A00 = C25237DiI.A00((Integer) null, C1370685y.A01(), C86164wN.A0o(r5, (C146958n9) null, 18), r5.A06, 2);
            return;
        }
        throw C18180wK.A0a("Cancel call cannot happen without a maybeRun");
    }
}
