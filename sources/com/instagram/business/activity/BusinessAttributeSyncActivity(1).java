package com.instagram.business.activity;

import X.AnonymousClass0wJ;
import X.AnonymousClass24J;
import X.AnonymousClass3SJ;
import X.AnonymousClass4VZ;
import X.C04530Oa;
import X.C10300i6;
import X.C11630kW;
import X.C18180wK;
import X.C18190wL;
import X.C25786Drz;
import X.C554533g;
import X.C61033Rq;
import X.C84114sZ;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.model.BusinessAttribute;
import java.util.List;

public final class BusinessAttributeSyncActivity extends BaseFragmentActivity implements C11630kW, C84114sZ {
    public final C04530Oa A00 = C18190wL.A0w(this, 38);
    public final C04530Oa A01 = C18190wL.A0w(this, 39);
    public final C04530Oa A02 = C18190wL.A0w(this, 40);
    public final C04530Oa A03 = C18190wL.A0w(this, 41);
    public final C04530Oa A04 = C18190wL.A0w(this, 42);
    public final C04530Oa A05 = C18190wL.A0w(this, 43);
    public final C04530Oa A06 = C18190wL.A0w(this, 44);
    public final C04530Oa A07 = C18190wL.A0w(this, 45);
    public final C04530Oa A08 = C18190wL.A0w(this, 46);
    public final C04530Oa A09 = C18190wL.A0w(this, 47);
    public final C04530Oa A0A = C18190wL.A0w(this, 48);

    public final String getModuleName() {
        return "business_attribute_sync_activity";
    }

    public final AnonymousClass24J Abi() {
        C554533g r0;
        AnonymousClass3SJ r1 = ((C61033Rq) this.A02.getValue()).A00;
        int i = r1.A00;
        if (i == -1) {
            return null;
        }
        List list = r1.A01;
        if (i == list.size() || (r0 = (C554533g) list.get(i)) == null) {
            return null;
        }
        return r0.A00;
    }

    public final void Bek() {
        C04530Oa r0;
        String str;
        C61033Rq r3 = (C61033Rq) this.A02.getValue();
        AnonymousClass3SJ r02 = r3.A00;
        if (r02.A00 != r02.A01.size()) {
            AnonymousClass3SJ r1 = r3.A00;
            r3.A00 = new AnonymousClass3SJ(r1.A01, r1.A00 + 1);
        }
        AnonymousClass24J Abi = Abi();
        if (Abi == null) {
            finish();
            return;
        }
        int ordinal = Abi.ordinal();
        if (ordinal == 0) {
            r0 = this.A09;
        } else if (ordinal == 3) {
            r0 = this.A05;
        } else if (ordinal == 2) {
            r0 = this.A0A;
        } else if (ordinal == 1) {
            r0 = this.A01;
        } else if (ordinal == 4) {
            r0 = this.A04;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        Fragment fragment = (Fragment) r0.getValue();
        C25786Drz A0Q = C18180wK.A0Q(this, AnonymousClass0wJ.A0U(this.A00));
        AnonymousClass24J Abi2 = Abi();
        if (Abi2 != null) {
            str = Abi2.name();
        } else {
            str = null;
        }
        A0Q.A07 = str;
        A0Q.A03 = fragment;
        A0Q.A05();
    }

    public final void CfF() {
        C61033Rq r4 = (C61033Rq) this.A02.getValue();
        AnonymousClass3SJ r3 = r4.A00;
        int i = r3.A00;
        if (i != -1) {
            r4.A00 = new AnonymousClass3SJ(r3.A01, i - 1);
        }
        AnonymousClass24J Abi = Abi();
        if (Abi == null) {
            finish();
        } else {
            getSupportFragmentManager().A1C(Abi.name(), 0);
        }
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A00);
    }

    public static final Bundle A00(BusinessAttributeSyncActivity businessAttributeSyncActivity) {
        Bundle A062 = C18180wK.A06();
        A062.putParcelable("fb_attributes", (BusinessAttribute) businessAttributeSyncActivity.A07.getValue());
        A062.putParcelable("ig_attributes", (BusinessAttribute) businessAttributeSyncActivity.A08.getValue());
        A062.putParcelable("sync_attributes", (BusinessAttribute) businessAttributeSyncActivity.A03.getValue());
        return A062;
    }

    public final void A0D(Bundle bundle) {
        if (Abi() == null) {
            Bek();
        }
    }
}
