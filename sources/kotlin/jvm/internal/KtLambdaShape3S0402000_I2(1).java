package kotlin.jvm.internal;

import X.AP0;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass55I;
import X.AnonymousClass69J;
import X.AnonymousClass7FV;
import X.AnonymousClass9F6;
import X.B5b;
import X.C02220Ah;
import X.C04220Ms;
import X.C122067Jz;
import X.C123657Xy;
import X.C147148nT;
import X.C147838q0;
import X.C18266Acd;
import X.C19556AyH;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.Alignment;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import kotlin.Unit;

public class KtLambdaShape3S0402000_I2 extends C02220Ah implements AnonymousClass0YY {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0402000_I2(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        super(1);
        this.A06 = i3;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = obj3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass55I r1;
        Drawable drawable;
        int i;
        AnonymousClass9F6 r4;
        C18266Acd acd;
        int i2;
        if (this.A06 != 0) {
            AP0 ap0 = (AP0) obj;
            C04220Ms.A0B(ap0, 0);
            int action = ap0.A00.getAction();
            if (action == 0) {
                r4 = (AnonymousClass9F6) this.A05;
                if (!AnonymousClass0wJ.A1X(r4.A01.A02) || r4.A03 != null) {
                    drawable = (Drawable) this.A03;
                    i = this.A01;
                    drawable.setTint(i);
                } else {
                    acd = (C18266Acd) this.A02;
                    i2 = this.A01;
                    acd.A00(AnonymousClass9F6.A00(r4, i2));
                }
            } else if (action == 1 || action == 3) {
                r4 = (AnonymousClass9F6) this.A05;
                if (!AnonymousClass0wJ.A1X(r4.A01.A02) || r4.A03 != null) {
                    drawable = (Drawable) this.A03;
                    i = C19556AyH.A02((B5b) this.A04, R.color.fds_transparent);
                    drawable.setTint(i);
                } else {
                    acd = (C18266Acd) this.A02;
                    i2 = C19556AyH.A02((B5b) this.A04, this.A00);
                    acd.A00(AnonymousClass9F6.A00(r4, i2));
                }
            }
            return false;
        }
        C04220Ms.A0B(obj, 0);
        C123657Xy r3 = (C123657Xy) this.A04;
        AnonymousClass69J layoutDirection = ((C147838q0) this.A05).getLayoutDirection();
        int i3 = this.A01;
        int i4 = this.A00;
        Alignment alignment = (Alignment) this.A02;
        Object B01 = ((C147148nT) this.A03).B01();
        if ((B01 instanceof AnonymousClass55I) && (r1 = (AnonymousClass55I) B01) != null) {
            alignment = r1.A00;
        }
        C122067Jz.A01(r3, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, alignment.A88(layoutDirection, AnonymousClass7FV.A00(r3.A01, r3.A00), AnonymousClass7FV.A00(i3, i4)));
        return Unit.A00;
    }
}
