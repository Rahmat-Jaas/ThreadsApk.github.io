package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class TermsComponentImpl extends TreeJNI implements C81204nM {

    public final class BodyTextWithMultipleActions extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYLinkableTextFragmentImpl.class};
        }
    }

    public final class CtaText extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYLinkableTextFragmentImpl.class};
        }
    }

    public final class PaymentsTerms extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYLinkableTextFragmentImpl.class};
        }
    }

    public final class PrivacyPolicyTerms extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYLinkableTextFragmentImpl.class};
        }
    }

    public final class TermsActions extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYLinkableTextFragmentImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"body_text", "sheet_body_text", "sheet_header"};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(PaymentsTerms.class, "payments_terms", false), C18190wL.A0G(PrivacyPolicyTerms.class, "privacy_policy_terms", false), C18190wL.A0G(CtaText.class, "cta_text", false), C18190wL.A0G(TermsActions.class, "terms_actions", true), C18190wL.A0G(BodyTextWithMultipleActions.class, "body_text_with_multiple_actions", false)};
    }
}
