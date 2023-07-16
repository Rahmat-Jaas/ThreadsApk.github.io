package com.facebook.content;

import X.C07720by;
import X.C15780rs;
import X.C18210wN;
import X.C67513zg;
import X.L6I;
import com.facebook.secure.content.DeferredInitAbstractContentProviderDIDelegate;
import com.facebook.ultralight.UL;

public abstract class FirstPartySecureContentProviderDelegate extends DeferredInitAbstractContentProviderDIDelegate {
    public final C07720by A00 = new C67513zg(this, UL.id._UL__ULSEP_com_facebook_gk_store_GatekeeperStore_ULSEP_com_facebook_gk_sessionless_Sessionless_ULSEP_BINDING_ID);

    public final boolean A0Y() {
        if (C15780rs.A01(this.A00.getContext())) {
            return true;
        }
        this.A00.get();
        throw C18210wN.A0W("get");
    }

    public FirstPartySecureContentProviderDelegate(L6I l6i) {
        super(l6i);
    }
}
