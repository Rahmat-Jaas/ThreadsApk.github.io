package X;

import android.os.Bundle;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.1hB  reason: invalid class name */
public final class AnonymousClass1hB extends C63873iU {
    public final /* synthetic */ AnonymousClass3CO A00;

    public AnonymousClass1hB(AnonymousClass3CO r1) {
        this.A00 = r1;
    }

    public final void onFail(AnonymousClass3XX r5) {
        int A03 = C14030oh.A03(904375891);
        C63813iO.A0A(this.A00.A01, 2131827050, 0);
        C14030oh.A0A(-1445613048, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C14030oh.A03(1131793410);
        AnonymousClass1TG r9 = (AnonymousClass1TG) obj;
        int A032 = C14030oh.A03(-1282762359);
        AnonymousClass3CO r7 = this.A00;
        C10300i6 r1 = r7.A02;
        if (r1 instanceof UserSession) {
            UserSession A02 = C05030Qo.A02(r1);
            User A0Y = AnonymousClass0wJ.A0Y(A02);
            A0Y.A1e();
            C18210wN.A1J(A02, A0Y);
            AnonymousClass3LY.A00(A02).CWx(new C688645t());
        }
        String str = r9.A01;
        String str2 = r9.A00;
        AnonymousClass1XU r2 = new AnonymousClass1XU();
        Bundle A06 = C18180wK.A06();
        A06.putString(DialogModule.KEY_TITLE, str);
        A06.putString("body", str2);
        r2.setArguments(A06);
        r7.A00.post(new C73214Rj(r2, this));
        C14030oh.A0A(-690971758, A032);
        C14030oh.A0A(-1142724741, A03);
    }
}
