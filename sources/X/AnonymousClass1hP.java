package X;

import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.1hP  reason: invalid class name */
public final class AnonymousClass1hP extends C63873iU {
    public final /* synthetic */ AnonymousClass4FD A00;
    public final /* synthetic */ BKU A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03 = "";

    public AnonymousClass1hP(AnonymousClass4FD r2, BKU bku, String str) {
        this.A01 = bku;
        this.A00 = r2;
        this.A02 = str;
    }

    public final void onFail(AnonymousClass3XX r7) {
        int A002 = AnonymousClass0wJ.A00(404738880, r7);
        super.onFail(r7);
        this.A01.A3g(AnonymousClass24M.NOT_SHARED);
        C63353hL.A03(ShareType.FOLLOWERS_SHARE, this.A00.A03, "after_share_upsell", this.A02, "");
        C14030oh.A0A(-471008909, A002);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = C14030oh.A03(351598110);
        int A002 = AnonymousClass0wJ.A00(164100945, obj);
        super.onSuccess(obj);
        this.A01.A3g(AnonymousClass24M.SHARED);
        C63353hL.A05(ShareType.FOLLOWERS_SHARE, this.A00.A03, "after_share_upsell", this.A02, "");
        C14030oh.A0A(1501391313, A002);
        C14030oh.A0A(-599624067, A032);
    }
}
