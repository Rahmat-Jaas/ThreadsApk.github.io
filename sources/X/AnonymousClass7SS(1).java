package X;

import com.facebook.graphql.impls.FetchAddressSuggestionsQueryResponseImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.7SS  reason: invalid class name */
public final class AnonymousClass7SS implements C142618fJ {
    public static final AnonymousClass7SS A00 = new AnonymousClass7SS();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeJNI = (TreeJNI) obj;
        if (treeJNI != null) {
            return treeJNI.getTreeValue("fetch_address_suggestions(country:$country,max_results:$max_results,payment_product_id:$payment_product_id,query_input:$query_input,session_id:$session_id,upl_session_id:$upl_session_id)", FetchAddressSuggestionsQueryResponseImpl.FetchAddressSuggestions.class);
        }
        return null;
    }
}
