package X;

import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.fragment.CategorySearchFragment;

/* renamed from: X.4OU  reason: invalid class name */
public final class AnonymousClass4OU implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;

    public AnonymousClass4OU(CategorySearchFragment categorySearchFragment) {
        this.A00 = categorySearchFragment;
    }

    public final void run() {
        ImmutableList A01;
        CategorySearchFragment categorySearchFragment = this.A00;
        C84654td r0 = categorySearchFragment.A06;
        if (r0 != null) {
            boolean A1Z = C18180wK.A1Z(r0.Aiz(), C311924p.CONVERSION_FLOW);
            C84654td r4 = categorySearchFragment.A06;
            if (A1Z) {
                C10300i6 r7 = categorySearchFragment.A0A;
                AnonymousClass1S0 r3 = AnonymousClass0wJ.A0R(r4).A03;
                boolean A012 = C61853Wb.A01(CategorySearchFragment.A0V, categorySearchFragment.A0A, "ig_professional_conversion_flow");
                BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) categorySearchFragment.A06;
                A01 = AnonymousClass3LJ.A00(r3, r7, businessConversionActivity.A04, A012, businessConversionActivity.A06);
            } else {
                boolean A05 = C67293zJ.A05(r4);
                r4 = categorySearchFragment.A06;
                if (A05) {
                    C10300i6 r32 = categorySearchFragment.A0A;
                    boolean A013 = C61853Wb.A01(CategorySearchFragment.A0V, r32, "ig_professional_conversion_flow");
                    BusinessConversionActivity businessConversionActivity2 = (BusinessConversionActivity) categorySearchFragment.A06;
                    A01 = AnonymousClass3LJ.A01(r32, businessConversionActivity2.A04, A013, businessConversionActivity2.A06);
                } else {
                    ((BusinessConversionActivity) r4).Bel((Bundle) null);
                }
            }
            BusinessConversionActivity businessConversionActivity3 = (BusinessConversionActivity) r4;
            BusinessConversionActivity.A02((Bundle) null, businessConversionActivity3);
            BusinessConversionActivity.A03(businessConversionActivity3);
            AnonymousClass3VX r02 = businessConversionActivity3.A01;
            if (r02 == null) {
                C04220Ms.A0E("conversionLogic");
                throw null;
            } else {
                r02.A03(A01);
                BusinessConversionActivity.A04(businessConversionActivity3, true);
            }
        }
        CategorySearchFragment.A04(categorySearchFragment);
    }
}
