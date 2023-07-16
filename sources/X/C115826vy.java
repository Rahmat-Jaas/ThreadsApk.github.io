package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6vy  reason: invalid class name and case insensitive filesystem */
public final class C115826vy {
    public static final Modifier A00(Modifier modifier) {
        C04220Ms.A0B(modifier, 0);
        long j = AnonymousClass79F.A01;
        C142918fo r1 = C102746Wj.A00;
        long j2 = C102736Wi.A00;
        return modifier.Cx6(new GraphicsLayerModifierNodeElement(r1, 1.0f, 1.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, j, j2, j2, true));
    }

    public static final Modifier A01(Modifier modifier, C142918fo r14) {
        boolean A1Z = AnonymousClass0wJ.A1Z(modifier, r14);
        long j = AnonymousClass79F.A01;
        long j2 = C102736Wi.A00;
        return modifier.Cx6(new GraphicsLayerModifierNodeElement(r14, 1.0f, 1.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, j, j2, j2, A1Z));
    }
}
