package X;

import com.facebook.graphql.impls.AccountAdminsFragmentImpl;
import com.facebook.graphql.impls.PayoutSettingsQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7T9  reason: invalid class name */
public final class AnonymousClass7T9 implements C142618fJ {
    public static final AnonymousClass7T9 A00 = new AnonymousClass7T9();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue = ((TreeJNI) obj).getTreeValue("pay_financial_entity(id:$id)", PayoutSettingsQueryResponseImpl.PayFinancialEntity.class);
        if (treeValue == null) {
            return null;
        }
        Boolean booleanVariable = treeValue.getBooleanVariable("include_account_admins");
        if (booleanVariable == null || booleanVariable.booleanValue()) {
            return treeValue.reinterpret(AccountAdminsFragmentImpl.class);
        }
        return null;
    }
}
