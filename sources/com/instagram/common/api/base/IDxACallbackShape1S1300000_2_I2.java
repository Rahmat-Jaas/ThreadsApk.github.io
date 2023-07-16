package com.instagram.common.api.base;

import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass3LY;
import X.AnonymousClass3XX;
import X.AnonymousClass6VE;
import X.BKU;
import X.C04220Ms;
import X.C131127rS;
import X.C14030oh;
import X.C18240wQ;
import X.C63873iU;
import X.C94075ti;
import com.instagram.service.session.UserSession;

public class IDxACallbackShape1S1300000_2_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (this.A04 != 0) {
            A01(this, obj);
        } else {
            A00(this, obj);
        }
    }

    public IDxACallbackShape1S1300000_2_I2(UserSession userSession, String str, AnonymousClass0ZU r3, AnonymousClass0YY r4, int i) {
        this.A04 = i;
        this.A01 = r4;
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = r3;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int A032;
        int i;
        if (this.A04 != 0) {
            A032 = C14030oh.A03(-945560288);
            C18240wQ.A1G(this.A00);
            i = 998732685;
        } else {
            A032 = C14030oh.A03(1670075450);
            C18240wQ.A1G(this.A00);
            i = 762877527;
        }
        C14030oh.A0A(i, A032);
    }

    public static final /* bridge */ /* synthetic */ void A00(IDxACallbackShape1S1300000_2_I2 iDxACallbackShape1S1300000_2_I2, Object obj) {
        int A032 = C14030oh.A03(-64377853);
        C94075ti r5 = (C94075ti) obj;
        int A002 = AnonymousClass0wJ.A00(1084387429, r5);
        AnonymousClass0YY r1 = (AnonymousClass0YY) iDxACallbackShape1S1300000_2_I2.A01;
        BKU bku = r5.A00;
        if (bku != null) {
            r1.invoke(bku);
            UserSession userSession = (UserSession) iDxACallbackShape1S1300000_2_I2.A02;
            AnonymousClass6VE.A00(userSession).A00();
            AnonymousClass3LY.A00(userSession).CWx(new C131127rS());
            C14030oh.A0A(1843158789, A002);
            C14030oh.A0A(646020936, A032);
            return;
        }
        C04220Ms.A0E("media");
        throw null;
    }

    public static final /* bridge */ /* synthetic */ void A01(IDxACallbackShape1S1300000_2_I2 iDxACallbackShape1S1300000_2_I2, Object obj) {
        int A032 = C14030oh.A03(-1067593382);
        C94075ti r5 = (C94075ti) obj;
        int A002 = AnonymousClass0wJ.A00(1831964698, r5);
        AnonymousClass0YY r1 = (AnonymousClass0YY) iDxACallbackShape1S1300000_2_I2.A01;
        BKU bku = r5.A00;
        if (bku != null) {
            r1.invoke(bku);
            UserSession userSession = (UserSession) iDxACallbackShape1S1300000_2_I2.A02;
            AnonymousClass6VE.A00(userSession).A00();
            AnonymousClass3LY.A00(userSession).CWx(new C131127rS());
            C14030oh.A0A(-1417374626, A002);
            C14030oh.A0A(2041652886, A032);
            return;
        }
        C04220Ms.A0E("media");
        throw null;
    }
}
