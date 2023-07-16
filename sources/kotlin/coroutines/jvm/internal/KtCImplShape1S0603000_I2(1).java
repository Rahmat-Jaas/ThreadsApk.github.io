package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YM;
import X.C1202779m;
import X.C146958n9;
import X.C27236EjA;
import X.C30936GbS;
import androidx.paging.PageEvent$StaticList;
import androidx.paging.SeparatorState;
import androidx.paging.SeparatorsKt;
import com.facebook.forker.Process;
import com.instagram.pendingmedia.service.igapi.ConfigureMediaStep;

public class KtCImplShape1S0603000_I2 extends C27236EjA {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape1S0603000_I2(Object obj, C146958n9 r2, int i) {
        super(r2);
        this.A09 = i;
        this.A08 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.A09) {
            case 0:
                this.A07 = obj;
                this.A02 |= Process.WAIT_RESULT_TIMEOUT;
                return ((SeparatorState) this.A08).A03((PageEvent$StaticList) null, this);
            case 1:
                this.A08 = obj;
                this.A02 |= Process.WAIT_RESULT_TIMEOUT;
                return SeparatorsKt.A00((C1202779m) null, this, (AnonymousClass0YM) null);
            default:
                this.A07 = obj;
                this.A02 |= Process.WAIT_RESULT_TIMEOUT;
                return ConfigureMediaStep.A01((C30936GbS) null, (ConfigureMediaStep) this.A08, this, false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape1S0603000_I2(C146958n9 r2) {
        super(r2);
        this.A09 = 1;
    }
}
