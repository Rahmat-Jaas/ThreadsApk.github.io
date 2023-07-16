package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.5AU  reason: invalid class name */
public final class AnonymousClass5AU extends C113246qz {
    public ValueAnimator A00;
    public Runnable A01;
    public boolean A02;
    public final AnonymousClass5AK A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass5AU r4 = (AnonymousClass5AU) obj;
            if (this.A04 == r4.A04) {
                return this.A03.equals(r4.A03);
            }
        }
        return false;
    }

    public final int hashCode() {
        return C86124wJ.A0H(this.A03, Boolean.valueOf(this.A04));
    }

    public AnonymousClass5AU(AnonymousClass5AK r3, boolean z) {
        this.A03 = r3;
        r3.A02 = this;
        this.A02 = C18180wK.A1V((r3.A01 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 1 : (r3.A01 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER ? 0 : -1)));
        this.A04 = z;
        if (z) {
            r3.A01 = 1.0f;
        }
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int A032 = C14030oh.A03(-1094387272);
        if (this.A04) {
            i2 = 659638708;
        } else {
            if (i == 0) {
                C1360181a r2 = new C1360181a(recyclerView, this);
                this.A01 = r2;
                recyclerView.postDelayed(r2, 1500);
            } else {
                recyclerView.removeCallbacks(this.A01);
                if (!this.A02) {
                    ValueAnimator valueAnimator = this.A00;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        this.A00.cancel();
                    }
                    AnonymousClass5AK r1 = this.A03;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{r1.A01, 1.0f});
                    ofFloat.addUpdateListener(new AnonymousClass7L8(recyclerView, r1));
                    ofFloat.setDuration(200);
                    ofFloat.start();
                    this.A02 = true;
                }
            }
            i2 = -1000132449;
        }
        C14030oh.A0A(i2, A032);
    }
}
