package X;

import com.facebook.graphql.impls.EmailOptInComponentImpl;
import com.facebook.graphql.impls.PAYLinkableTextFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;

/* renamed from: X.7SI  reason: invalid class name */
public final class AnonymousClass7SI implements C142618fJ {
    public final /* synthetic */ AnonymousClass58M A00;
    public final /* synthetic */ AnonymousClass7Kx A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass7SI(AnonymousClass58M r1, AnonymousClass7Kx r2, boolean z) {
        this.A02 = z;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        PAYLinkableTextFragmentImpl pAYLinkableTextFragmentImpl;
        CheckoutConfiguration checkoutConfiguration;
        TreeJNI treeValue;
        boolean z = this.A02;
        TreeJNI treeJNI = (TreeJNI) this.A01.A01;
        String str = null;
        if (treeJNI == null || (treeValue = treeJNI.getTreeValue("toggle_content", EmailOptInComponentImpl.ToggleContent.class)) == null) {
            pAYLinkableTextFragmentImpl = null;
        } else {
            pAYLinkableTextFragmentImpl = (PAYLinkableTextFragmentImpl) treeValue.reinterpret(PAYLinkableTextFragmentImpl.class);
        }
        ECPPaymentRequest A0a = C86124wJ.A0a(this.A00.A0z);
        if (!(A0a == null || (checkoutConfiguration = A0a.A01) == null)) {
            str = checkoutConfiguration.A09;
        }
        return new EmailOptInItem(pAYLinkableTextFragmentImpl, AnonymousClass69U.A0D, str, z);
    }
}
