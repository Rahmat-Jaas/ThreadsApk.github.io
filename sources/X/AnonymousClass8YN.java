package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

/* renamed from: X.8YN  reason: invalid class name */
public final class AnonymousClass8YN extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImageUrl A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8YN(ImageUrl imageUrl, int i) {
        super(3);
        this.A01 = imageUrl;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C147188nY A0H = C86104wH.A0H(obj2, obj3);
        C04220Ms.A0B(obj, 0);
        C97846Dc.A00(A0H, (Alignment) null, AnonymousClass7Kq.A0F(Modifier.A00, 215), (C104136bI) null, C120577Bm.A01(A0H, this.A01), (C146878n1) null, AnonymousClass7JS.A01(A0H, 2131826884), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 392, 120);
        return Unit.A00;
    }
}
