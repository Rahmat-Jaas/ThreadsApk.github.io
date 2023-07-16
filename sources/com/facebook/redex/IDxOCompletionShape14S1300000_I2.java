package com.facebook.redex;

import X.AnonymousClass0PT;
import X.AnonymousClass0QC;
import X.C04850Pk;
import X.C04860Pl;
import X.C07590bl;
import com.instagram.service.session.UserSession;

public class IDxOCompletionShape14S1300000_I2 implements C04850Pk {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public IDxOCompletionShape14S1300000_I2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = str;
        this.A00 = obj;
    }

    public final void ADn(AnonymousClass0PT r4) {
        if (this.A04 != 0) {
            ((UserSession) this.A01).userSessionEnder = null;
            AnonymousClass0QC.A04((AnonymousClass0QC) this.A02, (C07590bl) this.A00, this.A03);
            return;
        }
        AnonymousClass0QC.A04((AnonymousClass0QC) this.A02, (C04860Pl) this.A00, this.A03);
        C04850Pk r0 = (C04850Pk) this.A01;
        if (r0 != null) {
            r0.ADn(r4);
        }
    }
}
