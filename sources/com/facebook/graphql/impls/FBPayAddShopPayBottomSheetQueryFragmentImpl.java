package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class FBPayAddShopPayBottomSheetQueryFragmentImpl extends TreeJNI implements C81204nM {

    public final class FbpayShoppayConsentBottomSheet extends TreeJNI implements C81204nM {

        public final class BottomSheet extends TreeJNI implements C81204nM {

            public final class Description extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{PAYTextWithLinksFragmentImpl.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"primary_button_label", "secondary_button_label"};
            }

            public final class NavigationTitle extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final class Content extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final class Title extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(NavigationTitle.class, "navigation_title", false), C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Description.class, DevServerEntity.COLUMN_DESCRIPTION, false), C18190wL.A0G(Content.class, "content", true)};
            }
        }

        public final class PaymentsError extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{FBPayPaymentsUserFacingErrorFragmentImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(PaymentsError.class, "payments_error", false), BottomSheet.class, "bottom_sheet", false);
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayShoppayConsentBottomSheet.class, "fbpay_shoppay_consent_bottom_sheet(data:$input)");
    }
}
