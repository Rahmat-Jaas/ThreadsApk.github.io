package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass7FJ;
import X.C02220Ah;
import X.C115796vv;
import X.C120547Bi;
import X.C121347Fo;
import X.C122077Ka;
import X.C147188nY;
import X.C86104wH;
import X.C967466n;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.Modifier;
import com.instagram.common.gallery.GalleryItem;
import kotlin.Unit;

public class KtLambdaShape1S0221000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public final int A05;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        switch (this.A05) {
            case 0:
                AnonymousClass7FJ.A02(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (C967466n) this.A01, C115796vv.A00(this.A00), this.A04, this.A03);
                break;
            case 1:
                boolean z = this.A03;
                boolean z2 = this.A04;
                C121347Fo.A02(C86104wH.A0H(obj, obj2), (Modifier) this.A01, (AnonymousClass0ZU) this.A02, C115796vv.A00(this.A00), z, z2);
                break;
            case 2:
                boolean z3 = this.A03;
                boolean z4 = this.A04;
                C121347Fo.A03(C86104wH.A0H(obj, obj2), (Modifier) this.A01, (AnonymousClass0ZU) this.A02, C115796vv.A00(this.A00), z3, z4);
                break;
            case 3:
                C147188nY r4 = (C147188nY) obj3;
                if ((AnonymousClass0wJ.A04(obj2) & 11) == 2 && r4.BCM()) {
                    r4.CuJ();
                    break;
                } else {
                    boolean z5 = this.A04;
                    boolean z6 = this.A03;
                    AnonymousClass0YY r6 = (AnonymousClass0YY) this.A02;
                    int i = this.A00;
                    C120547Bi.A00((Drawable) this.A01, r4, (Modifier) null, r6, (float) 38, (float) 32, (57344 & i) | 440 | (458752 & i) | ((i >> 6) & 3670016), 8, z5, z6);
                    break;
                }
            default:
                boolean z7 = this.A03;
                boolean z8 = this.A04;
                C122077Ka.A0A(C86104wH.A0H(obj, obj2), (GalleryItem) this.A02, (AnonymousClass0YY) this.A01, C115796vv.A00(this.A00), z7, z8);
                break;
        }
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0221000_I2(Object obj, Object obj2, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A05 = i2;
        this.A01 = obj;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = obj2;
        this.A00 = i;
    }
}
