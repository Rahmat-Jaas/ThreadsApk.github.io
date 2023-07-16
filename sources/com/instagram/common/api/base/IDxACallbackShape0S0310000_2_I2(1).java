package com.instagram.common.api.base;

import X.AnonymousClass3XX;
import X.AnonymousClass7EC;
import X.C04220Ms;
import X.C10300i6;
import X.C103226Yh;
import X.C128877kW;
import X.C129017kq;
import X.C14030oh;
import X.C63233h2;
import X.C63813iO;
import X.C63873iU;
import X.C67463zb;
import X.C86154wM;
import X.C86164wN;
import X.C95115yt;
import android.content.Context;
import android.util.SparseArray;
import com.facebook.common.locale.Country;
import com.facebook.common.locale.LocaleMember;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxFCallbackShape114S0200000_2_I2;
import com.instagram.graphql.instagramschemagraphservices.IGFBPayUpdateCreditCardResponseImpl;
import com.instagram.user.model.User;

public class IDxACallbackShape0S0310000_2_I2 extends C63873iU {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04;

    public IDxACallbackShape0S0310000_2_I2(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A04 = i;
        this.A01 = obj3;
        this.A03 = z;
        this.A00 = obj;
        this.A02 = obj2;
    }

    public final void onFail(AnonymousClass3XX r7) {
        int A032;
        int i;
        Throwable illegalStateException;
        if (this.A04 != 0) {
            A032 = C14030oh.A03(-123890202);
            C129017kq r2 = (C129017kq) this.A01;
            Throwable th = r7.A01;
            if (th != null) {
                illegalStateException = (Throwable) C103226Yh.A00.apply(th);
            } else {
                illegalStateException = new IllegalStateException();
            }
            r2.A01(AnonymousClass7EC.A01(illegalStateException));
            i = 646237910;
        } else {
            A032 = C14030oh.A03(-1128840679);
            C04220Ms.A0B(r7, 0);
            super.onFail(r7);
            User user = (User) this.A01;
            user.A2f(!this.A03);
            C63813iO.A03((Context) this.A00, "third_party_downloads_account_level_setting_failed", 2131831662, 0);
            user.A1t((C10300i6) this.A02);
            i = 964041496;
        }
        C14030oh.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        Object obj2 = obj;
        if (1 - this.A04 != 0) {
            super.onSuccess(obj2);
            return;
        }
        int A032 = C14030oh.A03(1277556013);
        C95115yt r4 = (C95115yt) obj2;
        int A033 = C14030oh.A03(644338919);
        boolean z = this.A03;
        C128877kW r0 = (C128877kW) this.A00;
        if (z) {
            SparseArray sparseArray = (SparseArray) this.A02;
            String str2 = r4.A00;
            Object obj3 = this.A01;
            boolean z2 = sparseArray.get(10) instanceof Country;
            Object obj4 = sparseArray.get(10);
            if (z2) {
                str = C86164wN.A0f((LocaleMember) obj4);
            } else {
                str = (String) obj4;
            }
            C67463zb A002 = C67463zb.A00();
            C67463zb A003 = C67463zb.A00();
            GQLCallInputCInputShape1S0000000 A0L = C86154wM.A0L();
            A0L.A0B(C128877kW.A00(sparseArray, r0, str), "billing_address");
            A0L.A0D(C128877kW.A02(sparseArray, 2), "cardholder_name");
            A0L.A0D(C128877kW.A02(sparseArray, 12), "credit_card_id");
            C128877kW.A03(sparseArray, A0L, r0, str2, "credit_card_token");
            A002.A02(A0L, "input");
            r0.A01.AMA(new PandoGraphQLRequest(C63233h2.A01(), "IGFBPayUpdateCreditCard", A002.getParamsCopy(), A003.getParamsCopy(), IGFBPayUpdateCreditCardResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 40, "input", "update_credit_card"), new IDxFCallbackShape114S0200000_2_I2(6, obj3, r0));
        } else {
            C128877kW.A04((SparseArray) this.A02, (C129017kq) this.A01, r0, r4.A00, (String) null, (String) null, (String) null);
        }
        C14030oh.A0A(333633915, A033);
        C14030oh.A0A(-883366143, A032);
    }
}
