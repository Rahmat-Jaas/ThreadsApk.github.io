package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18170wI;
import X.C18190wL;
import X.C81204nM;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.pando.TreeJNI;

public final class ContactInformationComponentImpl extends TreeJNI implements C81204nM {

    public final class EmailFormFieldConfig extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayFormFieldImpl.class};
        }
    }

    public final class Emails extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayEmailImpl.class};
        }
    }

    public final class FullNameFieldConfig extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayFormFieldImpl.class};
        }
    }

    public final class OneTimeEmail extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayEmailImpl.class};
        }
    }

    public final class OneTimePhone extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayPhoneNumberImpl.class};
        }
    }

    public final class PhoneFormFieldConfig extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayFormFieldImpl.class};
        }
    }

    public final class PhoneNumbers extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayPhoneNumberImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"one_time_payer_name", "payer_name"};
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(Emails.class, "emails", true), C18190wL.A0G(PhoneNumbers.class, C18170wI.A00(HttpStatus.SC_RESET_CONTENT), true), C18190wL.A0G(EmailFormFieldConfig.class, "email_form_field_config", false), C18190wL.A0G(PhoneFormFieldConfig.class, "phone_form_field_config", false), C18190wL.A0G(FullNameFieldConfig.class, "full_name_field_config", false), C18190wL.A0G(OneTimeEmail.class, "one_time_email", false), C18190wL.A0G(OneTimePhone.class, "one_time_phone", false)};
    }
}
