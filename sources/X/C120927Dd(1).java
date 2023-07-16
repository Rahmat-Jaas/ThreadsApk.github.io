package X;

import android.content.Context;
import com.facebook.graphql.impls.ComponentDataMutationResponseImpl;
import com.facebook.graphql.impls.CredentialResponseImpl;
import com.facebook.graphql.impls.EmailResponseImpl;
import com.facebook.graphql.impls.PayerNameResponseImpl;
import com.facebook.graphql.impls.PhoneResponseImpl;
import com.facebook.graphql.impls.SharedPaymentsErrorImpl;
import com.facebook.graphql.impls.ShippingAddressResponseImpl;
import com.facebook.pando.TreeJNI;
import java.util.Locale;

/* renamed from: X.7Dd  reason: invalid class name and case insensitive filesystem */
public final class C120927Dd {
    public final Context A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(C138118Gg.A00);
    public final C04530Oa A02 = AnonymousClass0OY.A02(C138128Gh.A00);
    public final C04530Oa A03 = AnonymousClass0OY.A02(C138138Gi.A00);
    public final C04530Oa A04 = AnonymousClass0OY.A02(C138148Gj.A00);

    public static final Throwable A01(ComponentDataMutationResponseImpl componentDataMutationResponseImpl) {
        ComponentDataMutationResponseImpl.FbpayAccountMutation A002;
        ComponentDataMutationResponseImpl.FbpayAccountMutation.EmailResponse A003;
        ComponentDataMutationResponseImpl.FbpayAccountMutation.PhoneResponse A012;
        TreeJNI A0J;
        TreeJNI treeValue;
        TreeJNI reinterpret;
        TreeJNI A0M;
        SharedPaymentsErrorImpl sharedPaymentsErrorImpl;
        TreeJNI reinterpret2;
        TreeJNI A0M2;
        PhoneResponseImpl phoneResponseImpl;
        PhoneResponseImpl.Error error;
        EmailResponseImpl emailResponseImpl;
        EmailResponseImpl.Error error2;
        TreeJNI reinterpret3;
        TreeJNI A0M3;
        if (componentDataMutationResponseImpl == null || (A002 = componentDataMutationResponseImpl.A00()) == null) {
            return null;
        }
        TreeJNI treeValue2 = A002.getTreeValue("shipping_address_response", ComponentDataMutationResponseImpl.FbpayAccountMutation.ShippingAddressResponse.class);
        if ((treeValue2 == null || (reinterpret3 = treeValue2.reinterpret(ShippingAddressResponseImpl.class)) == null || (A0M3 = C86154wM.A0M(reinterpret3, ShippingAddressResponseImpl.Error.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(A0M3)) == null) && (((A003 = A002.A00()) == null || (emailResponseImpl = (EmailResponseImpl) A003.reinterpret(EmailResponseImpl.class)) == null || (error2 = (EmailResponseImpl.Error) C86154wM.A0M(emailResponseImpl, EmailResponseImpl.Error.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(error2)) == null) && (((A012 = A002.A01()) == null || (phoneResponseImpl = (PhoneResponseImpl) A012.reinterpret(PhoneResponseImpl.class)) == null || (error = (PhoneResponseImpl.Error) C86154wM.A0M(phoneResponseImpl, PhoneResponseImpl.Error.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(error)) == null) && (((A0J = C86164wN.A0J(A002)) == null || (reinterpret2 = A0J.reinterpret(PayerNameResponseImpl.class)) == null || (A0M2 = C86154wM.A0M(reinterpret2, PayerNameResponseImpl.Error.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(A0M2)) == null) && ((treeValue = A002.getTreeValue("credential_response", ComponentDataMutationResponseImpl.FbpayAccountMutation.CredentialResponse.class)) == null || (reinterpret = treeValue.reinterpret(CredentialResponseImpl.class)) == null || (A0M = C86154wM.A0M(reinterpret, CredentialResponseImpl.Error.class)) == null || (sharedPaymentsErrorImpl = (SharedPaymentsErrorImpl) C86124wJ.A0T(A0M)) == null))))) {
            return null;
        }
        return AnonymousClass7Fb.A01(sharedPaymentsErrorImpl);
    }

    public static final C89345Dg A00(AnonymousClass6BE r3) {
        C89345Dg r2 = new C89345Dg();
        r2.A04(r3, "mutation_data");
        Locale locale = Locale.US;
        C04220Ms.A08(locale);
        r2.A04(AnonymousClass6BL.valueOf(C18220wO.A0u(locale, "CREATE")), "mutation_type");
        return r2;
    }

    public C120927Dd(Context context) {
        this.A00 = context;
    }
}
