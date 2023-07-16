package com.instagram.ui.text;

import X.AnonymousClass0MJ;
import X.AnonymousClass0YP;
import X.AnonymousClass0wJ;
import X.AnonymousClass1U1;
import X.AnonymousClass1Y4;
import X.AnonymousClass1dN;
import X.AnonymousClass3BM;
import X.AnonymousClass3QC;
import X.AnonymousClass3W8;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C10650ih;
import X.C15430rJ;
import X.C156829Pn;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18250wR;
import X.C18730xl;
import X.C22701Zc;
import X.C22841am;
import X.C22851an;
import X.C23161cb;
import X.C23231co;
import X.C23351dd;
import X.C25745DrH;
import X.C25786Drz;
import X.C26231qG;
import X.C31155GhB;
import X.C32165H8c;
import X.C34612Ibi;
import X.C37350Jpy;
import X.C58963Iu;
import X.C62403Zn;
import X.C62653aT;
import X.C62763ag;
import X.C63213h0;
import X.C63493hb;
import X.C64943s7;
import X.I6G;
import X.ILe;
import X.IVw;
import X.K9R;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0100000_I2;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;
import com.instagram.request.IDxDCallbackShape173S0100000_1_I2;
import com.instagram.service.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

public class IDxCSpanShape63S0200000_1_I2 extends C18730xl {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape63S0200000_1_I2(FragmentActivity fragmentActivity, UserSession userSession, int i, int i2) {
        super(i);
        this.A02 = i2;
        if (10 - i2 != 0) {
            this.A01 = userSession;
            this.A00 = fragmentActivity;
        } else {
            this.A00 = fragmentActivity;
            this.A01 = userSession;
        }
    }

    public final void onClick(View view) {
        C25786Drz drz;
        Fragment fragment;
        switch (this.A02) {
            case 0:
                Context context = (Context) this.A00;
                C63493hb.A07(context, AnonymousClass0wJ.A0U(((C22701Zc) this.A01).A07), "https://www.facebook.com/help/instagram/1754230088373607?ref=learn_more", context.getString(2131829574));
                return;
            case 1:
                C34612Ibi ibi = (C34612Ibi) this.A01;
                C58963Iu r4 = new C58963Iu(AnonymousClass0wJ.A0U(ibi.A05));
                AnonymousClass0MJ r3 = new AnonymousClass0MJ();
                for (ILe A002 : (Iterable) this.A00) {
                    ibi.A06.getValue();
                    r4.A09(I6G.A00(A002), C64943s7.A00);
                }
                r4.A02(C18190wL.A0H(r3, 195), 2131822468);
                C62763ag r1 = new C62763ag(r4);
                r3.A00 = r1;
                r1.A02(ibi.requireActivity());
                return;
            case 2:
                AnonymousClass1dN r5 = (AnonymousClass1dN) this.A00;
                int i = r5.A04.A00;
                if (i == 1 || i == 2) {
                    AnonymousClass1dN.A04(r5, Long.valueOf(SystemClock.elapsedRealtime() - r5.A00), "upgrade_screen_privacy_clicked", "upsell");
                    drz = C18180wK.A0Q(r5.requireActivity(), r5.A07);
                    drz.A0A(r5.requireArguments(), new C22851an());
                    drz.A07 = C18220wO.A0q(r5);
                    drz.A08();
                    drz.A0B = true;
                    break;
                } else {
                    AnonymousClass1dN.A03(r5, (AnonymousClass3BM) this.A01);
                    return;
                }
            case 3:
                AnonymousClass1Y4 r0 = (AnonymousClass1Y4) this.A01;
                Context requireContext = r0.requireContext();
                C04530Oa r42 = r0.A01;
                UserSession A0X = AnonymousClass0wJ.A0X(r42);
                DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData = (DirectWellBeingUpsellBottomSheetData) this.A00;
                new C37350Jpy(requireContext, A0X, directWellBeingUpsellBottomSheetData.A01, directWellBeingUpsellBottomSheetData.A06).A04();
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C18220wO.A0W(AnonymousClass0wJ.A0U(r42)), "direct_hidden_words_adoption_click"), 526);
                if (AnonymousClass0wJ.A1U(A0I)) {
                    IVw iVw = new IVw(K9R.A00);
                    iVw.A04("upsell_type", "bottomsheet");
                    C18210wN.A1A(A0I, "help");
                    A0I.A0T("reason", (String) null);
                    A0I.A0T("source", (String) null);
                    A0I.A0T("extra_client_data", iVw.toString());
                    A0I.Bb4();
                    return;
                }
                return;
            case 4:
                C04220Ms.A0B(view, 0);
                ((AnonymousClass0YP) ((KtCSuperShape0S0100000_I2) ((KtCSuperShape0S0100000_I2) this.A01).A00).A00).invoke(C18190wL.A0A(view), this.A00);
                return;
            case 5:
                C23161cb r32 = (C23161cb) this.A00;
                C18230wP.A16((TextView) this.A01, r32.getContext());
                C26231qG r2 = new C26231qG();
                Bundle A06 = C18180wK.A06();
                C18180wK.A0w(A06, r32.A00);
                r2.setArguments(A06);
                C25745DrH.A00.A02(r32.getContext()).A07(r2);
                return;
            case 6:
                AnonymousClass1U1 r12 = (AnonymousClass1U1) this.A01;
                if (r12.A08) {
                    C62653aT.A02.A03();
                    Bundle A003 = r12.A00();
                    A003.putBoolean(C63213h0.A01(0, 33, 125), true);
                    A003.putBoolean("ARG_IS_ENABLING_WHATSAPP", false);
                    fragment = new C22841am();
                    fragment.setArguments(A003);
                    C23231co r02 = (C23231co) ((IDxDCallbackShape173S0100000_1_I2) this.A00).A00;
                    drz = C18180wK.A0Q(r02.getActivity(), r02.A05);
                    break;
                } else {
                    return;
                }
            case 7:
                C04220Ms.A0B(view, 0);
                SimpleWebViewActivity.A01.A02((Context) this.A00, AnonymousClass0wJ.A0U(((C156829Pn) this.A01).A0K), C18250wR.A0P("https://www.facebook.com/business/help/1845546175719460", view.getResources().getString(2131832874)));
                return;
            case 8:
                C10650ih.A06((Context) this.A00, C15430rJ.A01(((LinkWithText) this.A01).A01));
                return;
            case 9:
                Context context2 = (Context) this.A00;
                SimpleWebViewActivity.A00(context2, (C10300i6) this.A01, C18250wR.A0P(AnonymousClass3W8.A01(context2, AnonymousClass3QC.A00(0, 43, 80)), context2.getString(2131828277)));
                return;
            case 10:
                drz = C18180wK.A0Q((FragmentActivity) this.A00, (C10300i6) this.A01);
                fragment = new C23351dd();
                break;
            default:
                FragmentActivity fragmentActivity = (FragmentActivity) this.A00;
                C32165H8c A012 = C62403Zn.A01(fragmentActivity, (UserSession) this.A01);
                A012.A00 = new IDxDCallbackShape173S0100000_1_I2(fragmentActivity.getSupportFragmentManager(), this, 13);
                C31155GhB.A03(A012);
                return;
        }
        drz.A03 = fragment;
        drz.A05();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCSpanShape63S0200000_1_I2(int i, int i2, Object obj, Object obj2) {
        super(i);
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
