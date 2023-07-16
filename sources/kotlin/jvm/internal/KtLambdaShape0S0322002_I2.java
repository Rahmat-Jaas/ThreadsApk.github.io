package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C115286uo;
import X.C115796vv;
import X.C120547Bi;
import X.C86104wH;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

public class KtLambdaShape0S0322002_I2 extends C02220Ah implements AnonymousClass0YP {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public boolean A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0322002_I2(Object obj, Object obj2, Object obj3, float f, float f2, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A09 = i3;
        this.A06 = obj;
        this.A00 = f;
        this.A01 = f2;
        this.A04 = obj2;
        this.A08 = z;
        this.A07 = z2;
        this.A05 = obj3;
        this.A02 = i;
        this.A03 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A09) {
            case 0:
                float f = this.A00;
                float f2 = this.A01;
                C120547Bi.A02(C86104wH.A0H(obj, obj2), (Modifier) this.A04, (ImageUrl) this.A06, (AnonymousClass0YY) this.A05, f, f2, C115796vv.A00(this.A02), this.A03, this.A08, this.A07);
                break;
            case 1:
                C120547Bi.A00((Drawable) this.A06, C86104wH.A0H(obj, obj2), (Modifier) this.A04, (AnonymousClass0YY) this.A05, this.A00, this.A01, C115796vv.A00(this.A02), this.A03, this.A08, this.A07);
                break;
            default:
                float f3 = this.A00;
                float f4 = this.A01;
                C120547Bi.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A04, (C115286uo) this.A06, (AnonymousClass0YY) this.A05, f3, f4, C115796vv.A00(this.A02), this.A03, this.A08, this.A07);
                break;
        }
        return Unit.A00;
    }
}
