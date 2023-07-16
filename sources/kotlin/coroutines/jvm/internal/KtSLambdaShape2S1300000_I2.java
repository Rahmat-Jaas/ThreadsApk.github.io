package kotlin.coroutines.jvm.internal;

import X.AnonymousClass0OU;
import X.AnonymousClass0YM;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass8P7;
import X.AnonymousClass8P8;
import X.C117936zU;
import X.C134637y5;
import X.C146958n9;
import X.C18250wR;
import X.C39142Kno;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;

public class KtSLambdaShape2S1300000_I2 extends C39142Kno implements AnonymousClass0YM {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtSLambdaShape2S1300000_I2(C134637y5 r2, String str, C146958n9 r4, int i) {
        super(3, r4);
        this.A04 = i;
        this.A03 = str;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A04;
        C146958n9 r7 = (C146958n9) obj3;
        String str = this.A03;
        C134637y5 r2 = (C134637y5) this.A02;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        KtSLambdaShape2S1300000_I2 ktSLambdaShape2S1300000_I2 = new KtSLambdaShape2S1300000_I2(r2, str, r7, i);
        ktSLambdaShape2S1300000_I2.A00 = obj;
        ktSLambdaShape2S1300000_I2.A01 = obj2;
        return ktSLambdaShape2S1300000_I2.invokeSuspend(Unit.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        AnonymousClass0YY r3;
        int i = this.A04;
        AnonymousClass0OU.A00(obj);
        List list = (List) this.A00;
        Iterable<PendingMedia> iterable = (Iterable) this.A01;
        String str = this.A03;
        UserSession userSession = ((C134637y5) this.A02).A05;
        boolean A1J = C18250wR.A1J(userSession, str);
        if (i != 0) {
            if (A1J) {
                z = true;
                r3 = AnonymousClass8P8.A00;
            }
            return list;
        }
        if (A1J) {
            z = false;
            r3 = AnonymousClass8P7.A00;
        }
        return list;
        AnonymousClass0wJ.A1M(list, 0, iterable);
        for (PendingMedia pendingMedia : iterable) {
            if (AnonymousClass0wJ.A1X(r3.invoke(pendingMedia))) {
                list = C117936zU.A01(pendingMedia, userSession, list, z);
            }
        }
        return list;
    }
}
