package kotlin.jvm.internal;

import X.AnonymousClass0YC;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass5I4;
import X.AnonymousClass5IJ;
import X.AnonymousClass6MG;
import X.AnonymousClass7JR;
import X.AnonymousClass7JS;
import X.AnonymousClass7KB;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C04220Ms;
import X.C115656vh;
import X.C147188nY;
import X.C86124wJ;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

public class KtLambdaShape4S1400000_I2 extends C02220Ah implements AnonymousClass0YC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape4S1400000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        super(4);
        this.A05 = i;
        this.A00 = obj;
        this.A04 = str;
        this.A03 = obj2;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        Object[] objArr;
        int i3;
        int i4 = this.A05;
        int A042 = AnonymousClass0wJ.A04(obj2);
        C147188nY r8 = (C147188nY) obj3;
        int A043 = AnonymousClass0wJ.A04(obj4);
        Object obj5 = obj;
        if (i4 != 0) {
            C04220Ms.A0B(obj5, 0);
            if ((A043 & 14) == 0) {
                i3 = A043 | C147188nY.A0F(r8, obj5);
            } else {
                i3 = A043;
            }
            if ((A043 & 112) == 0) {
                i3 |= C147188nY.A04(r8, A042);
            }
            if ((i3 & 731) != 146 || !r8.BCM()) {
                AnonymousClass5IJ r5 = (AnonymousClass5IJ) C86124wJ.A0p(this.A00, A042);
                ImageUrl imageUrl = r5.A00;
                String str = r5.A03;
                Modifier A002 = C115656vh.A00(Modifier.A00, AnonymousClass7KB.A01(r8));
                String str2 = r5.A01;
                boolean z = r5.A07;
                AnonymousClass5I4 r10 = AnonymousClass5I4.A04;
                String str3 = this.A04;
                AnonymousClass6MG.A00(r8, A002, r10, imageUrl, str, str2, (AnonymousClass0ZU) null, (AnonymousClass0YY) null, AnonymousClass7JR.A00(r8, new KtLambdaShape5S1400000_I2(r5, this.A03, this.A01, this.A02, str3, 0), 1488477278), 0, 48, 1760, z, false, false, false);
            }
            r8.CuJ();
        } else {
            C04220Ms.A0B(obj5, 0);
            if ((A043 & 14) == 0) {
                i = A043 | C147188nY.A0F(r8, obj5);
            } else {
                i = A043;
            }
            if ((A043 & 112) == 0) {
                i |= C147188nY.A04(r8, A042);
            }
            if ((i & 731) != 146 || !r8.BCM()) {
                AnonymousClass5IJ r4 = (AnonymousClass5IJ) C86124wJ.A0p(this.A00, A042);
                String str4 = null;
                if (!r4.A04) {
                    r8.Cvb(289582879);
                    i2 = 2131822013;
                    objArr = new Object[]{r4.A03, this.A04};
                } else if (r4.A05) {
                    r8.Cvb(289583215);
                    i2 = 2131822014;
                    objArr = new Object[]{r4.A03};
                } else {
                    r8.Cvb(387151212);
                    AnonymousClass7W3.A0z(r8, false);
                    ImageUrl imageUrl2 = r4.A00;
                    String str5 = r4.A03;
                    AnonymousClass6MG.A00(r8, Modifier.A04(Modifier.A00), AnonymousClass5I4.A04, imageUrl2, str5, r4.A01, new KtLambdaShape5S1200000_I2(this.A02, this.A03, str4, 14), (AnonymousClass0YY) null, AnonymousClass7JR.A00(r8, new KtLambdaShape50S0200000_I2(17, r4, this.A01), -347296157), 384, 48, 1248, r4.A07, false, false, false);
                }
                str4 = AnonymousClass7JS.A03(r8, objArr, i2);
                AnonymousClass7W3.A0z(r8, false);
                ImageUrl imageUrl22 = r4.A00;
                String str52 = r4.A03;
                AnonymousClass6MG.A00(r8, Modifier.A04(Modifier.A00), AnonymousClass5I4.A04, imageUrl22, str52, r4.A01, new KtLambdaShape5S1200000_I2(this.A02, this.A03, str4, 14), (AnonymousClass0YY) null, AnonymousClass7JR.A00(r8, new KtLambdaShape50S0200000_I2(17, r4, this.A01), -347296157), 384, 48, 1248, r4.A07, false, false, false);
            }
            r8.CuJ();
        }
        return Unit.A00;
    }
}
