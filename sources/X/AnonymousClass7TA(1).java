package X;

import com.facebook.graphql.impls.EditLinksFragmentImpl;
import com.facebook.graphql.impls.PayoutSettingsQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7TA  reason: invalid class name */
public final class AnonymousClass7TA implements C142618fJ {
    public static final AnonymousClass7TA A00 = new AnonymousClass7TA();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue = ((TreeJNI) obj).getTreeValue("pay_financial_entity(id:$id)", PayoutSettingsQueryResponseImpl.PayFinancialEntity.class);
        if (treeValue == null) {
            return null;
        }
        Boolean booleanVariable = treeValue.getBooleanVariable("include_edit_links");
        if (booleanVariable == null || booleanVariable.booleanValue()) {
            return treeValue.reinterpret(EditLinksFragmentImpl.class);
        }
        return null;
    }
}
