package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape2S0402000_I2;

/* renamed from: X.6Lw  reason: invalid class name and case insensitive filesystem */
public final class C100076Lw {
    public static final void A00(C147188nY r15, Modifier modifier, C22168CKc cKc, ImageUrl imageUrl, List list, int i, int i2) {
        C147188nY r9 = r15;
        int i3 = i2;
        Modifier A0d = C147188nY.A0d(r15, modifier, -1897993270, i3);
        r15.Cvb(259240014);
        Modifier modifier2 = Modifier.A00;
        C22168CKc cKc2 = cKc;
        if (cKc != null) {
            modifier2 = C120417Am.A02(modifier2, InspectableValueKt.A00, new AnonymousClass8Yc(AnonymousClass6QP.A00(r15, cKc2.A00), cKc2.A01, AnonymousClass7KE.A07, C147188nY.A0R(r15, C103086Xt.A00)));
        }
        AnonymousClass7W3 A04 = AnonymousClass7W3.A04(r9, false);
        ImageUrl imageUrl2 = imageUrl;
        List list2 = list;
        if (list != null) {
            C100056Lu.A00(list2, Modifier.A03(r9, A0d, modifier2, 259240324), r9, 8, 0);
        } else {
            r9.Cvb(259240453);
            C97846Dc.A00(r9, (Alignment) null, C115826vy.A01(A0d.Cx6(modifier2), AnonymousClass7G5.A00), (C104136bI) null, C120577Bm.A01(r9, imageUrl2), (C146878n1) null, (String) null, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 56, 120);
        }
        AnonymousClass7W3.A0w(A04, false);
        C147178nW AKE = r9.AKE();
        if (AKE != null) {
            List list3 = list2;
            Modifier modifier3 = A0d;
            AKE.D9d(new KtLambdaShape2S0402000_I2(list3, modifier3, imageUrl2, cKc2, i, i3, 4));
        }
    }
}
