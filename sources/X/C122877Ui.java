package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.7Ui  reason: invalid class name and case insensitive filesystem */
public final class C122877Ui implements C142728fU {
    public final C142638fL A00;
    public final C145698kw A01;
    public final C147168nV A02;

    public C122877Ui(C142638fL r2, C145698kw r3, C147168nV r4) {
        C18180wK.A1P(r2, 1, r4);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object A97(C142718fT r10, Object obj, Object obj2, C146958n9 r13, AnonymousClass0YY r14) {
        float A002 = C18240wQ.A00(obj);
        float A003 = C18240wQ.A00(obj2);
        return SnapFlingBehaviorKt.A01(this.A00, AnonymousClass6DW.A00(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, A003, 28), r10, r13, r14, (Math.abs(A002) + this.A01.ABf(this.A02)) * Math.signum(A003), A002);
    }
}
