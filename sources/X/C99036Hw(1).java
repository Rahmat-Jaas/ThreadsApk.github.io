package X;

import com.facebook.graphql.impls.AuthFactorRequirementImpl;
import com.facebook.graphql.impls.BIOAuthFactorImpl;
import com.facebook.graphql.impls.CSCAuthFactorImpl;
import com.facebook.graphql.impls.PINAuthFactorImpl;
import com.facebook.graphql.impls.PayPalAuthFactorImpl;
import com.facebook.graphql.impls.SDCAuthFactorImpl;
import com.facebook.graphql.impls.ThreeDSAuthFactorImpl;
import com.facebook.graphql.impls.TrustedDeviceAuthFactorImpl;
import com.facebook.pando.TreeJNI;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6Hw  reason: invalid class name and case insensitive filesystem */
public final class C99036Hw {
    public static final C114746tp A00(AuthFactorRequirementImpl authFactorRequirementImpl) {
        TreeJNI reinterpret;
        TreeJNI reinterpret2;
        String str;
        TreeJNI reinterpret3;
        TreeJNI reinterpret4;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        AuthFactorRequirementImpl authFactorRequirementImpl2 = authFactorRequirementImpl;
        Iterator it = C18230wP.A0P(authFactorRequirementImpl2, AuthFactorRequirementImpl.AuthFactorsGroups.class, "auth_factors_groups").iterator();
        while (it.hasNext()) {
            TreeJNI A0G = C18210wN.A0G(it);
            ArrayList A0v2 = AnonymousClass0wJ.A0v();
            Iterator it2 = C18230wP.A0P(A0G, AuthFactorRequirementImpl.AuthFactorsGroups.Factors.class, "factors").iterator();
            while (it2.hasNext()) {
                AuthFactorRequirementImpl.AuthFactorsGroups.Factors factors = (AuthFactorRequirementImpl.AuthFactorsGroups.Factors) it2.next();
                if (!factors.isFulfilled("PAYFBPayBIOAuthFactor")) {
                    reinterpret = null;
                } else {
                    reinterpret = factors.reinterpret(BIOAuthFactorImpl.class);
                }
                if (reinterpret != null) {
                    AnonymousClass66N r5 = (AnonymousClass66N) C86104wH.A0a(reinterpret, AnonymousClass66N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "auth_factor_type");
                    if (r5 != null) {
                        A0v2.add(new C115406v0((AnonymousClass79S) null, (String) null, (String) null, (String) null, (String) null, (String) null, r5.name(), (String) null, (String) null, (String) null));
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
                PINAuthFactorImpl A01 = factors.A01();
                if (A01 != null) {
                    AnonymousClass66N r52 = (AnonymousClass66N) C86104wH.A0a(A01, AnonymousClass66N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "auth_factor_type");
                    if (r52 != null) {
                        A0v2.add(new C115406v0((AnonymousClass79S) null, (String) null, (String) null, (String) null, (String) null, (String) null, r52.name(), (String) null, (String) null, (String) null));
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
                CSCAuthFactorImpl A00 = factors.A00();
                if (A00 != null) {
                    AnonymousClass66N r53 = (AnonymousClass66N) C86104wH.A0a(A00, AnonymousClass66N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "auth_factor_type");
                    if (r53 != null) {
                        A0v2.add(new C115406v0((AnonymousClass79S) null, (String) null, A00.getStringValue("cred_id"), (String) null, (String) null, C86164wN.A0g(A00), r53.name(), (String) null, (String) null, (String) null));
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
                PayPalAuthFactorImpl A02 = factors.A02();
                if (A02 != null) {
                    AnonymousClass66N r54 = (AnonymousClass66N) C86104wH.A0a(A02, AnonymousClass66N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "auth_factor_type");
                    if (r54 != null) {
                        String name = r54.name();
                        String stringValue = A02.getStringValue("cred_id");
                        String stringValue2 = A02.getStringValue("hidden_email");
                        C30071zm r55 = (C30071zm) C86104wH.A0a(A02, C30071zm.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "billing_agreement_type");
                        if (r55 != null) {
                            A0v2.add(new C115406v0((AnonymousClass79S) null, A02.getStringValue("connect_url"), stringValue, A02.getStringValue("email"), stringValue2, (String) null, name, r55.name(), (String) null, (String) null));
                        } else {
                            throw C18180wK.A0a("Required value was null.");
                        }
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
                if (factors.isFulfilled("PAYFBPayTrustedDeviceAuthFactor") && (reinterpret4 = factors.reinterpret(TrustedDeviceAuthFactorImpl.class)) != null) {
                    AnonymousClass66N r56 = (AnonymousClass66N) C86104wH.A0a(reinterpret4, AnonymousClass66N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "auth_factor_type");
                    if (r56 != null) {
                        A0v2.add(new C115406v0((AnonymousClass79S) null, (String) null, (String) null, (String) null, (String) null, (String) null, r56.name(), (String) null, (String) null, (String) null));
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
                if (factors.isFulfilled("PAYFBPay3DSAuthFactor") && (reinterpret3 = factors.reinterpret(ThreeDSAuthFactorImpl.class)) != null) {
                    AnonymousClass66N r57 = (AnonymousClass66N) C86104wH.A0a(reinterpret3, AnonymousClass66N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "auth_factor_type");
                    if (r57 != null) {
                        A0v2.add(new C115406v0((AnonymousClass79S) null, (String) null, (String) null, (String) null, (String) null, (String) null, r57.name(), (String) null, reinterpret3.getStringValue("nonce"), reinterpret3.getStringValue("url")));
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
                if (factors.isFulfilled("PAYFBPaySDCAuthFactor") && (reinterpret2 = factors.reinterpret(SDCAuthFactorImpl.class)) != null) {
                    AnonymousClass66N r0 = (AnonymousClass66N) C86104wH.A0a(reinterpret2, AnonymousClass66N.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "auth_factor_type");
                    if (r0 != null) {
                        String name2 = r0.name();
                        String stringValue3 = reinterpret2.getStringValue("cred_id");
                        String A0g = C86164wN.A0g(reinterpret2);
                        Class<SDCAuthFactorImpl.AuthAmount> cls = SDCAuthFactorImpl.AuthAmount.class;
                        TreeJNI treeValue = reinterpret2.getTreeValue("auth_amount", cls);
                        String str2 = null;
                        if (treeValue != null) {
                            str = treeValue.getStringValue("currency");
                        } else {
                            str = null;
                        }
                        TreeJNI treeValue2 = reinterpret2.getTreeValue("auth_amount", cls);
                        if (treeValue2 != null) {
                            str2 = treeValue2.getStringValue("amount");
                        }
                        A0v2.add(new C115406v0(new AnonymousClass79S(str, str2), (String) null, stringValue3, (String) null, (String) null, A0g, name2, (String) null, (String) null, (String) null));
                    } else {
                        throw C18180wK.A0a("Required value was null.");
                    }
                }
            }
            A0v.add(new C115006uL(A0v2, A0G.getIntValue("num_required_factors"), A0G.getBooleanValue("allow_user_select")));
        }
        return new C114746tp(A0v, authFactorRequirementImpl2.getIntValue("num_required_groups"));
    }
}
