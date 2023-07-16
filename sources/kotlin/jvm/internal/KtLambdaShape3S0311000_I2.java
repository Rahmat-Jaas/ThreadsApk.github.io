package kotlin.jvm.internal;

import X.AnonymousClass00J;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6MS;
import X.AnonymousClass74L;
import X.AnonymousClass7JS;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C100356Mz;
import X.C104136bI;
import X.C115286uo;
import X.C115796vv;
import X.C120577Bm;
import X.C122087Kb;
import X.C147068nL;
import X.C147188nY;
import X.C147368pE;
import X.C36483JXj;
import X.C86104wH;
import X.C90365Ls;
import X.C90375Lt;
import X.C97846Dc;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.typedurl.ImageUrl;
import kotlin.Unit;

public class KtLambdaShape3S0311000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0311000_I2(Object obj, Object obj2, Object obj3, int i, int i2, boolean z) {
        super(2);
        this.A05 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = z;
        this.A01 = obj3;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        float f;
        Object obj3 = obj;
        Object obj4 = obj2;
        switch (this.A05) {
            case 0:
                boolean z = this.A04;
                Integer num = (Integer) this.A01;
                AnonymousClass6MS.A00(C86104wH.A0H(obj3, obj4), (Modifier) this.A02, num, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), z);
                break;
            case 1:
                C147188nY r5 = (C147188nY) obj3;
                if ((AnonymousClass0wJ.A04(obj4) & 11) == 2 && r5.BCM()) {
                    r5.CuJ();
                    break;
                } else {
                    C147068nL r4 = (C147068nL) this.A02;
                    if (r4 instanceof C90365Ls) {
                        r5.Cvb(81417100);
                        C115286uo A022 = C120577Bm.A02(r5, (ImageUrl) AnonymousClass00J.A0C(((C90365Ls) r4).A04), (AnonymousClass0ZU) this.A03, 2, 0);
                        String AOQ = r4.AOQ();
                        if (AOQ == null) {
                            AOQ = AnonymousClass7JS.A01(r5, 2131822091);
                        }
                        C97846Dc.A00(r5, (Alignment) null, (Modifier) null, (C104136bI) null, A022, AnonymousClass74L.A00, AOQ, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 24584, 108);
                    } else if (r4 instanceof C90375Lt) {
                        r5.Cvb(81417528);
                        C36483JXj jXj = ((C90375Lt) r4).A03;
                        float width = (float) r4.getWidth();
                        float height = (float) r4.getHeight();
                        if (width <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || height <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                            f = 1.0f;
                        } else {
                            f = width / height;
                        }
                        C100356Mz.A00(r5, (C147368pE) this.A01, (Modifier) null, jXj, r4.AOQ(), (AnonymousClass0ZU) this.A03, f, ((this.A00 >> 9) & 896) | 12610560, 64, this.A04, true, false);
                    } else {
                        r5.Cvb(81418062);
                    }
                    AnonymousClass7W3.A0y(r5);
                    break;
                }
                break;
            default:
                C122087Kb.A04(C86104wH.A0H(obj3, obj4), (ImageUrl) this.A01, (ImageUrl) this.A02, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A04);
                break;
        }
        return Unit.A00;
    }
}
