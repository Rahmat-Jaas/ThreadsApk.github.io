package kotlin.coroutines.jvm.internal;

import X.C146958n9;
import X.C27236EjA;
import com.facebook.forker.Process;
import com.instagram.barcelona.common.ui.bottomsheet.ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;

public class KtCImplShape0S0201100_I2 extends C27236EjA {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public final Object invokeSuspend(Object obj) {
        int i = this.A04;
        this.A02 = obj;
        this.A00 |= Process.WAIT_RESULT_TIMEOUT;
        ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 = (ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1) this.A03;
        if (i != 0) {
            return modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.CBr(this, 0);
        }
        return modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1.CBn(this, 0, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0201100_I2(ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1 modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1, C146958n9 r2, int i) {
        super(r2);
        this.A04 = i;
        this.A03 = modalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1;
    }
}
