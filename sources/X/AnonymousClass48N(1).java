package X;

import com.instagram.unifiedfeedback.api.graphql.FBCommentImpl;

/* renamed from: X.48N  reason: invalid class name */
public final class AnonymousClass48N implements C41882MfV {
    public final C61723Vc A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass48N(C61723Vc r2, boolean z, boolean z2) {
        C04220Ms.A0B(r2, 1);
        this.A00 = r2;
        this.A02 = z;
        this.A01 = z2;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        FBCommentImpl fBCommentImpl = this.A00.A05;
        if (fBCommentImpl != null) {
            return C18220wO.A0m(fBCommentImpl);
        }
        return "TEMPORARY_COMMENT_KEY";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return false;
    }
}
