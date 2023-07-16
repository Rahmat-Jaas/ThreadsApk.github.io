package X;

import android.graphics.drawable.Drawable;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;

/* renamed from: X.3TK  reason: invalid class name */
public final class AnonymousClass3TK {
    public Drawable A00;
    public Scene A01;
    public Scene A02;
    public Transition A03;
    public TransitionSet A04;
    public ViewGroup A05;
    public Runnable A06;
    public Runnable A07;
    public final C11630kW A08;

    public static void A00(Scene scene, Transition transition, ViewGroup viewGroup, AnonymousClass3TK r10, int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            TransitionManager.go(scene, transition);
            return;
        }
        ArrayList A0k = C18240wQ.A0k(length);
        int i = 0;
        do {
            View findViewById = viewGroup.findViewById(iArr[i]);
            if (findViewById != null) {
                A0k.add(findViewById.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setDuration(150));
            }
            i++;
        } while (i < length);
        int size = A0k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == size - 1) {
                ((ViewPropertyAnimator) A0k.get(i2)).withEndAction(new C73344Sa(scene, transition, r10));
            }
            ((ViewPropertyAnimator) A0k.get(0)).start();
        }
    }

    public AnonymousClass3TK(C11630kW r1) {
        this.A08 = r1;
    }
}
