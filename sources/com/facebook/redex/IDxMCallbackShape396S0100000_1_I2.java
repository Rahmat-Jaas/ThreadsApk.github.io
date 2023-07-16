package com.facebook.redex;

import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.C18180wK;
import X.C29691z7;
import X.C32145H7b;
import X.C40983LtS;
import X.C83954sG;
import X.H7a;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.msys.mca.MailboxCallback;
import fxcache.model.FxCalAccountLinkageInfo;

public class IDxMCallbackShape396S0100000_1_I2 implements MailboxCallback {
    public Object A00;
    public final int A01;

    public IDxMCallbackShape396S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onCompletion(Object obj) {
        Object h7a;
        if (this.A01 != 0) {
            FxCalAccountLinkageInfo fxCalAccountLinkageInfo = new FxCalAccountLinkageInfo(AnonymousClass0ZV.A00, System.currentTimeMillis());
            C29691z7 r2 = (C29691z7) this.A00;
            synchronized (r2.A00) {
                r2.A00 = fxCalAccountLinkageInfo;
            }
            r2.A0E(CallerContext.A01("FxIGMasterAccountCacheHelper"), (C83954sG) null, (Boolean) null, "fx_company_identity_switcher_linking_cache");
            return;
        }
        C40983LtS ltS = (C40983LtS) this.A00;
        if (AnonymousClass0wJ.A1X(obj)) {
            h7a = new C32145H7b(C18180wK.A0Y());
        } else {
            h7a = new H7a(C18180wK.A0a("MailboxTam returns false when running tam_client_request_participants_add"));
        }
        ltS.A02(h7a);
        ltS.A00();
    }
}
