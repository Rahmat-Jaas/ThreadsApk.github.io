package X;

import com.facebook.graphql.impls.PayoutOwnerFragmentImpl;
import com.facebook.graphql.impls.PayoutSettingsQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7TD  reason: invalid class name */
public final class AnonymousClass7TD implements C142618fJ {
    public static final AnonymousClass7TD A00 = new AnonymousClass7TD();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue = ((TreeJNI) obj).getTreeValue("pay_financial_entity(id:$id)", PayoutSettingsQueryResponseImpl.PayFinancialEntity.class);
        if (treeValue == null) {
            return null;
        }
        Boolean booleanVariable = treeValue.getBooleanVariable("include_payout_owner");
        if (booleanVariable == null || booleanVariable.booleanValue()) {
            return treeValue.reinterpret(PayoutOwnerFragmentImpl.class);
        }
        return null;
    }
}
