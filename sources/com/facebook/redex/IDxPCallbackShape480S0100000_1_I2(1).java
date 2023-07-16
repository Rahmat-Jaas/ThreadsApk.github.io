package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass269;
import X.AnonymousClass2AT;
import X.AnonymousClass3XA;
import X.AnonymousClass4JZ;
import X.C04220Ms;
import X.C07530bf;
import X.C08350dD;
import X.C144608im;
import X.C18180wK;
import X.C18200wM;
import X.C18220wO;
import X.C23121bx;
import X.C23201cg;
import X.C25081lj;
import X.C29241xa;
import X.C31155GhB;
import X.C313625r;
import X.C54202z4;
import X.C63813iO;
import X.C971568d;
import android.app.Activity;
import android.content.SharedPreferences;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;
import java.util.Map;

public class IDxPCallbackShape480S0100000_1_I2 implements C144608im {
    public Object A00;
    public final int A01;

    public IDxPCallbackShape480S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void CAi(Map map) {
        boolean z;
        SharedPreferences.Editor A0B;
        String str;
        switch (this.A01) {
            case 0:
                if (map.get("android.permission.WRITE_EXTERNAL_STORAGE") == C971568d.GRANTED) {
                    C29241xa.A0C((C29241xa) this.A00);
                    return;
                } else {
                    C63813iO.A04(2131821833);
                    return;
                }
            case 1:
                if (map.get("android.permission.WRITE_EXTERNAL_STORAGE") == C971568d.GRANTED) {
                    C23121bx r2 = (C23121bx) this.A00;
                    C31155GhB.A03(new C25081lj(C23121bx.A00(r2), r2));
                    return;
                }
                C63813iO.A03(C18220wO.A0A(this.A00), (String) null, 2131821833, 0);
                return;
            case 2:
                C04220Ms.A0B(map, 0);
                Object obj = map.get("android.permission.POST_NOTIFICATIONS");
                if (obj == C971568d.GRANTED) {
                    z = true;
                    A0B = C18220wO.A0B((C08350dD) this.A00);
                    str = "preference_has_allowed_push_system_dialog";
                } else if (obj == C971568d.DENIED) {
                    z = true;
                    A0B = C18220wO.A0B((C08350dD) this.A00);
                    str = "preference_has_denied_push_system_dialog";
                } else {
                    return;
                }
                AnonymousClass0wJ.A13(A0B, str, z);
                return;
            case 3:
                C971568d r0 = (C971568d) map.get("android.permission.READ_CONTACTS");
                if (r0 == null) {
                    r0 = C971568d.DENIED;
                }
                int ordinal = r0.ordinal();
                if (ordinal == 0) {
                    C07530bf r1 = ((C23201cg) this.A00).A09;
                    String str2 = AnonymousClass2AT.A09.A00.A01;
                    C18200wM.A1S(r1, str2);
                    AnonymousClass3XA.A00(r1, str2);
                } else if (ordinal == 1) {
                    AnonymousClass269 r12 = AnonymousClass269.ContactsUpsellDeclined;
                    C23201cg r3 = (C23201cg) this.A00;
                    C18180wK.A1K(r12.A0B(r3.A09).A06((C313625r) null, AnonymousClass2AT.A09.A00), r3.A09);
                } else if (ordinal == 2) {
                    C54202z4.A00(((C23201cg) this.A00).A09);
                }
                C23201cg.A00((C23201cg) this.A00);
                return;
            default:
                IDxCListenerShape48S0300000_1_I2 iDxCListenerShape48S0300000_1_I2 = (IDxCListenerShape48S0300000_1_I2) this.A00;
                AnonymousClass4JZ.A02((Activity) iDxCListenerShape48S0300000_1_I2.A00, (UserSession) iDxCListenerShape48S0300000_1_I2.A02, (EditPhoneNumberView) iDxCListenerShape48S0300000_1_I2.A01);
                return;
        }
    }
}
