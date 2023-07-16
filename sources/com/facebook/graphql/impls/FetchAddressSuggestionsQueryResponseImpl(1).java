package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FetchAddressSuggestionsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchAddressSuggestions extends TreeJNI implements C81204nM {

        public final class Attribution extends TreeJNI implements C81204nM {

            public final class IconDark extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{TypeaheadAttributionIconImpl.class};
                }
            }

            public final class IconLight extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{TypeaheadAttributionIconImpl.class};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(IconDark.class, "icon_dark(scale:$attribution_icon_scale)", false), IconLight.class, "icon_light(scale:$attribution_icon_scale)", false);
            }
        }

        public final class Suggestions extends TreeJNI implements C81204nM {

            public final class AddressDetails extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{TypeaheadAddressDetailsImpl.class};
                }
            }

            public final class MainText extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{TypeaheadMatchedStringImpl.class};
                }
            }

            public final class SecondaryText extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{TypeaheadMatchedStringImpl.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"address_id"};
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(MainText.class, "main_text", false), C18190wL.A0G(SecondaryText.class, "secondary_text", false), C18190wL.A0G(AddressDetails.class, "address_details", false)};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Suggestions.class, "suggestions", true), Attribution.class, "attribution", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FetchAddressSuggestions.class, "fetch_address_suggestions(country:$country,max_results:$max_results,payment_product_id:$payment_product_id,query_input:$query_input,session_id:$session_id,upl_session_id:$upl_session_id)");
    }
}
