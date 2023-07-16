package com.facebook.redex;

import X.AnonymousClass01J;
import X.AnonymousClass1bD;
import X.AnonymousClass1cR;
import X.AnonymousClass2AS;
import X.AnonymousClass2SS;
import X.AnonymousClass3D9;
import X.AnonymousClass3DI;
import X.AnonymousClass3ZJ;
import X.AnonymousClass6VR;
import X.C05050Qq;
import X.C10300i6;
import X.C18180wK;
import X.C18190wL;
import X.C18250wR;
import X.C23101bv;
import X.C25550Dnj;
import X.C25667Dpo;
import X.C29571yr;
import X.C63463hW;
import X.C63593hs;
import X.C84794ts;
import android.os.Bundle;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

public class IDxNActionShape117S0300000_1_I2 implements C84794ts {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxNActionShape117S0300000_1_I2(AnonymousClass3D9 r1, C29571yr r2, UserSession userSession, int i) {
        this.A03 = i;
        this.A00 = r2;
        switch (i) {
            case 0:
            case 3:
                this.A02 = r1;
                this.A01 = userSession;
                break;
            default:
                this.A01 = userSession;
                this.A02 = r1;
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object C8i(AnonymousClass3DI r12, Object obj, int i) {
        AnonymousClass1bD A002;
        AnonymousClass01J r2;
        AnonymousClass2AS r0;
        switch (this.A03) {
            case 0:
                if (i == 1) {
                    int i2 = -1;
                    int i3 = -1;
                    AnonymousClass3D9 r3 = (AnonymousClass3D9) this.A02;
                    String str = r3.A06;
                    C23101bv r02 = r3.A03;
                    if (r02.A00 == r02.A01 - 1) {
                        i2 = 2131826219;
                        i3 = 6;
                    }
                    A002 = AnonymousClass2SS.A00(str, 2131832985, i3, 3, i2, 2131832981, 2131832982);
                    C05050Qq.A00(C18250wR.A07(A002), (C10300i6) this.A01);
                    A002.mArguments.putString("DynamicFlowPlugin.extraFlowId", "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
                    r2 = new AnonymousClass01J(r3.A03.getChildFragmentManager());
                    r0 = AnonymousClass2AS.ADD_BIO;
                    break;
                } else {
                    return null;
                }
            case 1:
                UserSession userSession = (UserSession) this.A01;
                C25550Dnj A003 = AnonymousClass6VR.A00(userSession);
                AnonymousClass3D9 r32 = (AnonymousClass3D9) this.A02;
                A003.A04(r32.A04);
                String str2 = r32.A01.A0F;
                synchronized (C63593hs.class) {
                    C63593hs.A03.A00(str2);
                }
                r32.A04.A1t(userSession);
                C25667Dpo.A00(userSession).A00 = true;
                ((AnonymousClass3ZJ) this.A00).A08("ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93", r32);
                return null;
            case 2:
                if (i == 1) {
                    Bundle A06 = C18180wK.A06();
                    A06.putString("DynamicFlowPlugin.extraFlowId", "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
                    C63463hW.A03();
                    UserSession userSession2 = (UserSession) this.A01;
                    AnonymousClass3D9 r4 = (AnonymousClass3D9) this.A02;
                    C23101bv r03 = r4.A03;
                    int i4 = 2131831737;
                    if (r03.A00 == r03.A01 - 1) {
                        i4 = 2131826219;
                    }
                    AnonymousClass1cR r33 = new AnonymousClass1cR();
                    C18190wL.A13(A06, userSession2.token);
                    A06.putBoolean("extra_enable_share_to_feed", true);
                    A06.putBoolean("extra_allow_skip", false);
                    A06.putBoolean("extra_save_profile_picture_on_exit", false);
                    A06.putInt("extra_progress_button_label_resource_id", i4);
                    r33.setArguments(A06);
                    AnonymousClass01J r22 = new AnonymousClass01J(r4.A03.getChildFragmentManager());
                    String obj2 = AnonymousClass2AS.ADD_PROFILE_PICTURE.toString();
                    r22.A0K(obj2);
                    r22.A0F(r33, obj2, R.id.content_panel);
                    r22.A00();
                }
                return this.A02;
            default:
                if (i == 1) {
                    int i5 = -1;
                    int i6 = -1;
                    AnonymousClass3D9 r34 = (AnonymousClass3D9) this.A02;
                    String str3 = r34.A07;
                    C23101bv r04 = r34.A03;
                    if (r04.A00 == r04.A01 - 1) {
                        i5 = 2131826219;
                        i6 = 6;
                    }
                    A002 = AnonymousClass2SS.A00(str3, 2131832986, i6, 1, i5, 2131832983, 2131832984);
                    C05050Qq.A00(C18250wR.A07(A002), (C10300i6) this.A01);
                    A002.mArguments.putString("DynamicFlowPlugin.extraFlowId", "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93");
                    r2 = new AnonymousClass01J(r34.A03.getChildFragmentManager());
                    r0 = AnonymousClass2AS.ADD_NAME;
                    break;
                } else {
                    return null;
                }
        }
        String obj3 = r0.toString();
        r2.A0K(obj3);
        r2.A0G(A002, obj3, R.id.content_panel);
        r2.A00();
        return null;
    }
}
