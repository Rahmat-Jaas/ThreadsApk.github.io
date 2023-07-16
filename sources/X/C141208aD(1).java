package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import kotlin.Unit;

/* renamed from: X.8aD  reason: invalid class name and case insensitive filesystem */
public final class C141208aD extends C02220Ah implements AnonymousClass0YM {
    public static final C141208aD A00 = new C141208aD();

    public C141208aD() {
        super(3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY r2 = (C147188nY) obj2;
        if ((AnonymousClass0wJ.A04(obj3) & 81) != 16 || !r2.BCM()) {
            AnonymousClass70V.A01(r2, (Modifier) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 7, 0);
        } else {
            r2.CuJ();
        }
        return Unit.A00;
    }
}
