package X;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.1dC  reason: invalid class name */
public abstract class AnonymousClass1dC extends C34640IcN implements C39882L5e {
    public static final String __redex_internal_original_name = "BaseManageDataSheetFragment";

    public final int BHT() {
        return 0;
    }

    public final float BQB() {
        return 0.8f;
    }

    public final void C47() {
    }

    public final void C49(int i) {
    }

    public final boolean Cs4() {
        return true;
    }

    public abstract String getModuleName();

    public final boolean isScrolledToTop() {
        return false;
    }

    public final void onBottomSheetClosed() {
    }

    public final /* synthetic */ boolean A8B() {
        return false;
    }

    public final int AZN() {
        if (this instanceof C26231qG) {
            return -2;
        }
        return -1;
    }

    public final View BFj() {
        return this.mView;
    }

    public final boolean BRv() {
        if (this instanceof C26231qG) {
            return false;
        }
        return true;
    }

    public final float BfH() {
        return 1.0f;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        if (this instanceof C26221qF) {
            C26221qF r2 = (C26221qF) this;
            float f = (float) ((-i) - i2);
            r2.A02.setTranslationY(f);
            r2.A01.setTranslationY(f);
        }
    }

    public final int AU4(Context context) {
        return ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final /* synthetic */ float BgR() {
        return BQB();
    }
}
