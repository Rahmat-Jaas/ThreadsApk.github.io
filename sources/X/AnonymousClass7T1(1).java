package X;

import com.facebook.graphql.impls.FBPayComponentDataQueryResponseImpl;
import com.facebook.graphql.impls.IncentivesComponentImpl;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7T1  reason: invalid class name */
public final class AnonymousClass7T1 implements C142618fJ {
    public static final AnonymousClass7T1 A00 = new AnonymousClass7T1();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI A0I;
        ImmutableList treeList;
        TreeJNI treeJNI;
        TreeJNI treeJNI2 = (TreeJNI) obj;
        if (treeJNI2 == null || (A0I = C86164wN.A0I(treeJNI2)) == null || (treeList = A0I.getTreeList("components", FBPayComponentDataQueryResponseImpl.FetchFbpayComponentData.Components.class)) == null || (treeJNI = (TreeJNI) AnonymousClass00J.A0D(treeList)) == null || !treeJNI.isFulfilled("PAYFBPayComponentIncentives")) {
            return null;
        }
        return treeJNI.reinterpret(IncentivesComponentImpl.class);
    }
}
