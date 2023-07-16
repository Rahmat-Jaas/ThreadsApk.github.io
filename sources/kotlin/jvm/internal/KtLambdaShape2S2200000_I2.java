package kotlin.jvm.internal;

import X.AnonymousClass000;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.BKN;
import X.BKU;
import X.C02220Ah;
import X.C04220Ms;
import X.C10300i6;
import X.C13330nS;
import X.C146638ma;
import X.C18180wK;
import X.C18210wN;
import X.C18230wP;
import X.C21839C2o;
import X.C23267CpF;
import X.C63493hb;
import X.C86114wI;
import X.C884057x;
import android.content.Context;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

public class KtLambdaShape2S2200000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S2200000_I2(PendingMedia pendingMedia, C23267CpF cpF, String str, String str2, int i) {
        super(0);
        this.A04 = i;
        this.A01 = cpF;
        this.A00 = pendingMedia;
        if (3 - i != 0) {
            this.A02 = str;
            this.A03 = str2;
        } else {
            this.A03 = str;
            this.A02 = str2;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A04) {
            case 0:
                C884057x r2 = (C884057x) this.A01;
                String str = this.A02;
                C04220Ms.A0B(str, 0);
                UserSession userSession = r2.A0A;
                C21839C2o c2o = r2.A09;
                BKU A0W = C86114wI.A0W(userSession, str);
                if (A0W != null) {
                    USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(c2o, userSession), "instagram_organic_comment"), 1894);
                    BKN bkn = A0W.A0f;
                    A0I.A0T("m_pk", bkn.A4Y);
                    A0I.A1e(bkn.A4l);
                    A0I.A1Q(bkn.A4e);
                    A0I.A0z(C18230wP.A0f(A0W.Aup().A00));
                    A0I.A0T(AnonymousClass000.A00(171), "0");
                    A0I.A0S(AnonymousClass000.A00(1244), C18210wN.A0V());
                    A0I.Bb4();
                }
                String str2 = this.A03;
                boolean A0I2 = C04220Ms.A0I(str2, str);
                C146638ma r1 = (C146638ma) this.A00;
                if (A0I2) {
                    r1.BhK(str2, (String) null);
                    break;
                } else {
                    r1.BhK(str, str2);
                    break;
                }
            case 1:
                C63493hb.A07((Context) this.A00, (C10300i6) this.A01, this.A03, this.A02);
                break;
            case 2:
                ((C23267CpF) this.A01).A00.A1I((PendingMedia) this.A00, this.A03, this.A02);
                break;
            case 3:
                ((C23267CpF) this.A01).A00.A1J((PendingMedia) this.A00, this.A03, this.A02);
                break;
            default:
                ((C23267CpF) this.A01).A00.A1K((PendingMedia) this.A00, this.A02, this.A03);
                break;
        }
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S2200000_I2(Object obj, Object obj2, String str, String str2, int i) {
        super(0);
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = str2;
    }
}
