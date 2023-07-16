package X;

import com.facebook.dcp.prediction.litennmodelparams.DynamicNNModelParams;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.781  reason: invalid class name */
public final class AnonymousClass781 {
    public DynamicNNModelParams A00;
    public final C147128nR A01;
    public final ReentrantLock A02 = new ReentrantLock();
    public final C98776Gw A03;

    public AnonymousClass781(C147128nR r2, C98776Gw r3) {
        C04220Ms.A0B(r2, 1);
        this.A01 = r2;
        this.A03 = r3;
    }

    public final AnonymousClass5Id A01() {
        AnonymousClass5Id r2;
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            DynamicNNModelParams dynamicNNModelParams = this.A00;
            if (dynamicNNModelParams != null) {
                r2 = AnonymousClass5Id.A00(dynamicNNModelParams);
            } else {
                File A002 = A00(this);
                if (!A002.exists() || !A002.canRead()) {
                    r2 = new AnonymousClass5Id((Object) null, (String) null, false);
                } else {
                    String A003 = AnonymousClass8DI.A00(A002, AnonymousClass74V.A05);
                    C39237Kq4 kq4 = C36975Ji8.A03;
                    AnonymousClass76V r5 = kq4.A02;
                    C02230Ai A0l = C18210wN.A0l(DynamicNNModelParams.class);
                    List emptyList = Collections.emptyList();
                    boolean A1Z = C18200wM.A1Z(emptyList);
                    DynamicNNModelParams dynamicNNModelParams2 = (DynamicNNModelParams) kq4.A00(A003, AnonymousClass72C.A00(new AnonymousClass0AD(emptyList, (AnonymousClass0AD) null, A0l, A1Z ? 1 : 0), r5));
                    this.A00 = dynamicNNModelParams2;
                    r2 = AnonymousClass5Id.A01(dynamicNNModelParams2, (String) null, A1Z);
                }
            }
            return r2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final File A00(AnonymousClass781 r3) {
        return C86154wM.A0U(ITF.A00().AOC((C109746kY) null, 341716450), AnonymousClass00U.A0L(C98766Gv.A00(r3.A01), "_weights.json"));
    }
}
