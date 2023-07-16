package X;

import com.instagram.api.schemas.CommentAudienceControlType;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.user.model.User;

/* renamed from: X.5ye  reason: invalid class name and case insensitive filesystem */
public final class C95025ye extends C63873iU {
    public final /* synthetic */ C145858lE A00;
    public final /* synthetic */ IgReactCommentModerationModule A01;
    public final /* synthetic */ String A02;

    public C95025ye(C145858lE r1, IgReactCommentModerationModule igReactCommentModerationModule, String str) {
        this.A01 = igReactCommentModerationModule;
        this.A02 = str;
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r5) {
        String str;
        int A03 = C14030oh.A03(584247641);
        if (this.A01.getCurrentActivity() != null) {
            C145858lE r2 = this.A00;
            Object obj = r5.A00;
            if (obj != null) {
                str = ((C85814vo) obj).getErrorMessage();
            } else {
                str = "";
            }
            r2.reject(IgReactCommentModerationModule.ERROR_SERVER_ERR, str);
        }
        C14030oh.A0A(1168040285, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(417308666);
        int A032 = C14030oh.A03(-1594372894);
        IgReactCommentModerationModule igReactCommentModerationModule = this.A01;
        if (igReactCommentModerationModule.getCurrentActivity() != null) {
            User A0Y = AnonymousClass0wJ.A0Y(C18180wK.A0V(C18190wL.A0C(igReactCommentModerationModule.getCurrentActivity())));
            CommentAudienceControlType commentAudienceControlType = (CommentAudienceControlType) CommentAudienceControlType.A01.get(this.A02);
            if (commentAudienceControlType == null) {
                commentAudienceControlType = CommentAudienceControlType.UNRECOGNIZED;
            }
            A0Y.A05.Chj(commentAudienceControlType);
            this.A00.resolve((Object) null);
        }
        C14030oh.A0A(1184856457, A032);
        C14030oh.A0A(1548383902, A03);
    }
}
