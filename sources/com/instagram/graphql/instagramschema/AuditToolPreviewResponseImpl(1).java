package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class AuditToolPreviewResponseImpl extends TreeJNI implements C81204nM {

    public final class IgAuditToolPreview extends TreeJNI implements C81204nM {

        public final class QuickPromotionDetails extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"nux_id", "promotion_id"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(QuickPromotionDetails.class, "quick_promotion_details");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgAuditToolPreview.class, "ig_audit_tool_preview(input:$input)");
    }
}
