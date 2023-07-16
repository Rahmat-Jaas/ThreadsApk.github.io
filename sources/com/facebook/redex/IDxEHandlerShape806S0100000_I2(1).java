package com.facebook.redex;

import X.AnonymousClass0IN;
import X.AnonymousClass0IT;
import X.C04220Ms;
import X.C06440Zj;
import X.C06910aa;
import X.C07140ax;
import X.C07150ay;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;

public class IDxEHandlerShape806S0100000_I2 implements AnonymousClass0IT {
    public Object A00;
    public final int A01;

    public IDxEHandlerShape806S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void handleUncaughtException(Thread thread, Throwable th, AnonymousClass0IN r5) {
        switch (this.A01) {
            case 0:
                MultiSignalANRDetector multiSignalANRDetector = C06910aa.A0B;
                if (multiSignalANRDetector != null) {
                    multiSignalANRDetector.A0c = true;
                    multiSignalANRDetector.A0A.A00();
                    multiSignalANRDetector.A0T.stopDetector();
                    return;
                }
                return;
            case 1:
                C07140ax r1 = (C07140ax) this.A00;
                r1.A01.A4x(thread, th);
                r1.A02(thread, th);
                return;
            default:
                C06440Zj r12 = ((C07150ay) this.A00).A04;
                C04220Ms.A0B(thread, 0);
                C04220Ms.A0B(th, 1);
                r12.A00.A4x(thread, th);
                return;
        }
    }
}
