package X;

import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0101000_I2;
import com.instagram.api.schemas.PartnerProgramOnboardingSteps;
import com.instagram.monetization.onboarding.model.ProductOnboardingNextStepInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Tj  reason: invalid class name and case insensitive filesystem */
public final class C101986Tj {
    public static final List A00(List list) {
        ArrayList A0w = AnonymousClass0wJ.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KtCSuperShape0S0101000_I2 ktCSuperShape0S0101000_I2 = (KtCSuperShape0S0101000_I2) it.next();
            A0w.add(new ProductOnboardingNextStepInfo(((PartnerProgramOnboardingSteps) ktCSuperShape0S0101000_I2.A01).A00, ktCSuperShape0S0101000_I2.A00, 4));
        }
        return A0w;
    }
}
