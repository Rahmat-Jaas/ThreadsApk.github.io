package com.instagram.common.api.base;

import X.AnonymousClass0wJ;
import X.AnonymousClass24M;
import X.AnonymousClass3DL;
import X.AnonymousClass3XX;
import X.AnonymousClass3iG;
import X.AnonymousClass4CM;
import X.BKU;
import X.C10300i6;
import X.C11630kW;
import X.C14030oh;
import X.C18180wK;
import X.C21761Sb;
import X.C38040KHr;
import X.C63353hL;
import X.C63673i6;
import X.C63733iD;
import X.C63813iO;
import X.C63873iU;
import X.CUV;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.service.session.UserSession;

public class IDxACallbackShape0S1500000_1_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public String A05;
    public final int A06;

    public IDxACallbackShape0S1500000_1_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, int i) {
        this.A06 = i;
        this.A04 = obj3;
        this.A05 = str;
        this.A03 = obj2;
        this.A02 = obj4;
        this.A01 = obj5;
        this.A00 = obj;
    }

    public final void onFail(AnonymousClass3XX r11) {
        int A002;
        int i;
        if (this.A06 != 0) {
            A002 = C14030oh.A03(1699538150);
            C63353hL.A03(ShareType.FOLLOWERS_SHARE, (UserSession) this.A04, "likes_sheet", (String) null, this.A05);
            ((BKU) this.A03).A3g(AnonymousClass24M.NOT_SHARED);
            IgdsButton igdsButton = ((AnonymousClass3DL) this.A02).A09;
            igdsButton.setLoading(false);
            igdsButton.setEnabled(true);
            ((CUV) this.A01).A0B.notifyDataSetChanged();
            C63813iO.A03((Context) this.A00, "feed_share_auto_xpost_upsell_failure", 2131827439, 0);
            i = 722494956;
        } else {
            A002 = AnonymousClass0wJ.A00(1350135922, r11);
            super.onFail(r11);
            String str = this.A05;
            C63673i6.A09((C11630kW) this.A00, (C10300i6) this.A04, str, "igtv_long_press_menu", "system_share_sheet", r11.A01);
            i = -1389079611;
        }
        C14030oh.A0A(i, A002);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        if (this.A06 != 0) {
            A032 = C14030oh.A03(161956328);
            int A033 = C14030oh.A03(25516536);
            C63353hL.A05(ShareType.FOLLOWERS_SHARE, (UserSession) this.A04, "likes_sheet", (String) null, this.A05);
            ((BKU) this.A03).A3g(AnonymousClass24M.SHARED);
            IgdsButton igdsButton = ((AnonymousClass3DL) this.A02).A09;
            igdsButton.setLoading(false);
            igdsButton.setEnabled(true);
            ((CUV) this.A01).A0B.notifyDataSetChanged();
            C63733iD A012 = C63733iD.A01();
            C63733iD.A07((Context) this.A00, A012, 2131827440);
            A012.A0C();
            C63733iD.A09(C38040KHr.A01, A012);
            C14030oh.A0A(-80140706, A033);
            i = 297210403;
        } else {
            A032 = C14030oh.A03(-1157505271);
            C21761Sb r13 = (C21761Sb) obj;
            int A002 = AnonymousClass0wJ.A00(691747689, r13);
            String str = r13.A00;
            UserSession userSession = (UserSession) this.A04;
            Bundle A062 = C18180wK.A06();
            BKU bku = (BKU) this.A03;
            A062.putString("android.intent.extra.TEXT", AnonymousClass3iG.A00(bku, userSession, str));
            AnonymousClass3iG.A01(((Fragment) this.A01).getActivity(), A062, (AnonymousClass4CM) this.A02, bku, userSession, str);
            C63673i6.A0B((C11630kW) this.A00, userSession, this.A05, "igtv_long_press_menu", "system_share_sheet", r13.A00, bku.A0f.A4h);
            C14030oh.A0A(-2045155246, A002);
            i = -728103169;
        }
        C14030oh.A0A(i, A032);
    }
}
