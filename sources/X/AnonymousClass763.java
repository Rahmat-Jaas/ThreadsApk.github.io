package X;

import com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus;
import com.instagram.user.model.User;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.763  reason: invalid class name */
public final class AnonymousClass763 {
    public final int A00;
    public final List A01;
    public final boolean A02;

    public AnonymousClass763(List list, int i, boolean z) {
        C04220Ms.A0B(list, 4);
        this.A00 = i;
        this.A02 = z;
        this.A01 = list;
    }

    public static AnonymousClass1jA A00(BrandedContentBrandTaggingRequestApprovalStatus brandedContentBrandTaggingRequestApprovalStatus, AnonymousClass763 r2, CV1 cv1, User user) {
        user.A05.CiE(brandedContentBrandTaggingRequestApprovalStatus);
        List list = r2.A01;
        C04220Ms.A0C(list, AnonymousClass000.A00(75));
        cv1.A01 = C03940Lk.A01(list);
        cv1.A07().A05();
        cv1.A06().A00();
        return new AnonymousClass1jA(Unit.A00);
    }
}
