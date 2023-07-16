package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6EV  reason: invalid class name */
public final class AnonymousClass6EV {
    public static final Modifier A00(Modifier modifier, float f) {
        C04220Ms.A0B(modifier, 0);
        float f2 = f;
        if (f == 1.0f) {
            return modifier;
        }
        long j = AnonymousClass79F.A01;
        C142918fo r1 = C102746Wj.A00;
        long j2 = C102736Wi.A00;
        return modifier.Cx6(new GraphicsLayerModifierNodeElement(r1, 1.0f, 1.0f, f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, j, j2, j2, true));
    }
}
