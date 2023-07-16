package X;

import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import kotlin.Unit;

/* renamed from: X.8Qv  reason: invalid class name and case insensitive filesystem */
public final class C140048Qv extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ AnonymousClass0ZU A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140048Qv(AnonymousClass0ZU r2, boolean z, boolean z2) {
        super(2);
        this.A02 = z;
        this.A01 = z2;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY r6 = (C147188nY) obj;
        if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r6.BCM()) {
            if (this.A02) {
                boolean z = this.A01;
                int i = R.drawable.barcelona_globe_outline_24;
                int i2 = 2131822162;
                if (z) {
                    i = R.drawable.instagram_lock_pano_outline_24;
                    i2 = 2131822159;
                }
                C115286uo A002 = AnonymousClass6QP.A00(r6, i);
                String A012 = AnonymousClass7JS.A01(r6, i2);
                C123327Wm r7 = Modifier.A00;
                AnonymousClass0ZU r3 = this.A00;
                boolean A0y = C147188nY.A0y(r6, r3);
                AnonymousClass7W3 r2 = (AnonymousClass7W3) r6;
                Object A13 = r2.A13();
                if (A0y || A13 == AnonymousClass7GN.A00) {
                    A13 = AnonymousClass7W3.A0K(r2, r3, 16);
                }
                C86114wI.A17(r6, AnonymousClass70U.A00(r6, r7, (AnonymousClass799) null, AnonymousClass7W3.A08(r2, A13, false), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 255, false), A002, A012);
            }
        } else {
            r6.CuJ();
        }
        return Unit.A00;
    }
}
