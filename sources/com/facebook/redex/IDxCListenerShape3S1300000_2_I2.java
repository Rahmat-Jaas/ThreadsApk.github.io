package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass2FT;
import X.AnonymousClass3VP;
import X.AnonymousClass3WK;
import X.AnonymousClass5j3;
import X.AnonymousClass5j7;
import X.AnonymousClass5j8;
import X.AnonymousClass65B;
import X.AnonymousClass67N;
import X.AnonymousClass7JF;
import X.AnonymousClass7Kz;
import X.AnonymousClass9CN;
import X.C04220Ms;
import X.C1185671k;
import X.C142188eA;
import X.C143708hB;
import X.C170829vd;
import X.C18022AWq;
import X.C18170wI;
import X.C18180wK;
import X.C18539AhF;
import X.C19457Awe;
import X.C25786Drz;
import X.C2W;
import X.C31580Grx;
import X.C32165H8c;
import X.C34640IcN;
import X.C36489JXt;
import X.C63233h2;
import X.C67463zb;
import X.C86114wI;
import X.C86154wM;
import X.C94075ti;
import X.H1T;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4001000_I2;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.api.base.IDxACallbackShape1S1300000_2_I2;
import com.instagram.graphql.instagramschemagraphservices.DeleteAllResponseImpl;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.service.session.UserSession;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape3S1210000_I2;
import kotlin.jvm.internal.KtLambdaShape4S1210000_I2;

