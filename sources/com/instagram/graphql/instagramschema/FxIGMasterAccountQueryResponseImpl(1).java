package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C18230wP;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FxIGMasterAccountQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FxcalAccounts extends TreeJNI implements C81204nM {

        public final class InlineFacebookCALAccountData extends TreeJNI implements C81204nM {

            public final class FbUser extends TreeJNI implements C81204nM {

                public final class ProfilePicture extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18230wP.A1Z();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(ProfilePicture.class, "profile_picture(height:$fb_profile_image_size,width:$fb_profile_image_size)");
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1b();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(FbUser.class, "fb_user");
            }
        }

        public final class InlineInstagramCALAccountData extends TreeJNI implements C81204nM {

            public final class IgUser extends TreeJNI implements C81204nM {

                public final class ProfilePicture extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18230wP.A1Z();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(ProfilePicture.class, "profile_picture");
                }

                public final String[] getScalarFields() {
                    return C18210wN.A1b();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(IgUser.class, "ig_user");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"account_type", "obfuscated_id"};
        }

        public final Class[] getInlineClasses() {
            return new Class[]{InlineFacebookCALAccountData.class, InlineInstagramCALAccountData.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(FxcalAccounts.class, "fxcal_accounts");
    }
}
