package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

/* renamed from: X.8WC  reason: invalid class name */
public final class AnonymousClass8WC extends C02220Ah implements AnonymousClass0YP {
    public static final AnonymousClass8WC A00 = new AnonymousClass8WC();

    public AnonymousClass8WC() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r2 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r2.BCM()) {
            AnonymousClass78U.A01.A00(r2, (Modifier) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 3072, 7, 0);
        } else {
            r2.CuJ();
        }
        return Unit.A00;
    }
}
