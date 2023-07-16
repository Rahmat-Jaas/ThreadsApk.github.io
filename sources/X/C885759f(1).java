package X;

import androidx.paging.PagingSource;
import com.facebook.forker.Process;
import kotlin.jvm.internal.KtLambdaShape22S0100000_I2_2;

/* renamed from: X.59f  reason: invalid class name and case insensitive filesystem */
public final class C885759f extends PagingSource {
    public int A00 = Process.WAIT_RESULT_TIMEOUT;
    public final C104226bR A01;
    public final C27219EgD A02;

    public C885759f(C104226bR r3, C27219EgD egD) {
        C04220Ms.A0B(egD, 1);
        this.A02 = egD;
        this.A01 = r3;
        r3.A00.A00(new AnonymousClass86U(this));
        this.A00.A00(new KtLambdaShape22S0100000_I2_2(this, 6));
    }
}
