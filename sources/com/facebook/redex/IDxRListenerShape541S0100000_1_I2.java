package com.facebook.redex;

import X.AnonymousClass05D;
import X.AnonymousClass0wJ;
import X.AnonymousClass10J;
import X.AnonymousClass1a7;
import X.AnonymousClass1cS;
import X.AnonymousClass1cT;
import X.AnonymousClass3LY;
import X.C04220Ms;
import X.C18240wQ;
import X.C23391dj;
import X.C304821m;
import X.C62163Xl;
import X.C82294pO;
import X.E6R;
import android.os.Bundle;
import com.instagram.brandedcontent.model.BrandedContentGatingInfo;
import com.instagram.brandedcontent.model.BrandedContentProjectMetadata;
import com.instagram.model.business.BusinessInfo;

public class IDxRListenerShape541S0100000_1_I2 implements AnonymousClass05D {
    public Object A00;
    public final int A01;

    public IDxRListenerShape541S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bzx(String str, Bundle bundle) {
        C304821m r1;
        Boolean valueOf;
        switch (this.A01) {
            case 0:
                AnonymousClass1cT r3 = (AnonymousClass1cT) this.A00;
                if (r3.A04 != null && "native_calling_page_save".equals(str)) {
                    boolean z = bundle.getBoolean("native_calling_toggle_checked");
                    r3.A04.A06(z);
                    C62163Xl r12 = new C62163Xl(r3.A06);
                    r12.A0O = z;
                    r3.A06 = new BusinessInfo(r12);
                    r3.A0B = true;
                    return;
                }
                return;
            case 1:
                AnonymousClass1cS r32 = (AnonymousClass1cS) this.A00;
                if (r32.A03 != null && "native_calling_page_save".equals(str)) {
                    boolean z2 = bundle.getBoolean("native_calling_toggle_checked");
                    r32.A03.A06(z2);
                    C62163Xl r13 = new C62163Xl(r32.A05);
                    r13.A0O = z2;
                    r32.A05 = new BusinessInfo(r13);
                    return;
                }
                return;
            case 2:
                C04220Ms.A0B(bundle, 1);
                int i = bundle.getInt("ux_flow_status_code", 0);
                if (i == -1) {
                    valueOf = false;
                    r1 = C304821m.STATUS_UNKNOWN;
                } else {
                    C304821m[] values = C304821m.values();
                    if (i >= 0) {
                        C04220Ms.A0B(values, 0);
                        if (i <= values.length - 1) {
                            r1 = values[i];
                            valueOf = Boolean.valueOf(bundle.getBoolean("ux_flow_completion_status", false));
                        }
                    }
                    r1 = C304821m.STATUS_UNKNOWN;
                    valueOf = Boolean.valueOf(bundle.getBoolean("ux_flow_completion_status", false));
                }
                if (valueOf.booleanValue()) {
                    ((C82294pO) this.A00).CNh(r1);
                    return;
                }
                return;
            case 3:
                C23391dj r14 = (C23391dj) this.A00;
                r14.A01 = (BrandedContentGatingInfo) C18240wQ.A0D(bundle, "bundle_key_gating_info");
                AnonymousClass3LY.A00(r14.A05).A04(new E6R(r14.A01, (BrandedContentProjectMetadata) null, r14.A0G, r14.A0L));
                return;
            default:
                AnonymousClass0wJ.A1N(str, bundle);
                if (str.equals("BLOCKLIST_FRAGMENT_REQUEST_KEY") && bundle.getBoolean("ARGUMENT_BLOCKLIST_CHANGED_KEY")) {
                    ((AnonymousClass10J) ((AnonymousClass1a7) this.A00).A02.getValue()).A00();
                    return;
                }
                return;
        }
    }
}
