package X;

import com.facebook.graphql.impls.OtcOptionComponentImpl;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;

/* renamed from: X.7TJ  reason: invalid class name */
public final class AnonymousClass7TJ implements C142618fJ {
    public static final AnonymousClass7TJ A00 = new AnonymousClass7TJ();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        TreeJNI treeValue;
        TreeJNI treeValue2;
        TreeJNI treeJNI = (TreeJNI) obj;
        PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl = null;
        if (!(treeJNI == null || (treeValue = treeJNI.getTreeValue("pux_component", OtcOptionComponentImpl.PuxComponent.class)) == null || (treeValue2 = treeValue.getTreeValue("exit_flow_cta", OtcOptionComponentImpl.PuxComponent.ExitFlowCta.class)) == null)) {
            pAYLinkableTextFragmentImpl = (PAYLinkableTextFragmentImpl) treeValue2.reinterpret(PAYLinkableTextFragmentImpl.class);
        }
        return new AnonCheckoutPuxLink(pAYLinkableTextFragmentImpl, AnonymousClass69U.A07);
    }
}
