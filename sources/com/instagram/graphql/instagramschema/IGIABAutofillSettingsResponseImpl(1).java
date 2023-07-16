package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass8qY;
import X.C108776iv;
import X.C148498rB;
import X.C148508rC;
import X.C148518rD;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C81204nM;
import X.C85304uq;
import X.C85734vg;
import X.C86164wN;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class IGIABAutofillSettingsResponseImpl extends TreeJNI implements C85304uq {

    public final class IgIabAutofillSettings extends TreeJNI implements C85734vg {

        public final class ConnectPayload extends TreeJNI implements C148518rD {

            public final class AutofillAddress extends TreeJNI implements AnonymousClass8qY {

                public final class Address extends TreeJNI implements C148498rB {
                    public final String[] getScalarFields() {
                        return new String[]{"address_level_1", "address_level_2", "address_line_1", "address_line_2", "country", "country_name", "postal_code"};
                    }

                    public final String APa() {
                        return getStringValue("address_level_1");
                    }

                    public final String APb() {
                        return getStringValue("address_level_2");
                    }

                    public final String APc() {
                        return getStringValue("address_line_1");
                    }

                    public final String APd() {
                        return getStringValue("address_line_2");
                    }

                    public final String Aa7() {
                        return getStringValue("country");
                    }

                    public final String B2P() {
                        return getStringValue("postal_code");
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"single_line_address"};
                }

                public final C148498rB APX() {
                    return (C148498rB) getTreeValue("address", Address.class);
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(Address.class, "address");
                }
            }

            public final class Credentials extends TreeJNI implements C148508rC {

                public final class DefaultCredentials extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"is_default_for_consumer", "is_eligible_for_consumer"};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"card_expiry_month", "card_expiry_year", "credential_id", "credential_type", "icon_url", "is_card_expired", "last_four_digits", "paypal_ba_type", DialogModule.KEY_TITLE};
                }

                public final String AWU() {
                    return getStringValue("card_expiry_month");
                }

                public final String AWV() {
                    return getStringValue("card_expiry_year");
                }

                public final String Aal() {
                    return getStringValue("credential_id");
                }

                public final String AnP() {
                    return getStringValue("icon_url");
                }

                public final String Ar9() {
                    return getStringValue("last_four_digits");
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(DefaultCredentials.class, "default_credentials");
                }

                public final String BH2() {
                    return C86164wN.A0g(this);
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"account_id", "app_name", "email", "has_linked_accounts", FXPFAccessLibraryDebugFragment.NAME, "profile_url"};
            }

            public final String AOT() {
                return getStringValue("account_id");
            }

            public final AnonymousClass8qY ASN() {
                return (AnonymousClass8qY) getTreeValue("autofill_address", AutofillAddress.class);
            }

            public final ImmutableList Aan() {
                return getTreeList("credentials", Credentials.class);
            }

            public final String AfO() {
                return getStringValue("email");
            }

            public final String B4X() {
                return getStringValue("profile_url");
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Credentials.class, "credentials", true), AutofillAddress.class, "autofill_address", false);
            }

            public final String getName() {
                return C18220wO.A0l(this);
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"connect_consecutive_neg_interaction", "connect_request_failed_count", "consecutive_neg_interaction", "has_contact_autofill_setting", "is_autofill_consent_accepted", "is_contact_autofill_fbpay_disclosure_shown", "is_payment_autofill_opt_in", "payment_autofill_consecutive_neg_interaction"};
        }

        public final int AZ4() {
            return getIntValue("connect_consecutive_neg_interaction");
        }

        public final C148518rD AZ5() {
            return (C148518rD) getTreeValue("connect_payload", ConnectPayload.class);
        }

        public final int AZ8() {
            return getIntValue("consecutive_neg_interaction");
        }

        public final boolean Ale() {
            return getBooleanValue("has_contact_autofill_setting");
        }

        public final boolean Apk() {
            return getBooleanValue("is_autofill_consent_accepted");
        }

        public final boolean App() {
            return getBooleanValue("is_contact_autofill_fbpay_disclosure_shown");
        }

        public final boolean Aq3() {
            return getBooleanValue("is_payment_autofill_opt_in");
        }

        public final int B0M() {
            return getIntValue("payment_autofill_consecutive_neg_interaction");
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(ConnectPayload.class, "connect_payload");
        }
    }

    public final C85734vg Ao0() {
        return (C85734vg) getTreeValue("ig_iab_autofill_settings", IgIabAutofillSettings.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgIabAutofillSettings.class, "ig_iab_autofill_settings");
    }
}
