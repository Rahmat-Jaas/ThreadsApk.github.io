package X;

import com.facebook.graphql.impls.EmailOptInComponentImpl;
import com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7Sf  reason: invalid class name and case insensitive filesystem */
public final class C122467Sf implements C142618fJ {
    public static final C122467Sf A00 = new C122467Sf();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI A0I;
        ImmutableList treeList;
        TreeJNI treeJNI;
        TreeJNI treeJNI2 = (TreeJNI) obj;
        if (treeJNI2 == null || (A0I = C86164wN.A0I(treeJNI2)) == null || (treeList = A0I.getTreeList("components", FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Components.class)) == null || (treeJNI = (TreeJNI) AnonymousClass00J.A0D(treeList)) == null || !treeJNI.isFulfilled("PAYFBPayComponentEmailOptin")) {
            return null;
        }
        return treeJNI.reinterpret(EmailOptInComponentImpl.class);
    }
}
