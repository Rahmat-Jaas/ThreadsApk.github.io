package X;

import com.facebook.graphql.impls.PayoutMethodsFragmentImpl;
import com.facebook.graphql.impls.PayoutSettingsQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7TC  reason: invalid class name */
public final class AnonymousClass7TC implements C142618fJ {
    public static final AnonymousClass7TC A00 = new AnonymousClass7TC();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue = ((TreeJNI) obj).getTreeValue("pay_financial_entity(id:$id)", PayoutSettingsQueryResponseImpl.PayFinancialEntity.class);
        if (treeValue == null) {
            return null;
        }
        Boolean booleanVariable = treeValue.getBooleanVariable("include_payout_methods");
        if (booleanVariable == null || booleanVariable.booleanValue()) {
            return treeValue.reinterpret(PayoutMethodsFragmentImpl.class);
        }
        return null;
    }
}
