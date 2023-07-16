package X;

import android.content.SharedPreferences;

/* renamed from: X.1uY  reason: invalid class name and case insensitive filesystem */
public final class C28541uY extends AnonymousClass9UH {
    public final /* synthetic */ AnonymousClass3EZ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28541uY(C12560m7 r1, AnonymousClass3EZ r2, String str, String str2, String str3) {
        super(r1);
        this.A00 = r2;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void onFail(AnonymousClass3XX r7) {
        int A032 = C14030oh.A03(1063073109);
        C63643hy.A05(new AnonymousClass4Q7(this));
        this.A00.A00.A03.A02(this.A01, this.A02, this.A03, false);
        C14030oh.A0A(-997674118, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        SharedPreferences.Editor putString;
        boolean equals;
        SharedPreferences.Editor A032;
        String str;
        int A033 = C14030oh.A03(-1646768855);
        int A034 = C14030oh.A03(-805514613);
        String str2 = this.A01;
        if (str2.equals("direct_share_activity")) {
            equals = this.A02.equals("off");
            A032 = C28161tl.A03(this.A00.A00.A02);
            str = "direct_message_notification_status";
        } else if (str2.equals("pending_direct_share")) {
            equals = this.A02.equals("off");
            A032 = C28161tl.A03(this.A00.A00.A02);
            str = "direct_message_request_notification_mute_status";
        } else {
            if (str2.equals("direct_media_creator_share_activity")) {
                C28161tl A012 = AnonymousClass3WS.A01(this.A00.A00.A02);
                String str3 = this.A02;
                C04220Ms.A0B(str3, 0);
                putString = C28161tl.A02(A012).putString("direct_message_professional_notification_status", str3);
                putString.apply();
            }
            C63643hy.A05(new AnonymousClass4Q6(this));
            this.A00.A00.A03.A02(str2, this.A02, this.A03, true);
            C14030oh.A0A(1399265177, A034);
            C14030oh.A0A(145710442, A033);
        }
        putString = A032.putBoolean(str, equals);
        putString.apply();
        C63643hy.A05(new AnonymousClass4Q6(this));
        this.A00.A00.A03.A02(str2, this.A02, this.A03, true);
        C14030oh.A0A(1399265177, A034);
        C14030oh.A0A(145710442, A033);
    }
}
