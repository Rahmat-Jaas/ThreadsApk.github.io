package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.0hr  reason: invalid class name and case insensitive filesystem */
public final class C10180hr {
    public static final ObjectAnimator A00(Drawable drawable, int i, int i2, long j) {
        C04220Ms.A0B(drawable, 0);
        drawable.mutate();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(drawable, new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("alpha", new int[]{i, i2})});
        C04220Ms.A06(ofPropertyValuesHolder);
        ofPropertyValuesHolder.setTarget(drawable);
        ofPropertyValuesHolder.setDuration(j);
        ofPropertyValuesHolder.start();
        return ofPropertyValuesHolder;
    }

    public static /* synthetic */ void A01(View view, int i, int i2, long j) {
        AnonymousClass03P r2 = null;
        if ((i2 & 4) != 0) {
            j = 200;
        }
        if ((i2 & 8) != 0) {
            r2 = AnonymousClass03P.A00;
        }
        C04220Ms.A0B(r2, 3);
        if (view != null) {
            view.animate().cancel();
            if (i == 0 && view.getVisibility() != 0) {
                view.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                view.setVisibility(i);
                view.animate().setDuration(j).withEndAction(new C10190hs(r2)).alpha(1.0f);
            } else if (view.getVisibility() == 0) {
                view.animate().setDuration(j).alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).withEndAction(new C10200ht(view, r2, i)).start();
            }
        }
    }
}
