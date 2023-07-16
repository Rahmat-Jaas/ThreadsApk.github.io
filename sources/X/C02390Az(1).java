package X;

import android.os.HandlerThread;

/* renamed from: X.0Az  reason: invalid class name and case insensitive filesystem */
public final class C02390Az {
    public C02300Ap A00;
    public C02300Ap A01;
    public final C02310Aq A02;
    public final C02380Ay A03;
    public final AnonymousClass0BP A04;
    public final C02530Bu A05;

    public C02390Az(HandlerThread handlerThread, C02160Ab r4, C02310Aq r5, AnonymousClass0BP r6, C02530Bu r7, Integer num) {
        this.A03 = new C02380Ay(handlerThread.getLooper(), r4, this, num);
        this.A05 = r7;
        this.A02 = r5;
        this.A04 = r6;
    }
}
