package X;

import com.facebook.graphql.impls.PayoutAccountInfoFragmentImpl;
import com.facebook.graphql.impls.PayoutSettingsQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7TB  reason: invalid class name */
public final class AnonymousClass7TB implements C142618fJ {
    public static final AnonymousClass7TB A00 = new AnonymousClass7TB();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue = ((TreeJNI) obj).getTreeValue("pay_financial_entity(id:$id)", PayoutSettingsQueryResponseImpl.PayFinancialEntity.class);
        if (treeValue == null) {
            return null;
        }
        Boolean booleanVariable = treeValue.getBooleanVariable("include_payout_account_info");
        if (booleanVariable == null || booleanVariable.booleanValue()) {
            return treeValue.reinterpret(PayoutAccountInfoFragmentImpl.class);
        }
        return null;
    }
}
