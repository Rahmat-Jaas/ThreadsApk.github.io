package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass56T;
import X.AnonymousClass57M;
import X.AnonymousClass6N2;
import X.AnonymousClass6NR;
import X.AnonymousClass7In;
import X.C02220Ah;
import X.C100556Nt;
import X.C115796vv;
import X.C121177En;
import X.C146638ma;
import X.C147368pE;
import X.C19210zU;
import X.C21839C2o;
import X.C86104wH;
import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.barcelona.profile.editor.ProfileEditorViewModel;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

public class KtLambdaShape1S0702000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0702000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3) {
        super(2);
        this.A09 = i3;
        this.A05 = obj;
        this.A06 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
        this.A07 = obj6;
        this.A08 = obj7;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A09) {
            case 0:
                C147368pE r3 = (C147368pE) this.A06;
                Modifier modifier = (Modifier) this.A04;
                AnonymousClass6N2.A00((Context) this.A02, C86104wH.A0H(obj, obj2), r3, modifier, (C146638ma) this.A05, (AnonymousClass56T) this.A08, (C21839C2o) this.A03, (UserSession) this.A07, C115796vv.A00(this.A00), this.A01);
                break;
            case 1:
                AnonymousClass0ZU r6 = (AnonymousClass0ZU) this.A03;
                C121177En r32 = (C121177En) this.A07;
                AnonymousClass7In.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A02, r32, (AnonymousClass57M) this.A08, (AnonymousClass0ZU) this.A06, r6, (AnonymousClass0YY) this.A04, (AnonymousClass0YY) this.A05, C115796vv.A00(this.A00), this.A01);
                break;
            case 2:
                C121177En r33 = (C121177En) this.A07;
                AnonymousClass6NR.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, r33, (ProfileEditorViewModel) this.A08, (AnonymousClass0ZU) this.A06, (AnonymousClass0ZU) this.A03, (AnonymousClass0YY) this.A05, (AnonymousClass0YY) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            default:
                Modifier modifier2 = (Modifier) this.A03;
                Context context = (Context) this.A02;
                UserSession userSession = (UserSession) this.A07;
                C100556Nt.A00(context, C86104wH.A0H(obj, obj2), modifier2, (C19210zU) this.A08, userSession, (AnonymousClass0ZU) this.A06, (AnonymousClass0ZU) this.A05, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
        }
        return Unit.A00;
    }
}
