package X;

import com.facebook.graphql.impls.IncentivesComponentImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.IncentiveList;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.7BJ  reason: invalid class name */
public final class AnonymousClass7BJ {
    public static final C145318kI A00(ECPIncentive eCPIncentive) {
        C145318kI r0;
        C04220Ms.A0B(eCPIncentive, 0);
        if (eCPIncentive instanceof ECPOnsiteOffer) {
            r0 = AnonymousClass7jG.A00;
        } else if (eCPIncentive instanceof ECPOffsiteOffer) {
            r0 = C128247jF.A00;
        } else {
            throw C18190wL.A0a("Processor not implemented yet for this incentive type");
        }
        return r0;
    }

    public static final List A01(M5J m5j) {
        TreeJNI treeJNI;
        TreeJNI treeValue;
        ImmutableList treeList;
        AnonymousClass7Kx A0R = C86104wH.A0R(m5j);
        if (A0R == null || (treeJNI = (TreeJNI) A0R.A01) == null || (treeValue = treeJNI.getTreeValue("all_eligible_incentives", IncentivesComponentImpl.AllEligibleIncentives.class)) == null || (treeList = treeValue.getTreeList("incentives", IncentivesComponentImpl.AllEligibleIncentives.Incentives.class)) == null) {
            return AnonymousClass0ZV.A00;
        }
        return treeList;
    }

    public static final List A02(M5J m5j) {
        IncentiveList incentiveList;
        AnonymousClass7Kx A0R = C86104wH.A0R(m5j);
        if (A0R == null || (incentiveList = (IncentiveList) A0R.A01) == null) {
            return AnonymousClass0ZV.A00;
        }
        return incentiveList.A00;
    }
}