public class IDxCListenerShape3S1300000_2_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxCListenerShape3S1300000_2_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        String str;
        AnonymousClass9CN r10;
        AnonymousClass65B r9;
        int i2;
        AnonymousClass3VP r1;
        ContextThemeWrapper contextThemeWrapper;
        String str2;
        switch (this.A04) {
            case 2:
                AnonymousClass7JF r3 = (AnonymousClass7JF) this.A01;
                AnonymousClass7JF.A03(AnonymousClass7JF.A00(r3, (Boolean) null, (Boolean) null, AnonymousClass006.A00, AnonymousClass006.A0j, (Long) null, (String) null, (String) null, (List) null, 252), r3);
                UserSession userSession = (UserSession) this.A02;
                C25786Drz A0Q = C18180wK.A0Q((FragmentActivity) this.A00, userSession);
                A0Q.A0D = true;
                A0Q.A03 = AnonymousClass2FT.A00().A01().A00(userSession, "REEL", (String) null, this.A03, false);
                A0Q.A05();
                return;
            case 3:
                UserSession userSession2 = (UserSession) this.A00;
                Context context = (Context) this.A01;
                String str3 = this.A03;
                C36489JXt jXt = (C36489JXt) this.A02;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                IDxObjectShape13S1300000_6_I2 iDxObjectShape13S1300000_6_I2 = new IDxObjectShape13S1300000_6_I2(context, jXt, userSession2, str3, 0);
                IDxObjectShape136S0200000_6_I2 iDxObjectShape136S0200000_6_I2 = new IDxObjectShape136S0200000_6_I2(1, context, jXt);
                C31580Grx A012 = AnonymousClass3WK.A01(userSession2);
                GQLCallInputCInputShape1S0000000 A0K = C86114wI.A0K();
                C67463zb A002 = C67463zb.A00();
                C67463zb A003 = C67463zb.A00();
                A002.A02(A0K, "data");
                A012.AMA(new PandoGraphQLRequest(C63233h2.A01(), "DeleteAll", A002.getParamsCopy(), A003.getParamsCopy(), DeleteAllResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 12, "data", "xig_delete_all_from_user_id_iab_link_history_ig"), new IDxFCallbackShape114S0200000_2_I2(7, iDxObjectShape13S1300000_6_I2, iDxObjectShape136S0200000_6_I2));
                return;
            case 4:
                r9 = (AnonymousClass65B) this.A02;
                str = this.A03;
                i2 = ((KtCSuperShape0S4001000_I2) this.A00).A00;
                r10 = (AnonymousClass9CN) this.A01;
                z = true;
                break;
            case 5:
                r9 = (AnonymousClass65B) this.A02;
                str = this.A03;
                i2 = ((KtCSuperShape0S4001000_I2) this.A00).A00;
                r10 = (AnonymousClass9CN) this.A01;
                z = false;
                break;
            default:
                AnonymousClass67N r0 = (AnonymousClass67N) this.A02;
                String str4 = this.A03;
                C143708hB r32 = (C143708hB) this.A01;
                C142188eA r2 = (C142188eA) this.A00;
                if (r0 != null) {
                    int ordinal = r0.ordinal();
                    if (ordinal == 4 || ordinal == 1) {
                        r2.getClass();
                        str4.getClass();
                        IDxONavigationShape640S0100000_2_I2 iDxONavigationShape640S0100000_2_I2 = (IDxONavigationShape640S0100000_2_I2) r2;
                        switch (iDxONavigationShape640S0100000_2_I2.A01) {
                            case 0:
                                r1 = AnonymousClass7Kz.A0N();
                                contextThemeWrapper = ((AnonymousClass5j7) iDxONavigationShape640S0100000_2_I2.A00).A00;
                                break;
                            case 1:
                                r1 = AnonymousClass7Kz.A0N();
                                contextThemeWrapper = ((AnonymousClass5j3) iDxONavigationShape640S0100000_2_I2.A00).A00;
                                break;
                            case 5:
                                return;
                            default:
                                r1 = AnonymousClass7Kz.A0N();
                                contextThemeWrapper = ((AnonymousClass5j8) iDxONavigationShape640S0100000_2_I2.A00).A00;
                                if (contextThemeWrapper == null) {
                                    str2 = "wrapperContext";
                                    break;
                                }
                                break;
                        }
                        if (contextThemeWrapper == null) {
                            str2 = "viewContext";
                            C04220Ms.A0E(str2);
                            throw null;
                        }
                        r1.A01(contextThemeWrapper, str4);
                        return;
                    }
                    if (ordinal == 3) {
                        dialogInterface.dismiss();
                        r32.getClass();
                    } else if (ordinal == 2) {
                        dialogInterface.dismiss();
                        if (r32 == null) {
                            return;
                        }
                    } else {
                        return;
                    }
                    r32.CBm();
                    return;
                }
                return;
        }
        C2W c2w = r9.A04;
        C19457Awe A0T = C86154wM.A0T(c2w);
        C18022AWq aWq = c2w.BDY().A05;
        C04220Ms.A06(aWq);
        A0T.A05 = new C18022AWq(aWq.A01, FeaturedProductPermissionStatus.APPROVED, C170829vd.LOADING, aWq.A03);
        C86154wM.A1O(c2w, A0T);
        C18539AhF ahF = r9.A02;
        KtLambdaShape3S1210000_I2 ktLambdaShape3S1210000_I2 = new KtLambdaShape3S1210000_I2(r9, r10, str, 8, z);
        KtLambdaShape4S1210000_I2 ktLambdaShape4S1210000_I2 = new KtLambdaShape4S1210000_I2(r9, r10, str, 6, z);
        C34640IcN icN = ahF.A01;
        UserSession userSession3 = ahF.A03;
        String obj = r10.A02.toString();
        AnonymousClass0wJ.A1M(userSession3, 0, obj);
        H1T A0O = AnonymousClass0wJ.A0O(userSession3);
        A0O.A0J("commerce/community/featured_products/permission_update_age_decision/");
        A0O.A0O(C18170wI.A00(453), obj);
        A0O.A0K(AnonymousClass000.A00(758), i2);
        A0O.A0R("overage_decision", z);
        C32165H8c A0T2 = AnonymousClass0wJ.A0T(A0O, C94075ti.class, C1185671k.class);
        A0T2.A00 = new IDxACallbackShape1S1300000_2_I2(userSession3, obj, ktLambdaShape4S1210000_I2, ktLambdaShape3S1210000_I2, 0);
        icN.schedule(A0T2);
    }
}
