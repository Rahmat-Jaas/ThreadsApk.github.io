package com.facebook.redex;

import X.AnonymousClass06E;
import X.AnonymousClass0wJ;
import X.AnonymousClass1R8;
import X.AnonymousClass1cj;
import X.AnonymousClass265;
import X.AnonymousClass269;
import X.AnonymousClass3KQ;
import X.AnonymousClass3Ty;
import X.AnonymousClass4ES;
import X.C04220Ms;
import X.C07530bf;
import X.C10300i6;
import X.C15730rn;
import X.C18180wK;
import X.C18220wO;
import X.C31155GhB;
import X.C32165H8c;
import X.C34640IcN;
import X.C63313hF;
import X.C81574o1;
import X.C84604tW;
import X.C84634tZ;
import X.C84664te;
import X.C85854vs;
import X.H1T;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.api.base.IDxACallbackShape5S0400000_1_I2;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape2S0510000_I2;

public class IDxCListenerShape3S0700000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    public IDxCListenerShape3S0700000_1_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.A07 = i;
        this.A00 = obj;
        this.A06 = obj4;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A04 = obj5;
        this.A01 = obj6;
        this.A02 = obj7;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        H1T A0O;
        Object[] A1Y;
        String str;
        if (this.A07 != 0) {
            AnonymousClass4ES r1 = (AnonymousClass4ES) ((C85854vs) this.A05);
            AnonymousClass269 r0 = AnonymousClass269.A0a;
            AnonymousClass1cj r3 = r1.A01;
            C15730rn A012 = C63313hF.A01(r3, r0);
            A012.A0D("autocomplete_account_type", r1.A00.AOZ());
            C18180wK.A1K(A012, r3.A0M);
            C84604tW r32 = (C84604tW) this.A00;
            AnonymousClass3Ty.A00.A00((C34640IcN) this.A03, (C84634tZ) this.A01, r32, (C81574o1) this.A02, (C07530bf) this.A04, (AnonymousClass265) this.A06);
            return;
        }
        Context context = (Context) this.A00;
        C10300i6 r5 = (C10300i6) this.A06;
        AnonymousClass06E r2 = (AnonymousClass06E) this.A05;
        User user = (User) this.A04;
        User user2 = (User) this.A01;
        Object obj = this.A02;
        List B0z = ((C84664te) this.A03).B0z();
        boolean z = false;
        if (!(B0z instanceof Collection) || !B0z.isEmpty()) {
            Iterator it = B0z.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C04220Ms.A0I(it.next(), user2.getId())) {
                        z = true;
                        A0O = AnonymousClass0wJ.A0O(r5);
                        A1Y = C18220wO.A1Y(user, user2);
                        str = "groups/%s/remove_admin_request/%s/";
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        A0O = AnonymousClass0wJ.A0O(r5);
        A1Y = C18220wO.A1Y(user, user2);
        str = "groups/%s/remove_admin/%s/";
        A0O.A0T(str, A1Y);
        C32165H8c A0T = AnonymousClass0wJ.A0T(A0O, AnonymousClass1R8.class, AnonymousClass3KQ.class);
        A0T.A00 = new IDxACallbackShape5S0400000_1_I2(9, context, obj, user2, new KtLambdaShape2S0510000_I2(context, r5, user, obj, user2, 3, z));
        C31155GhB.A01(context, r2, A0T);
    }
}
