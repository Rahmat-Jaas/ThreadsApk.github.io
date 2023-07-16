package X;

import androidx.compose.foundation.pager.PagerState;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.8DZ  reason: invalid class name */
public final class AnonymousClass8DZ extends C02220Ah implements AnonymousClass0ZU {
    public final /* synthetic */ int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8DZ(int i) {
        super(0);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        return new PagerState(this.A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }
}
