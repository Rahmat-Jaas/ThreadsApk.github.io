package X;

import com.instagram.barcelona.R;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.service.session.UserSession;

/* renamed from: X.7vp  reason: invalid class name and case insensitive filesystem */
public final class C133517vp implements C145578kj {
    public final /* synthetic */ AnonymousClass5zD A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ C127397h3 A02;
    public final /* synthetic */ UserSession A03;

    public C133517vp(AnonymousClass5zD r1, AnonymousClass3HX r2, C127397h3 r3, UserSession userSession) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = userSession;
        this.A02 = r3;
    }

    public final void BpQ(Hashtag hashtag) {
        AnonymousClass3HX r5 = this.A01;
        C04220Ms.A0B(r5, 0);
        ((C145538kf) r5.A00(R.id.bloks_ig_scheduler)).schedule(C19403Avl.A00(hashtag, this.A03));
        C127397h3 r3 = this.A02;
        C109326jp A08 = C127397h3.A08(r3);
        if (A08 != null) {
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A02(r3, 0);
            A002.A02(r5, 1);
            C122047Jt.A07(r5, r3, A002, A08);
        }
    }

    public final void Bpy(Hashtag hashtag) {
        AnonymousClass3HX r5 = this.A01;
        C04220Ms.A0B(r5, 0);
        ((C145538kf) r5.A00(R.id.bloks_ig_scheduler)).schedule(C19403Avl.A01(hashtag, this.A03));
        C127397h3 r3 = this.A02;
        C109326jp A0L = r3.A0L(38);
        if (A0L != null) {
            AnonymousClass3VO A002 = AnonymousClass3VO.A00();
            A002.A02(r3, 0);
            A002.A02(r5, 1);
            C122047Jt.A07(r5, r3, A002, A0L);
        }
    }
}
