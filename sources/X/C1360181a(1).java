package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.81a  reason: invalid class name and case insensitive filesystem */
public final class C1360181a implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ AnonymousClass5AU A01;

    public C1360181a(RecyclerView recyclerView, AnonymousClass5AU r2) {
        this.A01 = r2;
        this.A00 = recyclerView;
    }

    public final void run() {
        AnonymousClass5AU r4 = this.A01;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER});
        r4.A00 = ofFloat;
        ofFloat.addUpdateListener(new AnonymousClass7L8(this.A00, r4.A03));
        r4.A00.setDuration(200);
        r4.A00.start();
        r4.A02 = false;
    }
}
