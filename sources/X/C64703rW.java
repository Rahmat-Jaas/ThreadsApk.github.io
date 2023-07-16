package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;
import java.util.Calendar;
import java.util.Date;

/* renamed from: X.3rW  reason: invalid class name and case insensitive filesystem */
public final class C64703rW implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass3In A02;
    public final /* synthetic */ BKU A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C64703rW(FragmentActivity fragmentActivity, AnonymousClass3In r2, BKU bku, UserSession userSession, String str, int i, boolean z) {
        this.A01 = fragmentActivity;
        this.A04 = userSession;
        this.A06 = z;
        this.A00 = i;
        this.A03 = bku;
        this.A05 = str;
        this.A02 = r2;
    }

    public final void onClick(View view) {
        int A052 = C14030oh.A05(-363284754);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A04;
        boolean z = this.A06;
        int i = this.A00;
        BKU bku = this.A03;
        String str = this.A05;
        AnonymousClass3In r5 = this.A02;
        C04220Ms.A0C(fragmentActivity, "null cannot be cast to non-null type android.content.Context");
        AnonymousClass0MJ r9 = new AnonymousClass0MJ();
        int i2 = 2131824369;
        if (z) {
            i2 = 2131824370;
        }
        r9.A00 = new C30564GJu(fragmentActivity, new C69774Af(fragmentActivity, r5, bku, userSession, str, r9, i, z), userSession, AnonymousClass0wJ.A0k(fragmentActivity, i2), fragmentActivity.getString(2131824367), false, true);
        Date date = new Date(C18220wO.A09(i));
        Calendar instance = Calendar.getInstance();
        instance.add(12, (5 - (instance.get(12) % 5)) + 20);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(date);
        instance2.add(5, 7);
        C30564GJu gJu = (C30564GJu) r9.A00;
        if (gJu != null) {
            gJu.A01((String) null, date, instance.getTime(), instance2.getTime(), false);
        }
        r5.A02(AnonymousClass006.A0C);
        C14030oh.A0C(241969324, A052);
    }
}
