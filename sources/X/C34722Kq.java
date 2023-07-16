package X;

import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.transition.TransitionSet;

/* renamed from: X.2Kq  reason: invalid class name and case insensitive filesystem */
public final class C34722Kq {
    public static final void A00(Scene scene) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new Fade(2));
        transitionSet.addTransition(new Fade(1));
        transitionSet.setDuration(300);
        TransitionManager.go(scene, transitionSet);
    }
}
