package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass6M5;
import X.AnonymousClass6MA;
import X.AnonymousClass6QU;
import X.AnonymousClass7Ga;
import X.AnonymousClass7JX;
import X.AnonymousClass8s2;
import X.C02220Ah;
import X.C115286uo;
import X.C115796vv;
import X.C117686z5;
import X.C120477Ba;
import X.C121387Fs;
import X.C121947Ix;
import X.C144668is;
import X.C147188nY;
import X.C23894D0g;
import X.C86104wH;
import X.C968566y;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

public class KtLambdaShape2S0212000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0212000_I2(Object obj, Object obj2, int i, int i2, int i3, boolean z) {
        super(2);
        this.A05 = i3;
        this.A03 = obj;
        this.A04 = z;
        this.A02 = obj2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A05;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        switch (i) {
            case 0:
                boolean z = this.A04;
                AnonymousClass6M5.A00(A0H, (Modifier) this.A02, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, z);
                break;
            case 1:
                AnonymousClass6MA.A00(A0H, (Modifier) this.A03, (AnonymousClass0YP) this.A02, C115796vv.A00(this.A00), this.A01, this.A04);
                break;
            case 2:
                boolean z2 = this.A04;
                C117686z5.A00(A0H, (Modifier) this.A03, (AnonymousClass0ZU) this.A02, C115796vv.A00(this.A00), this.A01, z2);
                break;
            case 6:
                boolean z3 = this.A04;
                AnonymousClass7Ga.A01(A0H, (Modifier) this.A02, (AnonymousClass8s2) this.A03, C115796vv.A00(this.A00), this.A01, z3);
                break;
            case 7:
                boolean z4 = this.A04;
                C120477Ba.A02(A0H, (Modifier) this.A02, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01, z4);
                break;
            case 8:
                boolean z5 = this.A04;
                C121947Ix.A00(A0H, (Modifier) this.A02, (ImageUrl) this.A03, C115796vv.A00(this.A00), this.A01, z5);
                break;
            case 9:
                C121387Fs.A02(A0H, (Modifier) this.A02, (C968566y) this.A03, C115796vv.A00(this.A00), this.A01, this.A04);
                break;
            case 10:
                AnonymousClass6QU.A00(A0H, (C115286uo) this.A02, (C144668is) this.A03, C115796vv.A00(this.A00), this.A01, this.A04);
                break;
            default:
                boolean z6 = this.A04;
                AnonymousClass7JX.A01(A0H, (Modifier) this.A03, (C23894D0g) this.A02, C115796vv.A00(this.A00), this.A01, z6);
                break;
        }
        return Unit.A00;
    }
}
