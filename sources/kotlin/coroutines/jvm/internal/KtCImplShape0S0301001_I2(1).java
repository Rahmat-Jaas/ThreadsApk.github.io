package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass7WW;
import X.AnonymousClass8cU;
import X.C142718fT;
import X.C146958n9;
import X.C147368pE;
import X.C27236EjA;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.common.ui.toast.ToastDragDismissState;

public class KtCImplShape0S0301001_I2 extends C27236EjA {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtCImplShape0S0301001_I2(ToastDragDismissState toastDragDismissState, C146958n9 r3) {
        super(r3);
        this.A04 = toastDragDismissState;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.A05 != 0) {
            this.A03 = obj;
            this.A01 |= Process.WAIT_RESULT_TIMEOUT;
            return ((ToastDragDismissState) this.A04).A00((C147368pE) null, this, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        this.A04 = obj;
        this.A01 |= Process.WAIT_RESULT_TIMEOUT;
        return SnapFlingBehaviorKt.A02((AnonymousClass7WW) null, (AnonymousClass8cU) null, (C142718fT) null, this, (AnonymousClass0YY) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public KtCImplShape0S0301001_I2(C146958n9 r2) {
        super(r2);
    }
}
