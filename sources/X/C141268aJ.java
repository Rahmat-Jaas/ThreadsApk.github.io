package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import kotlin.Unit;

/* renamed from: X.8aJ  reason: invalid class name and case insensitive filesystem */
public final class C141268aJ extends C02220Ah implements AnonymousClass0YM {
    public static final C141268aJ A00 = new C141268aJ();

    public C141268aJ() {
        super(3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY r2 = (C147188nY) obj2;
        if ((AnonymousClass0wJ.A04(obj3) & 81) != 16 || !r2.BCM()) {
            AnonymousClass6ED.A00(r2, AnonymousClass7Kq.A08(Modifier.A04(Modifier.A00), AnonymousClass6FH.A00(r2, R.dimen.abc_button_inset_vertical_material)), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 0, 12, AnonymousClass7KB.A01(r2));
        } else {
            r2.CuJ();
        }
        return Unit.A00;
    }
}
