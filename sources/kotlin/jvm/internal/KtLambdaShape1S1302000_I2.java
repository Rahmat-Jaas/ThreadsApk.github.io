package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6N9;
import X.AnonymousClass7KS;
import X.BKU;
import X.C02220Ah;
import X.C04220Ms;
import X.C100176Mh;
import X.C100266Mq;
import X.C115286uo;
import X.C115796vv;
import X.C117926zT;
import X.C121867Io;
import X.C121917Iu;
import X.C146348m5;
import X.C146568mS;
import X.C147188nY;
import X.C147258p3;
import X.C18390Aee;
import X.C18391Aef;
import X.C19558AyJ;
import X.C19894BEu;
import X.C86104wH;
import X.C882157e;
import X.C970267q;
import android.view.View;
import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

public class KtLambdaShape1S1302000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        boolean z;
        UserSession userSession;
        C19894BEu bEu;
        View view;
        Object obj3 = obj;
        switch (this.A06) {
            case 0:
                C100176Mh.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (C882157e) this.A04, this.A05, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 1:
                C147188nY A0H = C86104wH.A0H(obj, obj2);
                String str = this.A05;
                LineType lineType = (LineType) this.A03;
                C100266Mq.A00(A0H, (Modifier) this.A02, lineType, (C970267q) this.A04, str, C115796vv.A00(this.A00), this.A01);
                break;
            case 2:
                Modifier modifier = (Modifier) this.A03;
                String str2 = this.A05;
                AnonymousClass6N9.A00((C147258p3) this.A02, C86104wH.A0H(obj, obj2), modifier, str2, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 3:
                String str3 = this.A05;
                C121867Io.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (C146568mS) this.A04, str3, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 4:
                C147188nY A0H2 = C86104wH.A0H(obj, obj2);
                String str4 = this.A05;
                C117926zT.A00(A0H2, (Modifier) this.A03, (C115286uo) this.A02, (Integer) this.A04, str4, C115796vv.A00(this.A00), this.A01);
                break;
            case 5:
                view = (View) obj3;
                z = AnonymousClass0wJ.A1X(obj2);
                C04220Ms.A0B(view, 0);
                C18390Aee aee = (C18390Aee) this.A04;
                userSession = aee.A02;
                bEu = aee.A01;
                break;
            case 6:
                view = (View) obj3;
                z = AnonymousClass0wJ.A1X(obj2);
                C04220Ms.A0B(view, 0);
                C18391Aef aef = (C18391Aef) this.A04;
                userSession = aef.A02;
                bEu = aef.A01;
                break;
            case 7:
                C121917Iu.A03(C86104wH.A0H(obj, obj2), (Modifier) this.A03, this.A05, (AnonymousClass0ZU) this.A04, (AnonymousClass0YM) this.A02, C115796vv.A00(this.A00), this.A01);
                break;
            default:
                C147188nY A0H3 = C86104wH.A0H(obj, obj2);
                String str5 = this.A05;
                AnonymousClass7KS.A04(A0H3, (Modifier) this.A02, (C146348m5) this.A04, str5, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
        }
        C19558AyJ.A03(view, (BKU) this.A02, (BKU) this.A03, bEu, userSession, this.A05, this.A01 + 1, this.A00, z);
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S1302000_I2(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3) {
        super(2);
        this.A06 = i3;
        this.A03 = obj;
        this.A05 = str;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A00 = i;
        this.A01 = i2;
    }
}
