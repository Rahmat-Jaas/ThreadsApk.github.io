package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

/* renamed from: X.8XV  reason: invalid class name */
public final class AnonymousClass8XV extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass8XV A00 = new AnonymousClass8XV();

    public AnonymousClass8XV() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r2 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r2.BCM()) {
            AnonymousClass70V.A01(r2, (Modifier) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 7, 0);
        } else {
            r2.CuJ();
        }
        return Unit.A00;
    }
}
