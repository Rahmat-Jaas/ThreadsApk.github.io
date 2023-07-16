package com.instagram.common.api.base;

import X.AnonymousClass0g9;
import X.AnonymousClass0wJ;
import X.AnonymousClass1SV;
import X.AnonymousClass1mP;
import X.AnonymousClass2B8;
import X.AnonymousClass312;
import X.AnonymousClass390;
import X.AnonymousClass3XX;
import X.AnonymousClass433;
import X.AnonymousClass5z0;
import X.C14030oh;
import X.C63713iA;
import X.C63873iU;
import X.C85634vW;
import X.C85814vo;
import com.instagram.graphql.instagramschema.IGFxImBusinessReminderQueryResponseImpl;
import java.util.concurrent.TimeUnit;

public class IDxACallbackShape44S0000000_1_I2 extends C63873iU {
    public final int A00;

    public IDxACallbackShape44S0000000_1_I2(int i) {
        this.A00 = i;
    }

    public final void onFail(AnonymousClass3XX r3) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = C14030oh.A03(-2121306064);
                Object obj = r3.A00;
                if (obj != null) {
                    ((C85814vo) obj).getErrorMessage();
                }
                i2 = 917971235;
                break;
            case 2:
                i = C14030oh.A03(1553152275);
                i2 = 1293335328;
                break;
            case 3:
                i = C14030oh.A03(-897457296);
                i2 = 1852998901;
                break;
            case 4:
                i = C14030oh.A03(-2062589766);
                i2 = -1000440293;
                break;
            default:
                super.onFail(r3);
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = C14030oh.A03(610578956);
                int A03 = C14030oh.A03(-1686239977);
                AnonymousClass433.A02 = true;
                C14030oh.A0A(1706298564, A03);
                i2 = 558079474;
                break;
            case 2:
                i = C14030oh.A03(-232235681);
                int A032 = C14030oh.A03(-1153797330);
                AnonymousClass312.A00 = (IGFxImBusinessReminderQueryResponseImpl) ((AnonymousClass5z0) obj).A01;
                C14030oh.A0A(-456249004, A032);
                i2 = -1784577035;
                break;
            case 3:
                i = C14030oh.A03(35843079);
                C14030oh.A0A(1418882515, C14030oh.A03(-2022542513));
                i2 = 1814776645;
                break;
            case 4:
                i = C14030oh.A03(120520211);
                AnonymousClass5z0 r8 = (AnonymousClass5z0) obj;
                int A033 = C14030oh.A03(-1286131620);
                C63713iA.A00 = r8;
                Object obj2 = r8.A01;
                if (obj2 != null) {
                    C85634vW r1 = (C85634vW) obj2;
                    if (!(r1.AkP() == null || r1.AkP().B4J() == null)) {
                        C63713iA.A01 = r1.AkP().B4J().BBJ();
                    }
                }
                C14030oh.A0A(-1370703516, A033);
                i2 = -1822593885;
                break;
            case 6:
                i = C14030oh.A03(-2069831270);
                AnonymousClass1SV r82 = (AnonymousClass1SV) obj;
                int A002 = AnonymousClass0wJ.A00(-1386086090, r82);
                AnonymousClass390 r12 = r82.A00;
                if (r12 != null && !AnonymousClass2B8.A00) {
                    AnonymousClass2B8.A00 = true;
                    AnonymousClass0g9.A00().A01(new AnonymousClass1mP(r12), TimeUnit.SECONDS.toMillis(r12.A00));
                }
                C14030oh.A0A(-1692881786, A002);
                i2 = -300441289;
                break;
            default:
                super.onSuccess(obj);
                return;
        }
        C14030oh.A0A(i2, i);
    }
}
