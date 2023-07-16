package X;

import com.facebook.graphql.impls.PayoutSettingsQueryResponseImpl;
import com.facebook.graphql.impls.TaxInfoFragmentImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7TE  reason: invalid class name */
public final class AnonymousClass7TE implements C142618fJ {
    public static final AnonymousClass7TE A00 = new AnonymousClass7TE();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue = ((TreeJNI) obj).getTreeValue("pay_financial_entity(id:$id)", PayoutSettingsQueryResponseImpl.PayFinancialEntity.class);
        if (treeValue == null) {
            return null;
        }
        Boolean booleanVariable = treeValue.getBooleanVariable("include_tax_info");
        if (booleanVariable == null || booleanVariable.booleanValue()) {
            return treeValue.reinterpret(TaxInfoFragmentImpl.class);
        }
        return null;
    }
}
