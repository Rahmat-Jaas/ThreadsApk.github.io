package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlockGraphicsLayerElement;
import androidx.compose.ui.graphics.GraphicsLayerModifierNodeElement;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.6w3  reason: invalid class name and case insensitive filesystem */
public final class C115876w3 {
    public static final Modifier A00(Modifier modifier) {
        if (!C86164wN.A1Q(0, modifier)) {
            return modifier;
        }
        C123327Wm r0 = Modifier.A00;
        long j = AnonymousClass79F.A01;
        C142918fo r2 = C102746Wj.A00;
        long j2 = C102736Wi.A00;
        return modifier.Cx6(r0.Cx6(new GraphicsLayerModifierNodeElement(r2, 1.0f, 1.0f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, j, j2, j2, false)));
    }

    public static final Modifier A01(Modifier modifier, AnonymousClass0YY r2) {
        AnonymousClass0wJ.A1N(modifier, r2);
        return modifier.Cx6(new BlockGraphicsLayerElement(r2));
    }
}
