package X;

import android.util.Pair;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6r5  reason: invalid class name and case insensitive filesystem */
public abstract class C113286r5 {
    public final void A02(C143748hF r8) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        synchronized (basePendingResult.A07) {
            if (C18180wK.A1W((basePendingResult.A0A.getCount() > 0 ? 1 : (basePendingResult.A0A.getCount() == 0 ? 0 : -1)))) {
                r8.Br9(basePendingResult.A02);
            } else {
                basePendingResult.A09.add(r8);
            }
        }
    }

    public final void A03(C143758hG r9, TimeUnit timeUnit, long j) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        synchronized (basePendingResult.A07) {
            C13320nQ.A07(!basePendingResult.A0C, "Result has already been consumed.");
            if (!basePendingResult.A03) {
                if (C18180wK.A1W((basePendingResult.A0A.getCount() > 0 ? 1 : (basePendingResult.A0A.getCount() == 0 ? 0 : -1)))) {
                    C86124wJ.A1E(basePendingResult.A06, new Pair(r9, BasePendingResult.A00(basePendingResult)), 1);
                } else {
                    basePendingResult.A01 = r9;
                    AnonymousClass5pv r3 = basePendingResult.A06;
                    r3.sendMessageDelayed(r3.obtainMessage(2, basePendingResult), timeUnit.toMillis(j));
                }
            }
        }
    }
}
