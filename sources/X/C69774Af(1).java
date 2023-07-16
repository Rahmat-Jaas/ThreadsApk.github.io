package X;

import android.content.Context;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.instagram.service.session.UserSession;
import java.util.Date;

/* renamed from: X.4Af  reason: invalid class name and case insensitive filesystem */
public final class C69774Af implements C33659Hs6 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass3In A02;
    public final /* synthetic */ BKU A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ AnonymousClass0MJ A06;
    public final /* synthetic */ boolean A07;

    public final void BtA(Date date) {
    }

    public C69774Af(Context context, AnonymousClass3In r2, BKU bku, UserSession userSession, String str, AnonymousClass0MJ r6, int i, boolean z) {
        this.A01 = context;
        this.A00 = i;
        this.A04 = userSession;
        this.A07 = z;
        this.A03 = bku;
        this.A05 = str;
        this.A02 = r2;
        this.A06 = r6;
    }

    public final void BuV(Date date) {
        int i;
        if (date != null) {
            i = (int) (date.getTime() / ((long) 1000));
        } else {
            i = 0;
        }
        if (((long) i) <= C18230wP.A06() / ((long) 1000)) {
            C63813iO.A06(this.A01);
        } else if (this.A00 != i) {
            Context context = this.A01;
            UserSession userSession = this.A04;
            boolean z = this.A07;
            BKU bku = this.A03;
            String str = this.A05;
            AnonymousClass1hY r6 = new AnonymousClass1hY(context, this.A02, bku, userSession, i, z);
            C67463zb A002 = C67463zb.A00();
            GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000 = new GQLCallInputCInputShape1S0000000();
            GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, C18180wK.A0e(), "client_mutation_id");
            GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, str, "unpublished_content_id");
            GraphQlCallInput.A05(gQLCallInputCInputShape1S0000000, Integer.valueOf(i), "scheduled_publish_time");
            C67463zb.A01(gQLCallInputCInputShape1S0000000, A002);
            AnonymousClass7Ko.A0B(true);
            C31155GhB.A03(C67473zc.A01(A002, r6, userSession, AnonymousClass15E.class, "ContentSchedulingRescheduleMutation"));
        }
        C30564GJu gJu = (C30564GJu) this.A06.A00;
        if (gJu != null) {
            gJu.A00();
        }
        AnonymousClass3In r2 = this.A02;
        Integer num = AnonymousClass006.A0C;
        r2.A05(num, AnonymousClass006.A00);
        r2.A00(num);
    }
}
