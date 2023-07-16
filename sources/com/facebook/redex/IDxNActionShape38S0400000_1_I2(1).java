package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1XX;
import X.AnonymousClass2AS;
import X.AnonymousClass3D9;
import X.AnonymousClass3DI;
import X.AnonymousClass7Ko;
import X.C09140ev;
import X.C18180wK;
import X.C18190wL;
import X.C18250wR;
import X.C23101bv;
import X.C25786Drz;
import X.C29571yr;
import X.C32165H8c;
import X.C566538a;
import X.C59333Kk;
import X.C63503hc;
import X.C63873iU;
import X.C680441x;
import X.C84794ts;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.api.base.IDxACallbackShape35S0200000_1_I2;
import com.instagram.service.session.UserSession;

public class IDxNActionShape38S0400000_1_I2 implements C84794ts {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxNActionShape38S0400000_1_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj3;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object C8i(AnonymousClass3DI r8, Object obj, int i) {
        C23101bv r5;
        C32165H8c A05;
        C63873iU iDxACallbackShape35S0200000_1_I2;
        int i2 = this.A04;
        AnonymousClass3D9 r4 = (AnonymousClass3D9) this.A03;
        switch (i2) {
            case 0:
                r5 = r4.A03;
                A05 = C63503hc.A05(r4.A01, (UserSession) this.A02, C09140ev.A00((Context) this.A01), true);
                iDxACallbackShape35S0200000_1_I2 = new IDxACallbackShape35S0200000_1_I2(30, this, r8);
                break;
            case 1:
                C566538a r0 = r4.A02;
                Bitmap bitmap = r0.A00;
                boolean z = r0.A01;
                C23101bv r42 = r4.A03;
                C59333Kk.A00((Context) this.A01, bitmap, new IDxACallbackShape35S0200000_1_I2(31, this, r8), r42, (UserSession) this.A02, z);
                return null;
            case 2:
                UserSession userSession = (UserSession) this.A02;
                int A002 = C29571yr.A00(AnonymousClass0wJ.A0Y(userSession));
                AnonymousClass7Ko.A0D(C18180wK.A1X(A002), "Number of steps must be greater than 0.");
                C23101bv r3 = new C23101bv();
                Bundle A06 = C18180wK.A06();
                A06.putInt("extra_number_of_steps", A002);
                C18190wL.A13(A06, userSession.token);
                r3.setArguments(A06);
                r4.A03 = r3;
                C18250wR.A07(r3).putString("DynamicFlowPlugin.extraFlowId", "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
                C25786Drz A0Q = C18180wK.A0Q((FragmentActivity) this.A01, userSession);
                r4.A00 = A0Q;
                A0Q.A03 = r3;
                String obj2 = AnonymousClass2AS.ENTRY_POINT.toString();
                A0Q.A07 = obj2;
                A0Q.A09 = obj2;
                A0Q.A04 = new C680441x(userSession.getUserId());
                A0Q.A07();
                return null;
            default:
                new AnonymousClass1XX().A0A(r4.A03.getChildFragmentManager(), "ProfileWizardPlugin_LoaderDialogFragmentName");
                r5 = r4.A03;
                A05 = C63503hc.A06((UserSession) this.A02);
                iDxACallbackShape35S0200000_1_I2 = C63873iU.A06(this, 118);
                break;
        }
        A05.A00 = iDxACallbackShape35S0200000_1_I2;
        r5.schedule(A05);
        return null;
    }
}
