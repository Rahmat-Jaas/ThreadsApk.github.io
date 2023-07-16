package X;

import com.facebook.graphql.impls.CredentialResponseImpl;
import com.facebook.graphql.impls.PaypalBAImpl;
import com.facebook.pando.TreeJNI;

/* renamed from: X.8N7  reason: invalid class name */
public final class AnonymousClass8N7 extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8N7 A00 = new AnonymousClass8N7();

    public AnonymousClass8N7() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        TreeJNI treeJNI;
        CredentialResponseImpl.Credential credential;
        TreeJNI reinterpret;
        String stringValue;
        if (!(!(obj instanceof CredentialResponseImpl) || (treeJNI = (TreeJNI) obj) == null || (credential = (CredentialResponseImpl.Credential) treeJNI.getTreeValue("credential", CredentialResponseImpl.Credential.class)) == null)) {
            if (credential.A00() != null) {
                reinterpret = credential.A00();
            } else if (credential.isFulfilled("PAYPaymentPaypalBillingAgreement")) {
                Class<PaypalBAImpl> cls = PaypalBAImpl.class;
                if (credential.reinterpret(cls) != null) {
                    if (!credential.isFulfilled("PAYPaymentPaypalBillingAgreement")) {
                        return null;
                    }
                    reinterpret = credential.reinterpret(cls);
                }
            }
            if (reinterpret == null || (stringValue = reinterpret.getStringValue("credential_id")) == null) {
                return null;
            }
            return AnonymousClass0wJ.A0d(stringValue);
        }
        throw C18240wQ.A0j();
    }
}
