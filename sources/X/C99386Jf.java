package X;

import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;

/* renamed from: X.6Jf  reason: invalid class name and case insensitive filesystem */
public final class C99386Jf {
    public static final BrandedContentBrandTaggingRequestApprovalStatus A00(String str) {
        BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus = (BrandedContentBrandTaggingRequestApprovalStatus) BrandedContentBrandTaggingRequestApprovalStatus.A01.get(str);
        if (brandedContentBrandTaggingRequestApprovalStatus == null) {
            return BrandedContentBrandTaggingRequestApprovalStatus.UNRECOGNIZED;
        }
        return brandedContentBrandTaggingRequestApprovalStatus;
    }
}
