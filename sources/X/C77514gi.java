package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.KtLambdaShape8S0300000_I2_3;

/* renamed from: X.4gi  reason: invalid class name and case insensitive filesystem */
public final class C77514gi extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass06E A01;
    public final /* synthetic */ C11630kW A02;
    public final /* synthetic */ AnonymousClass3H0 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ AnonymousClass0ZU A05;
    public final /* synthetic */ AnonymousClass0ZU A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77514gi(Context context, AnonymousClass06E r3, C11630kW r4, AnonymousClass3H0 r5, String str, AnonymousClass0ZU r7, AnonymousClass0ZU r8) {
        super(1);
        this.A00 = context;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = str;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = r4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass06E r5;
        Object obj2;
        AnonymousClass0ZU r2;
        C32165H8c A022;
        int i;
        C20096BOd bOd = (C20096BOd) obj;
        Context context = this.A00;
        if (bOd == null) {
            AnonymousClass3H0 r8 = this.A03;
            UserSession userSession = r8.A00;
            r5 = this.A01;
            String str = this.A04;
            obj2 = new KtLambdaShape8S0300000_I2_3(48, this.A02, this.A06, r8);
            r2 = this.A05;
            H1T A0O = AnonymousClass0wJ.A0O(userSession);
            A0O.A0J("commerce/shopping_auto_highlight/shop_reel/");
            A0O.A0O("story_id", str);
            A022 = AnonymousClass0wJ.A0T(A0O, C85814vo.class, AnonymousClass3Za.class);
            i = 46;
        } else {
            UserSession userSession2 = this.A03.A00;
            r5 = this.A01;
            String str2 = bOd.A1G;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.A04;
            obj2 = this.A06;
            r2 = this.A05;
            C18190wL.A1S(str2, 3, obj2);
            A022 = C63663i4.A02(C23921D1j.ARCHIVE, userSession2, str2, (String) null, (String) null, (String) null, (List) null, C18250wR.A0c(str3), AnonymousClass84Y.A00, -1, -1);
            i = 45;
        }
        C63873iU.A0F(A022, r2, obj2, i);
        C31155GhB.A01(context, r5, A022);
        return Unit.A00;
    }
}
