package X;

import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.7Uj  reason: invalid class name and case insensitive filesystem */
public final class C122887Uj implements C145698kw {
    public final /* synthetic */ AnonymousClass0YM A00;
    public final /* synthetic */ LazyListState A01;

    public final float ABV(C147168nV r4, float f) {
        C04220Ms.A0B(r4, 0);
        float abs = Math.abs(AnonymousClass6DY.A00(new C122717To(new C122807Tx(r4)), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f)) - ABf(r4);
        if (abs < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            abs = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        if (abs != BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return abs * Math.signum(f);
        }
        return abs;
    }

    public C122887Uj(LazyListState lazyListState, AnonymousClass0YM r2) {
        this.A01 = lazyListState;
        this.A00 = r2;
    }

    public final float ABf(C147168nV r6) {
        List A002 = C147158nU.A00(this.A01);
        if (!C18190wL.A1a(A002)) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        int size = A002.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((AnonymousClass7VH) ((AnonymousClass8cc) A002.get(i2))).A02;
        }
        return ((float) i) / ((float) A002.size());
    }

    public final AnonymousClass86X ABg(C147168nV r11) {
        LazyListState lazyListState = this.A01;
        List A002 = C147158nU.A00(lazyListState);
        AnonymousClass0YM r7 = this.A00;
        int size = A002.size();
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            float A003 = C115676vj.A00((AnonymousClass8cc) A002.get(i), lazyListState.A02(), r11, r7);
            if (A003 <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A003 > f) {
                f = A003;
            }
            if (A003 >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && A003 < f2) {
                f2 = A003;
            }
        }
        return new AnonymousClass86X(f, f2);
    }
}
